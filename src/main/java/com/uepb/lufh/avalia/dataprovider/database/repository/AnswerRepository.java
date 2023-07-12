package com.uepb.lufh.avalia.dataprovider.database.repository;

import com.uepb.lufh.avalia.dataprovider.database.entity.AnswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<AnswerEntity, Long> {

}
