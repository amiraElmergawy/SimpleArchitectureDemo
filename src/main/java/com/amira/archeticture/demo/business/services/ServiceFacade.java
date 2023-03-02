package com.amira.archeticture.demo.business.services;

import com.amira.archeticture.demo.business.dtos.OrderDto;
import com.amira.archeticture.demo.business.dtos.UserDto;

public interface ServiceFacade {

    public boolean register(UserDto user);
    public boolean login(UserDto user);
    public boolean makeOrder(OrderDto order, int UserId);

}
