package com.react.application.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/userList")
    @ResponseBody
    public List<UserVO> UserList(UserVO userVO, Model model) throws Exception {
        List<UserVO> userList = userService.userList(userVO);
        model.addAttribute("userList", userList);
        return userList;
    }

    @GetMapping("/reactuserList")
    public String reactUserList(UserVO userVO, Model model) throws Exception {
        List<UserVO> userList = userService.userList(userVO);
        model.addAttribute("userList", userList);
        return "User/UserList";
    }

    @GetMapping("/test")
    @ResponseBody
    public Object test() {
        return "테스트";
    }
}
