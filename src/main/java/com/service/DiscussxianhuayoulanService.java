package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxianhuayoulanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxianhuayoulanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxianhuayoulanView;


/**
 * 鲜花游览评论表
 *
 * @author 
 * @email 
 * @date 2021-03-20 11:33:21
 */
public interface DiscussxianhuayoulanService extends IService<DiscussxianhuayoulanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxianhuayoulanVO> selectListVO(Wrapper<DiscussxianhuayoulanEntity> wrapper);
   	
   	DiscussxianhuayoulanVO selectVO(@Param("ew") Wrapper<DiscussxianhuayoulanEntity> wrapper);
   	
   	List<DiscussxianhuayoulanView> selectListView(Wrapper<DiscussxianhuayoulanEntity> wrapper);
   	
   	DiscussxianhuayoulanView selectView(@Param("ew") Wrapper<DiscussxianhuayoulanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxianhuayoulanEntity> wrapper);
   	
}

