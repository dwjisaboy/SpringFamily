package wenjie.deng.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wenjie.deng.myboot.GetHashCodeClass;

@RestController
@RequestMapping("/demo")
public class TestController {

    @Autowired
    private GetHashCodeClass getHashCodeClass;

    @RequestMapping("/test")
    public String test(){
        System.out.println(getHashCodeClass.getHashCode());
        return getHashCodeClass.getHashCode();
    }
}
