package com.example.nimit_agarwal_evalution

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(val list: ArrayList<ResultsDTO> = arrayListOf<ResultsDTO>()) : RecyclerView.Adapter<MusicViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MusicViewHolder(view)

    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
     var musicViewHolder = list[position]
     holder.setData(musicViewHolder)
    }

    override fun getItemCount(): Int {
    return list.size
    }
}