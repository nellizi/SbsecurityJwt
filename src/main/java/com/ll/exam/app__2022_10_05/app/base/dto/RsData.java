package com.ll.exam.app__2022_10_05.app.base.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpHeaders;

@Getter
@Setter
@AllArgsConstructor
public class RsData<T> {
    private String resultCode;
    private String msg;
    private T data;

    public static <T> HttpHeaders of(String resultCode, String msg) {
        return new RsData<>(resultCode, msg, null);
    }

    public boolean isSuccess() {
        return resultCode.startsWith("S-1");
    }

    public boolean isFail() {
        return isSuccess() == false;
    }
}