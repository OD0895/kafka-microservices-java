package kafkamicroservices.kafka;

import java.util.Objects;

public final class MessageRequest {
    private final String message;

    MessageRequest(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        MessageRequest that = (MessageRequest) obj;
        return Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        return "MessageRequest[" +
                "message=" + message + ']';
    }

}
