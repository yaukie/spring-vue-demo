package org.yaukie.model;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Data
@Accessors(chain=true)
@ToString
public class User {
    private String userId;

    private String userName;

    private String password;

    private Date createdTime;

    private Date updateTime;
 
}