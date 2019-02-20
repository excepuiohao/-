package oa.service.Impl;

import oa.bean.Notice;
import oa.factory.DaoFactory;
import oa.service.NoticeService;

import java.util.List;

public class NoticeServiceImpl implements NoticeService {
    @Override
    public List<Notice> query(Notice notice) {
        return DaoFactory.getNoticeDao().query(notice);
    }

    @Override
    public boolean insert(Notice notice) {
        return DaoFactory.getNoticeDao().insert(notice);
    }

    @Override
    public boolean updateAll(Notice notice) {
        return DaoFactory.getNoticeDao().updateAll(notice);
    }

    @Override
    public boolean update(Notice notice) {
        return DaoFactory.getNoticeDao().update(notice);
    }

    @Override
    public boolean delete(Notice notice) {
        return DaoFactory.getNoticeDao().delete(notice);
    }
}
