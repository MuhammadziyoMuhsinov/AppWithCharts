package com.reflex.narodnaya_platforma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.reflex.narodnaya_platforma.adapter.CustomPagerAdapter
import com.reflex.narodnaya_platforma.databinding.ActivityStartBinding
import com.reflex.narodnaya_platforma.models.ModelData

class ActivityStart : AppCompatActivity() {
    private lateinit var binding:ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val data = listOf<ModelData>(
            ModelData(R.drawable.logo, "народная платформа ", "Мы продолжаем линейку наших статей про сырьевые рынки.\n "),
            ModelData(R.drawable.img3, "народная платформа ", "В прошлый раз мы рассмотрели, как устроены рынок нефти\n  и рынок угля («Мировой рынок угля»)."),
            ModelData(R.drawable.img1, "народная платформа ", " В этой статье поговорим о не менее важной теме -\n мировом рынке природного газа"),
            ModelData(R.drawable.img2, "народная платформа ", " Это стратегическая ниша\n для нашей страны, т.к."),
            ModelData(R.drawable.img4, "народная платформа ", " Россия занимает первое место в мировом\n рейтинге по запасам природного газа. "),
        )
        val customPagerAdapter = CustomPagerAdapter(this, data)
        binding.viewpager.adapter = customPagerAdapter

        TabLayoutMediator(binding.tablayout, binding.viewpager) { tab, position->
        }.attach()

        binding.button.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }


    }
}