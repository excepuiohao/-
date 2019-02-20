package oa.dao.Impl;

import oa.bean.Notice;
import oa.dao.BaseDao;
import oa.dao.NoticeDao;

public class NoticeDaoImpl extends BaseDao<Notice> implements NoticeDao {
    @Override
    public boolean update(Notice notice) {
        return false;
    }

    @Override
    protected String getTable() {
        return "oa_notice";
    }
}
