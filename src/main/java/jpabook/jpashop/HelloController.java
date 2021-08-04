package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")  // hello url 로 오면 매핑이 된다.
    public String hello(Model model) {  //view 에서 데이터를 담아서 controller 에다가 넘길수 있다.
        model.addAttribute("data","hello!!");
        return "hello" ;  //화면이름
    }
}
