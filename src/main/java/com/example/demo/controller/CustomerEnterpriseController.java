package com.example.demo.controller;


import com.example.demo.domain.CustomerEnterprise;
import com.example.demo.service.CustomerEnterpriseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags= "客户的企业接口", value = "注意，这是客户的企业的接口，不是租户，也不是本企业")
@Slf4j
@RestController
public class CustomerEnterpriseController {

    @Autowired
    private CustomerEnterpriseService customerEnterpriseService;


    @ApiOperation(value = "新增客户企业信息", notes="新增对象，时间不需要，自动填写")
    @PostMapping("addCusEnt")
    public void addCusEnterprise(CustomerEnterprise customerEnterprise){
        log.debug(customerEnterprise.toString());
        customerEnterpriseService.saveOrUpdate(customerEnterprise);
    }


}
