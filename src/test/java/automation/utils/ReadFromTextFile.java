package automation.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromTextFile {
    public static void main(String[] args) throws IOException {

        File file =new File("src/test/resources/data/data.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        //Read line
        String line =bufferedReader.readLine();

        //Check if line is not null
        while (line!=null){
            System.out.println(line);
            line=bufferedReader.readLine();
        }
        //Method 2
        System.out.println("================= Method 2 ==============");
        Scanner sc =new Scanner(file);
        System.out.println(sc.useDelimiter("\\Z").next());

        // Method 3
        sc =new Scanner(file);
        System.out.println("=============== Method 3 ==================");
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
