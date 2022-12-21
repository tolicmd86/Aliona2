package automation.utils;

import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {
    static Properties properties;
    public static void initProperties(){

        try{
            FileReader fileReader=new FileReader("src/test/resources/data/config.properties");
            properties = new Properties();
            properties.load(fileReader);
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
