package weibocon.org.UI;

import java.util.ArrayList;

import weibocon.org.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class WeiboEditBase extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		SetLayoutResource();

		this.AddHandler();
	}

	protected void SetLayoutResource()
	{

	}

	private void AddHandler()
	{
		View v=this.findViewById(R.id.btnGoBack);
		if(v!=null)
			v.setOnClickListener(ol);
		v=this.findViewById(R.id.btnFaceSel);
		if(v!=null)
			v.setOnClickListener(ol);
		v=this.findViewById(R.id.btnAtSel);
		if(v!=null)
			v.setOnClickListener(ol);
		v=this.findViewById(R.id.btnTopicSel);
		if(v!=null)
			v.setOnClickListener(ol);
		v=this.findViewById(R.id.btnSend);
		if(v!=null)
			v.setOnClickListener(ol);
	}

	protected OnClickListener ol=new OnClickListener()
	{
		public void onClick(View v) {
			DoAction(v);
		}		
	};

	protected void DoAction(View v)
	{		
		View vv;
		ViewGroup g;

		switch(v.getId())
		{
		case R.id.btnGoBack:
			this.finish();
			break;
		case R.id.btnFaceSel:
			g=(ViewGroup) this.findViewById(R.id.pnlFaceList);
			if(g.getVisibility()==8)
				g.setVisibility(0);
			else
				g.setVisibility(8);

			break;
		case R.id.btnAtSel:
			g=(ViewGroup) this.findViewById(R.id.pnlSelectionList);
			if(g.getVisibility()==8)
			{				
				g.setVisibility(0);

				vv=g.findViewById(R.id.lstSelection);
				this.LoadListView((ListView) vv, this.GetAtList());
			}
			else
				g.setVisibility(8);

			break;
		case R.id.btnTopicSel:
			g=(ViewGroup) this.findViewById(R.id.pnlSelectionList);
			if(g.getVisibility()==8)
			{
				g.setVisibility(0);

				vv=g.findViewById(R.id.lstSelection);
				this.LoadListView((ListView) vv, this.GetTopicList());
			}
			else
				g.setVisibility(8);

			break;
		case R.id.btnSend:
			Send();
			break;
		}		

	}

	protected void Send()
	{

	}

	private ArrayList<String> GetAtList()
	{
		ArrayList<String> data=new ArrayList<String>();
		data.add("@Name1");
		data.add("@Name2");
		data.add("@Name3");

		return data;
	}

	private ArrayList<String> GetTopicList()
	{
		ArrayList<String> data=new ArrayList<String>();
		data.add("@Topic1");
		data.add("@Topic2");
		data.add("@Topic3");

		return data;
	}

	private void LoadListView(ListView lv,ArrayList<String> data)
	{
		ArrayAdapter<String> adp=new ArrayAdapter<String>(this,R.layout.list_item_simple,data);
		lv.setAdapter(adp);	
		lv.setOnItemClickListener(new OnItemClickListener()
		{

			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {

				OnListItemClick(arg0,arg1,arg2,arg3);
			}

		});
	}

	private void OnListItemClick(AdapterView<?> lv, View v, int pos,long arg3)
	{
		View pnl= this.findViewById(R.id.pnlSelectionList);
		pnl.setVisibility(8);
	}

}
