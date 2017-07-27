package com.csii.upp.qrcodeplatform.generate.dao;

import com.csii.upp.qrcodeplatform.generate.dao.model.Marketactivectrl;
import com.csii.upp.qrcodeplatform.generate.dao.model.MarketactivectrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketactivectrlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketactivectrl
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int countByExample(MarketactivectrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketactivectrl
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int deleteByExample(MarketactivectrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketactivectrl
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int deleteByPrimaryKey(String marketactiveid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketactivectrl
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int insert(Marketactivectrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketactivectrl
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int insertSelective(Marketactivectrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketactivectrl
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    List<Marketactivectrl> selectByExample(MarketactivectrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketactivectrl
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    Marketactivectrl selectByPrimaryKey(String marketactiveid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketactivectrl
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int updateByExampleSelective(@Param("record") Marketactivectrl record, @Param("example") MarketactivectrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketactivectrl
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int updateByExample(@Param("record") Marketactivectrl record, @Param("example") MarketactivectrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketactivectrl
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int updateByPrimaryKeySelective(Marketactivectrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketactivectrl
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int updateByPrimaryKey(Marketactivectrl record);
}