package com.android.example.pizza

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PizzaFragmentViewHolder(v: View):RecyclerView.ViewHolder(v) {

	val fragmentImage = itemView.findViewById<ImageView>(R.id.info_image)
	val fragmentTittle = itemView.findViewById<TextView>(R.id.info_text)




}