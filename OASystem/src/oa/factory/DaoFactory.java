package oa.factory;

import oa.bean.WorkOver;
import oa.dao.*;
import oa.service.ResignService;
import oa.service.WorkOverService;
import oa.service.Work_timeService;

public class DaoFactory {

    private static BaseDao<WorkOver> workOverDao;

    public static ApplyDao getApplyDao(){
        return (ApplyDao) AllFactory.get(AllFactory.Factory.ApplyDao);
    }

    public static NoticeDao getNoticeDao(){
        return (NoticeDao) AllFactory.get(AllFactory.Factory.NoticeDao);
    }

    public static ProjectDao getProjectDao(){
        return (ProjectDao) AllFactory.get(AllFactory.Factory.ProjectDao);
    }

    public static RateDao getRateDao(){
        return (RateDao) AllFactory.get(AllFactory.Factory.RateDao);
    }

    public static SignDao getSignDao(){
        return (SignDao) AllFactory.get(AllFactory.Factory.SignDao);
    }

    public static Update_infoDao getUpdate_InfoDao(){
        return (Update_infoDao) AllFactory.get(AllFactory.Factory.Update_infoDao);
    }

    public static UserDao getUserDao(){
        return (UserDao) AllFactory.get(AllFactory.Factory.UserDao);
    }
    public static Work_logDao getWork_logDao(){
        return (Work_logDao) AllFactory.get(AllFactory.Factory.Work_logDao);
    }

    public static Work_timeDao getWork_TimeDao(){
        return (Work_timeDao) AllFactory.get(AllFactory.Factory.Work_TimeDao);
    }

    public static ResignDao getResignDao() {
        return (ResignDao) AllFactory.get(AllFactory.Factory.ResignDao);
    }

    public static WorkOverDao getWorkOverDao() {
        return (WorkOverDao) AllFactory.get(AllFactory.Factory.WorkOverDao);
    }
}
