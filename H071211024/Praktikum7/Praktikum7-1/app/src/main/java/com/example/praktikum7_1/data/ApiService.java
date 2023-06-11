package com.example.praktikum7_1.data;

import com.example.praktikum7_1.data.model.ReqresInResponse;
import com.example.praktikum7_1.data.model.UserResponse;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
public interface ApiService {
    @GET("api/users/{id}")
    Call<ReqresInResponse<UserResponse>> getUser(@Path("id") String str);

    @GET("api/users")
    Call<ReqresInResponse<List<UserResponse>>> getUsers(@Query("page") String str);
}
