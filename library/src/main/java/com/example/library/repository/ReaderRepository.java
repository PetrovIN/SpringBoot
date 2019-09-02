package com.example.library.repository;

import com.example.library.DAO.Reader;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public interface ReaderRepository {
    boolean addReader(List<Reader> readers, Reader reader);
    boolean deleteReader(List<Reader> readers, Reader reader);
    Reader getReaderById(List<Reader> readers, int id);
    List<Reader> getReaderByName(List<Reader> readers, String name);
}
