package cn.ddossec.domain;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Production_process_design_sheet {

    /*
     * 序
     */
    private Integer id;

    /*
     * 产品名称
     */
    private String product_name;

    /*
     * 产品编号
     */
    private String design_idB;

    /*
     * 设计人
     */
    private String product_designer;

    /**
     * 登记人
     */
    private String product_registrant;

    /*
     * 设计要求
     */
    private String esign_require;

    /*
     * 设计时间
     */
    private String design_date;

    /**
     * 设计单号
     */
    private  String design_number;

    /**
     * 审核时间
     */
    private String audit_date;

    public Production_process_design_sheet(Integer id, String product_name, String design_idB, String product_designer, String product_registrant, String esign_require, String design_date, String design_number, String audit_date) {
        this.id = id;
        this.product_name = product_name;
        this.design_idB = design_idB;
        this.product_designer = product_designer;
        this.product_registrant = product_registrant;
        this.esign_require = esign_require;
        this.design_date = design_date;
        this.design_number = design_number;
        this.audit_date = audit_date;
    }
}
