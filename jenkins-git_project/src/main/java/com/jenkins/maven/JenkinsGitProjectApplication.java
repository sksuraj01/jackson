package com.jenkins.maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsGitProjectApplication {
	
	
	public static Logger logger=LoggerFactory.getLogger(JenkinsGitProjectApplication.class);
	
	public void init()
	{
		logger.info("Application started now by me");
	}

	public static void main(String[] args) {
		logger.info("Application executing");
		SpringApplication.run(JenkinsGitProjectApplication.class, args);
	}

}
