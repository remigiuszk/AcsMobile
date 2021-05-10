package com.example.acsmobile.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.example.acsmobile.R
import com.example.acsmobile.databinding.RecyclerviewCategoryBinding
import com.example.acsmobile.model.info.SectionCategoryModel

class SectionsRecyclerViewAdapter(
    private val categories: ArrayList<SectionCategoryModel>,
    private val navController: NavController,
    private val view: View
) : RecyclerView.Adapter<SectionsRecyclerViewAdapter.CategoryViewHolder>() {

    inner class CategoryViewHolder(
        val recyclerViewCategoryBinding: RecyclerviewCategoryBinding,
        val navController: NavController,
        val view: View
    ) : RecyclerView.ViewHolder(recyclerViewCategoryBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.recyclerview_category,
                parent,
                false
            ),
            navController,
            view
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.recyclerViewCategoryBinding.categoryName = categories[position].name
        holder.recyclerViewCategoryBinding.sectionButton.setOnClickListener {
            val layoutId: Int = view.resources.getIdentifier(
                categories[position].layoutName,
                "id",
                view.context.packageName
            )
            if (layoutId > 0) {
                val args: Bundle = bundleOf("categoryId" to  categories[position].id)
                navController.navigate(layoutId,args)
            }
            else
                Toast.makeText(
                    view.context,
                    "Nie można odnaleźć wybranej sekcji, spróbuj ponownie później.",
                    Toast.LENGTH_SHORT
                ).show()
        }
    }

    override fun getItemCount(): Int {
        return categories.size
    }
}