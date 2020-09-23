package com.tts.jiljil.ui.slider

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.tts.jiljil.R
import com.tts.jiljil.data.Slider
import com.tts.jiljil.ui.WelcomeActivity
import kotlinx.android.synthetic.main.activity_slider.*


class SliderActivity : AppCompatActivity() {

    var sliderList: ArrayList<Slider> = ArrayList<Slider>()
    lateinit var sliderAdapter: SliderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slider)



        sliderList.add(Slider(R.drawable.image1, "Create Inspiring Videos", "Express yourself through singing, dancing, comedy and more…", ""))
        sliderList.add(Slider(R.drawable.image2, "Win Real Money", "Just hit the claim button quickly before anyone grabs it", ""))
        sliderList.add(Slider(R.drawable.image3, "Pay Less & Win More!", "Create videos and enrol pay contest and win huge prizes", "Pay Contest"))
        sliderList.add(Slider(R.drawable.image4, "Challenge is Fun!", "Discover the latest challenge and take part and be popular and gifts", "Challenge"))

        sliderAdapter = SliderAdapter(sliderList, this)

        viewPager.adapter = sliderAdapter
        setUpIndicator()
        setCurrentIndicator(0)

        btnNext.setOnClickListener {
            if (viewPager.currentItem + 1 < sliderList.size) {
                viewPager.currentItem = viewPager.currentItem + 1
            } else {
                val i = Intent(this, WelcomeActivity::class.java)
                startActivity(i)
                finish()
            }
        }
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            @Override
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
            }
        })


    }


    fun setUpIndicator() {
        val imageView = arrayOfNulls<ImageView>(sliderList.size)
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        params.setMargins(8, 0, 8, 0)

        for (i in 0 until sliderList.size) {
            imageView[i] = ImageView(this)
            imageView[i]!!.setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.unselected_dot
                )
            )
            imageView[i]!!.layoutParams = params
            tabLayout.addView(imageView[i])

        }
    }

    fun setCurrentIndicator(index: Int) {
        for (i in 0 until sliderList.size) {
            var imageView: ImageView = tabLayout.getChildAt(i) as ImageView
            val drawableId: Int =
                if (i == index) R.drawable.selected_dot else R.drawable.unselected_dot
            val drawable: Drawable? = ContextCompat.getDrawable(this, drawableId)
            imageView.setImageDrawable(drawable)
        }
        if (index == sliderAdapter.itemCount - 1) {
            btnNext.text = "Let’s get started"
        } else {
            btnNext.text = "Next"

        }
    }

}