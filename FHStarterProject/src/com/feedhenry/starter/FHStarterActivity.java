package com.feedhenry.starter;


import com.feedhenry.sdk.FH;
import com.feedhenry.sdk.FHActCallback;
import com.feedhenry.sdk.FHResponse;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FHStarterActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fhstarter);
        
        //call FH.init to initialize FH service
        FH.init(this, new FHActCallback() {
          
          @Override
          public void success(FHResponse resp) {
            //NOTE: other FH methods can only be called after FH.init succeeds
          }
          
          @Override
          public void fail(FHResponse arg0) {
            
          }
        });
        
//        final Button button = (Button) findViewById(R.id.button1);
//        button.setOnClickListener(new View.OnClickListener() 
//        {
//           public void onClick(View v) {
//        	   Intent i = new Intent(Intent.ACTION_MAIN);
//               PackageManager manager = getPackageManager();
//               i = manager.getLaunchIntentForPackage("com.unity3d.player");
//               i.addCategory(Intent.CATEGORY_LAUNCHER);
//               startActivity(i);
//            }
//       });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_fhstarter, menu);
        return true;
    }

    
}
