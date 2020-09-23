package com.tts.jiljil.ui.profile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.tts.jiljil.R
import com.tts.jiljil.data.ProfileListItems
import kotlinx.android.synthetic.main.item_video_list.view.*

class ProfileListAdapter(private val list: List<ProfileListItems>, private val context: Context) : RecyclerView.Adapter<ProfileListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileListAdapter.ViewHolder {

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_video_list, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ProfileListAdapter.ViewHolder, position: Int) {
        holder.itemView.imageView.setImageDrawable(ContextCompat.getDrawable(context, list[position].image))
        holder.itemView.textView.text = list[position].views

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}