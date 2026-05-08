package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class cna extends f39 {
    public final String a = "ExpoModulesCore";

    @Override // defpackage.f39
    public final void a(o39 o39Var, String str, Throwable th) {
        char c;
        boolean z = dna.a;
        String str2 = this.a;
        if (!z) {
            StringBuilder sbF = u40.f("[", o39Var.a(), "] ", str2, "\t");
            sbF.append(str);
            System.out.println((Object) sbF.toString());
            if (th != null) {
                System.out.println((Object) z3.m(h4.t(th), "\n", boa.O(th)));
                return;
            }
            return;
        }
        o39.a.getClass();
        switch (o39Var) {
            case Trace:
            case Timer:
            case Stacktrace:
            case Debug:
                c = 3;
                break;
            case Info:
                c = 4;
                break;
            case Warn:
                c = 5;
                break;
            case Error:
                c = 6;
                break;
            case Fatal:
                c = 7;
                break;
            default:
                l.g();
                return;
        }
        if (c == 3) {
            Log.d(str2, str, th);
            return;
        }
        if (c == 4) {
            Log.i(str2, str, th);
            return;
        }
        if (c == 5) {
            Log.w(str2, str, th);
        } else if (c == 6) {
            Log.e(str2, str, th);
        } else {
            if (c != 7) {
                return;
            }
            Log.e(str2, str, th);
        }
    }
}
