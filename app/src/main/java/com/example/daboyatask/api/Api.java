package com.example.daboyatask.api;

import com.example.daboyatask.model.UserModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL="https://picsum.photos/v2/";
    @GET("list?page=1&limit=100")
    Call<List<UserModel>> getHeroes();
}
