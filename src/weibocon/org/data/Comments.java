package weibocon.org.data;

import java.util.Date;

public class Comments {
	private Long Id;
	private Date Create_at;
	private String Text;
	private String Source;
	private Long Uid;
	private Long Mid;
	private Long Status_id;
	private String Reply_comment;
	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
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
	 * @return the source
	 */
	public String getSource() {
		return Source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		Source = source;
	}
	/**
	 * @return the uid
	 */
	public Long getUid() {
		return Uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(Long uid) {
		Uid = uid;
	}
	/**
	 * @return the mid
	 */
	public Long getMid() {
		return Mid;
	}
	/**
	 * @param mid the mid to set
	 */
	public void setMid(Long mid) {
		Mid = mid;
	}
	/**
	 * @return the status_id
	 */
	public Long getStatus_id() {
		return Status_id;
	}
	/**
	 * @param status_id the status_id to set
	 */
	public void setStatus_id(Long status_id) {
		Status_id = status_id;
	}
	/**
	 * @return the reply_comment
	 */
	public String getReply_comment() {
		return Reply_comment;
	}
	/**
	 * @param reply_comment the reply_comment to set
	 */
	public void setReply_comment(String reply_comment) {
		Reply_comment = reply_comment;
	}

}
