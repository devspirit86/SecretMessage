 package com.devspirit.parttime.sm;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Menu extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	//===layout
	 private LinearLayout menu_bgLayout ;
	 private TableLayout menu_table ;
	 private TableRow menu_tablerow ;
	//===text
	 private TextView title ; 
	//===Button 
	 private ImageButton send ; 
	 private ImageButton read ; 
	 private ImageButton setting ; 
	 private ImageButton about ; 
	 private int button_size = 0;
	 private int windowHeight = 0;
	 private int windowWidth = 0;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化
	        setContentView(com.devspirit.parttime.sm.R.layout.main);
	        //========layout
	        menu_bgLayout =(LinearLayout)this.findViewById(com.devspirit.parttime.sm.R.id.menu_bglayout);
	        menu_table =(TableLayout)this.findViewById(com.devspirit.parttime.sm.R.id.menu_table);
	        menu_tablerow =(TableRow)this.findViewById(com.devspirit.parttime.sm.R.id.menu_tableRow);
	        //========text
	        this.title = (TextView)this.findViewById(com.devspirit.parttime.sm.R.id.title);
	        //========button
	        send = (ImageButton)this.findViewById(com.devspirit.parttime.sm.R.id.send) ;
	        read = (ImageButton)this.findViewById(com.devspirit.parttime.sm.R.id.read) ;
	        setting = (ImageButton)this.findViewById(com.devspirit.parttime.sm.R.id.setting) ;
	        about = (ImageButton)this.findViewById(com.devspirit.parttime.sm.R.id.about) ;
	        //设备
	        Display display = this.getWindowManager().getDefaultDisplay();
			this.windowHeight = display.getHeight();
			this.windowWidth = display.getWidth();
	        //初始
	        this.initMenu();
            //监听
	     	send.setOnClickListener(this);
	        read.setOnClickListener(this);
	        setting.setOnClickListener(this);
	        about.setOnClickListener(this);
        
    }
	public void initButton(ImageButton button){
		//初始化按钮
		button.setPadding(0, 0, 0, 0);
		button.setMaxHeight(this.button_size);
		button.setMaxWidth(this.button_size);
		button.setMinimumHeight(this.button_size);
		button.setMinimumWidth(this.button_size);
	} 
	public void initMenu(){
		//自适应menu界面
		//==================Text_title
		//==================Table
		this.menu_table.setPadding(10, 10, 10, 10);
		//==================button
		if(this.windowHeight>=this.windowWidth){
			this.button_size = this.windowWidth/4 ;
		}
		else{
			this.button_size = this.windowHeight/4 ;
		}
		this.initButton(this.send);
		this.initButton(this.read);
		this.initButton(this.setting);
		this.initButton(this.about);
		
		//==================button
		
		
	}
	public int getWidth(){
		return this.menu_bgLayout.getWidth() ;
	}
	public int getHeight(){
		return this.menu_bgLayout.getHeight() ;
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Uri uri = null ;
		switch(arg0.getId()){
		case com.devspirit.parttime.sm.R.id.send :{
			Intent intent = new Intent(this,Encode.class ); 
			this.startActivity(intent);
		} break ;
		case com.devspirit.parttime.sm.R.id.read :{
			Intent intent = new Intent(this,MessageList.class);
			this.startActivity(intent);
			} break ;
		case com.devspirit.parttime.sm.R.id.setting :{
			Intent intent = new Intent(this,Setting.class);
			this.startActivity(intent);
			}break ;
		case com.devspirit.parttime.sm.R.id.about :{
			Intent intent = new Intent(this,About.class);
			this.startActivity(intent);
			}break ;
		}
	}
	
    
}