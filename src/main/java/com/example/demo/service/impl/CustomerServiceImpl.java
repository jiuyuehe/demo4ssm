package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【customer】的数据库操作Service实现
* @createDate 2022-09-16 08:53:29
*/
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer>
    implements CustomerService{

}




