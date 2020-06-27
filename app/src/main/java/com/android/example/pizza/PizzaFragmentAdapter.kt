package com.android.example.pizza

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PizzaFragmentAdapter: RecyclerView.Adapter<PizzaFragmentViewHolder>() {
	private val pizzas = DataPizzas.pizzas


	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaFragmentViewHolder {
		val view = LayoutInflater.from(parent.context).inflate(R.layout.card_captioned_image,parent, false)
		return PizzaFragmentViewHolder(view)
	}

	override fun getItemCount(): Int {
		return DataPizzas.pizzas.size
	}

	override fun onBindViewHolder(holder: PizzaFragmentViewHolder, position: Int) {
		holder.fragmentImage.setImageResource(pizzas[position].getImageResourceId())
		holder.fragmentTittle.text = pizzas[position].getName()
	}


}