package com.mickzeller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mickzeller.domain.Award;
import com.mickzeller.service.AwardService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


@SpringBootApplication
public class Application
{

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
        //ReadFile file = new ReadFile("csv/academy_award_actresses.csv");
    }

    //load json file into database at runtime
    @Bean
    CommandLineRunner runner(AwardService awardService)
    {
        return args ->
        {
            //using jackson Object mapper to read in json file and load it to database
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Award>> typeReference = new TypeReference<List<Award>>()
            {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream("/json/academy_award_actresses.json");
            try
            {
                List<Award> awardList = mapper.readValue(inputStream, typeReference);
                awardService.save(awardList);
                System.out.println("json saved successfully");
            } catch (IOException e)
            {
                System.out.println("unable to save: " + e.getMessage());
            }
        };
    }

}
