package mail_sender;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Client {
    private static int count = 0;
    private int clientId;
    private String clientName;
    private int clientAge;
    private ClientSexEnum clientSex;
    private String clientEmail;

    public Client(String name, int age, ClientSexEnum sex, String email) {
        clientId = count++;
        clientName = name;
        clientAge = age;
        clientSex = sex;
        clientEmail = email;
    }

    public String getEmail() {
        return clientEmail;
    }
}
