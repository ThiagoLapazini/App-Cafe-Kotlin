package com.example.appcafekotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appcafekotlin.databinding.ProdutosLayoutBinding
import com.example.appcafekotlin.model.Food

class FoodAdapter(private val context: Context, private val foodList: MutableList<Food>) :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val listItem = ProdutosLayoutBinding.inflate(LayoutInflater.from(context), parent, false)
        return FoodViewHolder(listItem)
    }

    override fun getItemCount() = foodList.size

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.imgFood.setImageResource(foodList[position].imagemProduto!!)
        holder.nomeProduto.text = foodList[position].nomeProduto
        holder.valorProduto.text = foodList[position].precoProduto
    }

    inner class FoodViewHolder(binding: ProdutosLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val nomeProduto = binding.nomeProduto
        val valorProduto = binding.valorProduto
        val imgFood = binding.gridImagem
    }
}
