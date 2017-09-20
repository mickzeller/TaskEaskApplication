package com.mickzeller.util;


import com.mickzeller.domain.Award;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

import java.util.function.Function;
import java.util.stream.Collectors;

public class ReadFile
{
    private List<Award> inputList = new ArrayList<>();


    public ReadFile(String filePath)
    {
        processInputFile(filePath);
    }

    //From Java, read in a csv file and translate the output to a Java object.
    public List<Award> processInputFile(String inputFilePath)
    {

        try
        {
            File inputF = new File(inputFilePath);
            InputStream inputFS = new FileInputStream(inputF);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputFS));
            // skip the header of the csv
            inputList = bufferedReader.lines().skip(1).map(mapToItem).collect(Collectors.toList());
            bufferedReader.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return inputList;
    }

    private Function<String, Award> mapToItem = (line) ->
    {

        String[] array = line.split(",");// a CSV has comma separated lines
        Award award = new Award();
        award.setYear(array[0]);//<-- this is the first column in the csv file
        if (array[1] != null && array[1].trim().length() > 0)
        {
            award.setActress(array[1]);
        }
        if (array[2] != null && array[2].trim().length() > 0)
        {
            award.setMovie(array[2]);
        }
        return award;
    };


    public List<Award> getInputList()
    {
        return inputList;
    }
}
