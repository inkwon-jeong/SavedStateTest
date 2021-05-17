package com.example.savedstatetest.savedstatehandle

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class CounterViewModel(
  private val handle: SavedStateHandle
) : ViewModel() {
  val count = handle.getLiveData("count", 0)

  fun increment() {
    val count = handle.get<Int>("count") ?: 0
    handle.set("count", count + 1)
  }
}