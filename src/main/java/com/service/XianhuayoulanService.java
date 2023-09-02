package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianhuayoulanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianhuayoulanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianhuayoulanView;


/**
 * 鲜花游览
 *
 * @author 
 * @email 
 * @date 2021-03-20 11:33:20
 */
public interface XianhuayoulanService extends IService<XianhuayoulanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianhuayoulanVO> selectListVO(Wrapper<XianhuayoulanEntity> wrapper);
   	
   	XianhuayoulanVO selectVO(@Param("ew") Wrapper<XianhuayoulanEntity> wrapper);
   	
   	List<XianhuayoulanView> selectListView(Wrapper<XianhuayoulanEntity> wrapper);
   	
   	XianhuayoulanView selectView(@Param("ew") Wrapper<XianhuayoulanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianhuayoulanEntity> wrapper);
   	
}

