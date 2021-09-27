package com.example.nimit_agarwal_evalution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_layout.view.*
import retrofit2.Call
import retrofit2.Response
import java.util.*

class MainActivity : AppCompatActivity() {
    private var arrayList = arrayListOf<ResultsDTO>();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView();
    }

    private fun initView() {
       button.setOnClickListener {
           var apiService = Network.getRetrofitInstance().create(ApiService::class.java)
           apiService.getUSer(1).enqueue(object : retrofit2.Callback<ResponseDTO>{
               override fun onResponse(call: Call<ResponseDTO>, response: Response<ResponseDTO>) {
                  arrayList.addAll(response.body()?.results)
               }

               override fun onFailure(call: Call<ResponseDTO>, t: Throwable) {

               }

           })
       }
    }


}



