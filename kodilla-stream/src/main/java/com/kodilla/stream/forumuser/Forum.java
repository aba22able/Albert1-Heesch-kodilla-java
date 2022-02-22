package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.util.ArrayList;
import java.util.List;

public final class Forum
{
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(001, "User1", 'M', 5, 1999, 01,01));
        forumUsersList.add(new ForumUser(002, "User2", 'F', 0, 1876,01,01));
        forumUsersList.add(new ForumUser(003, "User3", 'F', 10, 1999,01,01));
        forumUsersList.add(new ForumUser(004, "User4", 'M', 999, 2012,01,01));
        forumUsersList.add(new ForumUser(005, "User5", 'M', 3, 1999,01,01));
        forumUsersList.add(new ForumUser(006, "User6", 'F', 0, 1999,01,01));
        forumUsersList.add(new ForumUser(007, "User7", 'M', 120, 2010,01,01));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(forumUsersList);
    }
}
