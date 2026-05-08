package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.h;
import defpackage.ax1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.ywa;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zef implements Function2<b, Integer, j6g> {
    public final /* synthetic */ g4a<kie> a;
    public final /* synthetic */ gza b;
    public final /* synthetic */ Function2<b, Integer, j6g> c;

    /* JADX WARN: Multi-variable type inference failed */
    public zef(g4a<kie> g4aVar, gza gzaVar, Function2<? super b, ? super Integer, j6g> function2) {
        this.a = g4aVar;
        this.b = gzaVar;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            e eVarB = h.b(e.a.b, "border");
            final long j = this.a.getValue().a;
            int i = ywa.b;
            final gza gzaVar = this.b;
            e eVarC = a.c(eVarB, new Function1() { // from class: qwa
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ss2 ss2Var = (ss2) obj;
                    long j2 = j;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                    if (fIntBitsToFloat > 0.0f) {
                        float fT1 = ss2Var.t1(4.0f);
                        float fT12 = ss2Var.t1(gzaVar.b(ss2Var.getLayoutDirection())) - fT1;
                        float fIntBitsToFloat2 = (fT1 * 2.0f) + fIntBitsToFloat + fT12;
                        vl8 layoutDirection = ss2Var.getLayoutDirection();
                        int[] iArr = ywa.a.a;
                        float fIntBitsToFloat3 = iArr[layoutDirection.ordinal()] == 1 ? Float.intBitsToFloat((int) (ss2Var.c() >> 32)) - fIntBitsToFloat2 : fT12 < 0.0f ? 0.0f : fT12;
                        if (iArr[ss2Var.getLayoutDirection().ordinal()] == 1) {
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (ss2Var.c() >> 32)) - (fT12 >= 0.0f ? fT12 : 0.0f);
                        }
                        float f = fIntBitsToFloat2;
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                        float f2 = (-fIntBitsToFloat4) / 2.0f;
                        float f3 = fIntBitsToFloat4 / 2.0f;
                        ax1.b bVarW1 = ss2Var.w1();
                        long jD = bVarW1.d();
                        bVarW1.a().o();
                        try {
                            bVarW1.a.d(fIntBitsToFloat3, f2, f, f3, 0);
                            ss2Var.N1();
                        } finally {
                            g7.k(bVarW1, jD);
                        }
                    } else {
                        ss2Var.N1();
                    }
                    return j6g.a;
                }
            });
            ag9 ag9VarD = hl1.d(c20.a.a, true);
            int iG = bVar2.G();
            t8b t8bVarM = bVar2.m();
            e eVarC2 = c.c(bVar2, eVarC);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            if (bVar2.j() == null) {
                pg8.B();
                throw null;
            }
            bVar2.B();
            if (bVar2.f()) {
                bVar2.y(aVar);
            } else {
                bVar2.n();
            }
            ygg.y(bVar2, ag9VarD, gl2.a.g);
            ygg.y(bVar2, t8bVarM, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                uz.g(iG, bVar2, iG, c0251a);
            }
            ygg.y(bVar2, eVarC2, gl2.a.d);
            Function2<b, Integer, j6g> function2 = this.c;
            if (function2 == null) {
                bVar2.L(-1295979683);
            } else {
                bVar2.L(235288868);
                function2.invoke(bVar2, 0);
            }
            bVar2.F();
            bVar2.q();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
