package defpackage;

import androidx.compose.runtime.b;
import com.google.android.gms.internal.measurement.zzev;
import defpackage.cz4;
import defpackage.e75;
import defpackage.gl2;
import defpackage.lz8;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uz implements lz8.a, cz4.b, e75.b {
    public final /* synthetic */ int a;

    public static int b(int i, int i2, int i3, int i4) {
        return zzev.j2(i) + i2 + i3 + i4;
    }

    public static int c(int i, String str) {
        return String.valueOf(str).length() + i;
    }

    public static String d(int i, int i2, int i3, String str, String str2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        return sb.toString();
    }

    public static String e(StringBuilder sb, hva hvaVar, String str, hva hvaVar2, String str2) {
        sb.append(hvaVar);
        sb.append(str);
        sb.append(hvaVar2);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder f(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static void g(int i, b bVar, int i2, gl2.a.C0251a c0251a) {
        bVar.p(Integer.valueOf(i));
        bVar.b(Integer.valueOf(i2), c0251a);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static void i(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        v20 v20Var = (v20) obj;
        switch (this.a) {
            case 4:
                v20Var.getClass();
                break;
            case 5:
                v20Var.getClass();
                break;
            default:
                v20Var.getClass();
                break;
        }
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        switch (this.a) {
            case 8:
                return Long.valueOf(ka6Var.V0());
            default:
                return Integer.valueOf(ka6Var.V0());
        }
    }
}
