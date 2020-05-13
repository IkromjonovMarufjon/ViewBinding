package com.example.viewbindingexample.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbindingexample.databinding.ItemExampleBinding
import com.example.viewbindingexample.model.ExampData

/**
 *  Created by Ikromjonov Ma'rufjon
 *  data = 5/13/2020 , time = 17:36
 */

class ExampAdapter : ListAdapter<ExampData,ExampAdapter.ViewHolder>(DiffItem) {
    private var _binding : ItemExampleBinding? = null
    private val binding get() = _binding!!

    object DiffItem : DiffUtil.ItemCallback<ExampData>(){
        override fun areItemsTheSame(oldItem: ExampData, newItem: ExampData): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ExampData, newItem: ExampData): Boolean {
            return oldItem.text == newItem.text
        }
    }


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun load() {
            getItem(adapterPosition).apply {
                binding.textID.text = id.toString()
                binding.textMessage.text = text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        _binding = ItemExampleBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)  = holder.load()

    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        Log.d("TTT","onDetachedFromRecyclerView")
        _binding = null
    }
}