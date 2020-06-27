package com.android.example.pizza

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.example.pizza.databinding.ActivityMainBinding
import com.android.example.pizza.databinding.FragmentPizzaBinding


class PizzaFragment :Fragment() {

    private lateinit var pizzaFragmentRV:RecyclerView
    private lateinit var viewBinding: FragmentPizzaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        viewBinding = FragmentPizzaBinding.inflate(LayoutInflater.from(context))

        pizzaFragmentRV = viewBinding.recyclerView
        pizzaFragmentRV.layoutManager = LinearLayoutManager(context)
        pizzaFragmentRV.adapter = PizzaFragmentAdapter()
        pizzaFragmentRV.setHasFixedSize(true)




        return viewBinding.root
    }


}