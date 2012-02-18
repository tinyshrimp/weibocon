package weibocon.org.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import weibocon.org.R;
import java.util.List;
import java.util.Map;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class WeiboAdapter extends BaseAdapter 
{
	private Context context;
	private List<Map<String,Object>> listItems;
	private LayoutInflater listContainer;

	public final class ListItemView{
		public ImageView image;
		public TextView title;
		public TextView info;
		public CheckBox check;
		public Button detail;
	}

	public WeiboAdapter(Context context,List<Map<String,Object>> listItems)
	{
		this.context = context;
		listContainer = LayoutInflater.from(context);
		this.listItems = listItems;	
	}
	
	public int getCount() {
		// TODO Auto-generated method stub
		return listItems.size();
	}

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public View getView(int position, View convertView, ViewGroup parent)
	{
		ListItemView listItemView = null;
		if(convertView ==null)
		{
			listItemView = new ListItemView();
			convertView = listContainer.inflate(R.layout.list_item, null);
			//ｻﾃｿﾘｼ�ﾔﾏ�
			/*
			listItemView.image =(ImageView) convertView.findViewById(R.id.imageitem);
			listItemView.title =(TextView) convertView.findViewById(R.id.textview);
			listItemView.info =(TextView) convertView.findViewById(R.id.textview1);
			listItemView.detail=(Button) convertView.findViewById(R.id.button);
			listItemView.check = (CheckBox) convertView.findViewById(R.id.checkItem);
			*/
			//ﾉ靹ﾃｿﾕｼ莨ｯｵｽconvertView
			convertView.setTag(listItemView);
		}else
		{
			listItemView = (ListItemView) convertView.getTag();
		}
		
		//ﾉ靹ﾃﾎﾄﾗﾖﾍｼﾆｬ
		/*
		listItemView.image.setBackgroundResource((Integer)listItems.get(position).get("image"));
		listItemView.title.setText((String)listItems.get(position).get("title"));
		listItemView.info.setText((String) listItems.get(position).get("info"));
		listItemView.detail.setText("ｱｾｲﾋｽ鯔ﾜ");
		*/
			
		return convertView;
	}

}


