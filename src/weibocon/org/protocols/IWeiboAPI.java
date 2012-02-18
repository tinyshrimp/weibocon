package weibocon.org.protocols;

import java.util.Hashtable;
import java.util.List;

import weibocon.org.data.Emotion;
import weibocon.org.data.Relation;
import weibocon.org.data.Status;
import weibocon.org.data.Tag;
import weibocon.org.data.UserInfo;
import weibocon.org.data.UserType;

public interface IWeiboAPI {
	/*
	 * 获取user source false string 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。
	 * access_token false string 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 uid
	 * false int64 需要查询的用户ID。 screen_name false string 需要查询的用户昵称。
	 */
	public UserInfo getUser(String source, String accessToken, Long uid);

	/*
	 * 获取指定user的粉丝，关注，微博数 source false string
	 * 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。 access_token false string
	 * 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 uid true string 需要获取数据的用户UID，
	 */
	public Hashtable getUser_RelationsCounts(String source, String accessToken,
			Long uid);

	/*
	 * 获取两个用户之间的详细关注关系情况 :friendships/show source false string
	 * 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。 access_token false string
	 * 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 source_id false int64 源用户的UID。
	 * target_id false int64 目标用户的UID。
	 */
	public Relation getRelation(String source, String access_token,
			int source_id, int target_id);

	/*
	 * 获取用户关注列表 UserType:粉丝或关注对象 source false string
	 * 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。 access_token false string
	 * 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 uid false int64 需要查询的用户UID。。
	 * count false int 单页返回的记录条数，默认为50，最大不超过200。 cursor false int
	 * 返回结果的游标，下一页用返回值里的next_cursor，上一页用previous_cursor，默认为0。
	 */
	public List<UserInfo> getFriends(UserType userType, String source,
			String access_toekn, Long uid, int count, int cursor);

	/*
	 * 获取当前登录用户及其所关注用户的最新微博:home_timeline source false string
	 * 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。 access_token false string
	 * 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 since_id false int64
	 * 若指定此参数，则返回ID比since_id大的微博（即比since_id时间晚的微博），默认为0。 max_id false int64
	 * 若指定此参数，则返回ID小于或等于max_id的微博，默认为0。 count false int 单页返回的记录条数，默认为50。 page
	 * false int 返回结果的页码，默认为1。 base_app false int
	 * 是否只获取当前应用的数据。0为否（所有数据），1为是（仅当前应用），默认为0。 feature false int
	 * 过滤类型ID，0：全部、1：原创、2：图片、3：视频、4：音乐，默认为0。
	 */
	public List<Status> getHomeStatus(String source, String access_token,
			Long since_id, Long max_id, int count, int page, int base_app,
			int feature);

	/*
	 * 获取某个用户最新发表的微博列表 :statuses/user_timeline source false string
	 * 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。 access_token false string
	 * 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 uid false int64 需要查询的用户ID。
	 * since_id false int64 若指定此参数，则返回ID比since_id大的微博（即比since_id时间晚的微博），默认为0。
	 * max_id false int64 若指定此参数，则返回ID小于或等于max_id的微博，默认为0。 count false int
	 * 单页返回的记录条数，默认为50。 page false int 返回结果的页码，默认为1。 base_app false int
	 * 是否只获取当前应用的数据。0为否（所有数据），1为是（仅当前应用），默认为0。 feature false int
	 * 过滤类型ID，0：全部、1：原创、2：图片、3：视频、4：音乐，默认为0。 trim_user false int
	 * 返回值中user信息开关，0：返回完整的user信息、1：user字段仅返回user_id，默认为0。
	 */
	public List<Status> getUserStatus(String source, String access_token,
			Long uid, int since_id, int max_id, int count, int page,
			int base_app, int feature, int trim_user);

	/*
	 * 发布一条新微博:statuses/update source false string
	 * 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。 access_token false string
	 * 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 status true string
	 * 要发布的微博文本内容，必须做URLencode，内容不超过140个汉字。 pic false binary
	 * 要上传的图片，仅支持JPEG、GIF、PNG格式，图片大小小于5M,如果pic为空，则发的是不带图片的微博，
	 * 反之，发送的则是带图片的微博，需要采用post方式，并且，调用的接口也不同 lat false float
	 * 纬度，有效范围：-90.0到+90.0，+表示北纬，默认为0.0。 long false float
	 * 经度，有效范围：-180.0到+180.0，+表示东经，默认为0.0。
	 */
	public Boolean publishStatus(String source, String access_token,
			String status, byte[] pic, float lat, float longi);

	/*
	 * 根据微博ID删除指定微博 source false string
	 * 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。 access_token false string
	 * 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 id true int64 需要删除的微博ID。
	 */
	public Boolean DeleteStatus(String source, String access_token, Long id);

