package com.voxeldev.summerpractice2022.ui.adapters

import androidx.recyclerview.widget.RecyclerView
import com.voxeldev.summerpractice2022.databinding.ItemTaxistsListBinding

class TaxiHolder(binding: ItemTaxistsListBinding) : RecyclerView.ViewHolder(binding.root) {
    val root = binding.root
    val nameTextView = binding.taxistName
    val priceTextView = binding.taxiPrice
}