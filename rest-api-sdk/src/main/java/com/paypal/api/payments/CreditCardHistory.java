package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CreditCardHistory  extends PayPalModel {

	/**
	 * A list of credit card resources
	 */
	private List<CreditCard> items;
	
	/**
	 * Total number of items.
	 */
	private int totalItems;

	/**
	 * Total number of pages.
	 */
	private int totalPages;
	
	/**
	 * HATEOAS links related to this call. Value assigned by PayPal.
	 */
	private List<Links> links;

	/**
	 * Default Constructor
	 */
	public CreditCardHistory() {
		items = new ArrayList<CreditCard>();
		links = new ArrayList<Links>();
	}
}
