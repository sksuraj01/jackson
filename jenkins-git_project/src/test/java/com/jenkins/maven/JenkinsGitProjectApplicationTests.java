package com.jenkins.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class JenkinsGitProjectApplicationTests {
	
	
	public static Logger logger=LoggerFactory.getLogger(JenkinsGitProjectApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Application is being tested");
		assertEquals(true,true);
	}

}
