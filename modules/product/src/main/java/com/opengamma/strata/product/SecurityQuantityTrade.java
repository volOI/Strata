/*
 * Copyright (C) 2018 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.strata.product;

/**
 * A trade that is based on security, quantity and price.
 * <p>
 * If the trade is directly based on a securitized product, the trade type is {@link SecuritizedProductTrade}.
 * If not, the financial instrument involved in this trade is represented in alternative form, e.g., {@link Security}.
 */
public interface SecurityQuantityTrade
    extends Trade, SecurityQuantity {

  /**
   * Gets the price that was traded.
   * <p>
   * This is the unit price agreed when the trade occurred.
   * 
   * @return the price
   */
  public abstract double getPrice();

  /**
   * Returns an instance with the specified quantity.
   * 
   * @param quantity  the new quantity
   * @return the instance with the specified quantity
   */
  public abstract SecurityQuantityTrade withQuantity(double quantity);

}