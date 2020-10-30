package amcoders.tamiltech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    private LinearLayout transcriptLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        transcriptLayout = (LinearLayout) findViewById(R.id.transcript_llt);

        transcriptLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tIntent = new Intent(DashboardActivity.this, TranscriptActivity.class);
                startActivity(tIntent);
            }
        });
    }
}