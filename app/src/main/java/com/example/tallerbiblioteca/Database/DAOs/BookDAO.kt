package com.example.tallerbiblioteca.Database.DAOs

import androidx.lifecycle.LiveData
import androidx.room.Dao
import com.example.tallerbiblioteca.Database.Entities.Book

@Dao
interface BookDAO {
    //TODO implementar los metodos de manejo de base de datos para Book

    fun getAllBooks(): LiveData<List<Book>>

    fun insert(book: Book)

    fun search(book: Book)
}