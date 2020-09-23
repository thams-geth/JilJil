package com.tts.jiljil.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.tts.jiljil.R
import com.tts.jiljil.ui.tellus.TellUsActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        llMobileNo.visibility = View.VISIBLE
        llOtp.visibility = View.GONE
        btngetOTP.setOnClickListener {
            llMobileNo.visibility = View.GONE
            llOtp.visibility = View.VISIBLE
        }

        btnVerifyOTP.setOnClickListener {
            val i = Intent(this, TellUsActivity::class.java)
            startActivity(i)
        }
    }
}