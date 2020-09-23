package com.tts.jiljil.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tts.jiljil.R
import com.tts.jiljil.data.ProfileListItems


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class ProfileFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    lateinit var recyclerView: RecyclerView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_profile, container, false)

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
//        ViewCompat.setNestedScrollingEnabled(recyclerView, true);

    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ProfileFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}