package com.dicoding.picodiploma.livesearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<Pos> pos;
    private Adapter adapter;
    private ApiInterface apiInterface;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progress);
        recyclerView = findViewById(R.id.recycler);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        fetchPos("");
    }

    public void fetchPos(String key){
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        Call<List<Pos>> call = apiInterface.getPos(key);

        call.enqueue(new Callback<List<Pos>>() {
            @Override
            public void onResponse(Call<List<Pos>> call, Response<List<Pos>> response) {
                progressBar.setVisibility(View.GONE);
                pos = response.body();
                adapter = new Adapter(pos, MainActivity.this);
                recyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Pos>> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this,"Error on:"+ t.toString(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
