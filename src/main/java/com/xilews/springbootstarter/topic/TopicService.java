package com.xilews.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic(1, "Java", "Java Course"),
			new Topic(2, "NodeJs", "NodeJS Course"), 
			new Topic(3, "React", "React Course"),
			new Topic(4, "JavaScript", "JavaScript Course"));

	public List<Topic> getAllTopics() {
		return this.topics;
	}

	public Topic getTopic(int id) {
		return topics.stream().filter(t -> t.getId() == id).findFirst().get();
	}
}
