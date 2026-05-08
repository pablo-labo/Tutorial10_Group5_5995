package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hw9 {
    public final yd0<Float> a;
    public final boolean b;
    public final d40<iw9> c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[iw9.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public hw9(iw9 iw9Var, iy3 iy3Var, Function1<? super iw9, Boolean> function1, yd0<Float> yd0Var, boolean z) {
        this.a = yd0Var;
        this.b = z;
        this.c = new d40<>(iw9Var, new pe0(iy3Var, 8), new fk0(iy3Var, 13), yd0Var, function1);
        if (z && iw9Var == iw9.c) {
            l5.q("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
            throw null;
        }
    }

    public static Object a(hw9 hw9Var, iw9 iw9Var, lu2 lu2Var) {
        Object objB = e30.b(hw9Var.c, iw9Var, ((cme) hw9Var.c.k).g(), lu2Var);
        return objB == g13.a ? objB : j6g.a;
    }

    public final Object b(lu2<? super j6g> lu2Var) {
        Object objA = a(this, iw9.a, lu2Var);
        return objA == g13.a ? objA : j6g.a;
    }

    public final boolean c() {
        return ((gme) this.c.g).getValue() != iw9.a;
    }

    public final Object d(c1f c1fVar) {
        d40<iw9> d40Var = this.c;
        pa4<iw9> pa4VarE = d40Var.e();
        iw9 iw9Var = iw9.b;
        boolean zD = pa4VarE.d(iw9Var);
        if (a.a[((iw9) ((gme) d40Var.g).getValue()).ordinal()] == 1) {
            pa4<iw9> pa4VarE2 = d40Var.e();
            iw9 iw9Var2 = iw9.c;
            if (pa4VarE2.d(iw9Var2)) {
                iw9Var = iw9Var2;
            }
        } else if (!zD) {
            iw9Var = iw9.a;
        }
        Object objA = a(this, iw9Var, c1fVar);
        return objA == g13.a ? objA : j6g.a;
    }

    public hw9(iy3 iy3Var) {
        this(iw9.b, iy3Var, new xi(8), yu9.a, false);
    }
}
