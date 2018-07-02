package com.hibernate.Fourth;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class Main {

	//Main class to create record in (MANY TO ONE) relationships between tables
	public static void main(String[] args) {
		
			StudentAddress studentAddress=new StudentAddress();
			studentAddress.setAddress_detail("Crnjelovo,Republika Srpska");
			
			Student student1=new Student();
			student1.setStudent_name("Radenko");
			student1.setStudentAddress(studentAddress);
			
			
			Student student2=new Student();
			student2.setStudent_name("Milka");
			student2.setStudentAddress(studentAddress);
			
			StandardServiceRegistry standardRegistry = 
				       new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
					Metadata metaData = 
				        new MetadataSources(standardRegistry).getMetadataBuilder().build();
					SessionFactory sessionFactory = metaData.getSessionFactoryBuilder().build();
					
					Session session=sessionFactory.openSession();
					session.beginTransaction();
					
					
					session.save(student1);
					session.save(student2);
					
					session.getTransaction().commit();
					session.close();
					sessionFactory.close();
	}
}
