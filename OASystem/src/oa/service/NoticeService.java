package oa.service;

import oa.bean.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> query(Notice notice);

    boolean insert(Notice notice);

    boolean updateAll(Notice notice);

    boolean update(Notice notice);

    boolean delete(Notice notice);
}
