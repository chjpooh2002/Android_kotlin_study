package com.poohpooh.twice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<ImageView>(R.id.member1)
        val btn2 = findViewById<ImageView>(R.id.member2)
        val btn3 = findViewById<ImageView>(R.id.member3)
        val btn4 = findViewById<ImageView>(R.id.member4)
        val btn5 = findViewById<ImageView>(R.id.member5)
        val btn6 = findViewById<ImageView>(R.id.member6)
        val btn7 = findViewById<ImageView>(R.id.member7)
        val btn8 = findViewById<ImageView>(R.id.member8)
        val btn9 = findViewById<ImageView>(R.id.member9)

        btn1.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","1")
            startActivity(intent)

        }

        btn2.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","2")
            startActivity(intent)

        }

        btn3.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","3")
            startActivity(intent)

        }

        btn4.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","4")
            startActivity(intent)

        }

        btn5.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","5")
            startActivity(intent)

        }

        btn6.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","6")
            startActivity(intent)

        }

        btn7.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","7")
            startActivity(intent)

        }

        btn8.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","8")
            startActivity(intent)

        }

        btn9.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","9")
            startActivity(intent)

        }
    }
}