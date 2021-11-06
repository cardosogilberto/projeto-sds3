package io.github.cardosogilberto.devsuperior.dsvendas.dto;

import java.time.LocalDate;

import io.github.cardosogilberto.devsuperior.dsvendas.entities.Sale;
import lombok.Data;

@Data
public class SaleDTO {
	
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	private SellerDTO seller;
	
	public SaleDTO(Sale entity) {
		id = entity.getId();
		visited = entity.getVisited();
		deals = entity.getDeals();
		amount = entity.getAmount();
		date = entity.getDate();
		seller = new SellerDTO(entity.getSeller());
		
	}

}
