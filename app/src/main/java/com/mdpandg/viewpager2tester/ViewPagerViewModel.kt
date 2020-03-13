package com.mdpandg.viewpager2tester

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewPagerViewModel : ViewModel() {
    val loginEvent: LiveData<Boolean> = MutableLiveData()
}
