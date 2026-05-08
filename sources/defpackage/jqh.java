package defpackage;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import defpackage.ht0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class jqh {
    public static final ht0 g = new ht0();
    public static final String[] h = {"key", "value"};
    public final ContentResolver a;
    public final Uri b;
    public final nqh c;
    public final Object d;
    public volatile Map<String, String> e;
    public final ArrayList f;

    public jqh(ContentResolver contentResolver, Uri uri) {
        nqh nqhVar = new nqh(this);
        this.c = nqhVar;
        this.d = new Object();
        this.f = new ArrayList();
        this.a = contentResolver;
        this.b = uri;
        contentResolver.registerContentObserver(uri, false, nqhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static jqh b(ContentResolver contentResolver, Uri uri) {
        jqh jqhVar;
        synchronized (jqh.class) {
            ht0 ht0Var = g;
            jqhVar = (jqh) ht0Var.get(uri);
            if (jqhVar == null) {
                try {
                    jqh jqhVar2 = new jqh(contentResolver, uri);
                    try {
                        ht0Var.put(uri, jqhVar2);
                    } catch (SecurityException unused) {
                    }
                    jqhVar = jqhVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return jqhVar;
    }

    public static synchronized void c() {
        try {
            for (jqh jqhVar : (ht0.e) g.values()) {
                jqhVar.a.unregisterContentObserver(jqhVar.c);
            }
            g.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Map<String, String> a() {
        Map<String, String> map;
        Object objA;
        Map<String, String> map2 = this.e;
        if (map2 == null) {
            synchronized (this.d) {
                try {
                    map2 = this.e;
                    if (map2 == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                c00 c00Var = new c00(this);
                                try {
                                    objA = c00Var.a();
                                } catch (SecurityException unused) {
                                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                                    try {
                                        objA = c00Var.a();
                                    } finally {
                                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                                    }
                                }
                                map = (Map) objA;
                            } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                                Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                map = null;
                            }
                            this.e = map;
                            map2 = map;
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    }
                } finally {
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }
}
