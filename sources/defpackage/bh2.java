package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;

/* JADX INFO: loaded from: classes.dex */
public final class bh2 {
    public static final Object a = new Object();

    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final ah2 b(b bVar, int i, mj8 mj8Var) {
        ah2 ah2Var;
        bVar.A(Integer.rotateLeft(i, 1), a);
        Object objV = bVar.v();
        if (objV == b.a.a) {
            ah2Var = new ah2(i, mj8Var, true);
            bVar.p(ah2Var);
        } else {
            objV.getClass();
            ah2Var = (ah2) objV;
            ah2Var.i(mj8Var);
        }
        bVar.I();
        return ah2Var;
    }

    public static final ah2 c(int i, vu5 vu5Var, b bVar) {
        Object objV = bVar.v();
        if (objV == b.a.a) {
            objV = new ah2(i, vu5Var, true);
            bVar.p(objV);
        }
        ah2 ah2Var = (ah2) objV;
        ah2Var.i(vu5Var);
        return ah2Var;
    }

    public static final boolean d(usc uscVar, usc uscVar2) {
        if (uscVar == null) {
            return true;
        }
        if (!(uscVar instanceof i) || !(uscVar2 instanceof i)) {
            return false;
        }
        i iVar = (i) uscVar;
        return !iVar.a() || uscVar == uscVar2 || wl7.b(iVar.c, ((i) uscVar2).c);
    }
}
