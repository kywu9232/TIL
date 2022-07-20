package view;

import java.util.ArrayList;
import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberSelectView2 implements View{
	@Override
	public void input() {
		MemberDAO dao = new MemberDAO();	
		int totalcount = dao.getTotalMember();
		int recordPerPage = 4;
		int totalPage = 0;
		
		if(totalcount % recordPerPage == 0) {
			totalPage = totalcount / recordPerPage ;
		}else {
			totalPage = totalcount / recordPerPage + 1;
		}
		System.out.println(totalPage);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("페이지 번호 입력 ( 1-" + totalPage +  "페이지 까지 가능 : ");
		String pagenum = sc.next();
		
		ArrayList<MemberDTO> list = dao.selectAllMember();
		if(pagenum.equals("*")) {
			list = dao.selectAllMember();
		}
		else {
			list = dao.selectPagingMember(Integer.parseInt(pagenum), recordPerPage);
			
		}
		for(MemberDTO dto : list) {
			System.out.println(dto);
		}
	}
	
}
