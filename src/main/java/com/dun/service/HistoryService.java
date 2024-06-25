package com.dun.service;

import com.dun.entity.History;

import java.util.List;

public interface HistoryService {

    History getById(String id);

    List<History> getByBookId(String bookId);

    List<History> getByUserId(String userId);

    void deleteById(String id);
}
