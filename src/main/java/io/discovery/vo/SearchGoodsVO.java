package io.discovery.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author fzx
 * @date 2019-1-3
 */
@Getter
@Setter
public class SearchGoodsVO implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 淘宝宝贝ID
   */
  private Long itemId;

  /**
   * 商品主图
   */
  private String picUrl;

  /**
   * 商品标题
   */
  private String title;

  /**
   * 商品来源
   */
  private String source;

  /**
   * 折扣价
   */
  private BigDecimal zkFinalPrice;

  /**
   * 是否有券
   */
  private Boolean hasCoupon;

  /**
   * 券面额
   */
  private BigDecimal couponDiscount;

  /**
   * 券后价
   */
  private BigDecimal couponedPrice;

  /**
   * 返币量
   */
  private BigDecimal commissionAmount;

  /**
   * 月销量
   */
  private Integer volume;

  /**
   * 宝贝所在地
   */
  private String provcity;

  /**
   * 二合一链接
   */
  private String couponUrl;

  @Override
  public String toString() {
    return "SearchGoodsVO{" +
        "itemId=" + itemId +
        ", picUrl='" + picUrl + '\'' +
        ", title='" + title + '\'' +
        ", source='" + source + '\'' +
        ", zkFinalPrice=" + zkFinalPrice +
        ", hasCoupon=" + hasCoupon +
        ", couponDiscount=" + couponDiscount +
        ", couponedPrice=" + couponedPrice +
        ", commissionAmount=" + commissionAmount +
        ", volume=" + volume +
        ", provcity='" + provcity + '\'' +
        ", couponUrl='" + couponUrl + '\'' +
        '}';
  }
}
