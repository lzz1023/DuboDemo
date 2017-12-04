package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.CountService;

public class CountServiceImpl implements CountService{
    @Override
    public int getCount(int num) {
        int sum = 0;
        for(int i=1;i<num;i++){
            sum+=i;
        }
        return sum;
    }
}
