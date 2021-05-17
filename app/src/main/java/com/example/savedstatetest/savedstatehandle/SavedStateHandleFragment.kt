package com.example.savedstatetest.savedstatehandle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.SavedStateViewModelFactory
import androidx.lifecycle.ViewModelProvider
import com.example.savedstatetest.databinding.FragmentSavedStateHandleBinding

class SavedStateHandleFragment : Fragment() {

  lateinit var viewModel: CounterViewModel

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    viewModel = ViewModelProvider(
      this,
      SavedStateViewModelFactory(requireActivity().application, this)
    ).get(CounterViewModel::class.java)

    val binding = FragmentSavedStateHandleBinding.inflate(inflater, container, false)
      .apply {
        viewModel.count.observe(viewLifecycleOwner, { count ->
          textViewCount.text = "$count"
        })

        buttonCount.setOnClickListener {
          viewModel.increment()
        }
      }

    return binding.root
  }
}