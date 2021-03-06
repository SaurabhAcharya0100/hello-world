package com.varuasayrahca.creatingnotofications;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
public class MainActivity extends AppCompatActivity {
NotificationCompat.Builder notification;
    private static final int uniqueid=123456;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     notification= new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);
    }
    public  void sauravButtonClicked(View view)
    {
notification.setSmallIcon(R.drawable.sq);
        notification.setTicker("WELCOME SAURAV");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("I AM HERE");
        notification.setContentText("NICE TO MEET YOU ..   ");

        Intent intent =new Intent(this,MainActivity.class);
        PendingIntent pendingintent=PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
notification.setContentIntent(pendingintent);



        NotificationManager nm=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueid, notification.build());



    }
}
