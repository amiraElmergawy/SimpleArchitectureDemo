package com.amira.archeticture.demo.business.services;

import java.util.List;

import com.amira.archeticture.demo.business.dtos.UserDto;

public interface UserService {

    public boolean addUser(UserDto user);
    public boolean updateUser(UserDto user);
    public boolean deleteUser(UserDto user);
    public UserDto getUser(int id);
    public UserDto getUser(String username, String password);
    public List<UserDto> getUsers();

}
