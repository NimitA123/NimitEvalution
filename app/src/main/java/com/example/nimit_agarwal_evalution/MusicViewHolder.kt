package com.example.nimit_agarwal_evalution

import android.media.MediaPlayer
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_layout.view.*
import android.media.MediaPlayer.create as create1
import android.media.MediaPlayer.create as create2

class MusicViewHolder(private  val view: View): RecyclerView.ViewHolder(view) {

    fun setData(resultsDTO: ResultsDTO) {

        Glide.with(view.imageView).load(resultsDTO.artistViewUrl).into(view.imageView)
        view.textView.text = resultsDTO.trackName.toString() //.text means setText
        view.textView2.text = resultsDTO.artistName.toString()
        view.button3.setOnClickListener {

            //    val mediaPlayer = MediaPlayer.create(this, resultsDTO.trackViewUrl)
            //      (mediaPlayer)
            //   }
            //.text means setText
            //  view.tvBody.text = responseDTO.body //.text means setText
        }


    }
}


