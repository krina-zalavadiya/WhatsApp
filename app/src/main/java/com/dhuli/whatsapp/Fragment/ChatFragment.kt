package com.dhuli.whatsapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.dhuli.whatsapp.Adapter.ChatAdapter
import com.dhuli.whatsapp.R
import com.dhuli.whatsapp.databinding.FragmentChatBinding


   var names = arrayOf("chinki","minki","HM","HM chinki minki","A","B","C","D","E","F","G")
   var imgs = arrayOf(R.drawable.img,R.drawable.img1,R.drawable.img2,R.drawable.img4,R.drawable.img,R.drawable.img1,R.drawable.img2,R.drawable.img4,R.drawable.img,R.drawable.img1,R.drawable.img2)

class ChatFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
                    }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var binding = FragmentChatBinding.inflate(layoutInflater)

        binding.ChatList.layoutManager = LinearLayoutManager(context)
        binding.ChatList.adapter = ChatAdapter(names, imgs)

        return binding.root
    }
}