package com.dun.service.impl;

import com.dun.entity.History;
import com.dun.mapper.HistoryMapper;
import com.dun.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    private HistoryMapper historyMapper;

    @Override
    public History getById(String id) {
        return historyMapper.getById(id);
    }

    @Override
    public List<History> getByBookId(String bookId) {
        return historyMapper.getByBookId(bookId);
    }

    @Override
    public List<History> getByUserId(String userId) {
        return historyMapper.getByUserId(userId);
    }

    @Override
    public void deleteById(String id) {
        historyMapper.deleteById(id);
    }
}
