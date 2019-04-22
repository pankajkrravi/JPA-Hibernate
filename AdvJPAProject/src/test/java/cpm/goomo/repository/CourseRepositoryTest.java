package cpm.goomo.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.goomo.jpa.AdvJPAProject.AdvJpaProjectApplication;
import com.goomo.jpa.AdvJPAProject.Entity.Course;
import com.goomo.jpa.AdvJPAProject.Reopsitory.CourseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AdvJpaProjectApplication.class)
public class CourseRepositoryTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CourseRepository courserepo;

	@Test
	@DirtiesContext
	public void find_ByMethod() {
		Course course = courserepo.findById(10001L);
		assertEquals("Java EE", course.getName());
		logger.info("Test is running");
	}

	@Test
	@DirtiesContext
	public void deleteByIdTest() {
		courserepo.deleteById(10002L);
		assertNull(courserepo.findById(10002L));
	}

	@Test
	@DirtiesContext
	public void save() {
		// get the course
		Course course = courserepo.findById(10001L);
		assertEquals("Java EE", course.getName());
		// up[date the details of course
		course.setName("Selenium updated");
		courserepo.save(course);
		// check the value
		Course course1 = courserepo.findById(10001L);
		assertEquals("Selenium updated", course1.getName());

		// assertNull(courserepo.findById(10002L));
	}

	@Test
	@DirtiesContext
	public void playWithEntitymanager() {
		courserepo.playWithEntitymanager();

	}
}
