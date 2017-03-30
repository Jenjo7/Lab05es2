package it.unibo.studio.savini.gianni.lab05es2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RunnableFuture;

/**
 * Created by gianni.savini on 30/03/2017.
 */
public class MyService extends Service {

    private String TAG = "MyService";
    //Così non dà errori quando viene passato come argomento
    private ArrayList<String> list;

    @Override
    public void onCreate() {
        super.onCreate();

        list = new ArrayList<>();
        list.add("Primo");
        list.add("Secondo");
        list.add("Terzo");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.i(TAG, "onStartCommand");

        new Thread(new Runnable() {
            @Override
            public void run() {
                //Questa Istruzione vuole il try catch
                try {
                    //aspetto 5 sec
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Intent intentBroadcast = new Intent();
                //intentBroadcast.setAction(MainActivity)

            }
        }).start();

        return START_NOT_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
