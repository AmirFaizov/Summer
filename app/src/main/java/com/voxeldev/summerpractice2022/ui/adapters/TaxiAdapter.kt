package com.voxeldev.summerpractice2022.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.voxeldev.summerpractice2022.R
import com.voxeldev.summerpractice2022.data.models.Taxi
import com.voxeldev.summerpractice2022.databinding.ItemTaxistsListBinding

class TaxiAdapter(
    private val taxisis: List<Taxi>,
    private val navController: NavController
) : RecyclerView.Adapter<TaxiHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaxiHolder {
        val binding = ItemTaxistsListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return TaxiHolder(binding)
    }

    override fun onBindViewHolder(holder: TaxiHolder, position: Int) {
        holder.nameTextView.text = taxisis[position].name
        holder.priceTextView.text = taxisis[position].price

        holder.root.setOnClickListener {
            navController.navigate(
                R.id.action_navigation_list_to_navigation_details,
                bundleOf("position" to position)
            )
        }
    }

    override fun getItemCount(): Int = taxisis.size
}