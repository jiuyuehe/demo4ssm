package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.CustomerEnterprise;
import com.example.demo.service.CustomerEnterpriseService;
import com.example.demo.mapper.CustomerEnterpriseMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【customer_enterprise(客户企业信息)】的数据库操作Service实现
* @createDate 2022-09-16 08:53:29
*/
@Service
public class CustomerEnterpriseServiceImpl extends ServiceImpl<CustomerEnterpriseMapper, CustomerEnterprise>
    implements CustomerEnterpriseService{

}




