package by.vsu.mf;

import by.vsu.mf.R;
import by.vsu.mf.managers.GameManager;
import by.vsu.mf.player.ResourceStorage;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView textView;
	private Handler handler;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // загружаем виджет из ресурсов 
        textView = (TextView)findViewById(R.id.textView);
        handler = new Handler() {
    		@Override
    		public void handleMessage(Message msg) {
    			String text = (String) msg.obj;
    			textView.setText( text );
    		}
    	};
        Thread th = new Thread(new GameManager(this));
        th.start();              
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void setText(String text) {
    	Message msg = new Message();
    	msg.obj = text;
    	handler.sendMessage(msg);
    }
}
