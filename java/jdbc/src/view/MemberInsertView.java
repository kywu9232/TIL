package view;

import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberInsertView implements View{
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		System.out.println("암호 입력 : ");
		int password = sc.nextInt();
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("폰번호 입력 : ");
		String phone = sc.next();
		System.out.println("이메일 입력 : ");
		String email = sc.next();
		
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPassword(password);
		dto.setName(name);
		dto.setPhone(phone);
		dto.setEmail(email);
		
		MemberDAO dao = new MemberDAO();		
		int result = dao.insertMember(dto);
		System.out.println(result);
				
	}
	
}
