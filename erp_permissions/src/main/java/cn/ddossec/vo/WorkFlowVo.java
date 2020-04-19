package cn.ddossec.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class WorkFlowVo extends BaseVo {

    //批量删除使用
    private String[] ids;

    // 流程部署名称
    private String deploymentName;

    //流程部署ID
    private String deploymentId;

}