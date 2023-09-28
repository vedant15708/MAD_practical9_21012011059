package com.example.mad_practical9_21012011059

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alramanimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageview=findViewById<ImageView>(R.id.image)
        imageview.setBackgroundResource(R.drawable.alram_animation_list)
        alramanimation=imageview.background
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus){
            alramanimation.start()
        }
        else{
            alramanimation.stop()
        }
    }

}