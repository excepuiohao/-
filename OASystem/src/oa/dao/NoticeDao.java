package oa.dao;

import oa.bean.Apply;
import oa.bean.Notice;

import java.util.List;

public interface NoticeDao {

    List<Notice> query(Notice notice);

    boolean insert(Notice notice);

    boolean updateAll(Notice notice);

    boolean update(Notice notice);

    boolean delete(Notice notice);
}
