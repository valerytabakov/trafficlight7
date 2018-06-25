package ua.tabakov.trafficlight;

import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// до метода onCreate()
    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        mInfoTextView = (TextView) findViewById(R.id.textViewInfo);
    }

    public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.red);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
    }
    public void onYellowButtonClick(View view) {
        mInfoTextView.setText(R.string.yellow);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
    }
    public void onGreenButtonClick(View view) {
        mInfoTextView.setText(R.string.green);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
    }
}
