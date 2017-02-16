package io.github.sweeper3000.canadacharter;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.view.MenuInflater;
import android.graphics.Color;


public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    // Menu
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_aboutactivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        final String GET_APP_STRING = "Get Canada Charter, an app to display the Canadian Charter of Rights and Freedoms at: ";
        switch (item.getItemId()) {
            case R.id.spread_the_word:
                Intent share_app = new Intent(Intent.ACTION_SEND);
                share_app.putExtra(Intent.EXTRA_TEXT, GET_APP_STRING);
                share_app.setType("text/plain");
                startActivity(share_app);
        }
        return true;
    } */

    public boolean isInstalled(String pkg) {
        PackageManager pm = getPackageManager();
        try {
            pm.getPackageInfo(pkg, PackageManager.GET_ACTIVITIES);
            return true;
        }
        catch (PackageManager.NameNotFoundException noChrome) {
            return false;
        }
    }

    // Go to GitHub

    public void toGitHub(View view) {
        final String GITHUB = "https://github.com/sweeper3000/CanadaCharter";
        final int CUSTOM_TABS_TOOLBAR_COLOR = Color.parseColor("#F44336");

        boolean isChromeInstalled = isInstalled("com.android.chrome");

        // Use Chrome Custom Tabs if Android is Jellybean or Above
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN || !isChromeInstalled) {
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            CustomTabsIntent github_intent = builder.build();
            builder.setToolbarColor(CUSTOM_TABS_TOOLBAR_COLOR);
            builder.addDefaultShareMenuItem();
            github_intent.launchUrl(this, Uri.parse(GITHUB));
        }
        // Open in browser if below Jellybean or if Chrome is not installed
        else {
            Intent github_intent_fallback = new Intent(Intent.ACTION_VIEW);
            github_intent_fallback.setData(Uri.parse(GITHUB));
            startActivity(github_intent_fallback);
        }
    }
}
