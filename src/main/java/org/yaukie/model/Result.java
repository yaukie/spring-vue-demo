package org.yaukie.model;

import java.util.List;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain=true)
public class Result {
	private int code ;
	private String msg;
	private User user ;
	private Object obj; 
}
