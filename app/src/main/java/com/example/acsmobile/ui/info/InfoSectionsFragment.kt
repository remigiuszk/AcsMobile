package com.example.acsmobile.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.acsmobile.R
import com.example.acsmobile.adapter.NewsRecyclerViewAdapter
import com.example.acsmobile.adapter.SectionsRecyclerViewAdapter
import com.example.acsmobile.databinding.InfoSectionsFragmentBinding
import com.example.acsmobile.databinding.NewsFragmentBinding
import com.example.acsmobile.factory.ViewModel.InfoSectionsViewModelFactory
import com.example.acsmobile.factory.ViewModel.NewsViewModelFactory
import com.example.acsmobile.interfaces.AcsAmwApi
import com.example.acsmobile.model.info.SectionCategoryModel
import com.example.acsmobile.repository.CategoryRepository
import com.example.acsmobile.repository.NewsRepository
import com.example.acsmobile.ui.news.NewsViewModel

class InfoSectionsFragment : Fragment() {

    companion object {
        fun newInstance() = InfoSectionsFragment()
    }

    private lateinit var viewModel: InfoSectionsViewModel
    private lateinit var binding: InfoSectionsFragmentBinding
    private lateinit var factory: InfoSectionsViewModelFactory
    private lateinit var recyclerViewCategories: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = InfoSectionsFragmentBinding.inflate(layoutInflater)
        return inflater.inflate(R.layout.info_sections_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerViewCategories = view.findViewById(R.id.recyclerViewSections)
        val api = AcsAmwApi()
        val repo = CategoryRepository(api)
        factory = InfoSectionsViewModelFactory(repo)
        viewModel = ViewModelProvider(this, factory).get(InfoSectionsViewModel::class.java)
        viewModel.getCategories()
        var navController:NavController = findNavController()
        viewModel.categories.observe(viewLifecycleOwner, { news ->
            recyclerViewCategories.also {
                it.layoutManager = GridLayoutManager(this.context, 3)
                it.setHasFixedSize(true)
                val filteredCategories = viewModel.categories.value?.filter {it.link.contains("sport")} as ArrayList<SectionCategoryModel>
                it.adapter = SectionsRecyclerViewAdapter(filteredCategories, navController, view)
            }
        })
    }

}