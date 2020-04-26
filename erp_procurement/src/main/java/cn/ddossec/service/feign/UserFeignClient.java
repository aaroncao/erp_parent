package cn.ddossec.service.feign;

import cn.ddossec.common.DataGridView;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "permissions-provider")
public interface UserFeignClient {

    @RequestMapping("loadUserByUserId")
    public DataGridView loadUserByUserId(Integer userId);

}