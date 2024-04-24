package framework;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

//In layman's terms, this code provides a way to manage configuration settings for a program.
// It reads these settings from a file named "config.properties" and
// allows other parts of the program to ask for specific settings by their names.
// The load() function reads the settings from the file, and
// the get() function retrieves the value of a particular setting when asked for.

public class Configuration {

    private Configuration(){ // cannot be instantiated from outside the class

    }
    private static Properties properties; // hold the configuration settings

    public static void load() throws IOException {  // method responsible for loading configuration settings
        Configuration config = new Configuration(); // creates an instance of Configuration
        properties=new Properties(); // Initializes the properties variable as a new Properties object.
        InputStream is = new FileInputStream(new File("config.properties")); // Opens a file named "config.properties" to read the settings.
        BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8)); //Creates a reader to read the file content using UTF-8 encoding.
        try{
            properties.load(reader); //Loads the properties from the file into the properties object.
        }finally{
            is.close();
            reader.close();   //Finally, it closes the input stream and the reader.
        }
    }
    public static String get(String option) throws IOException { //This method retrieves a specific configuration option.
        if(properties==null){ // Checks if the properties object is null. If it is, it calls the load() method to ensure the settings are loaded.
            load();
        }
        String value =properties.getProperty(option); //Retrieves the value associated with the given option from the properties.
        if(value==null){
            return ""; //If the value is not found (null), it returns an empty string.
        }
        return value;
    }

    public static long timeout() throws Exception {
        String value = get("timeout");
        if(value==null||value.trim().equals("")){
            return 60L;
        }
        return Long.parseLong(value);
    }

}

