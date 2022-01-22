package com.example.examplemvvm.domain

import com.example.examplemvvm.data.model.QuoteModel
import com.example.examplemvvm.data.network.QuoteRepository
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository: QuoteRepository) {


    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()

}