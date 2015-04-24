package org.anaguma.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.ToString;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="users")
@Data
@ToString
public class User implements Serializable{

    private static final long serialVersionUID = -1233274848853911489L;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Id
    @NotEmpty
    @Size(min = 1, max = 50)
    private String userName;

    @NotEmpty
    @Size(max = 64)
    private String password;

    private Boolean enabled;

// Delegate Data Base trigger
//    private Date   createAt;
//    private Date   updateAt;

}
