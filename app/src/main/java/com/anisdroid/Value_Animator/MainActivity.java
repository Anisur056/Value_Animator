package com.anisdroid.Value_Animator;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.animation.*;
import android.graphics.*;

public class MainActivity extends Activity 
{
	
	LinearLayout lll;
	Button bt_1,bt_2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		lll = (LinearLayout) findViewById(R.id.bgColor);
		bt_1 = (Button) findViewById(R.id.button_1);
		bt_2 = (Button) findViewById(R.id.button_2);
		
		bt_1.setOnClickListener(
		
			new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					
					ValueAnimator va = new ValueAnimator();
					va.setIntValues(Color.parseColor("#f44336"),
									Color.parseColor("#9c27b0"));
									
					va.setEvaluator(new ArgbEvaluator());
					va.addUpdateListener(
					
						new ValueAnimator.AnimatorUpdateListener(){

							@Override
							public void onAnimationUpdate(ValueAnimator p1)
							{
								// TODO: Implement this method
								
								lll.setBackgroundColor((Integer) p1.getAnimatedValue());
								
							}

							
						}
					
					);
					
					va.setDuration(4000);
					va.start();
					
				}

				
			}
		
		);
		
		
		bt_2.setOnClickListener(

			new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method

					ValueAnimator va = new ValueAnimator();
					va.setIntValues(Color.parseColor("#ffffff"),
									Color.parseColor("#ff9900"));

					va.setEvaluator(new ArgbEvaluator());
					va.addUpdateListener(

						new ValueAnimator.AnimatorUpdateListener(){

							@Override
							public void onAnimationUpdate(ValueAnimator p1)
							{
								// TODO: Implement this method

								lll.setBackgroundColor((Integer) p1.getAnimatedValue());

							}


						}

					);

					va.setDuration(4000);
					va.start();

				}


			}

		);
		
		
    }
}
