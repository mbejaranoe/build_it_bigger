package com.udacity.gradle.builditbigger;

import android.test.InstrumentationTestCase;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by Manolo on 16/12/2017.
 */

public class EndpointAsyncTaskTest extends InstrumentationTestCase {

    final CountDownLatch signal = new CountDownLatch(1);

    public void testAsync() throws Throwable {

        final EndpointAsyncTask task = new EndpointAsyncTask() {

            @Override
            protected String doInBackground(Void... voids) {
                return super.doInBackground(voids);
            }

            @Override
            protected void onPostExecute(String s) {
                assertNotNull(s);
                assertFalse(s.equals(""));
                signal.countDown();
            }
        };

        runTestOnUiThread(new Runnable() {
            @Override
            public void run() {
                task.execute();
            }
        });

        signal.await(30, TimeUnit.SECONDS);
    }
}
