package com.example.examplemvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examplemvvm.data.model.QuoteModel
import com.example.examplemvvm.data.model.QuoteProvider
import com.example.examplemvvm.domain.GetQuotesUseCase
import kotlinx.coroutines.launch

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    var getQuotesUseCase = GetQuotesUseCase()

    fun onCreate() {
        viewModelScope.launch {
            val result = getQuotesUseCase()
        }


    }

    fun randomQuote() {
        //    val currentQuote = QuoteProvider.random()
        //    quoteModel.postValue(currentQuote)
    }
}