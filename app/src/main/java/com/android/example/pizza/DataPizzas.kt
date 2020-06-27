package com.android.example.pizza

data class DataPizzas(private val name:String, private val imageResourceID:Int) {
companion object {
	val pizzas:MutableList<DataPizzas> = mutableListOf(
			DataPizzas("Diavolo", R.drawable.diavolo),
			DataPizzas("Funghi",R.drawable.funghi)
	)
}


	fun getName(): String {
		return this.name
	}
	fun getImageResourceId():Int {
		return this.imageResourceID
	}

}