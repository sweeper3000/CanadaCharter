package io.github.sweeper3000.canadacharter;

import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.graphics.Color;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    // Go to GitHub

        public void toGitHub(View view) {
            final String GITHUB = "https://github.com/sweeper3000/CanadaCharter";
            final int CUSTOM_TABS_TOOLBAR_COLOR = Color.parseColor("#F44336");

            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            CustomTabsIntent github_intent = builder.build();
            builder.setToolbarColor(CUSTOM_TABS_TOOLBAR_COLOR);
            builder.addDefaultShareMenuItem();
            github_intent.launchUrl(this, Uri.parse(GITHUB));
        }
}
