package model;

import java.io.Serializable;

public class Slide implements Serializable {
    private static final long serialVersionUID = 3894204398831539634L;

    private Integer id;
    private String content;
    private Integer courseWareId;
    private Integer version;
    private Integer parentSlideId;
    private Integer parentSlideVersion;
    private Integer originCourseWareId;

    public Slide() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getCourseWareId() {
        return courseWareId;
    }

    public void setCourseWareId(Integer courseWareId) {
        this.courseWareId = courseWareId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getParentSlideId() {
        return parentSlideId;
    }

    public void setParentSlideId(Integer parentSlideId) {
        this.parentSlideId = parentSlideId;
    }

    public Integer getParentSlideVersion() {
        return parentSlideVersion;
    }

    public void setParentSlideVersion(Integer parentSlideVersion) {
        this.parentSlideVersion = parentSlideVersion;
    }

    public Integer getOriginCourseWareId() {
        return originCourseWareId;
    }

    public void setOriginCourseWareId(Integer originCourseWareId) {
        this.originCourseWareId = originCourseWareId;
    }
}
