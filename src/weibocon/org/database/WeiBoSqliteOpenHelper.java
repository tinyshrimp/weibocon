package weibocon.org.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/*
 *謨ｰ謐ｮ蠎登pen霎�勧邀ｻ 
 */
public class WeiBoSqliteOpenHelper extends SQLiteOpenHelper {

	/*
	 * database version
	 */
	static final int version = 1;
	/*
	 * 謨ｰ謐ｮ蠎灘錐遘ｰ
	 */
	static final String dbName = "WeiBo.db";
	/*
	 * 蠕ｮ蜊夊｡ｨ蜷咲ｧｰ
	 */
	static final String tbl_Status = "Status";
	/*
	 * 逕ｨ謌ｷ陦ｨ蜷咲ｧｰ
	 */
	static final String tbl_UserInfo = "UserInfo";
	/*
	 * 謨呵ご蜷咲ｧｰ
	 */
	static final String tbl_Education = "Education";
	/*
	 * 譬�ｭｾ蜷咲ｧｰ
	 */
	static final String tbl_Tag = "Tag";
	/*
	 * 菫｡莉ｶ蜷咲ｧｰ
	 */
	static final String tbl_Messages = "Messages";
	/*
	 * 蜈ｳ豕ｨ蟇ｹ雎｡蜷咲ｧｰ
	 */
	static final String tbl_Friends = "Friends";
	/*
	 * 邊我ｸ晏錐遘ｰ
	 */
	static final String tbl_Followers = "Followers";
	/*
	 * 隸�ｮｺ蜷咲ｧｰ
	 */
	static final String tbl_Comments = "Comments";
	/*
	 * 陦ｨ諠�錐遘ｰ
	 */
	static final String tbl_Emotions = "Emotions";
	/*
	 * 蝨ｰ蝮��陦ｨ蜷咲ｧｰ
	 */
	static final String tbl_Code_Location = "Code_Location";
	/*
	 * 逋ｻ蠖戊｡ｨ蜷咲ｧｰ
	 */
	static final String tbl_LoginUser = "LoginUser";

	public WeiBoSqliteOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		// 蛻帛ｻｺ謨ｰ謐ｮ蠎楢｡ｨschema
		StringBuilder sql = new StringBuilder();

		// User
		sql.append("Create Table if not exists" + tbl_UserInfo);
		sql.append(" ( Id Integer Primary key,");
		sql.append("Uid Integer,");
		sql.append("Name Nvarchar(20),");
		sql.append("Nick Nvarchar(10),");
		sql.append("URL Nvarchar(50),");
		sql.append("Domain Nvarchar(50),");
		sql.append("Head Nvarchar(50),");
		sql.append("Location Nvarchar(50),");
		sql.append("Isvip Bool,");
		sql.append("Isent Bool,");
		sql.append("Email Nvarchar(50),");
		sql.append("Introduction Nvarchar(100),");
		sql.append("Birth_Year Integer,");
		sql.append("Birth_Month Integer,");
		sql.append("Birth_Day Integer,");
		sql.append("Country_Code Integer,");
		sql.append("Province_Code Integer,");
		sql.append("City_Code Integer,");
		sql.append("Sex Integer,");
		sql.append("FansNum Integer,");
		sql.append("StatusNum Integer,");
		sql.append("IdoNum Integer,");
		sql.append("FavouritesNum Integer,");
		sql.append("Tagid Integer,");
		sql.append("Eduid Integer,");
		sql.append("Create_at DateTime,");
		sql.append("following Bool,");
		sql.append("Allow_all_act_msg Bool,");
		sql.append("Geo_enabled Bool,");
		sql.append("Allow_all_comment Bool,");
		sql.append("Avatar_large Nvarchar(50),");
		sql.append("Verified_reason Nvarchar(100),");
		sql.append("Follow_me Bool,");
		sql.append("Bi_followers_count Integer,");
		sql.append("WeiboType Integer");
		sql.append(")");

