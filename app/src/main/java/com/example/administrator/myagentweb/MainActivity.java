package com.example.administrator.myagentweb;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.just.agentweb.AgentWeb;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout mLinearLayout = (LinearLayout) this.findViewById(R.id.container);

        AgentWeb mAgentWeb = AgentWeb.with(this)
                .setAgentWebParent(mLinearLayout, new LinearLayout.LayoutParams(-1, -1))
                .useDefaultIndicator()
                .createAgentWeb()
                .ready()
                .go("http://www.jd.com");
    }
}
