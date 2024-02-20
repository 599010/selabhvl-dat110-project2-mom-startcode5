package no.hvl.dat110.messages;

public class PublishMsg extends Message {

    private String topic;
    private String message;

    // message sent from client to publish a message on a topic 
    public PublishMsg(String user, String topic, String message) {
        super(MessageType.PUBLISH, user); // Assuming MessageType is an enum defining message types
        this.topic = topic;
        this.message = message;
    }

    // getter and setter methods for topic and message
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // toString method that uses the 'user' field from the superclass
    @Override
    public String toString() {
        return "PublishMsg{" +
                "user='" + getUser() + '\'' +
                ", topic='" + topic + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
