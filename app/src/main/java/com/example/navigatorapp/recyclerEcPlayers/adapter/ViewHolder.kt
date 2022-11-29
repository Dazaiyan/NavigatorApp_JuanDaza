package com.example.navigatorapp.recyclerEcPlayers.adapter

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navigatorapp.recyclerEcPlayers.EcPlayer
import com.example.navigatorapp.databinding.ItemPlayerBinding

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemPlayerBinding.bind(view)
    @SuppressLint("SetTextI18n")
    fun render(ecPlayer: EcPlayer){
        binding.tvEcPlayerName.text = ecPlayer.nombre
        binding.tvEcPlayerAge.text = "Caras: " + ecPlayer.caras.toString()
        binding.tvEcPlayerTeam.text = "Colores: " + ecPlayer.colores
        Glide.with(binding.ivEcPlayer.context).load(ecPlayer.imagen).into(binding.ivEcPlayer)
    }
}