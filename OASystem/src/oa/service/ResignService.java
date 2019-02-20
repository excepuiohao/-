package oa.service;

import oa.bean.Resign;

import java.util.List;

public interface ResignService {

    List<Resign> query(Resign resign);

    boolean insert(Resign resign);

    boolean updateAll(Resign resign);

    boolean update(Resign resign);

    boolean delete( Resign resign);

}
