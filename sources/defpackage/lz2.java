package defpackage;

import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class lz2 {
    public static final ArrayList a = new ArrayList();
    public static volatile yu5<k39, String, String, Boolean, Throwable, j6g>[] b = new yu5[0];

    public static void a(String str, String str2, String str3) {
        str3.getClass();
        String string = Uri.parse(str3).buildUpon().path("").query("").fragment("").toString();
        string.getClass();
        rf5 rf5VarA = rf5.a();
        StringBuilder sbF = u40.f("E/", str, ": ", str2, " : URL : ");
        sbF.append(string);
        String string2 = sbF.toString();
        q33 q33Var = rf5VarA.a;
        long jCurrentTimeMillis = System.currentTimeMillis() - q33Var.d;
        g33 g33Var = q33Var.g;
        g33Var.e.a(new h33(g33Var, jCurrentTimeMillis, string2));
        for (yu5<k39, String, String, Boolean, Throwable, j6g> yu5Var : b) {
            yu5Var.t(k39.Error, str, z3.m(str2, " : URL : ", string), Boolean.FALSE, null);
        }
        Log.e(str, str2 + " : URL : " + string);
    }

    public static void b(String str, String str2, boolean z, Throwable th) {
        str.getClass();
        str2.getClass();
        if (!z) {
            rf5 rf5VarA = rf5.a();
            String strL = t40.l("E/", str, ": ", str2);
            q33 q33Var = rf5VarA.a;
            long jCurrentTimeMillis = System.currentTimeMillis() - q33Var.d;
            g33 g33Var = q33Var.g;
            g33Var.e.a(new h33(g33Var, jCurrentTimeMillis, strL));
            if (th != null) {
                rf5VarA.b(th);
            }
        }
        for (yu5<k39, String, String, Boolean, Throwable, j6g> yu5Var : b) {
            yu5Var.t(k39.Error, str, str2, Boolean.valueOf(z), th);
        }
        Log.e(str, str2, th);
    }

    public static /* synthetic */ void c(String str, String str2, boolean z, Throwable th, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            th = null;
        }
        b(str, str2, z, th);
    }

    public static void d(String str, String str2, boolean z, Throwable th) {
        if (!z) {
            rf5 rf5VarA = rf5.a();
            String strL = t40.l("I/", str, ": ", str2);
            q33 q33Var = rf5VarA.a;
            long jCurrentTimeMillis = System.currentTimeMillis() - q33Var.d;
            g33 g33Var = q33Var.g;
            g33Var.e.a(new h33(g33Var, jCurrentTimeMillis, strL));
            if (th != null) {
                rf5VarA.b(th);
            }
        }
        Log.i(str, str2, th);
    }

    public static void f(String str) {
        Log.v("AppStartupTimes", str, null);
    }

    public static void g(String str, String str2, boolean z, Throwable th) {
        str.getClass();
        str2.getClass();
        if (!z) {
            rf5 rf5VarA = rf5.a();
            String strL = t40.l("W/", str, ": ", str2);
            q33 q33Var = rf5VarA.a;
            long jCurrentTimeMillis = System.currentTimeMillis() - q33Var.d;
            g33 g33Var = q33Var.g;
            g33Var.e.a(new h33(g33Var, jCurrentTimeMillis, strL));
            if (th != null) {
                rf5VarA.b(th);
            }
        }
        for (yu5<k39, String, String, Boolean, Throwable, j6g> yu5Var : b) {
            yu5Var.t(k39.Warn, str, str2, Boolean.valueOf(z), th);
        }
        Log.w(str, str2, th);
    }

    public static /* synthetic */ void h(String str, String str2, Exception exc, int i) {
        if ((i & 8) != 0) {
            exc = null;
        }
        g(str, str2, false, exc);
    }
}