		// Status
		sql.append("Create Table if not exists" + tbl_Status);
		sql.append(" ( Id Long Primary key,");
		sql.append(" ( Text Nvarchar(150),");
		sql.append(" ( OriginText Nvarchar(150),");
		sql.append(" ( IsTruncated Boolean,");
		sql.append(" ( Create_At DateTime,");
		sql.append(" ( InReplyToStatusId Long,");
		sql.append(" ( InReplyToUserId Long,");
		sql.append(" ( IsFavorited Boolean,");
		sql.append(" ( InReplyToScreenName Nvarchar(10),");
		sql.append(" ( Latitude Double,");
		sql.append(" ( Longitude Double,");
		sql.append(" ( Thumbnail_Pic Nvarchar(50),");
		sql.append(" ( BMiddle_pic Nvarchar(50),");
		sql.append(" ( Origin_Pic Nvarchar(50),");
		sql.append(" ( Rtweeted_Status Long,");
		sql.append(" ( uid Integer,");
		sql.append(" ( self Boolean,");
		sql.append(" ( Type Integer");

		sql.append(")");

		// Emotion
		sql.append("Create Table if not exists" + tbl_Emotions);
		sql.append(" ( Id Long Primary key,");
		sql.append(" ( Type Integer,");
		sql.append(" ( Icon Blob,");
		sql.append(" ( Phrase Nvarchar(20),");
		sql.append(" ( Url Nvarchar(50)");

		sql.append(")");

		// Code_Location
		sql.append("Create Table if not exists" + tbl_Code_Location);
		sql.append(" ( Id Long Primary key,");
		sql.append(" ( Code Long,");
		sql.append(" ( Icon Blob,");
		sql.append(" ( Location Nvarchar(50)");

		sql.append(")");

		// Comments
		sql.append("Create Table if not exists" + tbl_Comments);
		sql.append(" ( Id Long Primary key,");
		sql.append(" ( Create_at Datetime,");
		sql.append(" ( Text Nvarchar(150,");
		sql.append(" ( Source Nvarchar(50),");
		sql.append(" ( Uid Integer,");
		sql.append(" ( Mid Integer,");
		sql.append(" ( Status_id Long,");
		sql.append(" ( Reply_Comments Nvarchar(150)");

		sql.append(")");

		// Education
		sql.append("Create Table if not exists" + tbl_Education);
		sql.append(" ( Id Inetger Primary key,");
		sql.append(" ( uid Integer,");
		sql.append(" ( Year Integer,");
		sql.append(" ( Schoolid Integer,");
		sql.append(" ( Departmentid Integer,");
		sql.append(" ( Level Integer");

		sql.append(")");

		// Tag
		sql.append("Create Table if not exists" + tbl_Tag);
		sql.append(" ( Id Inetger Primary key,");
		sql.append(" ( Name Nvarchar(50)");

		sql.append(")");

		// Messages
		sql.append("Create Table if not exists" + tbl_Messages);
		sql.append(" ( Id Inetger Primary key,");
		sql.append(" ( Text Nvarchar(150),");
		sql.append(" ( OriginText Nvarchar(150),");
		sql.append(" ( Count Integer,");
		sql.append(" ( From Nvarchar(100),");
		sql.append(" ( Image Nvarchar(50),");
		sql.append(" ( Name Nvarchar(20),");
		sql.append(" ( Nick Nvarchar(10),");
		sql.append(" ( Self Boolean,");
		sql.append(" ( Timestamp Datetime,");
		sql.append(" ( Type Integer,");
		sql.append(" ( Head Nvarchar(50),");
		sql.append(" ( Location Nvarchar(100),");
		sql.append(" ( Geo Nvarchar(50),");
		sql.append(" ( Isvip Boolean");

		sql.append(")");

