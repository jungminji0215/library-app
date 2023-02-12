package com.group.libraryapp.utils;

import org.springframework.http.HttpStatus;

public class ResponseResult<T> {
    private HttpStatus status;
    private T data;

    public ResponseResult(HttpStatus status, T data) {
        this.status = status;
        this.data = data;
    }

    public ResponseResult(T data) {
        this(HttpStatus.OK, data);
    }

    public HttpStatus getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }
}