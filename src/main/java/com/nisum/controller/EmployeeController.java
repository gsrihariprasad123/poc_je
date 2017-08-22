package com.nisum.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.model.Employee;
import com.nisum.service.EmployeeService;

@RestController
public class EmployeeController {

	
	 @Autowired
	    private EmployeeService empService;
	 	private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();

	    @RequestMapping("/getById")
	    public Employee getById(@RequestParam(value="eid", defaultValue="World") String eid) {
	    	
	    	return	empService.getById(eid);
	                       
	    }
	    
	    @RequestMapping("/removeById")
	    public String removeById(@RequestParam(value="eid", defaultValue="World") String eid) {
	  
	    	return empService.remove(eid);
	                       
	    }
	    @RequestMapping(value="/save",method = RequestMethod.POST)	    
	    public String save(@RequestBody Employee emp) {
	    	
	    		empService.save(emp);
	        return "{\"msg\":\"Successfully submitted\"}";               
	    }
	    
	  
	    
	    @RequestMapping(value="/update",method = RequestMethod.PUT)	    
	    public String update(@RequestBody Employee emp) {
	    	
	    		empService.update(emp);
	        return "Successfully updated";               
	    }
	    @RequestMapping(value="/getAll",method = RequestMethod.GET)	    
	    public List<Employee> getAll() {
	    	
	    		
	        return empService.getAll();               
	    }
	    
	    @RequestMapping(value="/saveGet",method = RequestMethod.GET)	    
	    public String saveGet(@RequestParam(value="eid", defaultValue="World") String eid,
	    		@RequestParam(value="name", defaultValue="default") String name,
	    		@RequestParam(value="age", defaultValue="23") String age,
	    		@RequestParam(value="position", defaultValue="position") String position,
	    		@RequestParam(value="exp", defaultValue="exp") String exp) {
	    		Employee emp1 = new	Employee(eid, name,  position, Integer.parseInt( exp), Integer.parseInt( age));
	    		empService.save(emp1);
	        return "Successfully submitted";               
	    }
}
