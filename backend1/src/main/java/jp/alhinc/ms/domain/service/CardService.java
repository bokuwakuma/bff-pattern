package jp.alhinc.ms.domain.service;

import java.util.List;

import jp.alhinc.ms.domain.model.Card;

public interface CardService {

	public Card findOne(String userId);
	public List<Card> findAll(String userId);
}
