package com.example.appcafekotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.appcafekotlin.adapter.FoodAdapter
import com.example.appcafekotlin.databinding.ActivityMainBinding
import com.example.appcafekotlin.model.Food

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var foodAdapter: FoodAdapter
    private val foodList: MutableList<Food> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        foodAdapter = FoodAdapter(this, foodList)
        recyclerView.adapter = foodAdapter
        getFood()

    }
        private fun getFood() {
            val food1 = Food("Cafe Coado", "R$ 4,00", R.drawable.cafecoado)
            foodList.add(food1)
            val food2 = Food("Capuccino", "R$ 8,00", R.drawable.capuccino)
            foodList.add(food2)
            val food3 = Food("Croissant", "R$ 9,00", R.drawable.croissant)
            foodList.add(food3)
            val food4 = Food("Espresso", "R$ 6,00", R.drawable.espresso)
            foodList.add(food4)
            val food5 = Food("Pão de Queijo", "R$ 5,00", R.drawable.paodequeijo)
            foodList.add(food5)

            val food6 = Food("Cafe Coado", "R$ 4,00", R.drawable.cafecoado)
            foodList.add(food6)
            val food7 = Food("Capuccino", "R$ 8,00", R.drawable.capuccino)
            foodList.add(food7)
            val food8 = Food("Croissant", "R$ 9,00", R.drawable.croissant)
            foodList.add(food8)
            val food9 = Food("Espresso", "R$ 6,00", R.drawable.espresso)
            foodList.add(food9)
            val food10 = Food("Pão de Queijo", "R$ 5,00", R.drawable.paodequeijo)
            foodList.add(food10)
        }
    }


