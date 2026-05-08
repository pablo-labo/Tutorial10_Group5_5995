package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.a;
import defpackage.hh6;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class nli {
    public final pf5 a;
    public final xih b;
    public final a c;
    public final ThreadPoolExecutor d;
    public final bjg e;
    public final hh6 f;
    public final vf5 g;

    public nli(pf5 pf5Var, xih xihVar, ThreadPoolExecutor threadPoolExecutor, bjg bjgVar, hh6 hh6Var, vf5 vf5Var) {
        pf5Var.a();
        a aVar = new a(pf5Var.a, xihVar);
        this.a = pf5Var;
        this.b = xihVar;
        this.c = aVar;
        this.d = threadPoolExecutor;
        this.e = bjgVar;
        this.f = hh6Var;
        this.g = vf5Var;
    }

    public final Task<Bundle> a(final String str, final String str2, final String str3, final Bundle bundle) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d.execute(new Runnable(this, str, str2, str3, bundle, taskCompletionSource) { // from class: fli
            public final nli a;
            public final String b;
            public final String c;
            public final String d;
            public final Bundle e;
            public final TaskCompletionSource f;

            {
                this.a = this;
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = bundle;
                this.f = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                nli nliVar = this.a;
                String str4 = this.b;
                String str5 = this.c;
                String str6 = this.d;
                Bundle bundle2 = this.e;
                TaskCompletionSource taskCompletionSource2 = this.f;
                try {
                    nliVar.b(str4, str5, str6, bundle2);
                    taskCompletionSource2.setResult(nliVar.c.a(bundle2));
                } catch (IOException e) {
                    taskCompletionSource2.setException(e);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public final void b(String str, String str2, String str3, Bundle bundle) throws Throwable {
        String str4;
        String strEncodeToString;
        String str5;
        InputStream resourceAsStream;
        String str6;
        String string;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        pf5 pf5Var = this.a;
        pf5Var.a();
        bundle.putString("gmp_app_id", pf5Var.c.b);
        bundle.putString("gmsv", Integer.toString(this.b.e()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.d());
        xih xihVar = this.b;
        synchronized (xihVar) {
            try {
                if (xihVar.c == null) {
                    xihVar.f();
                }
                str4 = xihVar.c;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str4);
        pf5 pf5Var2 = this.a;
        pf5Var2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(pf5Var2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String strA = ((eg7) Tasks.await(this.g.a())).a();
            if (TextUtils.isEmpty(strA)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strA);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        yu8 yu8Var = yu8.c;
        yu8Var.getClass();
        la6 la6Var = yu8.b;
        fib.g("firebase-iid", "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = yu8Var.a;
        if (concurrentHashMap.containsKey("firebase-iid")) {
            string = (String) concurrentHashMap.get("firebase-iid");
        } else {
            Properties properties = new Properties();
            InputStream inputStream = null;
            property = null;
            String property = null;
            InputStream inputStream2 = null;
            try {
                try {
                    resourceAsStream = yu8.class.getResourceAsStream("/firebase-iid.properties");
                    try {
                        if (resourceAsStream != null) {
                            properties.load(resourceAsStream);
                            property = properties.getProperty("version", null);
                            StringBuilder sb = new StringBuilder(24 + String.valueOf(property).length());
                            sb.append("firebase-iid version is ");
                            sb.append(property);
                            String string2 = sb.toString();
                            if (Log.isLoggable(la6Var.a, 2)) {
                                String str7 = la6Var.b;
                                if (str7 != null) {
                                    string2 = str7.concat(string2);
                                }
                                Log.v("LibraryVersion", string2);
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder(55);
                            sb2.append("Failed to get app version for libraryName: firebase-iid");
                            String string3 = sb2.toString();
                            if (Log.isLoggable(la6Var.a, 5)) {
                                String str8 = la6Var.b;
                                if (str8 != null) {
                                    string3 = str8.concat(string3);
                                }
                                Log.w("LibraryVersion", string3);
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        str5 = null;
                        inputStream = resourceAsStream;
                        StringBuilder sb3 = new StringBuilder(55);
                        sb3.append("Failed to get app version for libraryName: firebase-iid");
                        String string4 = sb3.toString();
                        if (Log.isLoggable(la6Var.a, 6)) {
                            String str9 = la6Var.b;
                            if (str9 != null) {
                                string4 = str9.concat(string4);
                            }
                            Log.e("LibraryVersion", string4, e);
                        }
                        resourceAsStream = inputStream;
                        property = str5;
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = resourceAsStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                    str5 = null;
                }
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (property == null) {
                    if (Log.isLoggable(la6Var.a, 3)) {
                        String str10 = la6Var.b;
                        Log.d("LibraryVersion", str10 != null ? str10.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                    }
                    str6 = "UNKNOWN";
                } else {
                    str6 = property;
                }
                concurrentHashMap.put("firebase-iid", str6);
                string = str6;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if ("UNKNOWN".equals(string)) {
            int i = oa6.a;
            StringBuilder sb4 = new StringBuilder(19);
            sb4.append("unknown_");
            sb4.append(i);
            string = sb4.toString();
        }
        String strValueOf = String.valueOf(string);
        bundle.putString("cliv", strValueOf.length() != 0 ? "fiid-".concat(strValueOf) : new String("fiid-"));
        hh6.a aVarB = this.f.b();
        if (aVarB != hh6.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarB.a()));
            bundle.putString("Firebase-Client", this.e.a());
        }
    }

    public final Task<Void> c(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        String strValueOf2 = String.valueOf(str3);
        return a(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle).continueWith(this.d, new mxg()).continueWith(r0i.a, ak2.i0);
    }

    public final Task<Void> d(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String strValueOf2 = String.valueOf(str3);
        return a(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle).continueWith(this.d, new mxg()).continueWith(r0i.a, ak2.i0);
    }
}
