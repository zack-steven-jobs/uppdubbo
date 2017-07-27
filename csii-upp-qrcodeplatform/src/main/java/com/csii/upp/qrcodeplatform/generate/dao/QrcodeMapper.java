package com.csii.upp.qrcodeplatform.generate.dao;

import com.csii.upp.qrcodeplatform.generate.dao.model.Qrcode;
import com.csii.upp.qrcodeplatform.generate.dao.model.QrcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrcodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrcode
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int countByExample(QrcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrcode
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int deleteByExample(QrcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrcode
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int deleteByPrimaryKey(String qrcodenbr);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrcode
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int insert(Qrcode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrcode
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int insertSelective(Qrcode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrcode
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    List<Qrcode> selectByExample(QrcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrcode
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    Qrcode selectByPrimaryKey(String qrcodenbr);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrcode
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int updateByExampleSelective(@Param("record") Qrcode record, @Param("example") QrcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrcode
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int updateByExample(@Param("record") Qrcode record, @Param("example") QrcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrcode
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int updateByPrimaryKeySelective(Qrcode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrcode
     *
     * @mbggenerated Tue Jun 06 11:01:03 CST 2017
     */
    int updateByPrimaryKey(Qrcode record);
}