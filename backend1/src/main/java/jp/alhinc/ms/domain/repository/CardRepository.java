package jp.alhinc.ms.domain.repository;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import jp.alhinc.ms.domain.model.Card;

@Mapper
public interface CardRepository {
	Optional<Card> findById(String cardIdentifier);
}
