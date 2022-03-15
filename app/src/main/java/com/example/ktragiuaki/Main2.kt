package com.example.ktragiuaki

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ktragiuaki.databinding.ActivityMain2Binding
import com.example.ktragiuaki.databinding.ActivityMainBinding
import java.security.AccessController.getContext


class Main2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private lateinit var adapterRecycleview: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = intent
        val bundle = intent.extras
        if (bundle != null) {
            val data1 = bundle.getString("Names", "")
            val data2 = bundle.getString("Emails", "")
            val data3 = bundle.getString("Sdts", "")
            binding.textView.text = data1
            binding.textView2.text  =data2
            binding.textView3.text  =data3


        }
        adapterRecycleview = Adapter(list)
        binding.recycle.adapter = adapterRecycleview
        binding.recycle.setHasFixedSize(true)
        binding.recycle.layoutManager = LinearLayoutManager(this)
        }
//        binding.add.setOnClickListener {
//            val intent = Intent(this, Main2::class.java)
//            startActivity(intent)
//        }

    override fun onResume() {
        super.onResume()

    }


    }

//    companion object {
//        val Datas = mutableListOf<Data>()
//    }
