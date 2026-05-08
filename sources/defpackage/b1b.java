package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b1b implements mn1 {
    public final e2b b;
    public final mn1 c;

    public b1b(e2b e2bVar, mn1 mn1Var) {
        this.b = e2bVar;
        this.c = mn1Var;
    }

    @Override // defpackage.mn1
    public final float a(float f, float f2, float f3) {
        float fA = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f ? f + f2 <= 0.0f : f + f2 > f3) {
            z = true;
        }
        float fAbs = Math.abs(fA);
        e2b e2bVar = this.b;
        if (fAbs == 0.0f || !z) {
            if (Math.abs(e2bVar.f) < 1.0E-6d) {
                return 0.0f;
            }
            float fQ = e2bVar.f * (-1.0f);
            if (e2bVar.m()) {
                fQ += e2bVar.q();
            }
            return nic.B(fQ, -f3, f3);
        }
        float fQ2 = e2bVar.f * (-1.0f);
        while (fA > 0.0f && fQ2 < fA) {
            fQ2 += e2bVar.q();
        }
        while (fA < 0.0f && fQ2 > fA) {
            fQ2 -= e2bVar.q();
        }
        return fQ2;
    }
}
