package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class rc1 implements hdf {
    public final ah2 a;
    public final y4a b = new y4a();
    public final g4a c = r.f(null);

    public final class a implements kdf {
        public final zcf a;
        public final go1 b = h22.a(0, 7, null);

        public a(zcf zcfVar) {
            this.a = zcfVar;
        }

        @Override // defpackage.kdf
        public final void close() {
            this.b.f(j6g.a);
        }
    }

    public rc1(ah2 ah2Var) {
        this.a = ah2Var;
    }

    @Override // defpackage.hdf
    public final Object a(zcf zcfVar, c1f c1fVar) {
        Object objB = y4a.b(this.b, new sc1(this, new a(zcfVar), null), c1fVar);
        return objB == g13.a ? objB : j6g.a;
    }

    public final void b(gu5<? extends sl8> gu5Var, b bVar, int i) {
        gu5<? extends sl8> gu5Var2;
        c cVarH = bVar.h(723898654);
        int i2 = (cVarH.K(this) ? 32 : 16) | i;
        int i3 = 1;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            a aVar = (a) ((gme) this.c).getValue();
            if (aVar == null) {
                i iVarW = cVarH.W();
                if (iVarW != null) {
                    iVarW.d = new gu(this, i, i3, gu5Var);
                    return;
                }
                return;
            }
            gu5Var2 = gu5Var;
            this.a.t(aVar, aVar.a, gu5Var2, cVarH, 384);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW2 = cVarH.W();
        if (iVarW2 != null) {
            iVarW2.d = new uc(this, i, 2, gu5Var2);
        }
    }
}
