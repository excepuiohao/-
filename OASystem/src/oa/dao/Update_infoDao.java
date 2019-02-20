package oa.dao;

import oa.bean.Update_info;

import java.util.List;

public interface Update_infoDao {

    List<Update_info> query(Update_info update_info);

    boolean insert(Update_info update_info);

    boolean updateAll(Update_info update_info);

    boolean update(Update_info update_info);

    boolean delete( Update_info update_info);
}
