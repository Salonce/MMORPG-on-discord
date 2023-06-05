package saloncey.d4jmmorpg.Messages.GameObjects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Journey {
    private int id;
    private String text;

    public Journey() {
        // Default constructor required for Jackson deserialization
    }

    public Journey(int id, String text) {
        this.id = id;
        this.text = text;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }
}
