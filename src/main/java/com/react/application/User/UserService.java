package com.react.application.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    //유저 리스트
    public List<UserVO> userList(UserVO userVO) throws Exception {
        return userMapper.userList(userVO);
    }

    //유저 회원가입
    public int userInsert(UserVO userVO) throws Exception {
        return userMapper.userInsert(userVO);
    }
}
