package com.example.fourthassignment.Repo;

import com.example.fourthassignment.Model.UserCUDModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserRepo {

    @POST("/addUser")
    Call<Void> addUser(@Body UserCUDModel userCUDModel);

    @POST("/getUser")
    Call<List<UserCUDModel>> getUser(@Body UserCUDModel userCUDModel);
}
