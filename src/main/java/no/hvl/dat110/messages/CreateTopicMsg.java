package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
    
    private String topic; // Removed the 'user' field, will use 'user' from Message

    public CreateTopicMsg(String user, String topic) {
        super(MessageType.CREATETOPIC, user);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "CreateTopicMsg{" +
                "user='" + getUser() + '\'' + // Use getUser() method from Message class
                ", topic='" + topic + '\'' +
                '}';
    }
}
