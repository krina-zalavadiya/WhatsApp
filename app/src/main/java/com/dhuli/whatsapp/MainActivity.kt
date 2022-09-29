package com.dhuli.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dhuli.whatsapp.Adapter.FragAdapter
import com.dhuli.whatsapp.Fragment.CallFragment
import com.dhuli.whatsapp.Fragment.ChatFragment
import com.dhuli.whatsapp.Fragment.StatusFragment
import com.dhuli.whatsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    var fragments = arrayOf(ChatFragment(),StatusFragment(),CallFragment())
    var title = arrayOf("CHATS","STATUS","CALL")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Tab.addTab(binding.Tab.newTab().setText("CHATS"))
        binding.Tab.addTab(binding.Tab.newTab().setText("STATUS"))
        binding.Tab.addTab(binding.Tab.newTab().setText("CALL"))

        var adapter = FragAdapter(supportFragmentManager,fragments,title)
        binding.vpFargment.adapter = adapter
       binding.Tab.setupWithViewPager(binding.vpFargment)



    }
}