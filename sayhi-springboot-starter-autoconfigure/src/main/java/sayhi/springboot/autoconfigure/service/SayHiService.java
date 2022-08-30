package sayhi.springboot.autoconfigure.service;

import org.springframework.beans.factory.annotation.Autowired;
import sayhi.springboot.autoconfigure.properies.SayHiProperies;

public class SayHiService {

    @Autowired
    private  SayHiProperies sayHiProperies;

    public String sayHi(String name){

        return sayHiProperies.getPrefix()+name+sayHiProperies.getSuffix();
    }
}