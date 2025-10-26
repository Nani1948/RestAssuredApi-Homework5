package utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataUtils {

    public static String readJSONFileToString(String sFilePath) throws IOException {

        byte[] data = Files.readAllBytes(Paths.get(sFilePath));
        return new String(data, StandardCharsets.UTF_8);
    }
}
