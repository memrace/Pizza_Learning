package com.android.example.pizza

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PizzaFragmentViewHolder(v: View, private val onRecyclerViewClick:PizzaFragmentAdapter.IRecyclerViewListener):RecyclerView.ViewHolder(v), View.OnClickListener {

	val fragmentImage = itemView.findViewById<ImageView>(R.id.info_image)
	val fragmentTittle = itemView.findViewById<TextView>(R.id.info_text)
	val listener = itemView.setOnClickListener(this)
	override fun onClick(v: View?) {
		onRecyclerViewClick.onRecyclerViewClick(adapterPosition)
	}


}