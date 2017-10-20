/**
 * 
 */
package com.veera.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veera.model.Person;
import com.veera.service.PersonService;

/**
 * @author Veera
 *
 */
@RestController
@RequestMapping("/personService")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/personList")
	public Hashtable<String, Person> getAllPersonList()
	{
		return personService.getAllPerson();
	}
	
	@RequestMapping("/getPersonById/{id}")
	public Person getPersonById(@PathVariable("id") String id)
	{
		return personService.getPersonById(id);
	}

}
