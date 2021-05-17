package com.example.savedstatetest.viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.savedstatetest.R
import com.example.savedstatetest.databinding.FragmentViewModelBinding

class ViewModelFragment : Fragment() {

  lateinit var viewModel: CounterViewModel

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    viewModel = ViewModelProvider(this).get(CounterViewModel::class.java)

    val binding = FragmentViewModelBinding.inflate(inflater, container, false)
      .apply {
        textViewCount.text = "${viewModel.count}"
        buttonCount.setOnClickListener {
          textViewCount.text = "${viewModel.incrementAndGet()}"
        }
      }

    return binding.root
  }
}