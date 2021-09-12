package com.react.application.User;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    //유저 회원가입
    int userInsert(UserVO userVO) throws Exception;

    //유저 목록
    List<UserVO> userList(UserVO userVO) throws Exception;
}
