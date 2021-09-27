package com.example.nimit_agarwal_evalution

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MusicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun setData(resultsDTO: ResultsDTO){
        view.tvName.text = responseDTO.name //.text means setText
        view.tvEmail.text = responseDTO.email //.text means setText
        view.tvBody.text = responseDTO.body //.text means setText
    }
}
