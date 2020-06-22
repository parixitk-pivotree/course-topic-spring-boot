package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

	//getAllTopics()
	//getTopic(String id)
	//updateTopic(String id)
	//deleteTopic(String id)
	//ignore above methods as we have one common repository interface [CrudRepository] provided by Spring JPA
	
}
