package mail_sender;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() {
        try {
            File myObj = new File(filename);
            StringBuilder fileContents = new StringBuilder((int)myObj.length());
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                fileContents.append(myReader.nextLine() + System.lineSeparator());
            }

            return fileContents.toString();

        } catch (FileNotFoundException e) {
            return "";
        }
    }
}
