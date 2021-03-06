package com.team6.dao;

import com.team6.entity.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    int insert(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    int insertSelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    Shop selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Shop record);


    List queryShopByIdArray(Object[] objects);


    //取得商铺所有物品
    List getShopData(@Param("shopId") int shopId);


}