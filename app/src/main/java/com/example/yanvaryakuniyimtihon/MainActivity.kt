package com.example.yanvaryakuniyimtihon
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val b = arrayOf(
            AnimationUtils.loadAnimation(this, R.anim.anim1),
            AnimationUtils.loadAnimation(this, R.anim.anim2),
            AnimationUtils.loadAnimation(this, R.anim.anim3),
            AnimationUtils.loadAnimation(this, R.anim.anim4),
            AnimationUtils.loadAnimation(this, R.anim.anim5),
            AnimationUtils.loadAnimation(this, R.anim.anim6),
            AnimationUtils.loadAnimation(this, R.anim.anim7),
            AnimationUtils.loadAnimation(this, R.anim.anim8),
            AnimationUtils.loadAnimation(this, R.anim.anim9),
            AnimationUtils.loadAnimation(this, R.anim.anim10),
        )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextID.setOnClickListener {
            var tasodifiy = 0
            tasodifiy = Random.nextInt(11)
            rasm.startAnimation(b[tasodifiy])
        }
        b[0].setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                nextID.visibility=View.INVISIBLE
            }

            override fun onAnimationEnd(animation: Animation?) {
                nextID.visibility=View.VISIBLE
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }


        })

        b[1].setAnimationListener(object:Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                nextID.visibility=View.INVISIBLE
            }

            override fun onAnimationEnd(animation: Animation?) {
                nextID.visibility= View.VISIBLE
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

        })
        b[2].setAnimationListener(object:Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                nextID.visibility=View.INVISIBLE
            }

            override fun onAnimationEnd(animation: Animation?) {
                nextID.visibility= View.VISIBLE
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

        })
        b[3].setAnimationListener(object:Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                nextID.visibility=View.INVISIBLE
            }

            override fun onAnimationEnd(animation: Animation?) {
                nextID.visibility= View.VISIBLE
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

        })
        b[4].setAnimationListener(object:Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                nextID.visibility=View.INVISIBLE
            }

            override fun onAnimationEnd(animation: Animation?) {
                nextID.visibility= View.VISIBLE
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

        })
        b[5].setAnimationListener(object:Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                nextID.visibility=View.INVISIBLE
            }

            override fun onAnimationEnd(animation: Animation?) {
                nextID.visibility= View.VISIBLE
            }
            override fun onAnimationRepeat(animation: Animation?) {

            }

        })
        b[6].setAnimationListener(object:Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                nextID.visibility=View.INVISIBLE
            }

            override fun onAnimationEnd(animation: Animation?) {
                nextID.visibility= View.VISIBLE
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

        })
        b[7].setAnimationListener(object:Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                nextID.visibility=View.INVISIBLE
            }

            override fun onAnimationEnd(animation: Animation?) {
                nextID.visibility= View.VISIBLE
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

        })
        b[8].setAnimationListener(object:Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                nextID.visibility=View.INVISIBLE
            }

            override fun onAnimationEnd(animation: Animation?) {
                nextID.visibility= View.VISIBLE
            }

            override fun onAnimationRepeat(animation: Animation?) {
            }
        })



    }
}