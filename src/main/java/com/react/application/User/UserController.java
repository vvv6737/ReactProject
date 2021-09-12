package com.react.application.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/userList")
    public String UserList(UserVO userVO, Model model) throws Exception {
        List<UserVO> userList = userService.userList(userVO);
        model.addAttribute("userList", userList);
        return "User/UserList";
    }
}
