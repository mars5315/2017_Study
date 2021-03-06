package cn.helloan.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.helloan.entity.Person;
import cn.helloan.service.PersonService;

@Controller
@RequestMapping(value="/test")
public class HelloAction {
	private static final Logger logger = LoggerFactory.getLogger(HelloAction.class);
	@Resource
	private PersonService personService;
	/**
	 * 这是范例
	 * @return
	 * @author Lou Ge
	 */
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(){
		logger.debug("hello run!");
		System.out.println("hello world!");
		List<Person> all = personService.getAll();
		for (Person person : all) {
			System.out.println(person);
		}
		return "ok";
	}

}
