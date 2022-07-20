package view;

import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberSelectView implements View{
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		System.out.println("암호 입력 : ");
		String password = sc.next();
		
		MemberDAO dao = new MemberDAO();		
		MemberDTO dto = dao.selectMember(id,password);
		if(dto.getId() !=null) {
			if(dto.getPassword() != 0) {
				System.out.println(dto);
				
			}
			else {
				System.out.println("암호가 다릅니다. 다시 입력하세요");
			}
		}
		else {
			System.out.println("아이디가 존재하지 않습니다");
		}
	}
	
}
