package com.example.spj.presentation.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.spj.R

class SecondFinishFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onResume() {
        super.onResume()
        val test = requireView().findViewById<TextView>(R.id.textView)
        val test2 = requireView().findViewById<TextView>(R.id.textView3)
    }
}