package net.petercole.chitterspring.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document
public class Peep {

    @Id
    public String id;

    public String username;
    public String peepText;
//    public Date creationDateTime;

    @CreatedDate
    private Date createdDate;

    @LastModifiedDate
    private Date lastModifiedDate;

    public Peep(String id, String username, String peepText, Date createdDate, Date lastModifiedDate) {
        this.id = id;
        this.username = username;
        this.peepText = peepText;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public String toString() {
        return String.format(
                "Peep[id=%s, username='%s', peepText='%s', time='%s']",
                id, username, peepText, createdDate.toString());
    }

}
