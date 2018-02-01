package comt.example.administrator.hello_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

//activity周期
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton img=findViewById(R.id.imageButton);
        img.setBackgroundResource(R.drawable.fire1);

        Log.i("Activity LifeCycle","onCreate was called");//onCreate之后都是按照顺序来


    }

    protected void onStop(){//调用按照顺序，方法可以没有顺序
        super.onStop();
        Log.i("Activity LifeCycle","onStop was called");//是按照顺序来de

    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Activity LifeCycle","onDestroy was called");//是按照顺序来de

    }

    protected void onStart(){//myth:和构造类似
        super.onStart();
        Log.i("Activity LifeCycle","onStart was called");//是按照顺序来de

    }

    protected void onPause() {
        super.onPause();
        Log.i("Activity LifeCycle","onPause was called");//是按照顺序来de
    }

    protected void onResume(){
        super.onResume();
        Log.i("Activity LifeCycle","onResume was called");//是按照顺序来de

    }
    protected void onRestart(){
        super.onRestart();
        Log.i("Activity LifeCycle","onRestart was called");//是按照顺序来de

    }


    public void onclickButton(View view) {
        ImageButton img=findViewById(R.id.imageButton);



        if (view.getId()== R.id.fireOne){
             img.setBackgroundResource(R.drawable.fire1);
        }
        else if (view.getId()== R.id.firTwo){
            img.setBackgroundResource(R.drawable.fire2);
        }
        else if (view.getId()== R.id.fireThree){
            img.setBackgroundResource(R.drawable.fire3);
        }
        else if (view.getId()== R.id.fireFour){
            img.setBackgroundResource(R.drawable.fire4);
        }
    }
}
