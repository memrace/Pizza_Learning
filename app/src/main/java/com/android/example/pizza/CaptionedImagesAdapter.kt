package com.android.example.pizza

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class CaptionedImagesAdapter(private val captions:MutableList<String>,private val imageIds:MutableList<Int>): RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder>() {






	class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder { // определяем экземпляры
		val cv:CardView = LayoutInflater.from(parent.context).inflate(R.layout.card_captioned_image,parent, false) as CardView
		return ViewHolder(cv)
	}

	override fun getItemCount(): Int { // кол-во холдеров
		return captions.size
	}

	override fun onBindViewHolder(holder: ViewHolder, position: Int) { // добавление данных
		val cardView: View = holder.itemView
		val imageView:ImageView = cardView.findViewById(R.id.info_image)
		val drawable: Drawable? = ContextCompat.getDrawable(cardView.context, imageIds[position])

		imageView.setImageDrawable(drawable)
		imageView.setContentDescription(captions[position])

		val textView: TextView = cardView.findViewById(R.id.info_text)
		textView.text = captions[position]

	}
}