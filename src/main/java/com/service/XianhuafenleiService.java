package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianhuafenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianhuafenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianhuafenleiView;


/**
 * 鲜花分类
 *
 * @author 
 * @email 
 * @date 2021-03-20 11:33:20
 */
public interface XianhuafenleiService extends IService<XianhuafenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianhuafenleiVO> selectListVO(Wrapper<XianhuafenleiEntity> wrapper);
   	
   	XianhuafenleiVO selectVO(@Param("ew") Wrapper<XianhuafenleiEntity> wrapper);
   	
   	List<XianhuafenleiView> selectListView(Wrapper<XianhuafenleiEntity> wrapper);
   	
   	XianhuafenleiView selectView(@Param("ew") Wrapper<XianhuafenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianhuafenleiEntity> wrapper);
   	
}

