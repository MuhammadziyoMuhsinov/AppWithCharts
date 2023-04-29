package com.reflex.narodnaya_platforma.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.reflex.narodnaya_platforma.ActivityStart
import com.reflex.narodnaya_platforma.PagerFragment
import com.reflex.narodnaya_platforma.models.ModelData

class CustomPagerAdapter(activity: ActivityStart, val list: List<ModelData>) :
    FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return PagerFragment().apply {
            arguments= Bundle().apply {
                val item = list[position]
                putInt("image",item.image)
                putString("title",item.title)
                putString("des",item.description)
            }
        }
    }
}