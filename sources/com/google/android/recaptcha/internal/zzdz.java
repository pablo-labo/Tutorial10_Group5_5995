package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdz {
    public static final String zza(ContentResolver contentResolver) {
        Cursor cursorQuery = contentResolver.query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
        String strValueOf = "";
        if (cursorQuery != null && cursorQuery.moveToFirst() && cursorQuery.getColumnCount() >= 2) {
            try {
                strValueOf = String.valueOf(Long.parseLong(cursorQuery.getString(1)));
            } catch (Exception unused) {
            }
            cursorQuery.close();
        }
        return strValueOf;
    }
}
