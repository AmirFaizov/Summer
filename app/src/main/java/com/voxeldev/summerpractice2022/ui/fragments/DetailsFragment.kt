package com.voxeldev.summerpractice2022.ui.fragments

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.google.android.material.transition.MaterialContainerTransform
import com.voxeldev.summerpractice2022.R
import com.voxeldev.summerpractice2022.databinding.FragmentDetailsBinding
import com.voxeldev.summerpractice2022.ui.activities.MainActivity

class DetailsFragment : BaseFragment<FragmentDetailsBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)

        val taxists = (requireActivity() as MainActivity).taxists
        val position = arguments?.getInt("position", -1)

        if (position == null || position == -1) {
            Log.d("Taxists", "Error")
            return binding.root
        }

        Glide.with(requireContext())
            .load(taxists[position].url)
            .into(binding.image)
        binding.detailsTime.text = taxists[position].time
        binding.ditailsComment.text = taxists[position].comment
        binding.detailsPrice.text = taxists[position].price

        return binding.root
    }

    @SuppressLint("ResourceType")
    override fun setSharedElementEnterTransition(transition: Any?) {
        MaterialContainerTransform().apply {
            drawingViewId = R.id.main_nav_host_fragment
            duration = 1000
            scrimColor = Color.TRANSPARENT
            setAllContainerColors(requireContext().getColor(com.google.android.material.R.attr.colorSurface))
        }
    }
}