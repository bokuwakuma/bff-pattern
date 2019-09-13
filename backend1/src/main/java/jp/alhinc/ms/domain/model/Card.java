package jp.alhinc.ms.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Card {

	private String admissionName;
	private String personalCardNo;
	private String cardIdentifier;
	private String cardType;
}
