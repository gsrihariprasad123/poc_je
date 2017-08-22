package com.nisum.dao;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.mongodb.WriteResult;
import com.nisum.model.Employee;

@Service("empRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	
	public void saveEmp(Employee emp) {
		mongoTemplate.save(emp);
	}
	
	public void updateEmp(Employee emp) {
		//Query query = new Query();
	    //query.addCriteria(where("id").is(emp.getId()));

	    //and then you can add or update the new field (if the field does not exist, the template adds it into the document)
	    //Update update = new Update();
	    //update.set("addThisField", new Date());
		mongoTemplate.save(emp);
	   // mongoTemplate.upsert(query, update, Employee.class);
		
		//mongoTemplate.updateMulti(query, update, entityClass, collectionName)
	}
	@Override
	public Employee findById(String id) {

		Employee user = mongoTemplate.findOne(query(where("id").is(id)),
				Employee.class);
		// mongoTemplate.find(query, entityClass)
		return user;
	}
	@Override
	public Employee findByName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String removeById(String id) {
		// TODO Auto-generated method stub
		System.out.println("Its Came here............");
		WriteResult w=mongoTemplate.remove(new Query(Criteria.where("id").is(id)), Employee.class);
		
		System.out.println(w.toString()+"    ....   "+w.getN() + "  is updated: "     + w.isUpdateOfExisting());
	if(w.getN()==1)
		return "{\"msg\""+ ":"   +" \"successfully deleted\"}";
	else
		return "{\"msg\""+ ":"   +" \"id not found \"}";
	
		
	}

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		List<Employee> so=mongoTemplate.findAll(Employee.class);
		return so;
	}

	

}
