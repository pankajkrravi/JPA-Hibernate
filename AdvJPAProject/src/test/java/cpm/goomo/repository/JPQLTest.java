package cpm.goomo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.goomo.jpa.AdvJPAProject.AdvJpaProjectApplication;
import com.goomo.jpa.AdvJPAProject.Entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AdvJpaProjectApplication.class)
public class JPQLTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager manager;

	@Test
	public void jpql_Basic() {
		//List resultList = manager.createQuery("select c from Course c").getResultList();
		Query resultList = manager.createNamedQuery("query_get_all_courses",Course.class);
		logger.info("=== select  C FROM COURSE C=== ->{}", resultList);
	}

	@Test
	public void jpql_TypedQuery() {
		//TypedQuery<Course> query = manager.createQuery("select c from Course c", Course.class);
		Query query = manager.createNamedQuery("query_get_all_courses",Course.class);
		List<Course> resultList = query.getResultList();
		logger.info("=== select  C FROM COURSE C=== ->{}", resultList);
	}
	@Test
	public void jpql_withWhere() {
		//TypedQuery<Course> query = manager.createQuery("select c from Course c where name like '%EE'", Course.class);
		TypedQuery<Course> query = manager.createNamedQuery("query_get_EE",Course.class);
		List<Course> resultList = query.getResultList();
		logger.info("===select c from Course c where name like '%EE' === ->{}", resultList);
	}
}
