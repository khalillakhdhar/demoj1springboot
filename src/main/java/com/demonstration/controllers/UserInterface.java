package com.demonstration.controllers;

import java.util.List;

import com.demonstration.model.User;

public interface UserInterface {
public List<User> getAllUsers();
public User getOneUser(long id);
public void deleteOneUser(long id);
public void deleteAllUsers();
}
