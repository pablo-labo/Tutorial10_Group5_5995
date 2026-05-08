package defpackage;

import androidx.compose.ui.platform.d;

/* JADX INFO: loaded from: classes.dex */
public final class q50 extends mj8 implements gu5<j6g> {
    final /* synthetic */ wrd $scrollObservationScope;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q50(wrd wrdVar, d dVar) {
        super(0);
        this.$scrollObservationScope = wrdVar;
        this.this$0 = dVar;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        f5e f5eVar;
        pm8 pm8Var;
        wrd wrdVar = this.$scrollObservationScope;
        lrd lrdVar = wrdVar.e;
        lrd lrdVar2 = wrdVar.f;
        Float f = wrdVar.c;
        Float f2 = wrdVar.d;
        float fFloatValue = (lrdVar == null || f == null) ? 0.0f : lrdVar.a.invoke().floatValue() - f.floatValue();
        float fFloatValue2 = (lrdVar2 == null || f2 == null) ? 0.0f : lrdVar2.a.invoke().floatValue() - f2.floatValue();
        if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
            d dVar = this.this$0;
            int i = this.$scrollObservationScope.a;
            z2a z2aVar = d.Q;
            int iA = dVar.A(i);
            i5e i5eVarB = this.this$0.t().b(this.this$0.n);
            if (i5eVarB != null) {
                d dVar2 = this.this$0;
                try {
                    t6 t6Var = dVar2.p;
                    if (t6Var != null) {
                        t6Var.a.setBoundsInScreen(dVar2.k(i5eVarB));
                        j6g j6gVar = j6g.a;
                    }
                } catch (IllegalStateException unused) {
                    j6g j6gVar2 = j6g.a;
                }
            }
            i5e i5eVarB2 = this.this$0.t().b(this.this$0.o);
            if (i5eVarB2 != null) {
                d dVar3 = this.this$0;
                try {
                    t6 t6Var2 = dVar3.q;
                    if (t6Var2 != null) {
                        t6Var2.a.setBoundsInScreen(dVar3.k(i5eVarB2));
                        j6g j6gVar3 = j6g.a;
                    }
                } catch (IllegalStateException unused2) {
                    j6g j6gVar4 = j6g.a;
                }
            }
            this.this$0.d.invalidate();
            i5e i5eVarB3 = this.this$0.t().b(iA);
            if (i5eVarB3 != null && (f5eVar = i5eVarB3.a) != null && (pm8Var = f5eVar.c) != null) {
                d dVar4 = this.this$0;
                if (lrdVar != null) {
                    dVar4.s.h(iA, lrdVar);
                }
                if (lrdVar2 != null) {
                    dVar4.t.h(iA, lrdVar2);
                }
                dVar4.w(pm8Var);
            }
        }
        if (lrdVar != null) {
            this.$scrollObservationScope.c = lrdVar.a.invoke();
        }
        if (lrdVar2 != null) {
            this.$scrollObservationScope.d = lrdVar2.a.invoke();
        }
        return j6g.a;
    }
}
