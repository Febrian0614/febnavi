package com.example.brillnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.brillnavigation.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //binding.click.setOnClickListener {
       //     var inputA = binding.inputa.text.toString().toInt()
         //   var inputB = binding.inputb.text.toString().toInt()
         //   var hasil = jumlah(inputA, inputB)
         //   binding.hello.setText(hasil.toString())
      //  }
    }

   // private fun jumlah(a: Int, b: Int): Int{
     //   return a + b
    //}
}

