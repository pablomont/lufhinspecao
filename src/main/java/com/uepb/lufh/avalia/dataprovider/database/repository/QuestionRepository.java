package com.uepb.lufh.avalia.dataprovider.database.repository;

import com.uepb.lufh.avalia.dataprovider.database.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity, Long> {

    List<QuestionEntity> findAllByIdIn(List<Long> questionIds);

}
