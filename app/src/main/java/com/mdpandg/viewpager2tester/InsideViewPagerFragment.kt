package com.mdpandg.viewpager2tester

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.inside_view_pager_fragment.*


class InsideViewPagerFragment : Fragment() {

    companion object {
        fun newInstance() = InsideViewPagerFragment()
    }

    private lateinit var viewModel: InsideViewPagerViewModel
    private val sharedViewModel: ViewPagerViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.inside_view_pager_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InsideViewPagerViewModel::class.java)

        login_button.setOnClickListener {
            (sharedViewModel.loginEvent as MutableLiveData).value = true
            (sharedViewModel.loginEvent as MutableLiveData).value = false
        }
    }

}
