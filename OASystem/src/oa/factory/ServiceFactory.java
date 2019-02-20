package oa.factory;
import oa.service.*;

public class ServiceFactory {

    public static ApplyService getApplyService(){
        return (ApplyService) AllFactory.get(AllFactory.Factory.ApplyService);
    }

    public static NoticeService getNoticeService(){
        return (NoticeService) AllFactory.get(AllFactory.Factory.NoticeService);
    }

    public static ProjectService getProjectService(){
        return (ProjectService) AllFactory.get(AllFactory.Factory.ProjectService);
    }

    public static RateService getRateService(){
        return (RateService) AllFactory.get(AllFactory.Factory.RateService);
    }

    public static ResignService getResignService(){
        return (ResignService) AllFactory.get(AllFactory.Factory.ResignService);
    }

    public static SignService getSignService(){
        return (SignService) AllFactory.get(AllFactory.Factory.SignService);
    }

    public static Update_infoService getUpdate_INfoService(){
        return (Update_infoService) AllFactory.get(AllFactory.Factory.Update_infoService);
    }
    public static UserService getUserService(){
        return (UserService) AllFactory.get(AllFactory.Factory.UserService);
    }
    public static Work_logService gteWorklogService(){
        return (Work_logService) AllFactory.get(AllFactory.Factory.Work_logService);
    }

    public static Work_timeService getWork_TimeService(){
        return (Work_timeService) AllFactory.get(AllFactory.Factory.Work_TimeService);
    }
    public static WorkOverService getWorkOverService(){
        return (WorkOverService) AllFactory.get(AllFactory.Factory.WorkOverService);
    }
}
