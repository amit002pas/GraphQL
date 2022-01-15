package com.graphql.service;

import com.graphql.model.Employee;
import com.graphql.repository.EmployeeRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllEmployeeFetcher implements DataFetcher<List<Employee>> {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> get(DataFetchingEnvironment dataFetchingEnvironment) {
        return employeeRepository.findAll();
    }
}
