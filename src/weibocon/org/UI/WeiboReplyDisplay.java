package weibocon.org.UI;

import weibocon.org.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class WeiboReplyDisplay extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.weibo_reply_display);
		
		this.AddHandler();
	}
	
	private void AddHandler()
	{
		View v=this.findViewById(R.id.btnGoBack);
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
		switch(v.getId())
		{
		case R.id.btnGoBack:
			this.finish();
			break;
		}		

	}
}
