package com.example.to_do_app.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.to_do_app.R
import com.example.to_do_app.model.ToDo

class MyAdapter(private val context: Context, private val todoList: List<ToDo>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int = todoList.size

    override fun getItem(position: Int): ToDo = todoList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.list_item, parent, false)

        val tvToDo = rowView.findViewById<TextView>(R.id.tvToDo)
        val tvCompleted = rowView.findViewById<TextView>(R.id.tvCompleted)

        tvToDo.text = todoList[position].todo
        tvCompleted.text = todoList[position].completed.toString()

        val backgroundColor = if (todoList[position].completed) {
            ContextCompat.getColor(context, R.color.light_pink) // Light pink from colors.xml
        } else {
            ContextCompat.getColor(context, R.color.dark_pink) // Dark pink from colors.xml
        }
        rowView.setBackgroundColor(backgroundColor)

        return rowView
    }
}