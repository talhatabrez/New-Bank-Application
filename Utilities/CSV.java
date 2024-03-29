package Utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    //methods reads data from .csv file 
    public static List<String[]> read(String file){
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;

        try{
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                while ((dataRow = br.readLine()) != null) {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Could not find file");
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println("Could not read file");
            e.printStackTrace();
        }
        return data;
    }
}
