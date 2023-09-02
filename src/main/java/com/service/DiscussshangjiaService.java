package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshangjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshangjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshangjiaView;


/**
 * 商家评论表
 *
 * @author 
 * @email 
 * @date 2021-03-20 11:33:21
 */
public interface DiscussshangjiaService extends IService<DiscussshangjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshangjiaVO> selectListVO(Wrapper<DiscussshangjiaEntity> wrapper);
   	
   	DiscussshangjiaVO selectVO(@Param("ew") Wrapper<DiscussshangjiaEntity> wrapper);
   	
   	List<DiscussshangjiaView> selectListView(Wrapper<DiscussshangjiaEntity> wrapper);
   	
   	DiscussshangjiaView selectView(@Param("ew") Wrapper<DiscussshangjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshangjiaEntity> wrapper);
   	
}

