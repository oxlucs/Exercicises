package com.Aplication;

import entities.Coments;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat ("DD/mm/yyyy HH:mm:ss");

        Coments c1 = new Coments ("Have a nice trip!");
        Coments c2 = new Coments ("Have a nice trip!");
        Post post = new Post("Travelling to new Zealand",
                "I'm going to visit this wonderful country!",
                sdf.parse("21/06/2018 13:05:44"),
                12);
        post.addComments(c1);
        post.addComments(c2);

        Post post2 = new Post ("Good Night Guys", "See you tomorow",
                sdf.parse("27/08/2018 23:14:19"),
                5);
        Coments c3 = new Coments ("Good Night!");
        Coments c4 = new Coments ("May the force be with you!");
        post2.addComments(c3);
        post2.addComments(c4);

        System.out.println(post);
        System.out.println(post2);





    }
}
