package com.tts.jiljil.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tts.jiljil.R
import com.tts.jiljil.data.ProfileListItems

class OthersProfileFragment : Fragment() {

    companion object {
        fun newInstance() = OthersProfileFragment()
    }

    lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_others_profile, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        return view

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val list = ArrayList<ProfileListItems>()
        list.add(ProfileListItems(R.drawable.girl1, "2.1 M"))
        list.add(ProfileListItems(R.drawable.girl2, "3.1 M"))
        list.add(ProfileListItems(R.drawable.girl3, "1.1 k"))
        list.add(ProfileListItems(R.drawable.girl4, "1.4 M"))
        list.add(ProfileListItems(R.drawable.girl5, "1.6 M"))
        list.add(ProfileListItems(R.drawable.girl1, "10 k"))
        list.add(ProfileListItems(R.drawable.girl3, "2 M"))

        recyclerView.hasFixedSize()
        recyclerView.adapter = ProfileListAdapter(list, requireContext())
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 3)
    }

}