package com.sromku.simple.storage.sample;

import android.app.Application;

import com.sromku.simple.storage.InternalStorage;
import com.sromku.simple.storage.SimpleStorage;
import com.sromku.simple.storage.SimpleStorageConfiguration;

/**
 * Created by ZkHaider on 10/3/16.
 */

public class SampleApplication extends Application {

    // Simple storage key
    private static final String IVX = "abcdefghijklmnop";
    private static final String SECRET_KEY = "secret1234567890";

    @Override
    public void onCreate() {
        super.onCreate();

        // Go ahead and setup simple storage here
        buildSimpleStorage();
    }

    private void buildSimpleStorage() {

        SimpleStorage.getInternalStorage(this);

        // build configuration
        SimpleStorageConfiguration configuration = new SimpleStorageConfiguration.Builder()
                .setEncryptContent(IVX, SECRET_KEY)
                .build();

        SimpleStorage.updateConfiguration(configuration);
    }

}
