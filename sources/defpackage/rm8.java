package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rm8 extends f20 {
    @Override // defpackage.f20
    public final long b(tia tiaVar, long j) {
        qxa qxaVar = tiaVar.A0;
        if (qxaVar != null) {
            j = qxaVar.d(j, false);
        }
        return ak2.y(j, tiaVar.r0);
    }

    @Override // defpackage.f20
    public final Map<d20, Integer> c(tia tiaVar) {
        return tiaVar.G0().r();
    }

    @Override // defpackage.f20
    public final int d(tia tiaVar, d20 d20Var) {
        return tiaVar.V(d20Var);
    }
}
