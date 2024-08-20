package com.rishav.LibraryManagementSystemApp.Service;

import com.rishav.LibraryManagementSystemApp.DatabaseStore.BookDetails;
import com.rishav.LibraryManagementSystemApp.Repository.CrudRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Login")
public class HandlerClass
{
    BookDetails bookDetails;
    @Autowired
    CrudRepositoryInterface crud;

    @GetMapping("/")
    public String welcome()
    {
        return "<html><body>"
                + "<h1>WELCOME</h1>"
                + "</body></html>";
    }

    @GetMapping("/all")
    public List<BookDetails> findAllFunction()
    {
        return crud.findAll();
    }
    @GetMapping("{id}")
    public BookDetails bookName(@PathVariable int id)
    {
        return crud.findById(id);
    }

    @PostMapping("/addDetails")
    public String addBook(@RequestBody BookDetails bookDetails)
    {
        crud.save(bookDetails);
        return bookDetails.getBookId()+" Saved Successfully "+bookDetails.getBookName();
    }

}
