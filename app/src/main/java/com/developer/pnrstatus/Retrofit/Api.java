package com.developer.pnrstatus.Retrofit;

import android.content.Context;
import android.widget.EditText;

import com.developer.pnrstatus.JSONclasses.Root;
import com.developer.pnrstatus.MainActivity;
import com.developer.pnrstatus.R;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {


    String BASE_URL="https://api.railwayapi.com/v2/";




    @GET("pnr-status/pnr/{pnr_id}/apikey/tglm7rsjbh/")
    Call<Root> getpnr(@Path(value = "pnr_id", encoded = true) String pnrNo);
}