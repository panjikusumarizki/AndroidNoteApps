package com.goji.mynoteapps.ui.main

import android.app.Application
import androidx.lifecycle.*
import com.goji.mynoteapps.database.Note
import com.goji.mynoteapps.repository.NoteRepository

class MainViewModel(application: Application) : ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun getAllNotes(): LiveData<List<Note>> = mNoteRepository.getALlNotes()
}