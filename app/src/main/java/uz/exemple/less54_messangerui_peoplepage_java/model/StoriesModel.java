package uz.exemple.less54_messangerui_peoplepage_java.model;

public class StoriesModel {
    private Integer profile = null;
    private int background;
    private int countStories;
    private String fullName;

    public StoriesModel(Integer profile, int background, int countStories, String fullName) {
        this.profile = profile;
        this.background = background;
        this.countStories = countStories;
        this.fullName = fullName;
    }

    public Integer getProfile() {
        return profile;
    }

    public int getBackground() {
        return background;
    }

    public int getCountStories() {
        return countStories;
    }

    public String getFullName() {
        return fullName;
    }
}
