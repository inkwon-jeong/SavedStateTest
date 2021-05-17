package com.example.savedstatetest.viewmodel

import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

  var count = 0
    private set

  fun incrementAndGet(): Int {
    count++
    return count
  }
}