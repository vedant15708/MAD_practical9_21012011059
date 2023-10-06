package com.example.mad_practical9_21012011059

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alramanimation:AnimationDrawable
    lateinit var heartanimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageview=findViewById<ImageView>(R.id.animation)
        imageview.setBackgroundResource(R.drawable.alram_animation_list)
        alramanimation=imageview.background as AnimationDrawable
        val animate = findViewById<ImageView>(R.id.heart)
        animate.setBackgroundResource(R.drawable.heart_animation_list)
        heartanimation = animate.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus){
            alramanimation.start()
            heartanimation.start()
        }
        else{
            alramanimation.stop()
            heartanimation.stop()
        }
    }

}