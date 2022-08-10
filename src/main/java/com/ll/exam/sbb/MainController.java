package com.ll.exam.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/sbb")
    // 아래 함수의 리턴값을 그대로 브라우저에 표시한다.
    // 아래 함수의 리턴 값을 문자열화 해서 브라우저 응답의 바디에 담는다.
    @ResponseBody
    public String index() {
        //서버에서 실행(console)
        System.out.println("Hello");
        // 먼 미래에 브라우저에서 보여진다.
        return "안녕하세요.";
    }
}