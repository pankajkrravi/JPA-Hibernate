package com.goomo.jpa.AdvJPAProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.goomo.jpa.AdvJPAProject.Entity.Course;
import com.goomo.jpa.AdvJPAProject.Reopsitory.CourseRepository;
import com.goomo.jpa.AdvJPAProject.Reopsitory.StudentRepository;


@SpringBootApplication
public class AdvJpaProjectApplication implements CommandLineRunner {

	/*
	 * @Autowired private CourseRepository courseRepository;
	 */
	@Autowired
	private StudentRepository studentRepository;
	private Logger logger = LoggerFactory.getLogger(Course.class);

	public static void main(String[] args) {
		SpringApplication.run(AdvJpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		studentRepository.saveStudentWithPassport();
		/*
		 * Course course = repository.findById(10001L); logger.info("Course 10001 ->{}",
		 * course); //repository.deleteById(10001L); repository.save(new
		 * Course("Microservises demo"));
		 * 
		 */
		//repository.playWithEntitymanager();
	}

}
