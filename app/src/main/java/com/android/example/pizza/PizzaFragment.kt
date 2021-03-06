package com.android.example.pizza

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.example.pizza.databinding.FragmentPizzaBinding


class PizzaFragment :Fragment(), PizzaFragmentAdapter.IRecyclerViewListener {

    private lateinit var pizzaFragmentRV:RecyclerView
    private lateinit var viewBinding: FragmentPizzaBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        viewBinding = FragmentPizzaBinding.inflate(LayoutInflater.from(context))

        pizzaFragmentRV = viewBinding.recyclerView
        pizzaFragmentRV.layoutManager = LinearLayoutManager(context)
        pizzaFragmentRV.adapter = PizzaFragmentAdapter(this)
        pizzaFragmentRV.setHasFixedSize(true)


//        clickAdapter.setOnClickListenerRecyclerView(object : PizzaFragmentAdapter.IOnClickListenerRecyclerView{
////            override fun onItemClick(position: Int) {
////                val intent: Intent = Intent(context, OrderActivity::class.java)
////                startActivity(intent)
////            }
////
////        })



        return viewBinding.root
    }

    override fun onRecyclerViewClick(position: Int) {
        val intent = Intent(context,OrderActivity::class.java)
        startActivity(intent)
    }


}