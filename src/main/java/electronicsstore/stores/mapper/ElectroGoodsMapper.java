package electronicsstore.stores.mapper;

import electronicsstore.stores.mapper.delegate.ElectroGoodsMapperDelegate;
import electronicsstore.stores.model.ElectroGoods;
import electronicsstore.stores.web.model.request.ElectroGoodsRequest;
import electronicsstore.stores.web.model.response.electrogoods.ElectroGoodsListResponse;
import electronicsstore.stores.web.model.response.electrogoods.ElectroGoodsResponse;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@DecoratedWith(ElectroGoodsMapperDelegate.class)
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ElectroGoodsMapper {

    ElectroGoods requestToElectroGoods(ElectroGoodsRequest request);

    @Mapping(source = "goodsId", target = "id")
    ElectroGoods requestToElectroGoods(Long goodsId, ElectroGoodsRequest request);

    ElectroGoodsResponse electroGoodsToResponse(ElectroGoods electroGoods);

    List<ElectroGoodsResponse> electroGoodsListToResponseList(List<ElectroGoods> goods);

    default ElectroGoodsListResponse electroGoodsListToListResponse(List<ElectroGoods> goods) {
        return ElectroGoodsListResponse.builder()
                .goods(electroGoodsListToResponseList(goods))
                .build();
    }
}
