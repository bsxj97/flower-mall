package com.dao;

import com.entity.DiscussxianhuayoulanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxianhuayoulanVO;
import com.entity.view.DiscussxianhuayoulanView;


/**
 * 鲜花游览评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-20 11:33:21
 */
public interface DiscussxianhuayoulanDao extends BaseMapper<DiscussxianhuayoulanEntity> {
	
	List<DiscussxianhuayoulanVO> selectListVO(@Param("ew") Wrapper<DiscussxianhuayoulanEntity> wrapper);
	
	DiscussxianhuayoulanVO selectVO(@Param("ew") Wrapper<DiscussxianhuayoulanEntity> wrapper);
	
	List<DiscussxianhuayoulanView> selectListView(@Param("ew") Wrapper<DiscussxianhuayoulanEntity> wrapper);

	List<DiscussxianhuayoulanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxianhuayoulanEntity> wrapper);
	
	DiscussxianhuayoulanView selectView(@Param("ew") Wrapper<DiscussxianhuayoulanEntity> wrapper);
	
}
