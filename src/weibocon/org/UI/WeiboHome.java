package weibocon.org.UI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import weibocon.org.R;
import weibocon.org.adapters.WeiboAdapter;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;

public class WeiboHome extends Activity {

	private PopupWindow mPopupWindow;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.weibo_home);

		this.InitialTabHost();
	}

	@Override 
	public void onBackPressed()
	{
		AlertDialog.Builder b=new AlertDialog.Builder(this);
		b.setTitle(R.string.quitconf_title);
		b.setMessage(R.string.quitconf_message);
		b.setPositiveButton("OK", new DialogInterface.OnClickListener() {		
			public void onClick(DialogInterface dialog, int which) {
				BackPress();
			}
		});
		b.setNegativeButton("Cancel", null);
		b.setIcon(R.drawable.ic_help);
		AlertDialog d=b.create();
		d.show(); 
	}

	private void BackPress()
	{
		super.onBackPressed();
		if(this.isFinishing())
		{
			this.finish();
			System.exit(0);
		}
	}

	private void InitialTabHost()
	{
		TabHost tb=(TabHost)this.findViewById(android.R.id.tabhost);
		tb.setup();
		LayoutInflater inf=LayoutInflater.from(this);
		inf.inflate(R.layout.hometabs_alldata, tb.getTabContentView());
		LinearLayout pnl=(LinearLayout) inf.inflate(R.layout.pnl_tabwidget, null);
		View v;

		TabSpec spc=tb.newTabSpec("TAB1");
		v=pnl.findViewById(R.id.tabpnl_home);
		pnl.removeView(v);
		spc.setIndicator(v);
		spc.setContent(R.id.pnl_WeiboAll);
		tb.addTab(spc);		
		spc=tb.newTabSpec("TAB2");
		v=pnl.findViewById(R.id.tabpnl_message);
		pnl.removeView(v);
		spc.setIndicator(v);
		spc.setContent(R.id.txt_tab2);
		tb.addTab(spc);
		spc=tb.newTabSpec("TAB3");
		v=pnl.findViewById(R.id.tabpnl_selfinfo);
		pnl.removeView(v);
		spc.setIndicator(v);
		spc.setContent(R.id.txt_tab3);
		tb.addTab(spc);
		spc=tb.newTabSpec("TAB4");
		v=pnl.findViewById(R.id.tabpnl_square);
		pnl.removeView(v);
		spc.setIndicator(v);
		spc.setContent(R.id.txt_tab4);
		tb.addTab(spc);
		spc=tb.newTabSpec("TAB5");
		v=pnl.findViewById(R.id.tabpnl_more);
		pnl.removeView(v);
		spc.setIndicator(v);
		spc.setContent(R.id.txt_tab5);
		tb.addTab(spc);	

		tb.setCurrentTab(1);		
		this.AddTabChangedHandler(tb);
		tb.setCurrentTab(0);	
	}

	private void AddTabChangedHandler(TabHost tb)
	{
		tb.setOnTabChangedListener(new OnTabChangeListener(){
			public void onTabChanged(String tabId) {
				if (tabId.equals("TAB1"))
				{
					InitialTAB1();
					LoadData_TAB1();
				}
				else if(tabId.equals("TAB2"))
				{

				}
				else if(tabId.equals("TAB3"))
				{

				}
				else if(tabId.equals("TAB4"))
				{

				}
				else if(tabId.equals("TAB5"))
				{

				}
			}			
		});
	}

	private void InitialTAB1()
	{
		View v=this.findViewById(R.id.btnUserSelection);
		v.setOnClickListener(ol);

		ImageView img=(ImageView)this.findViewById(R.id.img_EditButton);
		img.setOnClickListener(ol);

		ListView lv=(ListView)this.findViewById(R.id.lst_WeiboContent);
		lv.setOnItemClickListener(new OnItemClickListener()
		{
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Intent intent1=new Intent(WeiboHome.this,WeiboDetail.class);
				WeiboHome.this.startActivity(intent1);				
			}
		});
		
	}

	private void LoadData_TAB1()
	{
		List<Map<String,Object>> data=this.GetData();

		ListView lv=(ListView)this.findViewById(R.id.lst_WeiboContent);
		WeiboAdapter adp=new WeiboAdapter(this.getBaseContext(),data);
		lv.setAdapter(adp);   	
	}

	private List<Map<String,Object>> GetData()
	{
		List<Map<String,Object>> data=new ArrayList<Map<String,Object>>();

		HashMap<String,Object> mp;

		int index;
		for(index=0;index<30;index++)
		{
			mp=new HashMap<String,Object>();
			mp.put("UserName", "YouLi"+index);
			mp.put("WeiboContent", "This is a sample!");

			data.add(mp);
		}

		return data;
	}

	private OnClickListener ol=new OnClickListener()
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
		case R.id.img_EditButton:
			intent1=new Intent(this,WeiboWrite.class);
			break;
		case R.id.btnUserSelection:
			this.ChangeUser(v);
		}

		if(intent1!=null)
		{
			this.startActivity(intent1);
		}
	}

	private void ChangeUser(View v)
	{
		PopupWindow pop;

		if(mPopupWindow==null)
		{
			LayoutInflater inf=LayoutInflater.from(this);
			LinearLayout pnlBack=(LinearLayout) inf.inflate(R.layout.grouplist_popup, null);
			ListView lv=(ListView) pnlBack.findViewById(R.id.lstGroups);
			lv.setOnItemClickListener(new OnItemClickListener()
			{
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					if(mPopupWindow!=null)
						mPopupWindow.dismiss();					
				}
			});
			lv.setSelector(R.drawable.grouplist_selector);

			ArrayList<String> data=new ArrayList<String>();
			data.add("全部");
			data.add("同事");
			data.add("同学");
			data.add("朋友");
			ArrayAdapter<String> adp=new ArrayAdapter<String>(this, R.layout.grouplist_listitem, data);
			lv.setAdapter(adp);

			pop=new PopupWindow(pnlBack, 200, 250, true);
			pop.setOutsideTouchable(true);
			pop.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
			mPopupWindow=pop;
		}
		else
			pop=mPopupWindow;

		pop.update();
		pop.showAsDropDown(v,-v.getWidth()/2,0);
	}

}
