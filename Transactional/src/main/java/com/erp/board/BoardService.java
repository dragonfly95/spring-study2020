package com.erp.board;

import com.erp.admin.AdminMapper;
import com.erp.vo.mem_admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.vo.bbs_board;
import org.springframework.transaction.annotation.Transactional;

@Service("BoardService")
public class BoardService
{
	@Autowired
	private BoardMapper boardMapper;

	@Autowired
	private AdminMapper adminMapper;

	@Transactional
	public void testTransaction(mem_admin admin, bbs_board board) throws BoardException {
		adminMapper.admin_update ( admin );
		boardMapper.update_succ1 ( board );
		boardMapper.update_succ2 ( board );
		boardMapper.update_error ( board );
	}
}
