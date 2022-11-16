package com.kitady.gke.javaee.jpa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * ITEM Entity
 */
@Entity
@Access(AccessType.FIELD)
@Table(name = "ITEM")
public class Item implements Serializable {

  /** serialVersionUID */
  private static final long serialVersionUID = 1L;

  /** PK */
  /** UUID(UUID) */
  @Id
  @Column(name = "UUID")
  private String uuid;

  /** NAME(NAME) */
  @Column(name = "NAME")
  private String name;

  /** JP NAME(NAMEJP) */
  @Column(name = "NAMEJP")
  private String namejp;

  /** TYPE(TYPE) */
  @Column(name = "TYPE")
  private String type;

  /** DIV(DIV) */
  @Column(name = "DIV")
  private String div;

  /** ITEMNO(ITEMNO) */
  @Column(name = "ITEMNO")
  private Long itemno;

  /** PRICE(PRICE) */
  @Column(name = "PRICE")
  private BigDecimal price;

  /** EXPLANATION(EXPLANATION) */
  @Column(name = "EXPLANATION")
  private String explanation;

  /** REG_DATE(REGDATE) */
  @Column(name = "REGDATE")
  private Date regdate;

  /** TIME_ZONE(TIMEZONE) */
  @Column(name = "TIMEZONE")
  private String timezone;

  /** TIME_STMP(TIMESTMP) */
  @Column(name = "TIMESTMP")
  private Timestamp timestmp;

  /** VERSION(VERSION) */
  @Version
  @Column(name = "VERSION")
  private Timestamp version;

  /**
   * Contractor
   */
  public Item() {
    super();
  }

  /**
   * UUID(UUID) getter
   * 
   * @return UUID(UUID)
   */
  public String getUuid() {
    return this.uuid;
  }

  /**
   * UUID(UUID) setter
   * 
   * @param uuid UUID(UUID)
   * 
   */
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * NAME(NAME) getter
   * 
   * @return NAME(NAME)
   */
  public String getName() {
    return this.name;
  }

  /**
   * NAME(NAME) setter
   * 
   * @param name NAME(NAME)
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * JP NAME(NAMEJP) getter
   * 
   * @return JP NAME(NAMEJP)
   */
  public String getNamejp() {
    return this.namejp;
  }

  /**
   * JP NAME(NAMEJP) setter
   * 
   * @param namejp JP NAME(NAMEJP)
   */
  public void setNamejp(String namejp) {
    this.namejp = namejp;
  }

  /**
   * TYPE(TYPE) getter
   * 
   * @return TYPE(TYPE)
   */
  public String getType() {
    return this.type;
  }

  /**
   * TYPE(TYPE) setter
   * 
   * @param type TYPE(TYPE)
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * DIV(DIV) getter
   * 
   * @return DIV(DIV)
   */
  public String getDiv() {
    return this.div;
  }

  /**
   * DIV(DIV) setter
   * 
   * @param div DIV(DIV)
   */
  public void setDiv(String div) {
    this.div = div;
  }

  /**
   * ITEMNO(ITEMNO) getter
   * 
   * @return ITEMNO(ITEMNO)
   */
  public Long getItemno() {
    return this.itemno;
  }

  /**
   * ITEMNO(ITEMNO) setter
   * 
   * @param itemno ITEMNO(ITEMNO)
   */
  public void setItemno(Long itemno) {
    this.itemno = itemno;
  }

  /**
   * PRICE(PRICE) getter
   * 
   * @return PRICE(PRICE)
   */
  public BigDecimal getPrice() {
    return this.price;
  }

  /**
   * PRICE(PRICE) setter
   * 
   * @param price PRICE(PRICE)
   */
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * EXPLANATION(EXPLANATION) getter
   * 
   * @return EXPLANATION(EXPLANATION)
   */
  public String getExplanation() {
    return this.explanation;
  }

  /**
   * EXPLANATION(EXPLANATION) setter
   * 
   * @param explanation EXPLANATION(EXPLANATION)
   */
  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  /**
   * REG_DATE(REGDATE) getter
   * 
   * @return REG_DATE(REGDATE)
   */
  public Date getRegdate() {
    return this.regdate;
  }

  /**
   * REG_DATE(REGDATE) setter
   * 
   * @param regdate REG_DATE(REGDATE)
   */
  public void setRegdate(Date regdate) {
    this.regdate = regdate;
  }

  /**
   * TIME_ZONE(TIMEZONE) getter
   * 
   * @return TIME_ZONE(TIMEZONE)
   */
  public String getTimezone() {
    return this.timezone;
  }

  /**
   * TIME_ZONE(TIMEZONE) setter
   * 
   * @param timezone TIME_ZONE(TIMEZONE)
   */
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /**
   * TIME_STMP(TIMESTMP) getter
   * 
   * @return TIME_STMP(TIMESTMP)
   */
  public Timestamp getTimestmp() {
    return this.timestmp;
  }

  /**
   * TIME_STMP(TIMESTMP) setter
   * 
   * @param timestmp TIME_STMP(TIMESTMP)
   */
  public void setTimestmp(Timestamp timestmp) {
    this.timestmp = timestmp;
  }

  /**
   * VERSION(VERSION) getter
   * 
   * @return VERSION(VERSION)
   */
  public Timestamp getVersion() {
    return this.version;
  }

  /**
   * VERSION(VERSION) setter
   * 
   * @param version VERSION(VERSION)
   */
  public void setVersion(Timestamp version) {
    this.version = version;
  }

}
