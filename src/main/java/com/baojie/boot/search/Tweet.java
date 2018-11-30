package com.baojie.boot.search;


import java.util.Date;

public class Tweet {

    private  String text;
    private  Date createdAt=new Date();
    private String profileImageUrl;
    private String languageCode;
    private Integer retweetCount;
    private TwitterProfile user;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Integer getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    public TwitterProfile getUser() {
        return user;
    }

    public void setUser(TwitterProfile user) {
        this.user = user;
    }
}
