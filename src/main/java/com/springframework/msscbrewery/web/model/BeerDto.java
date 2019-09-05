package com.springframework.msscbrewery.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
	
	private UUID id;
	
	private Integer version;
	
	private String beerName;
	
	private OffsetDateTime createdDate;
	
	private OffsetDateTime lastModifiedDate;
	
	private BeerStyleEnum beerStyle;
	
	private BigDecimal price;
	
	private String upc;
	
	private Integer quantityOnHand;
	

}
