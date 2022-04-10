package com.example.front_endassignment2.fragments

import android.content.res.Resources
import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.example.front_endassignment2.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class ProfileFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        val dialog: BottomSheetDialog = BottomSheetDialog(requireContext(), R.style.BottomSheetDialog)
//        dialog.setContentView(R.layout.fragment_profile_bottom_sheet)
//        dialog.show()

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_bottom_sheet, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutParams: FrameLayout.LayoutParams =
            view.layoutParams as FrameLayout.LayoutParams
        layoutParams.rightMargin = 16.toPx().toInt()
        layoutParams.leftMargin = 16.toPx().toInt()
        view.layoutParams = layoutParams

    }

    fun Number.toPx() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        Resources.getSystem().displayMetrics
    )

    override fun getTheme(): Int {
        return R.style.NoBackgroundDialogTheme
    }
}