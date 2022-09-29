package com.dhuli.whatsapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dhuli.whatsapp.Fragment.imgs
import com.dhuli.whatsapp.R
import de.hdodenhof.circleimageview.CircleImageView

class ChatAdapter(names: Array<String>, imgs: Array<Int>) : RecyclerView.Adapter<ChatAdapter.ChatHolder>(){
    var names = names
    var imgs = imgs
    class ChatHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
              var nameItem = itemView.findViewById<TextView>(R.id.namesItem)
              var imgItem = itemView.findViewById<CircleImageView>(R.id.Profile)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatHolder {
        return ChatHolder(LayoutInflater.from(parent.context).inflate(R.layout.chat_item,parent,false))
    }

    override fun onBindViewHolder(holder: ChatHolder, position: Int) {
          holder.nameItem.text = names[position]

          holder.imgItem.setImageResource(imgs[position])
    }

    override fun getItemCount(): Int {
          return names.size
    }
}