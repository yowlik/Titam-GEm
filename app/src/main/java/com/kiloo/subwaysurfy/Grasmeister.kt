package com.kiloo.subwaysurfy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.kiloo.subwaysurfy.databinding.ActivityGrasmeisterBinding

class Grasmeister : AppCompatActivity(), Animation.AnimationListener {
    lateinit var hool:ActivityGrasmeisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hool= ActivityGrasmeisterBinding.inflate(layoutInflater)
        setContentView(hool.root)
        val animatra=AnimationUtils.loadAnimation(this,R.anim.animkar)
        animatra.setAnimationListener(this)
        hool.cirssssssss.setOnClickListener {
            hool.cirssssssss.startAnimation(animatra)
            hool.cirssssssss.rota
        }
    }

    override fun onAnimationStart(p0: Animation?) {
        hool.cirssssssss.setBackgroundResource(R.drawable.redwiinner)
    }

    override fun onAnimationEnd(p0: Animation?) {


    }

    override fun onAnimationRepeat(p0: Animation?) {

    }
}