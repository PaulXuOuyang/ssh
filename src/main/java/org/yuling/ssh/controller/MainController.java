package org.yuling.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yuling.ssh.service.MainService;

@Controller
@RequestMapping("/main")
public class MainController {

	@Autowired
	MainService mainService;
	
	 @RequestMapping(value = "/test", method = RequestMethod.GET)
	 public String test(){
		 //实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
        return "test";
	 }
	 
	 @RequestMapping(value = "/springTest", method = RequestMethod.GET)
	 public String springTest(){
		 return mainService.test();
	 }

    @RequestMapping(value = "/savePerson", method = RequestMethod.GET)
    @ResponseBody
    public String savePerson(){
    	try{
    		mainService.savePerson();
    		return "success!";
    	}catch(RuntimeException e){
    		e.printStackTrace();
    		return e.getMessage();
    	}
       
    }
	
}
