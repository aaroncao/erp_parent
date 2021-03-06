package cn.ddossec.service;

import cn.ddossec.domain.Product_designprocess;
import cn.ddossec.domain.Production_mdesign_procedure;

import java.util.List;

public interface Product_designprocessService {



    /*查询所有数据**/
    public List<Product_designprocess> findAllProduction_modesign_procedure();

    /**
     * 根据产品编号查询单中的工序
     *
     */
    public  List<Product_designprocess>   findDId(String  design_id);

    public void updateProduct_designprocess(List<Product_designprocess> product_designprocessesLis,Integer sjdId ,Integer shdId,String edie_date,String userName);

    /**
     * 添加
     *
     */
    public int insertProduction_modesign_procedure(Product_designprocess product_designprocess);
}
