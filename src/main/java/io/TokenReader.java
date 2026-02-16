package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TokenReader {
    private final String dirPath = "config";
    private final String filePath = "config/token.txt";

    public String readDiscordToken() {
        String token = "";
        if (!Files.exists(Path.of(dirPath))) {
            try {
                Files.createDirectory(Path.of(dirPath));
            } catch (IOException e) {
                System.err.println("ERROR: config folder could not be created.");
            }
        }
        try {
            token = Files.readString(Path.of(filePath));
        } catch (IOException e) {
            System.err.println("ERROR: File 'token.txt' is either missing or broken. Please (re-)add the file to the config folder and try again.");
        }
        return token;
    }
}
