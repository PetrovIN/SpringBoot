package com.example.library.repository;

//import com.example.library.DAO.Reader;
import org.springframework.stereotype.Component;

import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReaderRepositoryImpl implements ReaderRepository {
    @Override
    public boolean addReader(List<java.io.Reader> readers, java.io.Reader reader) {
        if (reader != null && !readers.contains(reader)) {
            readers.add(reader);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteReader(List<java.io.Reader> readers, java.io.Reader reader) {
        if (reader != null && readers.contains(reader)) {
            readers.remove(reader);
            return true;
        }
        return false;
    }

    @Override
    public Reader getReaderById(List<Reader> readers, int id) {
        return Arrays.asList(readers).contains(id);
    }

    @Override
    public List<Reader> getReaderByName(List<Reader> readers, String name) {
        return readers.stream().filter(reader -> reader.getName() == name).collect(Collectors.toList());
    }
}
