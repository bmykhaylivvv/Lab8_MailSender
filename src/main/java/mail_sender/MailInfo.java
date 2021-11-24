package mail_sender;

import java.util.HashMap;

public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public MailInfo(Client infoClient, MailCode infoMailCode) {
        client = infoClient;
        mailCode = infoMailCode;
    }


    public String getText() {
        HashMap<String, String> templates = new HashMap<String, String>();
        templates.put("%NAME%", client.getClientName());

        String text = mailCode.generateText();
        for (String key : templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }

        return text;
    }

    public String getEmail() {
        return client.getEmail();
    }
}
