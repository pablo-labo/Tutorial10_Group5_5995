package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.net.TrafficStats;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import defpackage.b7e;
import defpackage.c31;
import defpackage.cn8;
import defpackage.dg7;
import defpackage.ekg;
import defpackage.f4d;
import defpackage.fib;
import defpackage.gg2;
import defpackage.j07;
import defpackage.j6c;
import defpackage.jic;
import defpackage.k06;
import defpackage.k31;
import defpackage.ln2;
import defpackage.lnf;
import defpackage.m50;
import defpackage.mse;
import defpackage.pf5;
import defpackage.q8b;
import defpackage.qx0;
import defpackage.tf5;
import defpackage.u31;
import defpackage.vf5;
import defpackage.w74;
import defpackage.zz5;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements vf5 {
    public static final Object m = new Object();
    public final pf5 a;
    public final tf5 b;
    public final q8b c;
    public final ekg d;
    public final cn8<j07> e;
    public final jic f;
    public final Object g;
    public final ExecutorService h;
    public final b7e i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public a(final pf5 pf5Var, j6c j6cVar, ExecutorService executorService, b7e b7eVar) {
        pf5Var.a();
        tf5 tf5Var = new tf5(pf5Var.a, j6cVar);
        q8b q8bVar = new q8b(pf5Var);
        if (w74.j0 == null) {
            w74.j0 = new w74(27);
        }
        w74 w74Var = w74.j0;
        if (ekg.c == null) {
            ekg.c = new ekg(w74Var);
        }
        ekg ekgVar = ekg.c;
        cn8<j07> cn8Var = new cn8<>(new j6c() { // from class: uf5
            @Override // defpackage.j6c
            public final Object get() {
                return new j07(pf5Var);
            }
        });
        jic jicVar = new jic();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = pf5Var;
        this.b = tf5Var;
        this.c = q8bVar;
        this.d = ekgVar;
        this.e = cn8Var;
        this.f = jicVar;
        this.h = executorService;
        this.i = b7eVar;
    }

    @Override // defpackage.vf5
    public final Task a() {
        d();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zz5 zz5Var = new zz5(this.d, taskCompletionSource);
        synchronized (this.g) {
            this.l.add(zz5Var);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new m50(this, 5));
        return task;
    }

    /* JADX WARN: Finally extract failed */
    public final void b() {
        k31 k31VarC;
        synchronized (m) {
            try {
                pf5 pf5Var = this.a;
                pf5Var.a();
                ln2 ln2VarD = ln2.d(pf5Var.a);
                try {
                    k31VarC = this.c.c();
                    q8b.a aVar = k31VarC.c;
                    if (aVar == q8b.a.b || aVar == q8b.a.a) {
                        String strE = e(k31VarC);
                        q8b q8bVar = this.c;
                        k31.a aVarH = k31VarC.h();
                        aVarH.a = strE;
                        aVarH.b = q8b.a.c;
                        k31VarC = aVarH.a();
                        q8bVar.b(k31VarC);
                    }
                    if (ln2VarD != null) {
                        ln2VarD.e();
                    }
                } catch (Throwable th) {
                    if (ln2VarD != null) {
                        ln2VarD.e();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h(k31VarC);
        this.i.execute(new qx0(this, 5));
    }

    public final k31 c(k31 k31Var) {
        int responseCode;
        u31 u31VarF;
        tf5 tf5Var = this.b;
        pf5 pf5Var = this.a;
        pf5Var.a();
        String str = pf5Var.c.a;
        String str2 = k31Var.b;
        pf5 pf5Var2 = this.a;
        pf5Var2.a();
        String str3 = pf5Var2.c.g;
        String str4 = k31Var.e;
        FirebaseInstallationsException.a aVar = FirebaseInstallationsException.a.b;
        f4d f4dVar = tf5Var.c;
        if (!f4dVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", aVar);
        }
        URL urlA = tf5.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = tf5Var.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    tf5.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    f4dVar.b(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    u31VarF = tf5.f(httpURLConnectionC);
                } else {
                    tf5.b(httpURLConnectionC, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        u31.a aVarA = lnf.a();
                        aVarA.c = lnf.b.c;
                        u31VarF = aVarA.a();
                    } else {
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.a.c);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            u31.a aVarA2 = lnf.a();
                            aVarA2.c = lnf.b.b;
                            u31VarF = aVarA2.a();
                        }
                    }
                }
                int iOrdinal = u31VarF.c.ordinal();
                if (iOrdinal == 0) {
                    String str5 = u31VarF.a;
                    long j = u31VarF.b;
                    this.d.a.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    k31.a aVarH = k31Var.h();
                    aVarH.c = str5;
                    aVarH.e = Long.valueOf(j);
                    aVarH.f = Long.valueOf(jCurrentTimeMillis);
                    return aVarH.a();
                }
                if (iOrdinal == 1) {
                    k31.a aVarH2 = k31Var.h();
                    aVarH2.g = "BAD CONFIG";
                    aVarH2.b = q8b.a.e;
                    return aVarH2.a();
                }
                if (iOrdinal != 2) {
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", aVar);
                }
                synchronized (this) {
                    this.j = null;
                }
                k31.a aVarH3 = k31Var.h();
                aVarH3.b = q8b.a.b;
                return aVarH3.a();
            } finally {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", aVar);
    }

    public final void d() {
        pf5 pf5Var = this.a;
        pf5Var.a();
        fib.g(pf5Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        pf5Var.a();
        fib.g(pf5Var.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        pf5Var.a();
        fib.g(pf5Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        pf5Var.a();
        String str = pf5Var.c.b;
        Pattern pattern = ekg.b;
        fib.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        pf5Var.a();
        fib.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", ekg.b.matcher(pf5Var.c.a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e(defpackage.k31 r6) {
        /*
            r5 = this;
            pf5 r0 = r5.a
            r0.a()
            java.lang.String r0 = r0.b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            pf5 r0 = r5.a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5d
        L1e:
            q8b$a r6 = r6.c
            q8b$a r0 = q8b.a.a
            if (r6 != r0) goto L5d
            cn8<j07> r6 = r5.e
            java.lang.Object r6 = r6.get()
            j07 r6 = (defpackage.j07) r6
            android.content.SharedPreferences r0 = r6.a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.a     // Catch: java.lang.Throwable -> L40
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L40
            android.content.SharedPreferences r2 = r6.a     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            goto L47
        L40:
            r5 = move-exception
            goto L5b
        L42:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
        L47:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L57
            jic r5 = r5.f
            r5.getClass()
            java.lang.String r5 = defpackage.jic.a()
            return r5
        L57:
            return r2
        L58:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            throw r5     // Catch: java.lang.Throwable -> L40
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r5
        L5d:
            jic r5 = r5.f
            r5.getClass()
            java.lang.String r5 = defpackage.jic.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.a.e(k31):java.lang.String");
    }

    public final k31 f(k31 k31Var) {
        int responseCode;
        c31 c31VarE;
        a aVar = this;
        String str = k31Var.b;
        String string = null;
        if (str != null && str.length() == 11) {
            j07 j07Var = aVar.e.get();
            synchronized (j07Var.a) {
                try {
                    String[] strArr = j07.c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str2 = strArr[i];
                            String string2 = j07Var.a.getString("|T|" + j07Var.b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        tf5 tf5Var = aVar.b;
        pf5 pf5Var = aVar.a;
        pf5Var.a();
        String str3 = pf5Var.c.a;
        String str4 = k31Var.b;
        pf5 pf5Var2 = aVar.a;
        pf5Var2.a();
        String str5 = pf5Var2.c.g;
        pf5 pf5Var3 = aVar.a;
        pf5Var3.a();
        String str6 = pf5Var3.c.b;
        FirebaseInstallationsException.a aVar2 = FirebaseInstallationsException.a.b;
        f4d f4dVar = tf5Var.c;
        if (!f4dVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", aVar2);
        }
        URL urlA = tf5.a("projects/" + str5 + "/installations");
        int i2 = 0;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = tf5Var.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    tf5.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    f4dVar.b(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                c31VarE = tf5.e(httpURLConnectionC);
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            } else {
                tf5.b(httpURLConnectionC, str6, str3, str5);
                if (responseCode == 429) {
                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.a.c);
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    c31 c31Var = new c31(null, null, null, null, dg7.a.b);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c31VarE = c31Var;
                }
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                i2++;
                aVar = this;
            }
            int iOrdinal = c31VarE.e.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.b);
                }
                k31.a aVarH = k31Var.h();
                aVarH.g = "BAD CONFIG";
                aVarH.b = q8b.a.e;
                return aVarH.a();
            }
            String str7 = c31VarE.b;
            String str8 = c31VarE.c;
            aVar.d.a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            String strC = c31VarE.d.c();
            long jD = c31VarE.d.d();
            k31.a aVarH2 = k31Var.h();
            aVarH2.a = str7;
            aVarH2.b = q8b.a.d;
            aVarH2.c = strC;
            aVarH2.d = str8;
            aVarH2.e = Long.valueOf(jD);
            aVarH2.f = Long.valueOf(jCurrentTimeMillis);
            return aVarH2.a();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", aVar2);
    }

    public final void g(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((mse) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vf5
    public final Task<String> getId() {
        String str;
        d();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k06 k06Var = new k06(taskCompletionSource);
        synchronized (this.g) {
            this.l.add(k06Var);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.h.execute(new gg2(this, 4));
        return task;
    }

    public final void h(k31 k31Var) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((mse) it.next()).b(k31Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
