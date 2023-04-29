package com.reflex.narodnaya_platforma.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.reflex.narodnaya_platforma.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
       _binding  = FragmentHomeBinding.inflate(layoutInflater)



        val entries: ArrayList<Entry> = ArrayList()

        entries.add(Entry(1991f, 643f))
        entries.add(Entry(1992f, 641f))
        entries.add(Entry(1993f, 618f))
        entries.add(Entry(1994f, 607f))
        entries.add(Entry(1995f, 595f))
        entries.add(Entry(1996f, 601f))
        entries.add(Entry(1997f, 571f))
        entries.add(Entry(1998f, 591f))
        entries.add(Entry(1999f, 592f))
        entries.add(Entry(2000f, 584f))
        entries.add(Entry(2001f, 581f))
        entries.add(Entry(2002f, 595f))
        entries.add(Entry(2003f, 620f))
        entries.add(Entry(2004f, 633f))

// На основании массива точек создадим первую линию с названием
        // На основании массива точек создадим первую линию с названием
        val dataset = LineDataSet(entries, "График первый")

        val data = LineData(dataset)

        binding.chart.setData(data)

        binding.chart.invalidate()






        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}