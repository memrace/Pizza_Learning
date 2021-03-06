package com.android.example.pizza

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

 class PizzaFragmentAdapter(private val onRecyclerViewClick:PizzaFragmentAdapter.IRecyclerViewListener): RecyclerView.Adapter<PizzaFragmentViewHolder>(){
	private val pizzas = DataPizzas.pizzas




	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaFragmentViewHolder {
		val view = LayoutInflater.from(parent.context).inflate(R.layout.card_captioned_image, parent, false)



		return PizzaFragmentViewHolder(view,onRecyclerViewClick)
	}

	override fun getItemCount(): Int {
		return DataPizzas.pizzas.size
	}

	override fun onBindViewHolder(holder: PizzaFragmentViewHolder, position: Int) {
		holder.fragmentImage.setImageResource(pizzas[position].getImageResourceId())
		holder.fragmentTittle.text = pizzas[position].getName()
		/*
		Bad Version OnClickListener
		 */

//		val context = holder.itemView.context
//
//		holder.itemView.setOnClickListener {
//			context.startActivity(Intent(context, OrderActivity::class.java))
//		}

	}


	 interface IRecyclerViewListener {
		 fun onRecyclerViewClick(position:Int)
	 }
}



