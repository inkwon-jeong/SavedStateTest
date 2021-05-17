package com.example.savedstatetest

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.savedstatetest.databinding.FragmentMainBinding

private const val TAG = "MainFragment"

class MainFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d(TAG, "onCreateView")
        val binding = FragmentMainBinding.inflate(inflater, container, false)
            .apply {
                buttonOnSaveInstanceState.setOnClickListener {
                    findNavController().navigate(
                        MainFragmentDirections
                            .actionMainFragmentToOnSaveInstanceStateFragment()
                    )
                }

                buttonSavedStateHandle.setOnClickListener {
                    findNavController().navigate(
                        MainFragmentDirections
                            .actionMainFragmentToSavedStateHandleFragment()
                    )
                }

                buttonViewModel.setOnClickListener {
                    findNavController().navigate(
                        MainFragmentDirections
                            .actionMainFragmentToViewModelFragment()
                    )
                }
            }

        return binding.root
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState")
    }
}