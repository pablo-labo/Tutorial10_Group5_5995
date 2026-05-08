package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.datadog.android.rum.internal.domain.RumContext;
import defpackage.y9e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class u8e {
    public static final a q = new a();
    public boolean a;
    public final String b;
    public volatile int c;
    public volatile int d;
    public y9e e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public volatile boolean h;
    public final long i;
    public final long j;
    public Runnable k;
    public Runnable l;
    public Runnable m;
    public Runnable n;
    public yq2<y9e> o;
    public final SharedPreferences p;

    public static final class a {
        public final synchronized u8e a(Context context, long j, long j2, TimeUnit timeUnit, Runnable[] runnableArr, boolean z) {
            u8e u8eVar;
            try {
                context.getClass();
                timeUnit.getClass();
                u8eVar = new u8e(j, j2, timeUnit, context, z);
                Runnable[] runnableArr2 = {null, null, null, null};
                if (runnableArr != null && runnableArr.length == 4) {
                    runnableArr2 = runnableArr;
                }
                u8eVar.k = runnableArr2[0];
                u8eVar.l = runnableArr2[1];
                u8eVar.m = runnableArr2[2];
                u8eVar.n = runnableArr2[3];
            } catch (Throwable th) {
                throw th;
            }
            return u8eVar;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public u8e(long j, long j2, TimeUnit timeUnit, Context context, boolean z) {
        String string;
        timeUnit.getClass();
        context.getClass();
        this.a = z;
        this.f = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.g = atomicBoolean;
        this.i = timeUnit.toMillis(j);
        this.j = timeUnit.toMillis(j2);
        this.h = true;
        atomicBoolean.set(!this.a);
        String strConcat = "snowplow_session_vars_".concat(new pxc("[^a-zA-Z0-9_]+").e("appTracker", "-"));
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            HashMap mapB = b(context, strConcat);
            if (mapB == null) {
                c49.d("u8e", "No previous session info available", new Object[0]);
            } else {
                this.e = y9e.a.a(mapB);
            }
            a aVar = q;
            y9e y9eVar = this.e;
            synchronized (aVar) {
                if (y9eVar != null) {
                    try {
                        string = y9eVar.f;
                        if (string == null) {
                            yjg yjgVar = yjg.a;
                            string = UUID.randomUUID().toString();
                            string.getClass();
                        }
                    } finally {
                    }
                } else {
                    yjg yjgVar2 = yjg.a;
                    string = UUID.randomUUID().toString();
                    string.getClass();
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("snowplow_general_vars", 0);
                String string2 = sharedPreferences.getString("SPInstallationUserId", null);
                if (string2 != null) {
                    string = string2;
                } else {
                    sharedPreferences.edit().putString("SPInstallationUserId", string).commit();
                }
            }
            this.b = string;
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(strConcat, 0);
            sharedPreferences2.getClass();
            this.p = sharedPreferences2;
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            c49.e("u8e", "Tracker Session Object created.", new Object[0]);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    public static void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        try {
            runnable.run();
        } catch (Exception unused) {
            c49.b("u8e", "Session event callback failed", new Object[0]);
        }
    }

    public static HashMap b(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                if (!sharedPreferences.contains(RumContext.SESSION_STATE)) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    return null;
                }
                HashMap map = new HashMap();
                String string = sharedPreferences.getString(RumContext.SESSION_STATE, null);
                JSONObject jSONObject = string != null ? new JSONObject(string) : null;
                Iterator<String> itKeys = jSONObject != null ? jSONObject.keys() : null;
                while (itKeys != null) {
                    if (!itKeys.hasNext()) {
                        break;
                    }
                    String next = itKeys.next();
                    map.put(next, jSONObject.get(next));
                }
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return map;
            } catch (JSONException e) {
                e.printStackTrace();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return null;
            }
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    public final void c() {
        y9e y9eVar = this.e;
        if (y9eVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(y9eVar.a());
            Long l = y9eVar.i;
            if (l != null) {
                linkedHashMap.put("lastUpdate", Long.valueOf(l.longValue()));
            }
            String string = new JSONObject(linkedHashMap).toString();
            string.getClass();
            SharedPreferences.Editor editorEdit = this.p.edit();
            editorEdit.putString(RumContext.SESSION_STATE, string);
            editorEdit.apply();
        }
    }

    public final void d(boolean z) {
        c49.a("u8e", "Session is suspended: %s", Boolean.valueOf(z));
        this.h = !z;
    }

    public final synchronized void e(long j, String str) {
        try {
            this.g.set(false);
            y9e y9eVar = this.e;
            if (y9eVar == null) {
                String strC = yjg.c(j);
                String string = UUID.randomUUID().toString();
                string.getClass();
                this.e = new y9e(str, strC, string, null, 1, this.b, "LOCAL_STORAGE", null, null);
            } else {
                y9eVar.b(j, str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
