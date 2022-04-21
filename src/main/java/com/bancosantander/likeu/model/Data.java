package com.bancosantander.likeu.model;

/**
 * Clase principal Data.
 */

public class Data implements java.io.Serializable {
/** 
@param serialVersionUID
*/
	private static final long serialVersionUID = 1;

	private java.lang.String type;
	private java.lang.String status;
/** 
@param card
*/
	private com.bancosantander.likeu.model.CardDetail card;
/** 
@param activation_date
*/
	private java.util.Date activation_date;
/** 
@param contract_key
*/
	private java.lang.String contract_key;
/** 
@param cut_of_date
*/
	private java.util.Date cut_of_date;
/** 
@param last_evaluation_date
*/
	private java.util.Date last_evaluation_date;

	/**
	 * Clase principal Data.
	 */
	public Data() {
	}
/**
 * Constructor de la clase
 * @param      type    array that is the source of characters.
 * @param      status    array that is the source of characters.
 * @param      card    array that is the source of characters.
 * @param      activation_date    array that is the source of characters.
 * @param      contract_key    array that is the source of characters.
 * @param      cut_of_date    array that is the source of characters.
 * @param      last_evaluation_date    array that is the source of characters.
 * @exception  IndexOutOfBoundsException  if the <code>offset</code>
 */
	public Data(java.lang.String type, java.lang.String status,
			com.bancosantander.likeu.model.CardDetail card,
			java.util.Date activation_date, java.lang.String contract_key,
			java.util.Date cut_of_date, java.util.Date last_evaluation_date) {
		this.type = type;
		this.status = status;
		this.card = card;
		this.activation_date = new java.util.Date(activation_date.getTime());;
		this.contract_key = contract_key;
		this.cut_of_date = new java.util.Date(cut_of_date.getTime());;
		this.last_evaluation_date = new java.util.Date(last_evaluation_date.getTime());;
	}

	/**
	 * @return
	 */	
	public java.lang.String getType() {
		return this.type;
	}
	/** 
	 * @param String
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}
	/**
	 * @return
	 */	
	public java.lang.String getStatus() {
		return this.status;
	}
	/** 
	 * @param String
	 */
	public void setStatus(java.lang.String status) {
		this.status = status;
	}
	/**
	 * @return
	 */	
	public com.bancosantander.likeu.model.CardDetail getCard() {
		return this.card;
	}
	/** 
	 * @param com.bancosantander.likeu.model.CardDetail
	 */
	public void setCard(com.bancosantander.likeu.model.CardDetail card) {
		this.card = card;
	}
	/**
	 * @return
	 */	
	public java.util.Date getActivation_date() {
		if (this.activation_date != null) {
			return new java.util.Date(this.activation_date.getTime());
		} else {
		return null;
		}
	}
	/** 
	 * @param Date
	 */
	public void setActivation_date(java.util.Date activation_date) {
		if (activation_date != null) {
			this.activation_date = new java.util.Date(activation_date.getTime());
		} else {
			this.activation_date = null;
		}
	}
	/**
	 * @return
	 */	
	public java.lang.String getContract_key() {
		return this.contract_key;
	}
	/** 
	 * @param String
	 */
	public void setContract_key(java.lang.String contract_key) {
		this.contract_key = contract_key;
	}
	/**
	 * @return
	 */	
	public java.util.Date getCut_of_date() {
		if (this.cut_of_date != null) {
			return new java.util.Date(this.cut_of_date.getTime());
		} else {
		return null;
		}
	}
	/** 
	 * @param Date
	 */
	public void setCut_of_date(java.util.Date cut_of_date) {
		if (cut_of_date != null) {
			this.cut_of_date = new java.util.Date(cut_of_date.getTime());
		} else {
			this.cut_of_date = null;
		}
	}
	/**
	 * @return
	 */	
	public java.util.Date getLast_evaluation_date() {
		if (this.last_evaluation_date != null) {
			return new java.util.Date(this.last_evaluation_date.getTime());
		} else {
		return null;
		}
	}
	/** 
	 * @param Date
	 */
	public void setLast_evaluation_date(java.util.Date last_evaluation_date) {
		if (last_evaluation_date != null) {
			this.last_evaluation_date = new java.util.Date(last_evaluation_date.getTime());
		} else {
			this.last_evaluation_date = null;
		}
	}
}