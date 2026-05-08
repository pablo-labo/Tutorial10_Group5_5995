package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.e;
import defpackage.ax1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class x90 implements wu5<e, b, Integer, e> {
    public final /* synthetic */ gu5<Boolean> a;
    public final /* synthetic */ boolean b;

    public x90(gu5<Boolean> gu5Var, boolean z) {
        this.a = gu5Var;
        this.b = z;
    }

    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        e eVar2 = eVar;
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(-196777734);
        final long j = ((qjf) bVar2.M(rjf.a)).a;
        boolean zE = bVar2.e(j);
        final gu5<Boolean> gu5Var = this.a;
        boolean zK = zE | bVar2.K(gu5Var);
        final boolean z = this.b;
        boolean zA = zK | bVar2.a(z);
        Object objV = bVar2.v();
        if (zA || objV == b.a.a) {
            objV = new Function1() { // from class: v90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ft1 ft1Var = (ft1) obj;
                    final m07 m07VarD = y90.d(ft1Var, Float.intBitsToFloat((int) (ft1Var.a.c() >> 32)) / 2.0f);
                    final ih1 ih1Var = new ih1(j, 5);
                    final gu5 gu5Var2 = gu5Var;
                    final boolean z2 = z;
                    return ft1Var.d(new Function1() { // from class: w90
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            ss2 ss2Var = (ss2) obj2;
                            ss2Var.N1();
                            if (!((Boolean) gu5Var2.invoke()).booleanValue()) {
                                return j6g.a;
                            }
                            boolean z3 = z2;
                            m07 m07Var = m07VarD;
                            ih1 ih1Var2 = ih1Var;
                            if (z3) {
                                long jF1 = ss2Var.F1();
                                ax1.b bVarW1 = ss2Var.w1();
                                long jD = bVarW1.d();
                                bVarW1.a().o();
                                try {
                                    bVarW1.a.g(jF1, -1.0f, 1.0f);
                                    ss2Var.o0(m07Var, ib5.a, ih1Var2);
                                } finally {
                                    g7.k(bVarW1, jD);
                                }
                            } else {
                                ss2Var.o0(m07Var, ib5.a, ih1Var2);
                            }
                            return j6g.a;
                        }
                    });
                }
            };
            bVar2.p(objV);
        }
        e eVarB = a.b(eVar2, (Function1) objV);
        bVar2.F();
        return eVarB;
    }
}
