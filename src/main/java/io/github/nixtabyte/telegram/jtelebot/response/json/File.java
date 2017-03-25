package io.github.nixtabyte.telegram.jtelebot.response.json;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Knjaz89 on 24.03.2017.
 */
public class File {

    @JsonProperty("file_id")
    private String fileId;

    /**
     * Optional
     */

    @JsonProperty("file_size")
    private Integer fileSize;

    @JsonProperty("file_path")
    private String filePath;

    @Override
    public String toString() {
        return "\nFile{" +
                "fileId='" + fileId + '\'' +
                ", fileSize=" + fileSize +
                ", filePath='" + filePath + '\'' +
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

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
