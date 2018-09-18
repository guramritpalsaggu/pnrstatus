package com.developer.pnrstatus;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.developer.pnrstatus.JSONclasses.PassengersItem;
import com.developer.pnrstatus.JSONclasses.Root;
import com.developer.pnrstatus.Retrofit.Api;

import org.w3c.dom.Text;

import java.util.List;
import java.util.ResourceBundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    String pnrNo;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

        public void getpnrstatus(View view) {
            EditText pnr = (EditText)findViewById(R.id.pnr);
            pnrNo = pnr.getText().toString();





        if(pnrNo!=null){

//        EditText pnr = (EditText)findViewById(R.id.pnr);
//        String pnrNo = pnr.getText().toString();

        final TextView trainno=(TextView)findViewById(R.id.trainno);
        final TextView seatno=(TextView)findViewById(R.id.seatno);

        Retrofit retrofit= new Retrofit.Builder().baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api=retrofit.create(Api.class);



        Call<Root> call =api.getpnr(pnrNo);

        call.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {

                Root data=response.body();

                List<PassengersItem> passengersItems;

                trainno.setText(data.train.getNumber());
                seatno.setText(data.getDoj());
//
//                Log.d("Passenger",data.getPnr());
////                Log.d("dateofj",data.getDoj());
//////                Log.d("train",data.train.getNumber());
////                if(data.getPnr() != null) {
////                    Log.d("Passenger",data.getPnr());
////                }






            }

            @Override
            public void onFailure(Call<Root> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });

    }}}








