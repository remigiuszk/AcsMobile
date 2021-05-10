package com.example.acsmobile.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.acsmobile.adapter.NewsRecyclerViewAdapter
import com.example.acsmobile.factory.ViewModel.NewsViewModelFactory
import com.example.acsmobile.interfaces.AcsAmwApi
import com.example.acsmobile.R
import com.example.acsmobile.repository.NewsRepository
import com.example.acsmobile.databinding.NewsFragmentBinding
import com.example.acsmobile.ui.info.InfoSectionsFragmentArgs

class NewsFragment : Fragment() {

    companion object {
        fun newInstance() = NewsFragment()
    }
    private lateinit var binding: NewsFragmentBinding
    private lateinit var viewModel: NewsViewModel
    private lateinit var factory: NewsViewModelFactory
    private lateinit var recyclerviewNews: RecyclerView
    private val args: InfoSectionsFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = NewsFragmentBinding.inflate(layoutInflater)
        return inflater.inflate(R.layout.news_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerviewNews = view.findViewById(R.id.recyclerViewNews)
        val api = AcsAmwApi()
        val repo = NewsRepository(api)
        factory = NewsViewModelFactory(repo)
        viewModel = ViewModelProvider(this, factory).get(NewsViewModel::class.java)
        if(args.categoryId == 0)
            viewModel.getNews()
        else
            viewModel.getNews(args.categoryId)
        viewModel.news.observe(viewLifecycleOwner, { news ->
            recyclerviewNews.also {
                it.layoutManager = LinearLayoutManager(requireContext())
                it.setHasFixedSize(true)
                it.adapter = NewsRecyclerViewAdapter(news)
            }

    })
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
////        recyclerviewNews.layoutManager = LinearLayoutManager(requireContext())
////        recyclerviewNews.adapter = viewModel.news.value?.let { NewsRecyclerViewAdapter(it) }
////        recyclerviewNews.setHasFixedSize(true)
//        viewModel.news.observe(viewLifecycleOwner, { news ->
//            recyclerviewNews.also {
//                it.layoutManager = LinearLayoutManager(requireContext())
//                it.setHasFixedSize(true)
//                it.adapter = NewsRecyclerViewAdapter(news)
//            }
//        })
    }

