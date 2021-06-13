package com.mkpatir.needacar.ui.calendar

import androidx.fragment.app.viewModels
import com.mkpatir.needacar.R
import com.mkpatir.needacar.databinding.FragmentCalendarBinding
import com.mkpatir.needacar.ui.base.BaseFragment
import com.mkpatir.needacar.ui.base.EmptyViewModel

class CalendarFragment: BaseFragment<FragmentCalendarBinding,EmptyViewModel>() {

    override fun setLayout(): Int = R.layout.fragment_calendar

    override fun setViewModel(): Lazy<EmptyViewModel> = viewModels()

    override fun setupUI() {

    }
}