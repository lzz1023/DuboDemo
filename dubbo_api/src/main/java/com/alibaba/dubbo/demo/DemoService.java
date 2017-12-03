package com.alibaba.dubbo.demo;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by lzz1023 on 20171201
 */
public interface DemoService {
    List<String> getPermissions(Long id);

}
