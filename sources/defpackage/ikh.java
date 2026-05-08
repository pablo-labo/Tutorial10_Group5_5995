package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ikh {
    public final SharedPreferences a;
    public final ht0 b = new ht0();

    public ikh(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseInstanceId", "App restored, clearing state");
                b();
                ikh ikhVar = FirebaseInstanceId.i;
                FirebaseInstanceId.getInstance(pf5.c()).h();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e.getMessage());
                Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder("cre".length() + str.length() + 3);
        sb.append(str);
        sb.append("|S|cre");
        return sb.toString();
    }

    public static String d(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str3.length() + uz.c(str.length() + 4, str2));
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    public final synchronized void b() {
        this.b.clear();
        this.a.edit().clear().commit();
    }

    public final synchronized void c(String str) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean zContains = this.a.contains(a(str));
            SharedPreferences sharedPreferences = this.a;
            if (zContains) {
                String string = sharedPreferences.getString(a(str), null);
                if (string != null) {
                    try {
                        jCurrentTimeMillis = Long.parseLong(string);
                    } catch (NumberFormatException unused) {
                        jCurrentTimeMillis = 0;
                    }
                } else {
                    jCurrentTimeMillis = 0;
                }
            } else {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(a(str), String.valueOf(jCurrentTimeMillis));
                editorEdit.commit();
            }
            this.b.put(str, Long.valueOf(jCurrentTimeMillis));
        } catch (Throwable th) {
            throw th;
        }
    }
}
