package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class rdd {
    public static final jte a = new jte(b.a);
    public static final ne4 b = new ne4(a.a);
    public static final udd c;
    public static final udd d;

    public static final class a extends mj8 implements gu5<jdd> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final jdd invoke() {
            return new jdd();
        }
    }

    public static final class b extends mj8 implements gu5<Boolean> {
        public static final b a = new b(0);

        @Override // defpackage.gu5
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static {
        long j = da2.i;
        c = new udd(true, Float.NaN, j);
        d = new udd(false, Float.NaN, j);
    }

    public static final udd a(boolean z, float f, long j) {
        return (j94.c(f, Float.NaN) && da2.c(j, da2.i)) ? z ? c : d : new udd(z, f, j);
    }

    public static udd b(long j, int i, float f) {
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = da2.i;
        }
        return a(true, f, j);
    }

    public static final pa7 c(boolean z, float f, long j, androidx.compose.runtime.b bVar, int i, int i2) {
        pa7 pa7VarA;
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            j = da2.i;
        }
        bVar.L(-1280632857);
        if (((Boolean) bVar.M(a)).booleanValue()) {
            dvf<Float> dvfVar = qdd.a;
            g4a g4aVarG = r.g(new da2(j), bVar);
            boolean z3 = (((i & 14) ^ 6) > 4 && bVar.a(z)) || (i & 6) == 4;
            if ((((i & 112) ^ 48) <= 32 || !bVar.c(f)) && (i & 48) != 32) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objV = bVar.v();
            if (z4 || objV == b.a.a) {
                objV = new ccb(z, f, g4aVarG);
                bVar.p(objV);
            }
            pa7VarA = (ccb) objV;
        } else {
            pa7VarA = a(z, f, j);
        }
        bVar.F();
        return pa7VarA;
    }
}
