package org.anaguma.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="authories")
@Data
public class Authority {


    @Id
    private String userName;

    private String authority;

}
