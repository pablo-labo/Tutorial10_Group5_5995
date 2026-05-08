package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class frh {
    public static volatile ssh<Boolean> a = qsh.a;
    public static final Object b = new Object();

    public static boolean a(Uri uri, Context context) {
        ProviderInfo providerInfoResolveContentProvider;
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(uz.c(91, authority));
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (a.a()) {
            return a.b().booleanValue();
        }
        synchronized (b) {
            try {
                if (a.a()) {
                    return a.b().booleanValue();
                }
                if ("com.google.android.gms".equals(context.getPackageName()) || ((providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) {
                    try {
                        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                            z = true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                a = new xsh(Boolean.valueOf(z));
                return a.b().booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
