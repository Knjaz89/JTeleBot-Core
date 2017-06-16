package io.github.nixtabyte.telegram.jtelebot.response.json;

import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Created by Knjaz89 on 16.06.2017.
 *
 * @see <a href="https://core.telegram.org/bots/api#videonote">http://google.com</a>
 */

public class VideoNote {

    @JsonProperty("file_id")
    private String fileId;

    @JsonProperty("length")
    private Integer length;

    @JsonProperty("duration")
    private Integer duration;

    /**
     * Optional
     */

    @JsonProperty("thumb")
    private PhotoSize thumb;

    @JsonProperty("file_size")
    private Integer fileSize;

    @Override
    public String toString() {
        return "\nVideoNote{" +
                "fileId='" + fileId + '\'' +
                ", length=" + length +
                ", duration=" + duration +
                ", thumb=" + thumb +
                ", fileSize=" + fileSize +
                '}';
    }

    /**
     * Getter and setter
     */

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
}
