package controller;

import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by WD42700 on 2018/7/19.
 */

@Controller
public class FirstController {

    @RequestMapping("index")
    public String Index() {
        System.out.print("进入了index页面");
        int  a=100;
        return "index";
    }


}
