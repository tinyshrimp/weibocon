package weibocon.org.UI;

import weibocon.org.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class WeiboDetail extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.weibo_detail);
		
		this.AddHandler();
	}

	private void AddHandler()
	{
		View v=this.findViewById(R.id.btnForward);
		v.setOnClickListener(ol);
		v=this.findViewById(R.id.btnForward2);
		v.setOnClickListener(ol);
		v=this.findViewById(R.id.btnReplyDisplay);
		v.setOnClickListener(ol);
		v=this.findViewById(R.id.btnReply);
		v.setOnClickListener(ol);
		v=this.findViewById(R.id.btnRefresh);
		v.setOnClickListener(ol);
		v=this.findViewById(R.id.btnFavorate);
		v.setOnClickListener(ol);
		v=this.findViewById(R.id.btnMore);
		v.setOnClickListener(ol);
		v=this.findViewById(R.id.btnGoBack);
		v.setOnClickListener(ol);
		v=this.findViewById(R.id.btnGoHome);
		v.setOnClickListener(ol);		
	}
	
	OnClickListener ol=new OnClickListener()
	{
		public void onClick(View v) {
			DoAction(v);
		}		
	};
	
	private void DoAction(View v)
	{
		Intent intent1=null;
		
		switch(v.getId())
		{
		case R.id.btnForward:
			intent1=new Intent(this,WeiboForward.class);
			break;
		case R.id.btnForward2:
			intent1=new Intent(this,WeiboForward.class);
			break;
		case R.id.btnReplyDisplay:
			intent1=new Intent(this,WeiboReplyDisplay.class);
			break;
		case R.id.btnReply:
			intent1=new Intent(this,WeiboReplyEdit.class);
			break;
		case R.id.btnRefresh:
			break;
		case R.id.btnFavorate:
			break;
		case R.id.btnMore:
			break;
		case R.id.btnGoBack:
			this.finish();
			break;
		case R.id.btnGoHome:
			this.finish();
			break;
		}
		
		if(intent1!=null)
		{
			this.startActivity(intent1);
		}
	}
	
}
