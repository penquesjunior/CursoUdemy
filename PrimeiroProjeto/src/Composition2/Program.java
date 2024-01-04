package Composition2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Composition2.Entities.Comment;
import Composition2.Entities.Post;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!!");
        Comment c2 = new Comment("Wow that's awesome!!");

        Post p1 = new Post(sdf.parse("04/01/2024 14:17:55"),
                "Traveling to new York", "i'm going to visit this wonderful country!", 620);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        Comment c3 = new Comment("Good Night bro");
        Comment c4 = new Comment("May the force be with you");

        Post p2 = new Post(sdf.parse("10/01/2024 14:17:55"),
                "i Study all night",
                "gonna be alright",
                24);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);

    }
}