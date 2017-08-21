package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final Integer userID;
    private final String userName;
    private final char userSex;
    private final LocalDate userBirth;
    private final Integer userPosts;

    public ForumUser(Integer userID, String userName, char userSex, String userBirth, Integer userPosts) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.userBirth = LocalDate.parse(userBirth);
        this.userPosts = userPosts;
    }

    public Integer getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public Integer getAge() {
        LocalDate today = LocalDate.now();
        return today.getYear() - userBirth.getYear();
    }

    public Integer getUserPosts() {
        return userPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID: " + userID +
                ", Name: '" + userName + '\'' +
                ", Sex: " + userSex +
                ", Age: " + getAge() +
                ", Number of Posts: " + userPosts +
                '}';
    }
}
