package com.baomidou.ant.md.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-02-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("MD_Customer")
public class MdCustomer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ??ID
     */
    @TableId("CustomerID")
    private String CustomerID;

    /**
     * ????
     */
    @TableField("Code")
    private String Code;

    /**
     * ????
     */
    @TableField("Name")
    private String Name;

    /**
     * ??ID
     */
    @TableField("ChannelID")
    private String ChannelID;

    /**
     * OrgID
     */
    @TableField("OrgID")
    private String OrgID;

    /**
     * ????
     */
    @TableField("Address")
    private String Address;

    /**
     * ??????
     */
    @TableField("Tel")
    private String Tel;

    /**
     * ????
     */
    @TableField("ZipCode")
    private String ZipCode;

    /**
     * GPS??
     */
    @TableField("Longitude")
    private Double Longitude;

    /**
     * GPS??
     */
    @TableField("Latitude")
    private Double Latitude;

    /**
     * ????
     */
    @TableField("Size")
    private Integer Size;

    /**
     * ????
     */
    @TableField("Class")
    private String Class;

    /**
     * ????
     */
    @TableField("Type")
    private String Type;

    /**
     * ??????
     */
    @TableField("IsDistributor")
    private String IsDistributor;

    /**
     * ????????
     */
    @TableField("CreditCode")
    private String CreditCode;

    /**
     * 送货地址
     */
    @TableField("DeliveryAddress")
    private String DeliveryAddress;

    /**
     * 城市组
     */
    @TableField("CityGroup")
    private String CityGroup;

    /**
     * 城市组二次分类
     */
    @TableField("SubCityGroup")
    private String SubCityGroup;

    /**
     * 结账编码
     */
    @TableField("BillingCode")
    private String BillingCode;

    /**
     * 是否为DC
     */
    @TableField("IsDC")
    private String IsDC;

    /**
     * DC供货门店数
     */
    @TableField("DCCoverage")
    private Integer DCCoverage;

    /**
     * 供货大仓
     */
    @TableField("Supplier")
    private String Supplier;

    /**
     * 上级分销商
     */
    @TableField("ParentCode")
    private String ParentCode;

    /**
     * 是否有教室
     */
    @TableField("IsWithClassroom")
    private String IsWithClassroom;

    /**
     * 是否有游泳池
     */
    @TableField("IsWithSwimmingPool")
    private String IsWithSwimmingPool;

    /**
     * 是否为院线店
     */
    @TableField("IsHosPOC")
    private String IsHosPOC;

    /**
     * ??BU
     */
    @TableField("BuCode")
    private String BuCode;

    /**
     * ????
     */
    @TableField("IsDeleted")
    private String IsDeleted;

    /**
     * ???
     */
    @TableField("CreateBy")
    private String CreateBy;

    /**
     * ????
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * ?????
     */
    @TableField("LastModifiedBy")
    private String LastModifiedBy;

    /**
     * ??????
     */
    @TableField("LastModifiedTime")
    private LocalDateTime LastModifiedTime;

    /**
     * 城市报告 bu6需要
     */
    @TableField("CityInReport")
    private String CityInReport;

    /**
     * 店长bu6使用
     */
    @TableField("Shopowner")
    private String Shopowner;

    /**
     * 微信号bu6使用
     */
    @TableField("WechatCode")
    private String WechatCode;

    /**
     * bu6使用 给那些通过links项目产生的门店做一个marker 
     */
    @TableField("IsLinks")
    private Integer IsLinks;

    /**
     * 是否与经销商合作bu6使用
     */
    @TableField("Active")
    private String Active;

    /**
     * 名称bu6使用 通过门店表带出来
     */
    @TableField("ParentDCName")
    private String ParentDCName;

    /**
     * 现在POP系统中的门店编码，历史数据迁移时需要考虑bu6使用
     */
    @TableField("POPCode")
    private String POPCode;

    /**
     * 门店订单日bu6使用
     */
    @TableField("OutletOrderDay")
    private LocalDate OutletOrderDay;

    /**
     * 驻地城市bu6使用
     */
    @TableField("CityIn")
    private String CityIn;

    /**
     * 在店时长
     */
    @TableField("InstoreTime")
    private Integer InstoreTime;

    /**
     * 门店是否存在 bu6使用
     */
    @TableField("IsExist")
    private String IsExist;

    /**
     * 服务周 bu6 只能排线用 1~4（表示每月第一周~第四周）
     */
    @TableField("ServiceWeek")
    private String ServiceWeek;

    /**
     * 服务日 bu6 智能排线用
     */
    @TableField("ServiceDay")
    private String ServiceDay;

    @TableField("Comment")
    private String Comment;

    @TableField("SAPNo")
    private String SAPNo;

    @TableField("PetShopCode")
    private String PetShopCode;

    @TableField("DistrictCode")
    private String DistrictCode;

    @TableField("KeyGroupID")
    private Integer KeyGroupID;

    @TableField("PicCredit")
    private String PicCredit;

    @TableField("BannerID")
    private String BannerID;

    @TableField("AllowVisit")
    private String AllowVisit;

    @TableField("ParentDC")
    private String ParentDC;

    @TableField("IsNDSC")
    private String IsNDSC;

    @TableField("IsUsing")
    private String IsUsing;

    @TableField("HasSSR")
    private String HasSSR;

    @TableField("ProvinceCode")
    private String ProvinceCode;

    @TableField("IsTop500")
    private String IsTop500;

    @TableField("Location")
    private String Location;

    @TableField("VisitCycle")
    private Integer VisitCycle;

    @TableField("IsKeyCustomer")
    private String IsKeyCustomer;

    @TableField("CreationTime")
    private LocalDateTime CreationTime;

    @TableField("HasDisplayFee")
    private String HasDisplayFee;

    @TableField("OutletChannelID")
    private String OutletChannelID;

    @TableField("DisplayCost")
    private Double DisplayCost;

    @TableField("AssetCategory")
    private String AssetCategory;

    @TableField("OOHType")
    private String OOHType;

    @TableField("Gu_ID")
    private String guId;

    @TableField("PicLivingArea")
    private String PicLivingArea;

    @TableField("IsWithCashier")
    private String IsWithCashier;

    @TableField("CreationCode")
    private String CreationCode;

    @TableField("ConfirmUserCode")
    private String ConfirmUserCode;

    @TableField("IsWithPromoter")
    private String IsWithPromoter;

    @TableField("CreationName")
    private String CreationName;

    @TableField("ConfirmUserName")
    private String ConfirmUserName;

    @TableField("IsSR")
    private String IsSR;

    @TableField("PicDoorHead")
    private String PicDoorHead;

    @TableField("LocationWyetID")
    private String LocationWyetID;

    @TableField("HasMerchandiser")
    private String HasMerchandiser;

    @TableField("CityCode")
    private String CityCode;

    @TableField("IsSellLiving")
    private String IsSellLiving;


}
