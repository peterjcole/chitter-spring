package net.petercole.chitterspring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document
public class Peep {

    @Id
    public String id;

    public String username;
    public String peepText;
    public Date creationDateTime;

    public Peep(String id, String username, String peepText, Date creationDateTime) {
        this.id = id;
        this.username = username;
        this.peepText = peepText;
        this.creationDateTime = creationDateTime;
    }

    public Peep(String username, String peepText, Date creationDateTime) {
        this.username = username;
        this.peepText = peepText;
        this.creationDateTime = creationDateTime;
    }

    public Peep(String username, String peepText) {
        this.username = username;
        this.peepText = peepText;
        this.creationDateTime = new Date();
    }

    public Peep() {
    }


    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPeepText() {
        return peepText;
    }

    public void setPeepText(String peepText) {
        this.peepText = peepText;
    }

    public Date getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    @Override
    public String toString() {
        return String.format(
                "Peep[id=%s, username='%s', peepText='%s', time='%s']",
                id, username, peepText, creationDateTime.toString());
    }

}
