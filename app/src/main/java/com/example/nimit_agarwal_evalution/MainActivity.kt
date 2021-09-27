package com.example.nimit_agarwal_evalution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response
import kotlin.collections.ArrayList

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
           val name = SearchView.text.toString()
           apiService.getUSer(name).enqueue(object : retrofit2.Callback<ResponseDTO>{
               override fun onResponse(call: Call<ResponseDTO>, response: Response<ResponseDTO>) {
                   response.body()!!.also {
                       arrayList= it.results as ArrayList<ResultsDTO>
                       SetRecycleView()

                   }
               }

               override fun onFailure(call: Call<ResponseDTO>, t: Throwable) {

               }

           })
       }
    }

    private fun SetRecycleView() {
     val musicAdapter= MusicAdapter(arrayList)
     val linearLayout = LinearLayoutManager(this)
       RecyclerView.adapter = musicAdapter
        RecyclerView.layoutManager = linearLayout
    }


}





