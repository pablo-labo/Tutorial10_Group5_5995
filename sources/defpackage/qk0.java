package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class qk0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final o34 h;

    public qk0(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, o34 o34Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = o34Var;
    }

    public static qk0 a(Context context, nr6 nr6Var, String str, String str2, ArrayList arrayList, o34 o34Var) {
        String packageName = context.getPackageName();
        String strC = nr6Var.c();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new qk0(str, str2, arrayList, strC, packageName, string, str3, o34Var);
    }
}
