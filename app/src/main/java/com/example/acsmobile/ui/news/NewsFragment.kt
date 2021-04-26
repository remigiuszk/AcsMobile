package com.example.acsmobile.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.acsmobile.adapter.NewsRecyclerViewAdapter
import com.example.acsmobile.factory.NewsViewModelFactory
import com.example.acsmobile.interfaces.NewsApi
import com.example.acsmobile.R
import com.example.acsmobile.repository.NewsRepository
import com.example.acsmobile.databinding.NewsFragmentBinding

class NewsFragment : Fragment() {

    companion object {
        fun newInstance() = NewsFragment()
    }
    private lateinit var binding: NewsFragmentBinding
    private lateinit var viewModel: NewsViewModel
    private lateinit var factory: NewsViewModelFactory
    private lateinit var recyclerviewNews: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = NewsFragmentBinding.inflate(layoutInflater)
        val view = binding.root
        recyclerviewNews = view.findViewById<RecyclerView>(R.id.recyclerViewNews)
        return inflater.inflate(R.layout.news_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val api = NewsApi()
        val repo = NewsRepository(api)
        factory = NewsViewModelFactory(repo)
        viewModel = ViewModelProvider(this, factory).get(NewsViewModel::class.java)
        viewModel.getNews()
//        recyclerviewNews.layoutManager = LinearLayoutManager(requireContext())
//        recyclerviewNews.adapter = viewModel.news.value?.let { NewsRecyclerViewAdapter(it) }
//        recyclerviewNews.setHasFixedSize(true)
        viewModel.news.observe(viewLifecycleOwner, { news ->
            recyclerviewNews.also {
                it.layoutManager = LinearLayoutManager(requireContext())
                it.setHasFixedSize(true)
                it.adapter = NewsRecyclerViewAdapter(news)
            }
        })
    }

}