package com.example.savedstatetest.onsaveinstancestate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.savedstatetest.databinding.FragmentOnSaveInstanceStateBinding

class OnSaveInstanceStateFragment : Fragment() {

  private var count: Int = 0

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val binding = FragmentOnSaveInstanceStateBinding.inflate(inflater, container, false)
      .apply {
        if (savedInstanceState != null) {
          count = savedInstanceState.getInt("count")
        }

        textViewCount.text = "$count"
        buttonCount.setOnClickListener {
          count++
          textViewCount.text = "$count"
        }
      }

    return binding.root
  }

  override fun onSaveInstanceState(outState: Bundle) {
    super.onSaveInstanceState(outState)
    outState.putInt("count", count)
  }
}