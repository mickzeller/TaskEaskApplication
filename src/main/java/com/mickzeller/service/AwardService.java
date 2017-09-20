package com.mickzeller.service;

import com.mickzeller.domain.Award;
import com.mickzeller.repository.AwardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AwardService
{
    private AwardRepository awardRepository;

    public AwardService(AwardRepository awardRepository)
    {
        this.awardRepository = awardRepository;
    }


    public Iterable<Award> list()
    {
        return awardRepository.findAll();
    }

    public Iterable<Award> save(List<Award> awardList)
    {
        return awardRepository.save(awardList);
    }

}