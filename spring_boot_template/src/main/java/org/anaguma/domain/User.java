package org.anaguma.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="users")
@Data
@ToString
public class User {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String userName;
    private String password;
    private Date   createAt;
    private Date   updateAt;

}
