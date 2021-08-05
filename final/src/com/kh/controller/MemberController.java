package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.dao.MemberDao;
import com.kh.model.vo.PcMember;

// 데이터와 GUI 기능 연결하는 클래스
public class MemberController {
	
	private ArrayList<PcMember> list = new ArrayList<>();
	private MemberDao md = new MemberDao();
	
	// 회원 정보 추가 기능
	public void addList(PcMember pm) {
		list.add(pm);
	}

}
