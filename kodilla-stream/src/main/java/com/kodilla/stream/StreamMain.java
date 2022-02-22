package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum usersOfForum = new Forum();

        Map<Integer, ForumUser> forumUsers = usersOfForum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getPostsQuantity() > 0)
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.of(2002, 1, 1)))
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + forumUsers.size());
        forumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}