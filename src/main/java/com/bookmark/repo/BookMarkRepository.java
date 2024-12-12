package com.bookmark.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bookmark.model.BookMark;

@Repository
public interface BookMarkRepository extends JpaRepository<BookMark, Integer> {

    
}