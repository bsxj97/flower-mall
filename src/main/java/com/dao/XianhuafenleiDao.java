package com.dao;

import com.entity.XianhuafenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XianhuafenleiVO;
import com.entity.view.XianhuafenleiView;


/**
 * 鲜花分类
 * 
 * @author 
 * @email 
 * @date 2021-03-20 11:33:20
 */
public interface XianhuafenleiDao extends BaseMapper<XianhuafenleiEntity> {
	
	List<XianhuafenleiVO> selectListVO(@Param("ew") Wrapper<XianhuafenleiEntity> wrapper);
	
	XianhuafenleiVO selectVO(@Param("ew") Wrapper<XianhuafenleiEntity> wrapper);
	
	List<XianhuafenleiView> selectListView(@Param("ew") Wrapper<XianhuafenleiEntity> wrapper);

	List<XianhuafenleiView> selectListView(Pagination page,@Param("ew") Wrapper<XianhuafenleiEntity> wrapper);
	
	XianhuafenleiView selectView(@Param("ew") Wrapper<XianhuafenleiEntity> wrapper);
	
}
