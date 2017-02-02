package ua.matvienko_apps.whetherinyourhands.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by alex_ on 26-Aug-16.
 */
public class WeatherAuthenticatorService extends Service {
    private WeatherAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        mAuthenticator = new WeatherAuthenticator(this);
    }


    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}