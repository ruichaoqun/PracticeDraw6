package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice03Scale extends RelativeLayout {
    Button animateBt;
    ImageView imageView;

    public Practice03Scale(Context context) {
        super(context);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    int i;
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                switch (i%6){
                    case 0:
                        imageView.animate().scaleY(0.5f).start();
                        break;
                    case 1:
                        imageView.animate().scaleY(1).start();
                        break;
                    case 2:
                        imageView.animate().scaleX(0.5f).start();
                        break;
                    case 3:
                        imageView.animate().scaleX(1).start();
                        break;
                    case 4:
                        imageView.animate().scaleX(0.5f).scaleY(0.5f).start();
                        break;
                    case 5:
                        imageView.animate().scaleX(1).scaleY(1).start();
                        break;
                    default:
                }
                i++;
            }
        });
    }
}
