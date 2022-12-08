package com.example.m3tanetswear.data

import com.example.m3tanetswear.R
import com.example.m3tanetswear.data.model.Outfit

class DataSource {
    fun loadData(): List<Outfit> {
        return listOf(
            Outfit (R.drawable.outfit1, name = "5PAC3 CAD3TT", price = 0.00000002234, sale = false),
            Outfit (R.drawable.outfit2, name = "Y1NG & YANG", price = 0.00000004432, sale = true),
            Outfit (R.drawable.outfit3, name = "D3S3RT R053", price = 0.00000003563, sale = false),
            Outfit (R.drawable.outfit4, name = "R0CK5TAR", price = 0.00000007665, sale = false))


    }
}