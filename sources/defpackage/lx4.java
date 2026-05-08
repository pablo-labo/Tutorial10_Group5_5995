package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class lx4 {
    public static final lx4 a = new lx4();
    public static final qw4 b = qw4.a;
    public static final jw4 c = new jw4(n8a.n(String.format(mw4.ERROR_CLASS.a(), Arrays.copyOf(new Object[]{"unknown class"}, 1))));
    public static final hx4 d = c(kx4.f, new String[0]);
    public static final hx4 e = c(kx4.h0, new String[0]);
    public static final Set<d4c> f = pi3.k(new rw4());

    public static final ww4 a(xw4 xw4Var, boolean z, String... strArr) {
        if (!z) {
            return new ww4(xw4Var, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new klf(xw4Var, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static final ww4 b(xw4 xw4Var, String... strArr) {
        return a(xw4Var, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final hx4 c(kx4 kx4Var, String... strArr) {
        kx4Var.getClass();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return e(kx4Var, zr4.a, d(kx4Var, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static jx4 d(kx4 kx4Var, String... strArr) {
        kx4Var.getClass();
        return new jx4(kx4Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static hx4 e(kx4 kx4Var, List list, kwf kwfVar, String... strArr) {
        kx4Var.getClass();
        return new hx4(kwfVar, b(xw4.ERROR_TYPE_SCOPE, kwfVar.toString()), kx4Var, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(aj3 aj3Var) {
        if (aj3Var != null) {
            return (aj3Var instanceof jw4) || (aj3Var.d() instanceof jw4) || aj3Var == b;
        }
        return false;
    }
}
