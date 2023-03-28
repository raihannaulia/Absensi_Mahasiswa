package org.d3if3036.assesmentmopro1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.d3if3036.assesmentmopro1.databinding.ActivityMainBinding
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
//    private lateinit var recycleView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

//        recycleView = findViewById(R.id.recycleView)
    }
    fun ButtonCLick(view: View) {
        val nama: EditText = findViewById(R.id.nama)
        val tanggal: EditText = findViewById(R.id.tanggal)
        val nim: EditText = findViewById(R.id.nim)
        val matakuliah: EditText = findViewById(R.id.matakuliah)
//        val present: EditText = findViewById(R.id.present)
//        val absent: EditText = findViewById(R.id.absent)
//        val late: EditText = findViewById(R.id.late)
        val displayName: TextView = findViewById(R.id.displayName)
        val displayDate: TextView = findViewById(R.id.displayDate)
        val displayNim: TextView = findViewById(R.id.displayNim)
        val displaySubject: TextView = findViewById(R.id.displaySubject)
//        val displayPresent: TextView = findViewById(R.id.displayPresent)
//        val displayAbsent: TextView = findViewById(R.id.displayAbsent)
//        val displayLate: TextView = findViewById(R.id.displayLate)

        var str1:String = nama.text.toString()
        var str2:String = tanggal.text.toString()
        var str3:String = nim.text.toString()
        var str4:String = matakuliah.text.toString()
//        var str5:String = present.text.toString()
//        var str6:String = absent.text.toString()
//        var str7:String = late.text.toString()

        displayDate.setText(str1)
        displayName.setText(str2)
        displayNim.setText(str3)
        displaySubject.setText(str4)
//        displayPresent.setText(str5)
//        displayAbsent.setText(str6)
//        displayLate.setText(str7)
    }
}