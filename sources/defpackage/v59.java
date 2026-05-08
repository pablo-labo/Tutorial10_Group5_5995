package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v59 extends f20 {
    @Override // defpackage.f20
    public final long b(tia tiaVar, long j) {
        x59 x59VarD1 = tiaVar.d1();
        x59VarD1.getClass();
        long j2 = x59VarD1.f0;
        return ooa.f((((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
    }

    @Override // defpackage.f20
    public final Map<d20, Integer> c(tia tiaVar) {
        x59 x59VarD1 = tiaVar.d1();
        x59VarD1.getClass();
        return x59VarD1.G0().r();
    }

    @Override // defpackage.f20
    public final int d(tia tiaVar, d20 d20Var) {
        x59 x59VarD1 = tiaVar.d1();
        x59VarD1.getClass();
        return x59VarD1.V(d20Var);
    }
}
