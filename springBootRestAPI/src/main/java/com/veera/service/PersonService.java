/**
 * 
 */
package com.veera.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.veera.model.Person;

/**
 * @author Veera
 *
 */
@Service
public class PersonService {
	Hashtable<String, Person> persons=new Hashtable<String, Person>();
	public PersonService()
	{
		Person person=new Person();
		person.setId(1);
		person.setDateOfBirth("12/16/1950");
		person.setEmail("abc@gmail.com");
		person.setFirstName("Veera");
		person.setLastName("K");
		person.setMiddleName("V");
		person.setPhoneNumber("1234567890");
		persons.put("1", person);
		
		
		person=new Person();		
		person.setId(2);
		person.setDateOfBirth("12/16/1951");
		person.setEmail("abcdef@gmail.com");
		person.setFirstName("keera");
		person.setLastName("last");
		person.setMiddleName("V");
		person.setPhoneNumber("0987654123");
		persons.put("2", person);
		
		
	}
	
	
	public Person getPersonById(String id)
	{
		
		if(persons.containsKey(id))
		{
			return persons.get(id);
		}
		
		return null;
	}
	
	public Hashtable<String, Person> getAllPerson()
	{
		return persons;
	}
	

}
