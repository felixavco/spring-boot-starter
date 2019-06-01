package com.xilews.springbootstarter.topic;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public ArrayList<Topic> getAllTopics() {
		
		ArrayList<Topic> topics = new ArrayList<Topic>();
		
		topics.add(new Topic(1, "Java", "Java Course"));
		topics.add(new Topic(2, "NodeJs", "NodeJS Course"));
		topics.add(new Topic(3, "React", "React Course"));
		topics.add(new Topic(4, "JavaScript", "JavaScript Course"));
		
		return topics;
	}
}
