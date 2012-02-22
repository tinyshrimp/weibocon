package weibocon.org.protocols.sina;

import android.os.Bundle;

import com.weibo.net.AccessToken;
import com.weibo.net.DialogError;
import com.weibo.net.Weibo;
import com.weibo.net.WeiboDialogListener;
import com.weibo.net.WeiboException;

public class Login {
	private static final String APP_KEY="";
	private static final String REQUEST_TOKEN_KEY = "";
	
	public static void Request(String userName, String password, LoginCallback callback) {
		Weibo weibo = Weibo.getInstance();
		weibo.setupConsumerConfig(APP_KEY, REQUEST_TOKEN_KEY);
		weibo.setRedirectUrl("http://www.sina.com");
		weibo.authorize(null, new Login.AuthDialogListener(callback)); //TODO: first parameter is a Activity, it should not exist here. how to produce it?
	}
	
	static class AuthDialogListener implements WeiboDialogListener {
		private LoginCallback _callback = null;
		
		public AuthDialogListener(LoginCallback callback) {
			this._callback = callback;
		}
		public void onComplete(Bundle values) {
			String token = values.getString("access_token");
			String expires_in = values.getString("expires_in");
			AccessToken accessToken = new AccessToken(token, Login.REQUEST_TOKEN_KEY);
			accessToken.setExpiresIn(expires_in);
			if (this._callback != null) {
				this._callback.onSucceed();
			} else {
				//TODO: throw exception here.
			}
		}
		
		public void onError(DialogError e) {
			if (this._callback != null) {
				this._callback.onError(e.getMessage());
			} else {
				//TODO: throw exception here.
			}
		}
		
		public void onCancel() {
			if (this._callback != null) {
				this._callback.onCanceled();
			} else {
				//TODO: throw exception here.
			}
		}
		
		public void onWeiboException(WeiboException e) {
			if (this._callback != null) {
				this._callback.onError(e.getMessage());
			} else {
				//TODO: throw exception here.
			}
		}
	}
}

abstract class LoginCallback {
	abstract void onSucceed();
	abstract void onError(String messages);
	abstract void onCanceled();
	abstract void onException(String messages);
}
