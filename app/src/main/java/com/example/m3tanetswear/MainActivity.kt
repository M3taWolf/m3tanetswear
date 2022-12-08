package com.example.m3tanetswear

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.example.m3tanetswear.adapter.OutfitAdapter
import com.example.m3tanetswear.data.DataSource
import com.example.m3tanetswear.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val outfits = DataSource().loadData()
        binding.outfitRecycler.adapter = OutfitAdapter(outfits)
        binding.outfitRecycler.setHasFixedSize(true)

        val snapHelper: SnapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(binding.outfitRecycler)

    }



}