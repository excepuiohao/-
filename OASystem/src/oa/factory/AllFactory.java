package oa.factory;

import oa.dao.Impl.*;
import oa.service.Impl.*;

import java.util.HashMap;
import java.util.Map;

public class AllFactory {

    private static Map<Factory,Object> map = new HashMap<Factory, Object>();

    public static Object get(Factory factory){
        Object obj = map.get(factory);
        if(obj == null){
            switch (factory) {
                case UserDao: {
                    obj = new UserDaoImpl();
                    break;
                }
                case RateDao: {
                    obj = new RateDaoImpl();
                    break;
                }
                case SignDao: {
                    obj = new SignDaoImpl();
                    break;
                }
                case ApplyDao: {
                    obj = new ApplyDaoImpl();
                    break;
                }
                case NoticeDao: {
                    obj = new NoticeDaoImpl();
                    break;
                }
                case ResignDao: {
                    obj = new ResignDaoImpl();
                    break;
                }
                case ProjectDao: {
                    obj = new ProjectDaoImpl();
                    break;
                }
                case RateService: {
                    obj = new RateServiceImpl();
                    break;
                }
                case SignService: {
                    obj = new SignServiceImpl();
                    break;
                }
                case UserService: {
                    obj = new UserServiceImpl();
                    break;
                }
                case Work_logDao: {
                    obj = new Work_logDaoImpl();
                    break;
                }
                case ApplyService: {
                    obj = new ApplyServiceImpl();
                    break;
                }
                case Work_TimeDao: {
                    obj = new Work_timeDaoImpl();
                    break;
                }
                case NoticeService: {
                    obj = new NoticeServiceImpl();
                    break;
                }
                case ResignService: {
                    obj = new ResignServiceImpl();
                    break;
                }
                case ProjectService: {
                    obj = new ProjectServiceImpl();
                    break;
                }
                case Update_infoDao: {
                    obj = new Update_infoDaoImpl();
                    break;
                }
                case Work_logService: {
                    obj = new Work_logServiceImpl();
                    break;
                }
                case Work_TimeService: {
                    obj = new Work_timeServiceImpl();
                    break;
                }
                case Update_infoService: {
                    obj = new Update_infoServiceImpl();
                    break;
                }
                case WorkOverDao:{
                    obj = new WorkOverDaoImpl();
                    break;
                }
                case WorkOverService:{
                    obj = new WorkOverServiceImpl();
                    break;
                }
                default: {

                }
            }
  		map.put(factory,obj);
        }

        return obj;
    }
    enum Factory{
        ApplyDao,NoticeDao,ProjectDao,RateDao,ResignDao,SignDao,
        Update_infoDao,Work_logDao,UserDao,Work_TimeDao,
        ApplyService,NoticeService,ProjectService,RateService,ResignService,SignService,
        Update_infoService,Work_logService,UserService,Work_TimeService, WorkOverDao,WorkOverService

    }
}
