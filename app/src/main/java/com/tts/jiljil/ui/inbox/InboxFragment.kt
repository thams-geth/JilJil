package com.tts.jiljil.ui.inbox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.tts.jiljil.R

class InboxFragment : Fragment() {

    companion object {
        fun newInstance() = InboxFragment()
    }

    private lateinit var viewModel: InboxViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_inbox, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(InboxViewModel::class.java)
        // TODO: Use the ViewModel
    }

}