package com.example.quiz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_quiaz_question.view.*
import kotlinx.android.synthetic.main.qlay.view.*

class quizAdapter(var questionlist: List<Question>) :
    RecyclerView.Adapter<quizAdapter.quizViewHolder>() {

    class quizViewHolder(itemview: View):RecyclerView.ViewHolder(itemview) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): quizViewHolder {

        val itemview =
            LayoutInflater.from(parent.context).inflate(R.layout.qlay, parent, false)
        return quizViewHolder(itemview)
    }


    override fun getItemCount(): Int {
        return questionlist.size
    }

    override fun onBindViewHolder(holder: quizViewHolder, position: Int) {
        holder.itemView.questiontv.text=questionlist[position].question
        holder.itemView.correctans.text=questionlist[position].correctoption.toString()

    }

}