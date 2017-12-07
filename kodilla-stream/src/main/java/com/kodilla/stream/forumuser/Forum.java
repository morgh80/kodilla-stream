package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(1, "Jan Kowalski", 'M', "2000-01-01", 2));
        forumUsersList.add(new ForumUser(2, "Adam Jarząbek", 'M', "1970-01-01", 12));
        forumUsersList.add(new ForumUser(3, "Grażyna Janusz", 'F', "1960-01-01", 21));
        forumUsersList.add(new ForumUser(4, "Janusz Maria Grażyna", 'M', "1950-01-01", 21));
        forumUsersList.add(new ForumUser(5, "Senior Siarra", 'M', "1940-01-01", 0));
    }

    public List<ForumUser> getForumUsersList() {
        return new ArrayList<>(forumUsersList);
    }
}
