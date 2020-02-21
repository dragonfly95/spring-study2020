package com.erp.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.vo.mem_admin;

/*
 *  @ Administrator ServiceImpl
 */
@Service
public class AdminServiceImpl implements AdminService 
{
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public int admin_total(mem_admin admin) {
		return adminMapper.admin_total(admin);
	}

	@Override
	public void admin_insert(mem_admin admin) {
		adminMapper.admin_insert(admin);		
	}

	@Override
	public void admin_update(mem_admin admin) {
		adminMapper.admin_update(admin);
	}

	@Override
	public void admin_delete(mem_admin admin) {
		adminMapper.admin_delete(admin);
	}

	@Override
	public List<mem_admin> admin_list(mem_admin admin) {
		return adminMapper.admin_list(admin);
	}

	@Override
	public mem_admin admin_login(mem_admin admin) {
		return adminMapper.admin_login(admin);
	}

}
