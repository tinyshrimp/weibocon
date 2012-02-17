package weibocon.org.data;

import java.util.Date;
/*
 * 微博
 */
public class Status {
	private Integer id;
	private String Text;
	private String OriginText;
	private Boolean IsTrucated;
	private Date Create_at;
	private Boolean InReplyToStatusId;
	private Boolean InReplyToUserId;
	private Boolean IsFavorited;
	private String InReplyToScreenName;
	private Long Latitude;
	private Long Longitude;
	private String Thumbnail_Pic;
	private String BMiddle_Pic;
	private String Origin_Pic;
	private Long Rtweeted_Status;
	private Integer uid;
	private Boolean Self;
	private Integer Type;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return Text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		Text = text;
	}
	/**
	 * @return the originText
	 */
	public String getOriginText() {
		return OriginText;
	}
	/**
	 * @param originText the originText to set
	 */
	public void setOriginText(String originText) {
		OriginText = originText;
	}
	/**
	 * @return the isTrucated
	 */
	public Boolean getIsTrucated() {
		return IsTrucated;
	}
	/**
	 * @param isTrucated the isTrucated to set
	 */
	public void setIsTrucated(Boolean isTrucated) {
		IsTrucated = isTrucated;
	}
	/**
	 * @return the create_at
	 */
	public Date getCreate_at() {
		return Create_at;
	}
	/**
	 * @param create_at the create_at to set
	 */
	public void setCreate_at(Date create_at) {
		Create_at = create_at;
	}
	/**
	 * @return the inReplyToStatusId
	 */
	public Boolean getInReplyToStatusId() {
		return InReplyToStatusId;
	}
	/**
	 * @param inReplyToStatusId the inReplyToStatusId to set
	 */
	public void setInReplyToStatusId(Boolean inReplyToStatusId) {
		InReplyToStatusId = inReplyToStatusId;
	}
	/**
	 * @return the inReplyToUserId
	 */
	public Boolean getInReplyToUserId() {
		return InReplyToUserId;
	}
	/**
	 * @param inReplyToUserId the inReplyToUserId to set
	 */
	public void setInReplyToUserId(Boolean inReplyToUserId) {
		InReplyToUserId = inReplyToUserId;
	}
	/**
	 * @return the isFavorited
	 */
	public Boolean getIsFavorited() {
		return IsFavorited;
	}
	/**
	 * @param isFavorited the isFavorited to set
	 */
	public void setIsFavorited(Boolean isFavorited) {
		IsFavorited = isFavorited;
	}
	/**
	 * @return the inReplyToScreenName
	 */
	public String getInReplyToScreenName() {
		return InReplyToScreenName;
	}
	/**
	 * @param inReplyToScreenName the inReplyToScreenName to set
	 */
	public void setInReplyToScreenName(String inReplyToScreenName) {
		InReplyToScreenName = inReplyToScreenName;
	}
	/**
	 * @return the latitude
	 */
	public Long getLatitude() {
		return Latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Long latitude) {
		Latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public Long getLongitude() {
		return Longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Long longitude) {
		Longitude = longitude;
	}
	/**
	 * @return the thumbnail_Pic
	 */
	public String getThumbnail_Pic() {
		return Thumbnail_Pic;
	}
	/**
	 * @param thumbnail_Pic the thumbnail_Pic to set
	 */
	public void setThumbnail_Pic(String thumbnail_Pic) {
		Thumbnail_Pic = thumbnail_Pic;
	}
	/**
	 * @return the bMiddle_Pic
	 */
	public String getBMiddle_Pic() {
		return BMiddle_Pic;
	}
	/**
	 * @param bMiddle_Pic the bMiddle_Pic to set
	 */
	public void setBMiddle_Pic(String bMiddle_Pic) {
		BMiddle_Pic = bMiddle_Pic;
	}
	/**
	 * @return the origin_Pic
	 */
	public String getOrigin_Pic() {
		return Origin_Pic;
	}
	/**
	 * @param origin_Pic the origin_Pic to set
	 */
	public void setOrigin_Pic(String origin_Pic) {
		Origin_Pic = origin_Pic;
	}
	/**
	 * @return the rtweeted_Status
	 */
	public Long getRtweeted_Status() {
		return Rtweeted_Status;
	}
	/**
	 * @param rtweeted_Status the rtweeted_Status to set
	 */
	public void setRtweeted_Status(Long rtweeted_Status) {
		Rtweeted_Status = rtweeted_Status;
	}
	/**
	 * @return the uid
	 */
	public Integer getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	/**
	 * @return the self
	 */
	public Boolean getSelf() {
		return Self;
	}
	/**
	 * @param self the self to set
	 */
	public void setSelf(Boolean self) {
		Self = self;
	}
	/**
	 * @return the type
	 */
	public Integer getType() {
		return Type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Integer type) {
		Type = type;
	}
	
}
