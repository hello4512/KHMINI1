package com.kh.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.model.vo.PcMember;
import com.kh.model.vo.Requests;

// 회원 정보 데이터 파일 입출력 클래스
public class MemberDao {
	// 회원 정보 저장할 데이터 파일
	private String fileName = "pcMember.dat";
	private String fileName2 = "Requests.dat";
	
	// PcMember 객체 정보 열람
	public ArrayList<PcMember> fileOpen() {
		ArrayList<PcMember> list = new ArrayList<>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			list = (ArrayList<PcMember>) ois.readObject();
			
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("pcMember.dat 파일을 로드하지 못했습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	// PcMember 객체 정보 저장
	public void fileSave(ArrayList<PcMember> list) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(list);
			
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("pcMember.dat 파일 저장에 실패하였습니다.");
		}
		
	}
	
	// Requests 객체 정보 열람
				public ArrayList<Requests> fileOpen2() {
					ArrayList<Requests> list2 = new ArrayList<>();
					
					try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName2))) {
						list2 = (ArrayList<Requests>) ois.readObject();
						
					} catch (IOException e) {
//						e.printStackTrace();
						System.out.println("Requests.dat 파일을 로드하지 못했습니다.");
					} catch (ClassNotFoundException e) {
//						e.printStackTrace();
						System.out.println("ArrayList<Requests>으로 캐스팅 할 수 없습니다.");
					}
					
					return list2;
				}
				
				// Requests 객체 정보 저장
				public void fileSave2(ArrayList<Requests> list2) {
					
					try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName2))) {
						oos.writeObject(list2);
						
					} catch (IOException e) {
//						e.printStackTrace();
						System.out.println("Requests.dat 파일 저장에 실패하였습니다.");
					}
					
				}

}
