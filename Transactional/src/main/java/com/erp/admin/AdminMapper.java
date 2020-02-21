package com.erp.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.erp.vo.mem_admin;

/*
 *  @ Administrator Mapper
 */
@Resource(name="ds1")
@Repository(value = "adminMapper")
//@Transactional("tm1")
public interface AdminMapper 
{
	public int             admin_total  ( mem_admin admin ); // 개수 - 관리자
	public void            admin_insert ( mem_admin admin ); // 입력 - 관리자
	public void            admin_update ( mem_admin admin ); // 수정 - 관리자
	public void            admin_delete ( mem_admin admin ); // 삭제 - 관리자
	public List<mem_admin> admin_list   ( mem_admin admin ); // 목록 - 관리자 
	public mem_admin       admin_login  ( mem_admin admin ); // 단일 - 관리자
}