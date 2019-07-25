package com.dicoding.picodiploma.livesearch;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("getData.php")
    Call <List<Pos>> getPos(@Query("key") String keyword);
}
