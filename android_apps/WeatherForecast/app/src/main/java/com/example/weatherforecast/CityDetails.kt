package com.example.weatherforecast

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherforecast.databinding.FragmentCityDetailsBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class CityDetails : Fragment() {

    companion object {
        const val CITY = "city"
        const val SEARCH_PREFIX = "https://www.google.com/search?q="
    }

    private var _binding: FragmentCityDetailsBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    private lateinit var city_name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            city_name = it.getString(CITY).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCityDetailsBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView
        // Retrieve the LETTER from the Intent extras
        // intent.extras.getString returns String? (String or null)
        // so toString() guarantees that the value will be a String
        //val letterId = activity?.intent?.extras?.getString(LETTER).toString()

        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this.requireContext())
        recyclerView.adapter = WeatherAdapter(this.requireContext(), city_name)

        // Adds a [DividerItemDecoration] between items
        recyclerView.addItemDecoration(
            DividerItemDecoration(this.requireContext(), DividerItemDecoration.VERTICAL)
        )

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}