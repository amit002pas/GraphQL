package com.graphql.controller;

import com.graphql.model.Employee;
import com.graphql.repository.EmployeeRepository;
import com.graphql.service.GraphQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@RestController
public class EmployeeDetailController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    GraphQLService graphQLService;

    @PostConstruct
    void init() {
        employeeRepository.saveAll(Arrays.asList(new Employee(1, "Amit", 1000),
                new Employee(2, "Ankit", 2000), new Employee(3, "Rishav", 4000)));

    }

    @PostMapping
    public ResponseEntity getEmployeeDetail(@RequestBody String query) {
        System.out.println(employeeRepository.findById(1).get().getEmpId());
        return new ResponseEntity<Object>(graphQLService.graphQL.execute(query), HttpStatus.OK);
    }
}
