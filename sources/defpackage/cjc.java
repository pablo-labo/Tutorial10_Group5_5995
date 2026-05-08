package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class cjc extends jh5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjc(mge mgeVar, mge mgeVar2) {
        super(mgeVar, mgeVar2);
        mgeVar.getClass();
        mgeVar2.getClass();
        vi8.a.d(mgeVar, mgeVar2);
    }

    public static final ArrayList W0(pz3 pz3Var, ui8 ui8Var) {
        List<wxf> listK0 = ui8Var.K0();
        ArrayList arrayList = new ArrayList(t92.r0(listK0, 10));
        Iterator<T> it = listK0.iterator();
        while (it.hasNext()) {
            arrayList.add(pz3Var.d0((wxf) it.next()));
        }
        return arrayList;
    }

    public static final String X0(String str, String str2) {
        if (!zve.M(str, '<')) {
            return str;
        }
        return zve.p0(str, '<') + '<' + str2 + '>' + zve.o0('>', str, str);
    }

    @Override // defpackage.p7g
    public final p7g Q0(boolean z) {
        return new cjc(this.b.Q0(z), this.c.Q0(z));
    }

    @Override // defpackage.p7g
    public final p7g S0(gwf gwfVar) {
        gwfVar.getClass();
        return new cjc(this.b.S0(gwfVar), this.c.S0(gwfVar));
    }

    @Override // defpackage.jh5
    public final mge T0() {
        return this.b;
    }

    @Override // defpackage.jh5
    public final String U0(pz3 pz3Var, pz3 pz3Var2) throws IOException {
        mge mgeVar = this.b;
        String strX = pz3Var.X(mgeVar);
        mge mgeVar2 = this.c;
        String strX2 = pz3Var.X(mgeVar2);
        if (pz3Var2.d.o()) {
            return "raw (" + strX + ".." + strX2 + ')';
        }
        if (mgeVar2.K0().isEmpty()) {
            return pz3Var.F(strX, strX2, boa.t(this));
        }
        ArrayList arrayListW0 = W0(pz3Var, mgeVar);
        ArrayList arrayListW02 = W0(pz3Var, mgeVar2);
        String strW0 = z92.W0(arrayListW0, ", ", null, null, bjc.a, 30);
        ArrayList<Pair> arrayListH1 = z92.H1(arrayListW0, arrayListW02);
        if (arrayListH1.isEmpty()) {
            strX2 = X0(strX2, strW0);
        } else {
            for (Pair pair : arrayListH1) {
                String str = (String) pair.d();
                String str2 = (String) pair.e();
                if (!wl7.b(str, zve.b0(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
            strX2 = X0(strX2, strW0);
        }
        String strX0 = X0(strX, strW0);
        return strX0.equals(strX2) ? strX0 : pz3Var.F(strX0, strX2, boa.t(this));
    }

    @Override // defpackage.p7g
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final jh5 O0(bj8 bj8Var) {
        bj8Var.getClass();
        return new cjc((mge) bj8Var.A0(this.b), (mge) bj8Var.A0(this.c));
    }

    @Override // defpackage.jh5, defpackage.ui8
    public final in9 n() {
        v62 v62VarD = M0().d();
        t52 t52Var = v62VarD instanceof t52 ? (t52) v62VarD : null;
        if (t52Var == null) {
            s40.i(M0().d(), "Incorrect classifier: ");
            return null;
        }
        in9 in9VarH = t52Var.H(new ajc());
        in9VarH.getClass();
        return in9VarH;
    }
}
