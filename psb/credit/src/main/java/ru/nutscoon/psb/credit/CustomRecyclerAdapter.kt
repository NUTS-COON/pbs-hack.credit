package ru.nutscoon.psb.credit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomRecyclerAdapter(private val names: List<CreditData>) :
    RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var creditName: TextView? = null
        var creditDesc: TextView? = null

        init {
            creditName = itemView.findViewById(R.id.credit_name)
            creditDesc = itemView.findViewById(R.id.credit_description)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.rv_credit_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.creditName?.text = names[position].name
        holder.creditDesc?.text = names[position].desc
    }

    override fun getItemCount() = names.size
}