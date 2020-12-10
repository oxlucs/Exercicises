package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private String title;
    private String content;
    private Date moment;
    private Integer likes;
    private static SimpleDateFormat sdf1 = new SimpleDateFormat("DD/mm/yyyy HH:mm:ss");

    private List <Coments> comments = new ArrayList<>();

    public Post(){

    }
    public Post(String title, String content, Date moment, Integer likes){
        this.title = title;
        this.content = content;
        this.moment = moment;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getMoment() {
        return moment;
    }

    public Integer getLikes() {
        return likes;
    }

    public List<Coments> getComments() {
        return comments;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComments  (Coments comment){
        comments.add(comment);
    }
    public void removeComments (Coments comment){
        comments.remove(comment);
    }

    public String toString  () {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes + " likes - ");
        sb.append(sdf1.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Coments " + "\n");
        for (Coments c : comments){
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }

}
