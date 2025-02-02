package electronicsstore.stores.mapper.delegate;

import electronicsstore.stores.mapper.ElectroGoodsMapper;
import electronicsstore.stores.model.ElectroGoods;
import electronicsstore.stores.service.TypeElectronicsService;
import electronicsstore.stores.web.model.request.ElectroGoodsRequest;
import electronicsstore.stores.web.model.response.electrogoods.ElectroGoodsResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ElectroGoodsMapperDelegate implements ElectroGoodsMapper {

    @Autowired
    private TypeElectronicsService typeElectronicsService;

    @Override
    public ElectroGoods requestToElectroGoods(ElectroGoodsRequest request) {
        return ElectroGoods.builder()
                .name(request.getName())
                .count(request.getCount())
                .price(request.getPrice())
                .availability(request.getAvailability())
                .description(request.getDescription())
                .typeElectronics(typeElectronicsService.findById(request.getTypeGoodsId()))
                .build();
    }

    @Override
    public ElectroGoods requestToElectroGoods(Long goodsId, ElectroGoodsRequest request) {
        ElectroGoods electroGoods = requestToElectroGoods(request);
        electroGoods.setId(goodsId);

        return electroGoods;
    }

    @Override
    public ElectroGoodsResponse electroGoodsToResponse(ElectroGoods electroGoods) {
        return ElectroGoodsResponse.builder()
                .id(electroGoods.getId())
                .name(electroGoods.getName())
                .typeElectronics(electroGoods.getTypeElectronics().getName())
                .price(electroGoods.getPrice())
                .count(electroGoods.getCount())
                .description(electroGoods.getDescription())
                .availability(electroGoods.getAvailability())
                .build();
    }

    @Override
    public List<ElectroGoodsResponse> electroGoodsListToResponseList(List<ElectroGoods> goods) {
        return goods.stream().map(this::electroGoodsToResponse).toList();
    }
}
