package com.galvanize.triviaapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.galvanize.triviaapp.entity.QuestionEntity;

@RepositoryRestResource(path = "questions")
public interface QuestionRepository extends JpaRepository<QuestionEntity, Integer> {

	default List<QuestionEntity> findQuestionsQuizId() {
		int maxSize = countDistinctQuizId();
		return maxSize > 0 ? this.findAllByQuizId(RandomUtils.nextInt(1, maxSize + 1)) : new ArrayList<>();
	}

	@RestResource(exported = false)
	public List<QuestionEntity> findAllByQuizId(Integer quiz_id);

	@RestResource(exported = false)
	@Query(value = "SELECT COUNT(DISTINCT quiz_id) FROM question", nativeQuery = true)
	public int countDistinctQuizId();

}
