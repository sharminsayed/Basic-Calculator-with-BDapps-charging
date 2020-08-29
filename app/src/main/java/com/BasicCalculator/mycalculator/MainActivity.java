package com.BasicCalculator.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.sharmin.charging.AdsLib;
import com.sharmin.charging.SP;

import static com.sharmin.charging.SP.getSubCode;
import static com.sharmin.charging.SP.setSubCode;


public class MainActivity extends AppCompatActivity {
    AdsLib adsLib;

    double in1 = 0, i2 = 0;
    TextView edittext1;
    boolean Add, Sub, Multiply, Divide, Remainder, deci;
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_Add, button_Sub,
            button_Mul, button_Div, button_Equ, button_Del, button_Dot, button_Remainder;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adsLib= ChargingInstance.getAdsLib();
        adsLib.checkSubStatus(getSubCode());

        button_0 = (Button) findViewById(R.id.b0);
        button_1 = (Button) findViewById(R.id.b1);
        button_2 = (Button) findViewById(R.id.b2);
        button_3 = (Button) findViewById(R.id.b3);
        button_4 = (Button) findViewById(R.id.b4);
        button_5 = (Button) findViewById(R.id.b5);
        button_6 = (Button) findViewById(R.id.b6);
        button_7 = (Button) findViewById(R.id.b7);
        button_8 = (Button) findViewById(R.id.b8);
        button_9 = (Button) findViewById(R.id.b9);
        button_Dot = (Button) findViewById(R.id.bDot);
        button_Add = (Button) findViewById(R.id.badd);
        button_Sub = (Button) findViewById(R.id.bsub);
        button_Mul = (Button) findViewById(R.id.bmul);
        button_Div = (Button) findViewById(R.id.biv);
        button_Remainder = (Button) findViewById(R.id.BRemain);
        button_Del = (Button) findViewById(R.id.buttonDel);
        button_Equ = (Button) findViewById(R.id.buttoneql);

        edittext1 = (TextView) findViewById(R.id.display);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "6");
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "7");
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "8");
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "9");
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "0");
            }
        });

        button_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    Add = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        button_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    Sub = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        button_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    Multiply = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        button_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    Divide = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        button_Remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    Remainder = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        button_Equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Add || Sub || Multiply || Divide || Remainder) {
                    i2 = Float.parseFloat(edittext1.getText() + "");
                }

                if (Add) {

                    edittext1.setText(in1 + i2 + "");
                    Add = false;
                }

                if (Sub) {

                    edittext1.setText(in1 - i2 + "");
                    Sub = false;
                }

                if (Multiply) {
                    edittext1.setText(in1 * i2 + "");
                    Multiply = false;
                }

                if (Divide) {
                    edittext1.setText(in1 / i2 + "");
                    Divide = false;
                }
                if (Remainder) {
                    edittext1.setText(in1 % i2 + "");
                    Remainder = false;
                }
            }
        });

        button_Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SP.getSubscriptionStatus()){
                    showDialog((Activity)MainActivity.this);
                }else {
                    edittext1.setText("");
                    in1 = 0.0;
                    i2 = 0.0;
                }

            }
        });

        button_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (deci) {
                    //do nothing or you can show the error
                } else {
                    edittext1.setText(edittext1.getText() + ".");
                    deci = true;
                }

            }
        });
    }

    public void showDialog(final Activity activity) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setContentView(R.layout.sub);




        final TextView textView_sub = dialog.findViewById(R.id.textView_sub);
        final TextView textView_sub1 = dialog.findViewById(R.id.textView_sub1);

        Button button_s_daily = dialog.findViewById(R.id.button_s_daily);
        Button button_s_daily_api = dialog.findViewById(R.id.button_s_daily_api);
        final Button bt_send_sms = dialog.findViewById(R.id.bt_send_sms);
        final Button submit_code = dialog.findViewById(R.id.submit_code);

        final LinearLayout ll_sub = dialog.findViewById(R.id.ll_sub);
        final LinearLayout ll_sub_1 = dialog.findViewById(R.id.ll_sub_1);
        final EditText otp_code = dialog.findViewById(R.id.otp_code);


        button_s_daily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView_sub.setText("সাবস্ক্রাইব করতে আপনার মোবাইল নাম্বার দিন");
                textView_sub1.setText("শুধুমাত্র রবি এবং এয়ারটেল গ্রাহকদের জন্য");
                // ll_sub.setVisibility(View.VISIBLE);
                ll_sub_1.setVisibility(View.GONE);
                bt_send_sms.setVisibility(View.VISIBLE);
                adsLib.subscribe();

            }
        });

        button_s_daily_api.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //call sub api
            }
        });

        bt_send_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("smsto:21213");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "start "+ ChargingInstance.MSG_TEXT);
                activity.startActivity(intent);
                dialog.dismiss();
            }
        });


        submit_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Clicked Laugh Vote", Toast.LENGTH_SHORT).show();
                setSubCode(otp_code.getText().toString().isEmpty() ? "111111" : otp_code.getText().toString());
                adsLib.checkSubStatus(otp_code.getText().toString().isEmpty() ? "111111" : otp_code.getText().toString());
                dialog.dismiss();
            }
        });

        Button dialogButton = (Button) dialog.findViewById(R.id.video_ad);

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


        dialog.show();

    }
}
