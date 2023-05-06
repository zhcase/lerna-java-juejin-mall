package ltd.newbee.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ThymeleafController {

    @GetMapping("/thymeleaf")
    public  String hello(HttpServletRequest request, @RequestParam(value = "description",required = false,defaultValue = "springboot-thymeleaf") String description){
        request.setAttribute("descriptions", description);
        return "thymeleaf";
    }

    @GetMapping("/attributes")
    public  String attributes(ModelMap descriptions){
// 更改 h1 内容
        descriptions.put("title", "Thymeleaf 标签演示");
        // 更改 id、name、value
        descriptions.put("th_id", "thymeleaf-input");
        descriptions.put("th_name", "thymeleaf-input");
        descriptions.put("th_value", "13");
        // 更改 class、href
        descriptions.put("th_class", "thymeleaf-class");
        descriptions.put("th_href", "http://13blog.site");
        return "attributes";
    }
}
