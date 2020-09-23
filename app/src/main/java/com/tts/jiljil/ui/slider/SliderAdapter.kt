package com.tts.jiljil.ui.slider

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.tts.jiljil.R
import com.tts.jiljil.data.Slider
import kotlinx.android.synthetic.main.item_slider.view.*

class SliderAdapter(private val sliderList: List<Slider>, private val context: Context) :
    RecyclerView.Adapter<SliderAdapter.SliderHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderHolder {
        return SliderHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_slider, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return sliderList.size
    }

    override fun onBindViewHolder(holder: SliderHolder, position: Int) {

        holder.itemView.imageView.setImageDrawable(ContextCompat.getDrawable(context, sliderList[position].image))
        holder.itemView.txtTitle.text = sliderList[position].title
        holder.itemView.txtDesc.text = sliderList[position].desc
        holder.itemView.txt.text = sliderList[position].txt

    }

    class SliderHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}