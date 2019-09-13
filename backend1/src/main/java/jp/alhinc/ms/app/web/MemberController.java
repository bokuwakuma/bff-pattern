package jp.alhinc.ms.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.alhinc.ms.domain.resource.MemberResource;
import jp.alhinc.ms.domain.service.MemberService;

@RestController
@RequestMapping("api/v1")
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@GetMapping("/members")
	public MemberResource getMembers() {
		return null;
	}
	
	@GetMapping("/members/{memberId}")
	public MemberResource getMember(@PathVariable String memberId) {
		
		return null;
		
	}
	
	/**
	 * 新規登録
	 * 登録情報にカードを指定した場合、ID登録と同時にメインカード登録を行う。
	 * @return
	 */
	@PostMapping("/members/{memberId}")
	public MemberResource addMember(@PathVariable String memberId) {
		return null;
	}
}
