package com.example.autobrew

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OrderAdapter(private val items: List<OrderItem>) : RecyclerView.Adapter<OrderAdapter.OrderViewHolder>(){

    // A simple ViewHolder to hold your views
    class OrderViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.tvItemName)
        val details: TextView = view.findViewById(R.id.tvItemDetails)
        val price: TextView = view.findViewById(R.id.tvItemPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_order_summary, parent, false)
        return OrderViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        val item = items[position]
        holder.name.text = item.name
        holder.details.text = item.details
        holder.price.text = "₱${String.format("%.2f", item.price * item.quantity)}"
    }

    override fun getItemCount(): Int = items.size
}