package com.hibernate.Second;

import java.lang.annotation.Annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.fasterxml.classmate.AnnotationConfiguration;
import com.fasterxml.classmate.AnnotationInclusion;


//Main class to create record in table (ONE TO ONE ) 
public class MainStudent {

	public static void main(String[] args) {
		
		Student student=new Student();
		
		student.setStudent_name("Milenko");
		
		StudentDetail student_detail=new StudentDetail();
		student_detail.setStudent_mobile_number("065353917");
		
		student_detail.setStudent(student);
		
		StandardServiceRegistry standardRegistry = 
			       new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				Metadata metaData = 
			        new MetadataSources(standardRegistry).getMetadataBuilder().build();
				SessionFactory sessionFactory = metaData.getSessionFactoryBuilder().build();
				
				Session session=sessionFactory.openSession();
				session.beginTransaction();
				
				
				session.save(student_detail);
				
				session.getTransaction().commit();
				session.close();
				sessionFactory.close();
	}
}
