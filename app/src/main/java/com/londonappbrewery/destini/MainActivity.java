package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

//     TODO: Steps 4 & 8 - Declare member variables here:

    TextView mStoryTextView;
    Button mTopButon;
    Button mBottomButton;
    int mStoryIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryIndex = 1;

        mStoryTextView = findViewById(R.id.storyTextView);
        mTopButon = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView.setText(R.string.T1_Story);
        mTopButon.setText(R.string.T1_Ans1);
        mBottomButton.setText(R.string.T1_Ans2);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if (mStoryIndex == 1 || mStoryIndex == 2 ) {
                        mStoryTextView.setText(R.string.T3_Story);
                        mTopButon.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                    } else if (mStoryIndex == 3){
                        mStoryTextView.setText(R.string.T6_End);
                        mTopButon.setVisibility(View.GONE);
                        mBottomButton.setVisibility(View.GONE);
                        mStoryIndex = 10;
                    }

            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 if (mStoryIndex == 1){
                     mStoryTextView.setText(R.string.T2_Story);
                     mTopButon.setText(R.string.T2_Ans1);
                     mBottomButton.setText(R.string.T2_Ans2);
                     mStoryIndex = 2;
                 } else if(mStoryIndex == 3){
                     mStoryTextView.setText(R.string.T5_End);
                     mTopButon.setVisibility(View.GONE);
                     mBottomButton.setVisibility(View.GONE);
                     mStoryIndex = 10;
                 } else if (mStoryIndex == 2){
                     mStoryTextView.setText(R.string.T4_End);
                     mTopButon.setVisibility(View.GONE);
                     mBottomButton.setVisibility(View.GONE);
                     mStoryIndex = 10;
                 }

            }
        });


    }
}
