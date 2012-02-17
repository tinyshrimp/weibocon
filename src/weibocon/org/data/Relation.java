package weibocon.org.data;

public class Relation {
	private  int Source_id;
	private String Source_nick;
	private Boolean Source_follow_by;
	private boolean Source_following;
	private boolean Source_notifications_enabled;
	
	private  int Target_id;
	private String Target_nick;
	private Boolean Target_follow_by;
	private boolean target_following;
	private boolean Target_notifications_enabled;
	/**
	 * @return the source_id
	 */
	public int getSource_id() {
		return Source_id;
	}
	/**
	 * @param source_id the source_id to set
	 */
	public void setSource_id(int source_id) {
		Source_id = source_id;
	}
	/**
	 * @return the source_nick
	 */
	public String getSource_nick() {
		return Source_nick;
	}
	/**
	 * @param source_nick the source_nick to set
	 */
	public void setSource_nick(String source_nick) {
		Source_nick = source_nick;
	}
	/**
	 * @return the source_follow_by
	 */
	public Boolean getSource_follow_by() {
		return Source_follow_by;
	}
	/**
	 * @param source_follow_by the source_follow_by to set
	 */
	public void setSource_follow_by(Boolean source_follow_by) {
		Source_follow_by = source_follow_by;
	}
	/**
	 * @return the source_following
	 */
	public boolean isSource_following() {
		return Source_following;
	}
	/**
	 * @param source_following the source_following to set
	 */
	public void setSource_following(boolean source_following) {
		Source_following = source_following;
	}
	/**
	 * @return the source_notifications_enabled
	 */
	public boolean isSource_notifications_enabled() {
		return Source_notifications_enabled;
	}
	/**
	 * @param source_notifications_enabled the source_notifications_enabled to set
	 */
	public void setSource_notifications_enabled(boolean source_notifications_enabled) {
		Source_notifications_enabled = source_notifications_enabled;
	}
	/**
	 * @return the target_id
	 */
	public int getTarget_id() {
		return Target_id;
	}
	/**
	 * @param target_id the target_id to set
	 */
	public void setTarget_id(int target_id) {
		Target_id = target_id;
	}
	/**
	 * @return the target_nick
	 */
	public String getTarget_nick() {
		return Target_nick;
	}
	/**
	 * @param target_nick the target_nick to set
	 */
	public void setTarget_nick(String target_nick) {
		Target_nick = target_nick;
	}
	/**
	 * @return the target_follow_by
	 */
	public Boolean getTarget_follow_by() {
		return Target_follow_by;
	}
	/**
	 * @param target_follow_by the target_follow_by to set
	 */
	public void setTarget_follow_by(Boolean target_follow_by) {
		Target_follow_by = target_follow_by;
	}
	/**
	 * @return the target_following
	 */
	public boolean isTarget_following() {
		return target_following;
	}
	/**
	 * @param target_following the target_following to set
	 */
	public void setTarget_following(boolean target_following) {
		this.target_following = target_following;
	}
	/**
	 * @return the target_notifications_enabled
	 */
	public boolean isTarget_notifications_enabled() {
		return Target_notifications_enabled;
	}
	/**
	 * @param target_notifications_enabled the target_notifications_enabled to set
	 */
	public void setTarget_notifications_enabled(boolean target_notifications_enabled) {
		Target_notifications_enabled = target_notifications_enabled;
	}

}
