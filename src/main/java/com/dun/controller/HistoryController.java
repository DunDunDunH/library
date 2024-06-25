package com.dun.controller;

import com.dun.entity.History;
import com.dun.mapper.HistoryMapper;
import com.dun.service.HistoryService;
import lombok.AllArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("history")
public class HistoryController {

    @Autowired
    private HistoryService historyService;


    @GetMapping("getById")
    public History getById(@RequestParam("id") String id) {
        return historyService.getById(id);
    }

    @GetMapping("getByBookId")
    public List<History> getByBookId(@RequestParam("bookId")String bookId) {
        return historyService.getByBookId(bookId);
    }

    @GetMapping("getByUserId")
    public List<History> getByUserId(@RequestParam("userId")String userId) {
        return historyService.getByUserId(userId);
    }

    @PostMapping("deleteById")
    public void deleteById(@RequestParam("id")String id) {
        historyService.deleteById(id);
    }
}
