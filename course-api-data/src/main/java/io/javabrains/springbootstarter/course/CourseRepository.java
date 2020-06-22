package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	//public List<Course> findByName(String name); -- this is the way
	//public List<Course> findByDescription(String foo); -- this is the way
	// public List<Course> getCourseByTopic(String topicId); xx -> Not this way
	
	public List<Course> findByTopicId(String topicId);
}
