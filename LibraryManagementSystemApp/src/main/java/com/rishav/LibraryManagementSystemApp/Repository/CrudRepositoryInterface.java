package com.rishav.LibraryManagementSystemApp.Repository;

import com.rishav.LibraryManagementSystemApp.DatabaseStore.BookDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CrudRepositoryInterface extends JpaRepository<BookDetails,Integer> {


    List<BookDetails> findAll();
    BookDetails findById(int id);
}
