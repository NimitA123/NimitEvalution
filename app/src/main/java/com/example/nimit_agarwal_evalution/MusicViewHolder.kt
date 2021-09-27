package com.example.nimit_agarwal_evalution

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

class MusicViewHolder(private  val view: View): RecyclerView.ViewHolder(view) {
    fun setData(resultsDTO: ResultsDTO){
        view.textView.text = resultsDTO.trackName.toString() //.text means setText
        view.textView2.text = resultsDTO.artistName.toString() //.text means setText
      //  view.tvBody.text = responseDTO.body //.text means setText
    }
}
