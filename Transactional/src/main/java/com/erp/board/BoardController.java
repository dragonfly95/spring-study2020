/* ***********************************
 * 
 *  본래 변수명 : 전체 소문자
 *  변경된 변수 : 전체 대문자
 *  2018.2.19 (dblee) digital2u.co.kr
 * 
 *************************************/

package com.erp.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.erp.admin.AdminService;
import com.erp.vo.bbs_board;
import com.erp.vo.mem_admin;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class BoardController 
{
	@Autowired private BoardService   boardService;

    private static final Logger  logger        = LoggerFactory.getLogger(BoardController.class);

	// transaction + myBatis
    @RequestMapping(value="/", method={RequestMethod.POST,RequestMethod.GET})
    public String tran
    (
		  ModelMap  model
		, bbs_board board
		, mem_admin admin
    )
    throws Exception 
    {
    	logger.info("●●●●●●●●●●●●●●●●●●●●●●●●●●●●● 트랜잭션 ●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");

        try 
        {
        	logger.info("●●●●●● 시작 ●●●●●");
            boardService.testTransaction(admin, board);

        } catch (Exception se) {
        	logger.info("●●●●●● Exception ●●●●●" + se.getMessage());
        } finally {
        	logger.info("●●●●●● finally ●●●●●");
        }
        model.addAttribute("rrr", "myBatis~");
        return "/include/index";
    }


    @RequestMapping(value = "/test.do")
    public HashMap test1(@RequestParam HashMap<String, Object> map) {
        return new HashMap<>();
    }

}
