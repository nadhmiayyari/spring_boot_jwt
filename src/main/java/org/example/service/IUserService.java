package org.example.service;

import org.example.model.ERole;
import org.example.model.User;

import java.util.List;

public interface IUserService {

      List<User> findAllByRole(ERole role) ;

}