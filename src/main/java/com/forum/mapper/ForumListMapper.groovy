package com.forum.mapper

import com.forum.model.entity.ForumListEntity
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import tk.mybatis.mapper.common.Mapper

@org.apache.ibatis.annotations.Mapper
interface ForumListMapper extends Mapper<ForumListEntity> {
    @Select('select count(fid) from f_forumList where fid = #{fid}')
    Integer selectCountByFId(@Param('fid') String fid)

    @Select('select * from f_forumList')
    List<ForumListEntity> selectAllFromTable()

    @Select("select * from f_forumlist where fid >= (select floor( max(fid) * rand()) from f_forumlist ) and enable = #{enable} and authority = #{authority} order by fid")
    List<ForumListEntity> selectAllFromTableByEnableAndAuthorityWithoutType(
            @Param("enable") boolean enable, @Param("authority") boolean authority)


    @Select("select * from f_forumlist where fid >= (select floor( max(fid) * rand()) from f_forumlist ) and enable = #{enable} and authority = #{authority} and type = #{type} order by fid")
    List<ForumListEntity> selectAllFromTableByEnableAndAuthorityWithType(
            @Param("enable") boolean enable, @Param("authority") boolean authority, @Param("type") boolean type)
}