		// LoginUser
		sql.append("Create Table if not exists" + tbl_LoginUser);
		sql.append(" ( Uid Inetger ,");
		sql.append(" ( AccessToken Nvarchar(50),");
		sql.append(" ( AccessSecret Nvarchar(50),");
		sql.append(" ( IsOnline Boolean,");
		sql.append(" ( LastLogOut DateTime,");
		sql.append(" ( CurrentLogin DateTime");

		sql.append(")");

		// Friends
		sql.append("Create Table if not exists" + tbl_Friends);
		sql.append(" ( Id Integer Primary key,");
		sql.append("Name Nvarchar(20),");
		sql.append("Nick Nvarchar(10),");
		sql.append("Uid Integer,");
		sql.append("URL Nvarchar(50),");
		sql.append("Domain Nvarchar(50),");
		sql.append("Head Nvarchar(50),");
		sql.append("Location Nvarchar(50),");
		sql.append("Isvip Bool,");
		sql.append("Isent Bool,");
		sql.append("Email Nvarchar(50),");
		sql.append("Introduction Nvarchar(100),");
		sql.append("Birth_year Integer,");
		sql.append("Birth_month Integer,");
		sql.append("Birth_day Integer,");
		sql.append("Country_code Integer,");
		sql.append("Province_code Integer,");
		sql.append("City_code Integer,");
		sql.append("Sex Integer,");
		sql.append("FansNum Integer,");
		sql.append("StatusNum Integer,");
		sql.append("IdoNum Integer,");
		sql.append("FavouritesNum Integer,");
		sql.append("Tagid Integer,");
		sql.append("Eduid Integer,");
		sql.append("Create_at DateTime,");
		sql.append("Following Bool,");
		sql.append("Allow_all_act_msg Bool,");
		sql.append("Geo_enabled Bool,");
		sql.append("Allow_all_comment Bool,");
		sql.append("Avatar_large Nvarchar(50),");
		sql.append("Verified_reason Nvarchar(100),");
		sql.append("Follow_me Bool,");
		sql.append("Bi_followers_count Integer,");
		sql.append("Online_status Integer,");
		sql.append("WeiboType Integer");
		sql.append(")");

		// Followers
		sql.append("Create Table if not exists" + tbl_Followers);
		sql.append(" ( Id Integer Primary key,");
		sql.append("Name Nvarchar(20),");
		sql.append("Nick Nvarchar(10),");
		sql.append("Uid Integer,");
		sql.append("Url Nvarchar(50),");
		sql.append("Domain Nvarchar(50),");
		sql.append("Head Nvarchar(50),");
		sql.append("Location Nvarchar(50),");
		sql.append("Isvip Bool,");
		sql.append("Isent Bool,");
		sql.append("Email Nvarchar(50),");
		sql.append("Introduction Nvarchar(100),");
		sql.append("Birth_year Integer,");
		sql.append("Birth_month Integer,");
		sql.append("Birth_day Integer,");
		sql.append("Country_code Integer,");
		sql.append("Province_code Integer,");
		sql.append("City_code Integer,");
		sql.append("Sex Integer,");
		sql.append("FansNum Integer,");
		sql.append("StatusNum Integer,");
		sql.append("IdoNum Integer,");
		sql.append("FavouritesNum Integer,");
		sql.append("Tagid Integer,");
		sql.append("Eduid Integer,");
		sql.append("Create_at DateTime,");
		sql.append("Following Bool,");
		sql.append("Allow_all_act_msg Bool,");
		sql.append("Geo_enabled Bool,");
		sql.append("Allow_all_comment Bool,");
		sql.append("Avatar_large Nvarchar(50),");
		sql.append("Verified_reason Nvarchar(100),");
		sql.append("Follow_me Bool,");
		sql.append("Bi_followers_count Integer,");
		sql.append("Online_status Integer,");
		sql.append("WeiboType Integer");
		sql.append(")");

		db.execSQL(sql.toString());
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
