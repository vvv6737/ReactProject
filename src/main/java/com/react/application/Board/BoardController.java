package com.react.application.Board;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BoardController {

    @GetMapping("/home")
    public Object main() {
        return "현재시간은 "+new Date()+"입니다.";
    }
}