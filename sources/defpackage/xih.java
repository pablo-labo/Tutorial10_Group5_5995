package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xih {
    public final Context a;
    public String b;
    public String c;
    public int d;
    public int e = 0;

    public xih(Context context) {
        this.a = context;
    }

    public static String b(pf5 pf5Var) {
        pf5Var.a();
        xf5 xf5Var = pf5Var.c;
        String str = xf5Var.e;
        if (str != null) {
            return str;
        }
        pf5Var.a();
        String str2 = xf5Var.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final PackageInfo a(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public final synchronized int c() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        this.e = 2;
        return 2;
    }

    public final synchronized String d() {
        try {
            if (this.b == null) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public final synchronized int e() {
        PackageInfo packageInfoA;
        try {
            if (this.d == 0 && (packageInfoA = a("com.google.android.gms")) != null) {
                this.d = packageInfoA.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    public final synchronized void f() {
        PackageInfo packageInfoA = a(this.a.getPackageName());
        if (packageInfoA != null) {
            this.b = Integer.toString(packageInfoA.versionCode);
            this.c = packageInfoA.versionName;
        }
    }
}
