package com.tts.jiljil

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.tts.jiljil.ui.slider.SliderActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val image: ImageView = findViewById<ImageView>(R.id.imageViewBlink)
        val animation1 = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.blink
        )
        image.startAnimation(animation1)
        Handler().postDelayed(Runnable {
            val i = Intent(this, SliderActivity::class.java)
            startActivity(i)
            finish()
        }, 2500)
    }
}