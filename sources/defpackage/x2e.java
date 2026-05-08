package defpackage;

import defpackage.p2e;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes.dex */
public final class x2e {
    public static final p2e a(u3e u3eVar, zk1 zk1Var) {
        boolean z = u3eVar.f() == l73.a;
        return new p2e(c(u3eVar.j(), z, true, u3eVar.k(), zk1Var), c(u3eVar.i(), z, false, u3eVar.e(), zk1Var), z);
    }

    public static final p2e.a b(final u3e u3eVar, final vzd vzdVar, p2e.a aVar) {
        final int i = u3eVar.b() ? vzdVar.c : vzdVar.d;
        int iK = u3eVar.b() ? u3eVar.k() : u3eVar.e();
        int i2 = vzdVar.b;
        mif mifVar = vzdVar.f;
        int i3 = vzdVar.e;
        if (iK != i2) {
            return vzdVar.a(i);
        }
        gu5 gu5Var = new gu5() { // from class: v2e
            @Override // defpackage.gu5
            public final Object invoke() {
                return Integer.valueOf(vzdVar.f.b.d(i));
            }
        };
        qt8 qt8Var = qt8.c;
        final Lazy lazyE = boa.E(qt8Var, gu5Var);
        final int i4 = u3eVar.b() ? vzdVar.d : vzdVar.c;
        Lazy lazyE2 = boa.E(qt8Var, new gu5() { // from class: w2e
            @Override // defpackage.gu5
            public final Object invoke() {
                int iIntValue = ((Number) lazyE.getValue()).intValue();
                u3e u3eVar2 = u3eVar;
                boolean zB = u3eVar2.b();
                boolean z = u3eVar2.f() == l73.a;
                vzd vzdVar2 = vzdVar;
                mif mifVar2 = vzdVar2.f;
                int i5 = i;
                long j = mifVar2.j(i5);
                mif mifVar3 = vzdVar2.f;
                int i6 = kjf.c;
                int iG = (int) (j >> 32);
                q1a q1aVar = mifVar3.b;
                int iD = q1aVar.d(iG);
                int i7 = q1aVar.f;
                if (iD != iIntValue) {
                    iG = iIntValue >= i7 ? mifVar3.g(i7 - 1) : mifVar3.g(iIntValue);
                }
                int iC = (int) (j & 4294967295L);
                if (q1aVar.d(iC) != iIntValue) {
                    q1a q1aVar2 = mifVar3.b;
                    iC = iIntValue >= i7 ? q1aVar2.c(i7 - 1, false) : q1aVar2.c(iIntValue, false);
                }
                int i8 = i4;
                if (iG == i8) {
                    return vzdVar2.a(iC);
                }
                if (iC == i8) {
                    return vzdVar2.a(iG);
                }
                if (!(zB ^ z) ? i5 >= iG : i5 > iC) {
                    iG = iC;
                }
                return vzdVar2.a(iG);
            }
        });
        if (vzdVar.a != aVar.c) {
            return (p2e.a) lazyE2.getValue();
        }
        if (i == i3) {
            return aVar;
        }
        if (((Number) lazyE.getValue()).intValue() != mifVar.b.d(i3)) {
            return (p2e.a) lazyE2.getValue();
        }
        int i5 = aVar.b;
        long j = mifVar.j(i5);
        boolean zB = u3eVar.b();
        if (i3 != -1) {
            if (i != i3) {
                if (!(zB ^ (vzdVar.b() == l73.a))) {
                }
            }
            return vzdVar.a(i);
        }
        int i6 = kjf.c;
        return (i5 == ((int) (j >> 32)) || i5 == ((int) (j & 4294967295L))) ? (p2e.a) lazyE2.getValue() : vzdVar.a(i);
    }

    public static final p2e.a c(vzd vzdVar, boolean z, boolean z2, int i, zk1 zk1Var) {
        long j;
        int i2 = z2 ? vzdVar.c : vzdVar.d;
        if (i != vzdVar.b) {
            return vzdVar.a(i2);
        }
        long jA = zk1Var.a(vzdVar, i2);
        if (z ^ z2) {
            int i3 = kjf.c;
            j = jA >> 32;
        } else {
            int i4 = kjf.c;
            j = 4294967295L & jA;
        }
        return vzdVar.a((int) j);
    }

    public static final p2e.a d(p2e.a aVar, vzd vzdVar, int i) {
        return new p2e.a(vzdVar.f.a(i), i, aVar.c);
    }
}
