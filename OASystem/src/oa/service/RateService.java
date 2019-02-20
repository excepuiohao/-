package oa.service;

import oa.bean.Rate;

import java.util.List;

public interface RateService {

    List<Rate> query(Rate rate);

    boolean insert(Rate rate);

    boolean updateAll(Rate rate);

    boolean update(Rate rate);

    boolean delete(Rate rate );

}
