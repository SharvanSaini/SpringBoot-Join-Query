package com.demo.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dom.StudentDetail;
import com.demo.model.StudentEntity;
import com.demo.repository.StudentRepository;



@Service
public class QueryService implements IQueryService {

    @Autowired
    StudentRepository studentrepository;

    @Autowired
    EntityManagerFactory emf;

    @Override
    public List<StudentDetail> JPQLQuery()
    {
        EntityManager em = emf.createEntityManager();
        //em.getTransaction().begin( );

        Query query = em.createQuery("Select " +"s.rollNumber,s.name,d.departName,"
+"s.age,s.email from StudentEntity s " +
                "inner join DepartmentEntity d on s.departmentId=d.departmentId");
        @SuppressWarnings("unchecked")
        List<StudentDetail> list =(List<StudentDetail>)query.getResultList();
        System.out.println("Student Name :");
        em.close();

        return list;

    }

    public List<StudentEntity> studentAllData()
    {
        return studentrepository.findAll();
    }

}
