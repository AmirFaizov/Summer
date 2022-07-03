package com.example.homework2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework2.databinding.FragmentLockpersonBinding
import com.example.homework2.databinding.FragmentMusicBinding
import com.google.android.material.snackbar.Snackbar

class LockPersonFragment : Fragment(R.layout.fragment_lockperson) {

    private var _binding: FragmentLockpersonBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentLockpersonBinding.bind(view)

        with(binding) {
            btnLockperson.setOnClickListener {
                findNavController().navigate(
                    R.id.action_lockPersonFragment_to_mainFragment,
                    MainFragment.createBundle(textView1.text.toString())
                )
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}