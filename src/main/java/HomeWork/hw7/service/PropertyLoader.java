package HomeWork.hw7.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PropertyLoader {

    public static String getProperty(String name) throws IOException {
        Path path = Paths.get("application.properties");
        String propertyFileString = new String(Files.readAllBytes(path));
        return propertyFileString.split("=")[1];
    }
}
