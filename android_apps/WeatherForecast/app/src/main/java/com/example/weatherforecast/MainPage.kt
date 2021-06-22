package com.example.weatherforecast

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.weatherforecast.databinding.FragmentMainPageBinding


class MainPage : Fragment() {


    private var _binding: FragmentMainPageBinding? = null
    private val binding get() = _binding!!
    private lateinit var button: Button
    private lateinit var city_name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainPage", "on create")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("MainPage", "on create view")
        //return inflater.inflate(R.layout.fragment_main_page, container, false)
        _binding = FragmentMainPageBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        button = binding.button
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}