package com.erp.board;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.erp.vo.bbs_board;

@Resource(name="ds1")
@Repository(value="boardMapper")
//@Transactional(propagation = Propagation.REQUIRED , isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor=Exception.class)
public interface BoardMapper 
{
	public void update_succ1(bbs_board board); // throws BoardException;
	public void update_succ2(bbs_board board); // throws BoardException;
	public void update_error(bbs_board board); // throws BoardException;
}