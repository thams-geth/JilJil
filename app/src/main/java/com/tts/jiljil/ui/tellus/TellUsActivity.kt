package com.tts.jiljil.ui.tellus

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.tts.jiljil.R
import com.tts.jiljil.ui.home.HomeActivity
import kotlinx.android.synthetic.main.activity_tell_us.*

class TellUsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tell_us)

        llTellUs.visibility = View.VISIBLE
        lllanguage.visibility = View.GONE
        llSuccess.visibility = View.GONE

        btnNext.setOnClickListener {
            llTellUs.visibility = View.GONE
            lllanguage.visibility = View.VISIBLE
            llSuccess.visibility = View.GONE

        }

        btnSave.setOnClickListener {
            llTellUs.visibility = View.GONE
            lllanguage.visibility = View.GONE
            llSuccess.visibility = View.VISIBLE
        }

        btnBack.setOnClickListener {
            llTellUs.visibility = View.VISIBLE
            lllanguage.visibility = View.GONE
            llSuccess.visibility = View.GONE
        }

        btnDone.setOnClickListener {
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }
    }
}