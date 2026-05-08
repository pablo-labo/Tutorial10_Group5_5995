package defpackage;

import androidx.media3.session.o;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.google.firebase.components.DependencyException;
import defpackage.e75;
import defpackage.lx5;
import defpackage.lz8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w40 implements lz8.a, e75.b, x.e {
    public final /* synthetic */ int a;

    public static double b(double d, double d2, double d3, double d4) {
        return (d * d2 * d3) + d4;
    }

    public static int c(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int d(int i, int i2, gu5 gu5Var) {
        return (gu5Var.hashCode() + i) * i2;
    }

    public static String e(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String f(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder h(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder i(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ void k(int i, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(("Expected " + obj + ((Object) " for key: ") + i + obj2 + obj3 + ((Object) " instead.")).toString());
    }

    public static void l(lx5.b bVar, String str, String str2, String str3, String str4) {
        bVar.getClass();
        bVar.a(str, str2);
        bVar.a(str3, str4);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static void n(String str, String str2, String str3, boolean z) {
        lz2.b(str2, str3, z, new Exception(str));
    }

    public static void o(StringBuilder sb, hva hvaVar, String str, hva hvaVar2, String str2) {
        sb.append(hvaVar);
        sb.append(str);
        sb.append(hvaVar2);
        sb.append(str2);
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2) {
        throw new DependencyException(str + obj + obj2);
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        ((o) sVar).v(dVar);
        throw null;
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        v20 v20Var = (v20) obj;
        switch (this.a) {
            case 3:
                v20Var.getClass();
                break;
            case 4:
                v20Var.getClass();
                break;
            default:
                v20Var.getClass();
                break;
        }
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        return Double.valueOf(ka6Var.Q0());
    }
}
