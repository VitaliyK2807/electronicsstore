package electronicsstore.stores.service;

import electronicsstore.stores.model.ElectroGoods;

import java.util.List;

public interface ElectroGoodsService {

    List<ElectroGoods> findAll();

    ElectroGoods findById(Long id);

    ElectroGoods save(ElectroGoods goods);

    ElectroGoods update(ElectroGoods goods);

    void deleteById(Long id);

}
