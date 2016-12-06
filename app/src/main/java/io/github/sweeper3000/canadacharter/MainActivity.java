package io.github.sweeper3000.canadacharter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Go to Guarantee of Rights and Freedoms Activity
    public void toGuaranteeOfRightsAndFreedomsActivity(View view) {
        Intent guarantee_of_rights_and_freedoms = new Intent(MainActivity.this, GuaranteeOfRightsAndFreedomsActivity.class);
        startActivity(guarantee_of_rights_and_freedoms);
    }

    // Go to Fundamental Freedoms Activity
    public void toFundamentalFreedomsActivity(View view) {
        Intent fundamental_freedoms = new Intent(MainActivity.this, FundamentalFreedomsActivity.class);
        startActivity(fundamental_freedoms);
    }

    // Go to Democratic Rights Activity
    public void toDemocraticRightsActivity(View view) {
        Intent democratic_rights = new Intent(MainActivity.this, DemocraticRightsActivity.class);
        startActivity(democratic_rights);
    }

    // Go to Mobility Rights Activity
    public void toMobilityRightsActivity(View view) {
        Intent mobility_rights = new Intent(MainActivity.this, MobilityRightsActivity.class);
        startActivity(mobility_rights);
    }

    // Go to Legal Rights Activity
    public void toLegalRightsActivity(View view) {
        Intent legal_rights = new Intent(MainActivity.this, LegalRightsActivity.class);
        startActivity(legal_rights);
    }

    // Go to Equality Rights Activity
    public void toEqualityRightsActivity(View view) {
        Intent equality_rights = new Intent(MainActivity.this, RqualityRightsActivity.class);
        startActivity(equality_rights);
    }

    // Go to Official Languages of Canada Activity
    public void toOfficialLanguagesOfCanadaActivity(View view) {
        Intent official_languages = new Intent(MainActivity.this, OfficialLanguagesOfCanadaActivity.class);
        startActivity(official_languages);
    }
}
