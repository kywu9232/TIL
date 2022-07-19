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
		int password = sc.nextInt();
			
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPassword(password);
		
		MemberDAO dao = new MemberDAO();		
		int result = dao.insertMember(dto);
		if(result == 0) {
			System.out.println("회원가입부터 하세요");
		}
		else if(result ==1) {
			System.out.println("암호가 다릅니다");
		}
		else if(result ==2) {
			System.out.println("환영합니다");
		}
		System.out.println(result);
				
	}
	
}
