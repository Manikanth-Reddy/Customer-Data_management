package org.mani.CutomerDataManagement.dto;

import java.time.LocalDateTime;


import lombok.Data;

@Data

public class ResponseDTO<T> {
	private Integer statusCode;
	private T data;
	private String message;
	private LocalDateTime time;
}
