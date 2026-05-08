package defpackage;

import defpackage.xmf;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class una extends pvf<Object> {
    public static final tna c = new tna();
    public final ae6 a;
    public final xmf.a b = xmf.a;

    public una(ae6 ae6Var) {
        this.a = ae6Var;
    }

    @Override // defpackage.pvf
    public final Object a(nb8 nb8Var) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        sb8 sb8VarJ0 = nb8Var.j0();
        int iOrdinal = sb8VarJ0.ordinal();
        if (iOrdinal == 0) {
            nb8Var.a();
            arrayList = new ArrayList();
        } else if (iOrdinal != 2) {
            arrayList = null;
        } else {
            nb8Var.h();
            arrayList = new ey8();
        }
        if (arrayList == null) {
            return c(nb8Var, sb8VarJ0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (nb8Var.hasNext()) {
                String strX = arrayList instanceof Map ? nb8Var.X() : null;
                sb8 sb8VarJ02 = nb8Var.j0();
                int iOrdinal2 = sb8VarJ02.ordinal();
                if (iOrdinal2 == 0) {
                    nb8Var.a();
                    arrayList2 = new ArrayList();
                } else if (iOrdinal2 != 2) {
                    arrayList2 = null;
                } else {
                    nb8Var.h();
                    arrayList2 = new ey8();
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = c(nb8Var, sb8VarJ02);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strX, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    nb8Var.v();
                } else {
                    nb8Var.G();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.pvf
    public final void b(gc8 gc8Var, Object obj) throws IOException {
        if (obj == null) {
            gc8Var.Q();
            return;
        }
        Class<?> cls = obj.getClass();
        ae6 ae6Var = this.a;
        ae6Var.getClass();
        pvf pvfVarC = ae6Var.c(new iyf(cls));
        if (!(pvfVarC instanceof una)) {
            pvfVarC.b(gc8Var, obj);
        } else {
            gc8Var.p();
            gc8Var.G();
        }
    }

    public final Serializable c(nb8 nb8Var, sb8 sb8Var) throws IOException {
        int iOrdinal = sb8Var.ordinal();
        if (iOrdinal == 5) {
            return nb8Var.I0();
        }
        if (iOrdinal == 6) {
            this.b.getClass();
            return Double.valueOf(nb8Var.nextDouble());
        }
        if (iOrdinal == 7) {
            return Boolean.valueOf(nb8Var.nextBoolean());
        }
        if (iOrdinal == 8) {
            nb8Var.l1();
            return null;
        }
        bg.n(sb8Var, "Unexpected token: ");
        return null;
    }
}
