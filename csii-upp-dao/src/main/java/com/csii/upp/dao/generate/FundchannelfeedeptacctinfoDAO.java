package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Fundchannelfeedeptacctinfo;
import com.csii.upp.dto.generate.FundchannelfeedeptacctinfoExample;

public class FundchannelfeedeptacctinfoDAO extends BasePayDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELFEEDEPTACCTINFO
     *
     * @mbggenerated
     */
    public static int countByExample(FundchannelfeedeptacctinfoExample example) throws SQLException {
        Integer count = (Integer)  getSqlMap().queryForObject("FUNDCHANNELFEEDEPTACCTINFO.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELFEEDEPTACCTINFO
     *
     * @mbggenerated
     */
    public static int deleteByExample(FundchannelfeedeptacctinfoExample example) throws SQLException {
        int rows = getSqlMap().delete("FUNDCHANNELFEEDEPTACCTINFO.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELFEEDEPTACCTINFO
     *
     * @mbggenerated
     */
    public static int deleteByPrimaryKey(String deptnbr, String fundchannelcode, String inneracctcfmmode) throws SQLException {
        Fundchannelfeedeptacctinfo _key = new Fundchannelfeedeptacctinfo();
        _key.setDeptnbr(deptnbr);
        _key.setFundchannelcode(fundchannelcode);
        _key.setInneracctcfmmode(inneracctcfmmode);
        int rows = getSqlMap().delete("FUNDCHANNELFEEDEPTACCTINFO.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELFEEDEPTACCTINFO
     *
     * @mbggenerated
     */
    public static void insert(Fundchannelfeedeptacctinfo record) throws SQLException {
        getSqlMap().insert("FUNDCHANNELFEEDEPTACCTINFO.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELFEEDEPTACCTINFO
     *
     * @mbggenerated
     */
    public static void insertSelective(Fundchannelfeedeptacctinfo record) throws SQLException {
        getSqlMap().insert("FUNDCHANNELFEEDEPTACCTINFO.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELFEEDEPTACCTINFO
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public static List<Fundchannelfeedeptacctinfo> selectByExample(FundchannelfeedeptacctinfoExample example) throws SQLException {
        List<Fundchannelfeedeptacctinfo> list = getSqlMap().queryForList("FUNDCHANNELFEEDEPTACCTINFO.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELFEEDEPTACCTINFO
     *
     * @mbggenerated
     */
    public static Fundchannelfeedeptacctinfo selectByPrimaryKey(String deptnbr, String fundchannelcode, String inneracctcfmmode) throws SQLException {
        Fundchannelfeedeptacctinfo _key = new Fundchannelfeedeptacctinfo();
        _key.setDeptnbr(deptnbr);
        _key.setFundchannelcode(fundchannelcode);
        _key.setInneracctcfmmode(inneracctcfmmode);
        Fundchannelfeedeptacctinfo record = (Fundchannelfeedeptacctinfo) getSqlMap().queryForObject("FUNDCHANNELFEEDEPTACCTINFO.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELFEEDEPTACCTINFO
     *
     * @mbggenerated
     */
    public static int updateByExampleSelective(Fundchannelfeedeptacctinfo record, FundchannelfeedeptacctinfoExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("FUNDCHANNELFEEDEPTACCTINFO.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELFEEDEPTACCTINFO
     *
     * @mbggenerated
     */
    public static int updateByExample(Fundchannelfeedeptacctinfo record, FundchannelfeedeptacctinfoExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("FUNDCHANNELFEEDEPTACCTINFO.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELFEEDEPTACCTINFO
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKeySelective(Fundchannelfeedeptacctinfo record) throws SQLException {
        int rows = getSqlMap().update("FUNDCHANNELFEEDEPTACCTINFO.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNDCHANNELFEEDEPTACCTINFO
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKey(Fundchannelfeedeptacctinfo record) throws SQLException {
        int rows = getSqlMap().update("FUNDCHANNELFEEDEPTACCTINFO.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FUNDCHANNELFEEDEPTACCTINFO
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends FundchannelfeedeptacctinfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, FundchannelfeedeptacctinfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}