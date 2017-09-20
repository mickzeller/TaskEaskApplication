package com.mickzeller.repository;

import com.mickzeller.domain.Award;
import org.springframework.data.repository.CrudRepository;


public interface AwardRepository extends CrudRepository<Award, Long>
{
}
