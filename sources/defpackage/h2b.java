package defpackage;

import androidx.compose.runtime.b;
import defpackage.tle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h2b {
    public static final t1b a = new t1b(0, 0, 0, 0, 0, 0, tle.a.a, new a(), f13.a(vr4.a));
    public static final b b = new b();

    public static final class a implements bg9 {
        @Override // defpackage.bg9
        public final int getHeight() {
            return 0;
        }

        @Override // defpackage.bg9
        public final int getWidth() {
            return 0;
        }

        @Override // defpackage.bg9
        public final void j() {
        }

        @Override // defpackage.bg9
        public final Map<d20, Integer> r() {
            return bs4.a;
        }
    }

    public static final class b implements iy3 {
        @Override // defpackage.iy3
        public final float getDensity() {
            return 1.0f;
        }

        @Override // defpackage.iy3
        public final float p1() {
            return 1.0f;
        }
    }

    public static final long a(o1b o1bVar, int i) {
        long jF = (((((long) i) * ((long) (o1bVar.f() + o1bVar.h()))) + ((long) o1bVar.d())) + ((long) o1bVar.c())) - ((long) o1bVar.h());
        int iB = (int) (o1bVar.a() == dwa.b ? o1bVar.b() >> 32 : o1bVar.b() & 4294967295L);
        o1bVar.i().getClass();
        long jC = jF - ((long) (iB - nic.C(0, 0, iB)));
        if (jC < 0) {
            return 0L;
        }
        return jC;
    }

    public static final np3 b(final int i, final gu5 gu5Var, androidx.compose.runtime.b bVar, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        ko2 ko2Var = np3.I;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && bVar.d(i)) || (i2 & 6) == 4;
        final float f = 0.0f;
        if ((((i2 & 112) ^ 48) <= 32 || !bVar.c(0.0f)) && (i2 & 48) != 32) {
            z = false;
        }
        boolean zK = z2 | z | bVar.K(gu5Var);
        Object objV = bVar.v();
        if (zK || objV == b.a.a) {
            objV = new gu5() { // from class: g2b
                @Override // defpackage.gu5
                public final Object invoke() {
                    return new np3(i, f, gu5Var);
                }
            };
            bVar.p(objV);
        }
        np3 np3Var = (np3) ypd.N(objArr, ko2Var, (gu5) objV, bVar, 0);
        ((gme) np3Var.H).setValue(gu5Var);
        return np3Var;
    }
}
