package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Looper;
import android.window.OnBackInvokedDispatcher;
import androidx.media3.session.j;
import androidx.media3.session.k;
import androidx.media3.session.m;
import defpackage.e75;
import defpackage.lz8;
import defpackage.zu8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k6 implements lz8.b, lz8.a, e75.b, zu8.a, m.a, ru5 {
    public static float b(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int c(int i, float f, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher g(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static String h(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static void k(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    @Override // defpackage.ru5
    public Object apply(Object obj) {
        return Integer.valueOf(((wpf) obj).c);
    }

    @Override // zu8.a
    public String d(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    @Override // androidx.media3.session.m.a
    public void f(k kVar) {
        if (kVar.o0()) {
            j jVarZ0 = kVar.Z0();
            jVarZ0.getClass();
            ka2.q(Looper.myLooper() == jVarZ0.e.getLooper());
            jVarZ0.d.getClass();
        }
    }

    @Override // lz8.b
    public void i(Object obj, bh5 bh5Var) {
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((v20) obj).getClass();
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        return Double.valueOf(ka6Var.V0());
    }
}