	/*
	 * 转发一条微博 source false string 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。
	 * access_token false string 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 id
	 * true int64 要转发的微博ID。 status false string
	 * 添加的转发文本，必须做URLencode，内容不超过140个汉字，不填则默认为“转发微博”。 is_comment false int
	 * 是否在转发的同时发表评论，0：否、1：评论给当前微博、2：评论给原微博、3：都评论，默认为0 。
	 */
	public boolean TransferStatus(String source, String access_token, Long id,
			String status, int is_comment);

	/*
	 * 获取微博官方表情的详细信息 source false string
	 * 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。 access_token false string
	 * 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 type false string
	 * 表情类别，face：普通表情、ani：魔法表情、cartoon：动漫表情，默认为face。 language false string
	 * 语言类别，cnname：简体、twname：繁体，默认为cnname。
	 */
	public List<Emotion> getEmotions(String source, String access_token,
			String type, String language);

	/*
	 * 对一条微博进行评论:comments/create source false string
	 * 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。 access_token false string
	 * 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 comment true string
	 * 评论内容，必须做URLencode，内容不超过140个汉字。 id true int64 需要评论的微博ID。 comment_ori false
	 * int 当评论转发微博时，是否评论给原微博，0：否、1：是，默认为0。
	 */
	public Boolean createComment(String source, String access_token,
			String comment, Long id, int comment_ori);

	/*
	 * 回复一条评论 :comments/reply source false string
	 * 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。 access_token false string
	 * 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 cid true int64 需要回复的评论ID。 id
	 * true int64 需要评论的微博ID。 comment true string
	 * 回复评论内容，必须做URLencode，内容不超过140个汉字。 without_mention false int
	 * 回复中是否自动加入“回复@用户名”，0：是、1：否，默认为0。 comment_ori false int
	 * 当评论转发微博时，是否评论给原微博，0：否、1：是，默认为0。
	 */
	public Boolean replyComment(String source, String access_token, Long cid,
			Long id, String comment, int without_mention, int comment_ori);

	/*
	 * 删除一条评论 source false string 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。
	 * access_token false string 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 cid
	 * true int64 要删除的评论ID，只能删除登录用户自己发布的评论。
	 */
	public Boolean deleteComment(String source, String access_token, Long cid);

	/*
	 * 获取标签 source false string 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。
	 * access_token false string 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 uid
	 * true int64 要获取的标签列表所属的用户ID。 count false int 单页返回的记录条数，默认为20。 page false
	 * int 返回结果的页码，默认为1。
	 */
	public List<Tag> getOwnerTag(String source, String access_token, Long uid,
			int count, int page);

	/*
	 * 获取批量标签 source false string 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。
	 * access_token false string 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 uids
	 * true string 要获取标签的用户ID。最大20，逗号分隔。
	 */
	public List<Tag> getBatchTags(String source, String access_token, Long uid);

	/*
	 * 获取推荐的标签 source false string 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。
	 * access_token false string 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 count
	 * false int 返回记录数，默认10，最大10。
	 */
	public List<Tag> getSuggestionTags(String source, String access_token,
			int count);

	/*
	 * 为当前登录用户添加新的用户标签 source false string
	 * 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。 access_token false string
	 * 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 tags true string
	 * 要创建的一组标签，用半角逗号隔开，每个标签的长度不可超过7个汉字，14个半角字符。 注意事项
	 * 无论调用该接口次数多少，每个用户最多可以创建10个标签
	 */
	public Boolean createTag(String source, String access_token, String tags);

	/*
	 * 删除标签 source false string 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。
	 * access_token false string 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。
	 * tag_id true int64 要删除的标签ID。
	 */
	public Boolean deleteTag(String source, String access_token, Long tag_id);

	/*
	 * 批量删除标签 source false string 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。
	 * access_token false string 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 ids
	 * true string 要删除的一组标签ID，以半角逗号隔开，一次最多提交10个ID。 用户只能删除自己的标签
	 */
	public Boolean deleteBatchTags(String source, String access_token,
			String ids);

	/*
	 * 关注某人 source false string 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。
	 * access_token false string 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 uid
	 * false int64 需要关注的用户ID。 screen_name false string 需要关注的用户昵称。
	 */
	public Boolean createFriends(String source, String access_token, Long uid,
			String screen_name);

	/*
	 * 取消对某人的关注 source false string 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。
	 * access_token false string 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 uid
	 * false int64 需要取消关注的用户ID。 screen_name false string 需要取消关注的用户昵称。
	 */
	public Boolean deleteFriends(String source, String access_token, Long uid,
			String screen_name);

	/*
	 * 更新某人的关注 source false string 采用OAuth授权方式不需要此参数，其他授权方式为必填参数，数值为应用的AppKey。
	 * access_token false string 采用OAuth授权方式为必填参数，其他授权方式不需要此参数，OAuth授权后获得。 uid
	 * true int64 需要修改备注信息的用户UID。 remark true string 备注信息，需要URLencode。
	 */
	public Boolean updateFiends(String source, String access_toekn, Long uid,
			String remark);

}
