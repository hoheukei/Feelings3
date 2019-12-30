package com.example.feelings

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class FeelingViewModel(application: Application) : AndroidViewModel(application) {
    private val respositary: FeelingRepository

    val allFeelings: LiveData<List<Feeling>>

    init{
        val feelingDao = FeelingDatabase.getDatabase(application).feelingDao()

        respositary = FeelingRepository(feelingDao)
        allFeelings = respositary.allFeelings
    }

    fun insert(feeling: Feeling) = viewModelScope.launch {
        respositary.insert(feeling)
    }

}