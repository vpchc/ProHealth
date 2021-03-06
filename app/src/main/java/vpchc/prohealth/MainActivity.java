package vpchc.prohealth;

import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.content.Intent;
import android.app.Dialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        View callImage = findViewById(R.id.callButton);
        View providersImage = findViewById(R.id.providerButton);
        View locationsImage = findViewById(R.id.locationsButton);
        View formsImage = findViewById(R.id.formsButton);
        View portalImage = findViewById(R.id.portalButton);
        View programsImage = findViewById(R.id.programsButton);
        View trackerImage = findViewById(R.id.trackerButton);
        View jobsImage = findViewById(R.id.jobsButton);
        View facebookImage = findViewById(R.id.facebookButton);


        callImage.setOnClickListener(homeListener);
        providersImage.setOnClickListener(homeListener);
        locationsImage.setOnClickListener(homeListener);
        formsImage.setOnClickListener(homeListener);
        portalImage.setOnClickListener(homeListener);
        programsImage.setOnClickListener(homeListener);
        trackerImage.setOnClickListener(homeListener);
        jobsImage.setOnClickListener(homeListener);
        facebookImage.setOnClickListener(homeListener);
    }

    private View.OnClickListener homeListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.callButton:
                    ImageView homeButton = (ImageView) findViewById(R.id.callButton);
                    homeButton.setImageResource(R.drawable.call_on);
                    callPopup();
                    break;
                case R.id.providerButton:
                    ImageView providerButton = (ImageView) findViewById(R.id.providerButton);
                    providerButton.setImageResource(R.drawable.providers_on);
                    break;
                case R.id.locationsButton:
                    ImageView locationsButton = (ImageView) findViewById(R.id.locationsButton);
                    locationsButton.setImageResource(R.drawable.locations_on);
                    break;
                case R.id.formsButton:
                    ImageView formsButton = (ImageView) findViewById(R.id.formsButton);
                    formsButton.setImageResource(R.drawable.forms_on);
                    break;
                case R.id.portalButton:
                    ImageView portalButton = (ImageView) findViewById(R.id.portalButton);
                    portalButton.setImageResource(R.drawable.portal_on);
                    String portalUrl = "https://secure2.myunionportal.org/vpchc/default.aspx";
                    Intent portalLink = new Intent(Intent.ACTION_VIEW);
                    portalLink.setData(Uri.parse(portalUrl));
                    startActivity(portalLink);
                    break;
                case R.id.programsButton:
                    ImageView programsButton = (ImageView) findViewById(R.id.programsButton);
                    programsButton.setImageResource(R.drawable.programs_on);
                    break;
                case R.id.trackerButton:
                    ImageView trackerButton = (ImageView) findViewById(R.id.trackerButton);
                    trackerButton.setImageResource(R.drawable.tracker_on);
                    break;
                case R.id.jobsButton:
                    ImageView jobsButton = (ImageView) findViewById(R.id.jobsButton);
                    jobsButton.setImageResource(R.drawable.jobs_on);
                    break;
                case R.id.facebookButton:
                    ImageView facebookButton = (ImageView) findViewById(R.id.facebookButton);
                    facebookButton.setImageResource(R.drawable.facebook_on);
                    String facebookUrl = "https://www.facebook.com/VPCHC";
                    Intent facebookLink = new Intent(Intent.ACTION_VIEW);
                    facebookLink.setData(Uri.parse(facebookUrl));
                    startActivity(facebookLink);
                    break;
                default:
                    break;
            }
        }
    };

    private boolean callPopup(){
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.call_dialog);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
