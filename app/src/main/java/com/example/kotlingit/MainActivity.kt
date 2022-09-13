package com.example.kotlingit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            lifecycleScope.launch{
                viewModel.addNoteState.collect{
                    adapter.setList(list)
                    binding.rv.adapter= adapter
                }
            }


    }
}