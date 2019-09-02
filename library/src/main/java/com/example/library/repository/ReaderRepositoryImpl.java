package com.example.library.repository;

import com.example.library.DAO.Reader;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReaderRepositoryImpl implements ReaderRepository {
    @Override
    public boolean addReader(List<Reader> readers, Reader reader) {
        if (reader != null && !readers.contains(reader)) {
            readers.add(reader);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteReader(List<Reader> readers, Reader reader) {
        if (reader != null && readers.contains(reader)) {
            readers.remove(reader);
            return true;
        }
        return false;
    }

    @Override
    public Reader getReaderById(List<Reader> readers, int id) {
        return null;
    }

    @Override
    public List<Reader> getReaderByName(List<Reader> readers, String name) {
        return null;
    }
}
