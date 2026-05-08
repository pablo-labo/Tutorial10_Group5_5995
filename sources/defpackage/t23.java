package defpackage;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class t23 {
    public Object a;
    public Object b;

    public String a(String str) {
        String str2 = (String) this.b;
        Resources resources = (Resources) this.a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void b() throws IOException {
        String str = (String) this.a;
        if (((FileChannel) this.b) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.b = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.b;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.b = null;
            ja.m(l5.m("Unable to lock file: '", str, "'."), th);
        }
    }

    public void c(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            u20 u20Var = "clx".equals(bundle2.getString("_o")) ? (vh1) this.a : (gm1) this.b;
            if (u20Var == null) {
                return;
            }
            u20Var.b(string, bundle2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    public Object d() {
        brh brhVar = (brh) this.a;
        String str = (String) this.b;
        ContentResolver contentResolver = brhVar.a.getContentResolver();
        Uri uri = gqh.a;
        synchronized (gqh.class) {
            try {
                int i = 0;
                if (gqh.f == null) {
                    gqh.e.set(false);
                    gqh.f = new HashMap<>();
                    gqh.k = new Object();
                    gqh.l = false;
                    contentResolver.registerContentObserver(gqh.a, true, new cqh(i, ));
                } else if (gqh.e.getAndSet(false)) {
                    gqh.f.clear();
                    gqh.g.clear();
                    gqh.h.clear();
                    gqh.i.clear();
                    gqh.j.clear();
                    gqh.k = new Object();
                    gqh.l = false;
                }
                Object obj = gqh.k;
                if (gqh.f.containsKey(str)) {
                    String str2 = gqh.f.get(str);
                    return str2 != null ? str2 : null;
                }
                for (String str3 : gqh.m) {
                    if (str.startsWith(str3)) {
                        if (!gqh.l || gqh.f.isEmpty()) {
                            String[] strArr = gqh.m;
                            HashMap<String, String> map = gqh.f;
                            Cursor cursorQuery = contentResolver.query(gqh.b, null, null, strArr, null);
                            TreeMap treeMap = new TreeMap();
                            if (cursorQuery != null) {
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        treeMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                    } finally {
                                        cursorQuery.close();
                                    }
                                }
                            }
                            map.putAll(treeMap);
                            gqh.l = true;
                            if (gqh.f.containsKey(str)) {
                                String str4 = gqh.f.get(str);
                                return str4 != null ? str4 : null;
                            }
                        }
                        return null;
                    }
                }
                Cursor cursorQuery2 = contentResolver.query(gqh.a, null, null, new String[]{str}, null);
                if (cursorQuery2 == null) {
                    if (cursorQuery2 != null) {
                        cursorQuery2.close();
                    }
                    return null;
                }
                try {
                    if (!cursorQuery2.moveToFirst()) {
                        synchronized (gqh.class) {
                            try {
                                if (obj == gqh.k) {
                                    gqh.f.put(str, null);
                                }
                            } finally {
                            }
                        }
                        cursorQuery2.close();
                        return null;
                    }
                    String string = cursorQuery2.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    synchronized (gqh.class) {
                        try {
                            if (obj == gqh.k) {
                                gqh.f.put(str, string);
                            }
                        } finally {
                        }
                    }
                     = string != null ? string : 0;
                    cursorQuery2.close();
                    return ;
                } finally {
                }
                cursorQuery2.close();
            } finally {
            }
        }
    }
}
