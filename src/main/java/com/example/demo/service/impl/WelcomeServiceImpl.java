package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.Welcome;
import com.example.demo.service.WelcomeService;
import com.example.demo.mapper.WelcomeMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【welcome】的数据库操作Service实现
* @createDate 2022-09-16 08:53:29
*/
@Service
public class WelcomeServiceImpl extends ServiceImpl<WelcomeMapper, Welcome>
    implements WelcomeService{

}




