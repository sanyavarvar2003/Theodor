package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var tl : String = "kva"
    var tp : String = "128"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun on(v: View){
        var ulog : EditText = findViewById(R.id.to)
        var upass : EditText = findViewById(R.id.pay)
        var res : TextView = findViewById(R.id.tv)
        if (tl == ulog.text.toString() && tp == upass.text.toString()) {
            var Ri: Intent = Intent(this, Main2Activity::class.java)
            startActivity(Ri);
        }
        else
            res.setText("Wasted")
    }




}
