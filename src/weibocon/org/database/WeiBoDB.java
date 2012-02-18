/**
 * 
 */
package weibocon.org.database;

import java.util.ArrayList;
import java.util.List;

import weibocon.org.data.Code_Location;
import weibocon.org.data.Comments;
import weibocon.org.data.Education;
import weibocon.org.data.Emotion;
import weibocon.org.data.Followers;
import weibocon.org.data.Friends;
import weibocon.org.data.Messages;
import weibocon.org.data.Status;
import weibocon.org.data.Tag;
import weibocon.org.data.UserInfo;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * @author JimWei
 * 
 */
public class WeiBoDB implements IWeiBoDB {
	private static final String _dbname = "WeiboCon.db";
	private static final Integer _dbversion = 1;
	private SQLiteDatabase _db = null;
	private WeiBoSqliteOpenHelper _helper = null;

	public WeiBoDB(Context context) {
		Init(context);
	}

	private void Init(Context context) {
		_helper = new WeiBoSqliteOpenHelper(context,
				WeiBoSqliteOpenHelper.dbName, null,
				WeiBoSqliteOpenHelper.version);
		_db = _helper.getWritableDatabase();
	}

	/*
	 * 关闭接口
	 */
	public void Close() {
		_db.close();
		_helper.close();

	}

	public Cursor GetUserInfo1() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @see weibocon.org.database.IWeiBoDB#AddUser(weibocon.org.data.UserInfo)
	 */
	public Boolean AddUser(UserInfo user) {
		StringBuilder strSql = new StringBuilder();
		strSql.append("Insert Into ");
		strSql.append(WeiBoSqliteOpenHelper.tbl_UserInfo);
		strSql.append("(uid,name,nick,sex,head,weibotype)");
		strSql.append(" Values(\r\n");
		strSql.append(user.getUid().toString());
		strSql.append("," + user.getName());
		strSql.append("," + user.getNick());
		strSql.append("," + user.getSex().toString());
		strSql.append("," + user.getHead());
		strSql.append("," + user.getWeiboType().toString());
		strSql.append(")");

		_db.execSQL(strSql.toString());
		return true;
	}

	public List<UserInfo> GetUserInfo() {
		List<UserInfo> list = new ArrayList<UserInfo>();
		StringBuilder strSql = new StringBuilder();
		strSql.append("Select * From " + WeiBoSqliteOpenHelper.tbl_UserInfo);

		Cursor _cursor = _db.rawQuery(strSql.toString(), null);

		UserInfo item = null;
		while (_cursor.moveToNext()) {
			item = new UserInfo();
			item.setId(_cursor.getInt(0));
			item.setUid(_cursor.getInt(1));
			item.setName(_cursor.getString(2));
			item.setNick(_cursor.getString(3));
			item.setSex(_cursor.getInt(4));
			item.setHead(_cursor.getString(5));
			item.setWeiboType(_cursor.getInt(6));

			list.add(item);
		}
		return list;
	}

	public Boolean UpdateUserInfo(UserInfo user) {
		StringBuilder strSql = new StringBuilder();
		strSql.append("Update " + WeiBoSqliteOpenHelper.tbl_UserInfo);
		strSql.append(" Set uid=" + user.getUid().toString());
		strSql.append(",name='" + user.getName() + "'");
		strSql.append(",nick='" + user.getNick() + "'");
		strSql.append(",sex=" + user.getSex().toString());

		_db.execSQL(strSql.toString());

		return true;
	}

	public Boolean DeleteUserInfo(UserInfo user) {
		String sql = "Delete From " + WeiBoSqliteOpenHelper.tbl_UserInfo
				+ "  Where id=" + user.getId().toString();

		_db.execSQL(sql);
		return true;
	}

	public List<Status> GetStatus(Integer page, Integer uid) {

		return null;
	}

	public Boolean DeleteStatus(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean AddStatus(List<Status> statusList) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean AddTag(List<Tag> tagList) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Tag> GetTag(Integer page, Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean AddFriends(List<Friends> friendsList) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Friends> GetFriends(Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean DeleteFriends(Integer friendsID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Comments> GetComments(Integer status_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean DeleteComments(Integer commentID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Emotion> GetEmoton() {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean AddEmotion(List<Emotion> emotionList) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean AdEducation(List<Education> educationList) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Education> GetEducation(Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean UpdateEducation(List<Education> educationList) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean AddCode_Location(List<Code_Location> code_LocationList) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Code_Location> GetCode_Location() {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean AddFollowers(List<Followers> followersList) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Followers> GetFollowers(Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean DeleteFollowers(Integer followersID) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean AddMessages(List<Messages> messageList) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Messages> GetMessages(Integer uid, Integer page) {
		// TODO Auto-generated method stub
		return null;
	}

}
