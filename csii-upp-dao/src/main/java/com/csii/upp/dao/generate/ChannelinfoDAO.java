package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Channelinfo;
import com.csii.upp.dto.generate.ChannelinfoExample;

public class ChannelinfoDAO extends BasePayDAO {
	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNELINFO
     *
     * @mbggenerated
     */
    public static int countByExample(ChannelinfoExample example) throws SQLException {
        Integer count = (Integer)  getSqlMap().queryForObject("CHANNELINFO.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNELINFO
     *
     * @mbggenerated
     */
    public static int deleteByExample(ChannelinfoExample example) throws SQLException {
        int rows = getSqlMap().delete("CHANNELINFO.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNELINFO
     *
     * @mbggenerated
     */
    public static int deleteByPrimaryKey(String channelnbr) throws SQLException {
        Channelinfo _key = new Channelinfo();
        _key.setChannelnbr(channelnbr);
        int rows = getSqlMap().delete("CHANNELINFO.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNELINFO
     *
     * @mbggenerated
     */
    public static void insert(Channelinfo record) throws SQLException {
        getSqlMap().insert("CHANNELINFO.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNELINFO
     *
     * @mbggenerated
     */
    public static void insertSelective(Channelinfo record) throws SQLException {
        getSqlMap().insert("CHANNELINFO.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNELINFO
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public static List<Channelinfo> selectByExample(ChannelinfoExample example) throws SQLException {
        List<Channelinfo> list = getSqlMap().queryForList("CHANNELINFO.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNELINFO
     *
     * @mbggenerated
     */
    public static Channelinfo selectByPrimaryKey(String channelnbr) throws SQLException {
        Channelinfo _key = new Channelinfo();
        _key.setChannelnbr(channelnbr);
        Channelinfo record = (Channelinfo) getSqlMap().queryForObject("CHANNELINFO.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNELINFO
     *
     * @mbggenerated
     */
    public static int updateByExampleSelective(Channelinfo record, ChannelinfoExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("CHANNELINFO.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNELINFO
     *
     * @mbggenerated
     */
    public static int updateByExample(Channelinfo record, ChannelinfoExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("CHANNELINFO.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNELINFO
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKeySelective(Channelinfo record) throws SQLException {
        int rows = getSqlMap().update("CHANNELINFO.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNELINFO
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKey(Channelinfo record) throws SQLException {
        int rows = getSqlMap().update("CHANNELINFO.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CHANNELINFO
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends ChannelinfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, ChannelinfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}