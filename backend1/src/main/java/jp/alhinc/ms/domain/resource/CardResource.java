package jp.alhinc.ms.domain.resource;

import java.util.List;

import jp.alhinc.ms.domain.model.Card;
import lombok.Data;

@Data
public class CardResource {

	private String cardCount;
	private List<Card> cards;
}
