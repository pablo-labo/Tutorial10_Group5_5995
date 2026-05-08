package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;

/* JADX INFO: loaded from: classes.dex */
public final class o84 {
    public static boolean a(ReactApplicationContext reactApplicationContext, Uri uri) throws Throwable {
        if (reactApplicationContext.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String strE = e(reactApplicationContext, uri, "mime_type");
        int iD = (int) d(reactApplicationContext, uri, "flags", 0L);
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        if ((iD & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(strE) || (iD & 8) == 0) {
            return (TextUtils.isEmpty(strE) || (iD & 2) == 0) ? false : true;
        }
        return true;
    }

    public static void b(Cursor cursor) {
        if (cursor != null) {
            try {
                s40.h(cursor);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean c(ReactApplicationContext reactApplicationContext, Uri uri) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = reactApplicationContext.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
                boolean z = cursorQuery.getCount() > 0;
                b(cursorQuery);
                return z;
            } catch (Exception e) {
                Log.w("DocumentFile", "Failed query: " + e);
                b(cursorQuery);
                return false;
            }
        } catch (Throwable th) {
            b(cursorQuery);
            throw th;
        }
    }

    public static long d(ReactApplicationContext reactApplicationContext, Uri uri, String str, long j) {
        ContentResolver contentResolver = reactApplicationContext.getContentResolver();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    b(cursorQuery);
                    return j;
                }
                long j2 = cursorQuery.getLong(0);
                b(cursorQuery);
                return j2;
            } catch (Exception e) {
                Log.w("DocumentFile", "Failed query: " + e);
                b(cursorQuery);
                return j;
            }
        } catch (Throwable th) {
            b(cursorQuery);
            throw th;
        }
        b(cursorQuery);
        throw th;
    }

    public static String e(ReactApplicationContext reactApplicationContext, Uri uri, String str) throws Throwable {
        Cursor cursorQuery;
        Throwable th;
        Exception exc;
        try {
            cursorQuery = reactApplicationContext.getContentResolver().query(uri, new String[]{str}, null, null, null);
        } catch (Exception e) {
            exc = e;
            cursorQuery = null;
        } catch (Throwable th2) {
            cursorQuery = null;
            th = th2;
        }
        try {
            try {
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    b(cursorQuery);
                    return null;
                }
                String string = cursorQuery.getString(0);
                b(cursorQuery);
                return string;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e2) {
            exc = e2;
            Log.w("DocumentFile", "Failed query: " + exc);
            b(cursorQuery);
            return null;
        }
        th = th3;
        b(cursorQuery);
        throw th;
    }
}
