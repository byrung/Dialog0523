package com.example.dialog0523

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnDialog = findViewById<Button>(R.id.btnDialog)

        btnDialog.setOnClickListener {
            var placesArr = arrayOf("에펠", "프로방스", "피렌세")
            var selectArr = booleanArrayOf(false, true, false)
            var dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("좋플레이스")
            dialog.setIcon(R.drawable.Log)
            dialog.setSingleChoiceItems(placesArr, 1){ d1, which ->
                btnDialog.text = placesArr[which]
            }
            dialog.setPositiveButton("닫기", null)
            dialog.show()
        }
    }
}