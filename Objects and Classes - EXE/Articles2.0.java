package JavaFundamentalsExe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Articles {
    static class Article {
        private String title;
        private String content;
        private String author;


        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void Edit(String newContent) {
            this.content = newContent;
        }

        public void ChangeAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        public void Rename(String newTitle) {
            this.title = newTitle;
        }

        @Override
        public String toString() {

            return title + " - " + content + ": " + author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Article> articleList = new ArrayList<>();


        int n = Integer.parseInt(in.nextLine());

        while (n > 0) {
            String[] input = in.nextLine().split(", ");

            Article article = new Article(input[0], input[1], input[2]);

            articleList.add(article);

           /* if (action.equals("Edit")) {
                article.Edit(data[1]);
            } else if (action.equals("ChangeAuthor")) {
                article.ChangeAuthor(data[1]);
            } else if (action.equals("Rename")) {
                article.Rename(data[1]);
            } */

            n--;
        }
        String type = in.nextLine();
        List<Article> sorted = new ArrayList<>();
        if (type.equals("title")) {
            sorted = articleList.stream().sorted(Comparator.comparing(Article::getTitle)).collect(Collectors.toList());
        } else if (type.equals("content")) {
            sorted = articleList.stream().sorted(Comparator.comparing(Article::getContent)).collect(Collectors.toList());
        } else if (type.equals("author")) {
            sorted = articleList.stream().sorted(Comparator.comparing(Article::getAuthor)).collect(Collectors.toList());
        }

        for (Article article : sorted) {
            System.out.println(article.toString());
        }


    }
}
