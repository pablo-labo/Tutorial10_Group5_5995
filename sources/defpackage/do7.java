package defpackage;

import defpackage.b32;
import defpackage.ere;
import defpackage.mwc;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class do7 implements b32 {
    public static final do7 a = new do7();

    @Override // defpackage.b32
    public final String a(iv7 iv7Var) {
        return b32.a.a(this, iv7Var);
    }

    @Override // defpackage.b32
    public final boolean b(iv7 iv7Var) {
        mge mgeVarB;
        rlg rlgVar = iv7Var.i().get(1);
        mwc.b bVar = mwc.d;
        rlgVar.getClass();
        int i = b04.a;
        xx9 xx9VarD = yz3.d(rlgVar);
        xx9VarD.getClass();
        bVar.getClass();
        t52 t52VarA = rc5.a(xx9VarD, ere.a.R);
        if (t52VarA == null) {
            mgeVarB = null;
        } else {
            gwf.b.getClass();
            gwf gwfVar = gwf.c;
            List<rxf> parameters = t52VarA.j().getParameters();
            parameters.getClass();
            Object objK1 = z92.k1(parameters);
            objK1.getClass();
            mgeVarB = yi8.b(gwfVar, t52VarA, u63.Z(new hre((rxf) objK1)));
        }
        if (mgeVarB == null) {
            return false;
        }
        ui8 type = rlgVar.getType();
        type.getClass();
        return vi8.a.d(mgeVarB, kyf.g(type, false));
    }

    @Override // defpackage.b32
    public final String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
