package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        System.out.println("Excersise 7.3");

        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUsersList = forum.getForumUsersList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'M')
                .filter(forumUser -> forumUser.getAge() > 20)
                .filter(forumUser -> forumUser.getUserPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        forumUsersList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }

}
