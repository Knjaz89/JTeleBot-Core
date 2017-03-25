package io.github.nixtabyte.telegram.jtelebot.response.json;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Arrays;

/**
 * Created by Knjaz89 on 24.03.2017.
 *
 * @see <a href="https://core.telegram.org/bots/api#game">http://google.com</a>
 */
public class Game {

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("photo")
    private PhotoSize[] photo;

    /**
     * Optional
     */

    @JsonProperty("text")
    private String text;

    @JsonProperty("text_entities")
    private MessageEntity[] textEntities;

    @JsonProperty("animation")
    private Animation animation;

    @Override
    public String toString() {
        return "\nGame{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", photo=" + Arrays.toString(photo) +
                ", text='" + text + '\'' +
                ", textEntities=" + Arrays.toString(textEntities) +
                ", animation=" + animation +
                '}';
    }

    /**
     * Getter and setter
     */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PhotoSize[] getPhoto() {
        return photo;
    }

    public void setPhoto(PhotoSize[] photo) {
        this.photo = photo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MessageEntity[] getTextEntities() {
        return textEntities;
    }

    public void setTextEntities(MessageEntity[] textEntities) {
        this.textEntities = textEntities;
    }

    public Animation getAnimation() {
        return animation;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }
}
