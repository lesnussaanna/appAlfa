package com.pm.appalfa.admin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.pm.appalfa.R
import com.pm.appalfa.admin.model.Notification

class NotificationAdapter (private val notificationList: ArrayList<Notification>) :
    RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>() {


    class NotificationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ShapeableImageView = itemView.findViewById(R.id.gambar)
        val textView: TextView = itemView.findViewById(R.id.title)
        val textView2: TextView = itemView.findViewById(R.id.desc)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_notification, parent, false)
        return NotificationViewHolder(view)
    }

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        val event = notificationList[position]
        holder.imageView.setImageResource(event.image)
        holder.textView.text = event.title
        holder.textView2.text = event.desc
    }

    override fun getItemCount(): Int {
        return notificationList.size
    }
}