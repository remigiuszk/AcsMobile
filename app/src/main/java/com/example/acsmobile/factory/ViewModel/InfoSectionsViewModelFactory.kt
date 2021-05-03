package com.example.acsmobile.factory.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.repository.CategoryRepository
import com.example.acsmobile.ui.info.InfoSectionsViewModel

@Suppress("UNCHECKED_CAST")
class InfoSectionsViewModelFactory(
        private val categoryRepository: CategoryRepository
): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return InfoSectionsViewModel(categoryRepository) as T
    }
}