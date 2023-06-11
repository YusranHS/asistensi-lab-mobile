package com.example.praktikum7_1.data.model;

import com.google.gson.annotations.SerializedName;
public class ReqresInResponse<T> {
    @SerializedName("data")
    private T data;
    public T getData() {
        return this.data;
    }
}
