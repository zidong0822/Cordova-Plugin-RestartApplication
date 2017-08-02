/*
 * Cordova restart aplication
 * Cordova 2.2.0
 * Email: rodrigo[dot]gontijo[at]hotmail[dot]com
 * Author: Rodrigo Augusto Gontijo
 * Date: 05/27/2016
 */

package com.rodrigo.plugins.restartApplication;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;
import android.content.Intent;
import android.provider.Settings;


import android.content.Context;
import android.media.*;

public class RestartApplication extends CordovaPlugin {

    public static final String SET = "restartApplication";
    private static final String TAG = "RestartApplication";

    private Context context;
    private Context basecontext;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        boolean actionState = true;
        context = cordova.getActivity().getApplicationContext();
        basecontext = cordova.getActivity().getBaseContext();

        if (SET.equals(action)) {
            try {
                //Intent to restart application
                Intent intent = basecontext.getPackageManager()
                        .getLaunchIntentForPackage( basecontext.getPackageName() );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                cordova.getActivity().finish();
                this.cordova.startActivityForResult((CordovaPlugin) this,intent, 0);
                
            } catch (Exception e) {
                LOG.d(TAG, "Error restarting apllication " + e);
                actionState = false;
            }
        } else {
            actionState = false;
        }
        return actionState;
    }

}
