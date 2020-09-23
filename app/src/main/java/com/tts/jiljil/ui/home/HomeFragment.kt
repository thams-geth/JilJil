package com.tts.jiljil.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.tts.jiljil.R
import com.tts.jiljil.ui.FragmentClickListener

class HomeFragment : Fragment() {

    lateinit var fragmentClickListener: FragmentClickListener

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        fragmentClickListener = context as FragmentClickListener

    }

    private lateinit var imgProfile: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        imgProfile = view.findViewById(R.id.imgProfile)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        imgProfile.setOnClickListener {
            fragmentClickListener.onClick("OtherProfile")

        }
    }

}