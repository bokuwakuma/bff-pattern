package jp.alhinc.ms.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.alhinc.ms.domain.model.Card;
import jp.alhinc.ms.domain.resource.CardResource;
import jp.alhinc.ms.domain.service.CardService;

@RestController
@RequestMapping("api/v1")
public class CardController {

	@Autowired
	CardService cardService;
	
	/**
	 * 業務仕様
	 * 1人最大5枚のカードを持てる。
	 * 1枚は必ずメインカード、その他はサブカードとなる。
	 * 
	 * 特定ユーザのカード一覧取得
	 * @return
	 */
	@GetMapping("/members/{memberId}/cards")
	public CardResource getCardsOfMember(@PathVariable String memberId) {
		return null;
	}

	/**
	 * POST /cardsは実質ない
	 */
	
	/**
	 * カード登録
	 * @return
	 */
	@PostMapping("/cards")
	public Card addCard() {
		return null;
	}
	
	/**
	 * カード情報取得
	 * @return
	 */
	@GetMapping("/cards/{cardIdentifier}")
	public CardResource getCard(@PathVariable String cardIdentifier) {
		return null;
	}
	
	/**
	 * カード情報削除
	 */
	@DeleteMapping("/cards/{cardIdentifier}")
	public void deleteCard() {
		
	}

	/**
	 * メインカード登録
	 */
	@PutMapping("/cards/{cardIdentifier}/main")
	public void registerMainCard() {
		
	}
}
