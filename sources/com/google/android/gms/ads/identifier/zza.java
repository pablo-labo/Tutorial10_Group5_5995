package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.util.Log;
import defpackage.uz;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zza extends Thread {
    private final /* synthetic */ Map zzl;

    public zza(AdvertisingIdClient advertisingIdClient, Map map) {
        this.zzl = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String message;
        StringBuilder sb;
        String str;
        new zzc();
        Map map = this.zzl;
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str2 : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str2, (String) map.get(str2));
        }
        String string = builderBuildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 65);
                    sb2.append("Received non-success response code ");
                    sb2.append(responseCode);
                    sb2.append(" from pinging URL: ");
                    sb2.append(string);
                    Log.w("HttpUrlPinger", sb2.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            e = e;
            message = e.getMessage();
            sb = new StringBuilder(uz.c(uz.c(27, string), message));
            str = "Error while pinging URL: ";
            sb.append(str);
            sb.append(string);
            sb.append(". ");
            sb.append(message);
            Log.w("HttpUrlPinger", sb.toString(), e);
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            message = e.getMessage();
            sb = new StringBuilder(uz.c(uz.c(32, string), message));
            str = "Error while parsing ping URL: ";
            sb.append(str);
            sb.append(string);
            sb.append(". ");
            sb.append(message);
            Log.w("HttpUrlPinger", sb.toString(), e);
        } catch (RuntimeException e3) {
            e = e3;
            message = e.getMessage();
            sb = new StringBuilder(uz.c(uz.c(27, string), message));
            str = "Error while pinging URL: ";
            sb.append(str);
            sb.append(string);
            sb.append(". ");
            sb.append(message);
            Log.w("HttpUrlPinger", sb.toString(), e);
        }
    }
}
