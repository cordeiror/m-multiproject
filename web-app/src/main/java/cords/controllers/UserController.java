package cords.controllers;

import cords.entities.User;
import cords.schema.UserCommand;

/**
 * Created by renato on {2019-12-13}
 */
public class UserController {
    User saveUser(UserCommand command){
        return new User();
    }
}
