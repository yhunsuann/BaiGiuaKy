package com.example.ktragiuaki

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ktragiuaki.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.login.setOnClickListener {
            val name = binding.txtname.text.toString()
            val email = binding.txtemail.text.toString()
            val sdt = binding.txtphone.text.toString()
            val intent = Intent(this, Main2::class.java)
            val bundle = Bundle()
            bundle.putString("Names", name)
            bundle.putString("Emails",email)
            bundle.putString("Sdts",sdt)
            intent.putExtras(bundle);
            startActivity(intent);



        }

    }
}