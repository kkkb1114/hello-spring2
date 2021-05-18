package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("data")// URL에서 PHP GET방식처럼 ???/data를 치면 해당 메소드가 실행된다.
    public String hello(Model model){

        model.addAttribute("data", "datadata!!"); // 앞단은 키값, 뒷단은 데이터
        return "data";//return값은 해당 이름을 가진 html 파일로 데이터를 전송

    }

}
