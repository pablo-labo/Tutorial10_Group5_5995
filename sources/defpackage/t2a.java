package defpackage;

import defpackage.xz8;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class t2a {
    public final CopyOnWriteArrayList<Function1<yb2, j6g>> a = new CopyOnWriteArrayList<>();
    public final gse b;
    public final rqc c;

    public t2a() {
        gse gseVarE = hh2.e(null);
        this.b = gseVarE;
        this.c = wg2.j(gseVarE);
    }

    public static final yb2 a(t2a t2aVar, yb2 yb2Var, yz8 yz8Var, yz8 yz8Var2) {
        xz8 xz8Var;
        xz8 xz8Var2;
        xz8 xz8Var3;
        t2aVar.getClass();
        xz8 xz8Var4 = xz8.c.c;
        if (yb2Var == null || (xz8Var = yb2Var.a) == null) {
            xz8Var = xz8Var4;
        }
        xz8 xz8Var5 = yz8Var.a;
        xz8 xz8VarB = b(xz8Var, xz8Var5, xz8Var5, yz8Var2 != null ? yz8Var2.a : null);
        if (yb2Var == null || (xz8Var2 = yb2Var.b) == null) {
            xz8Var2 = xz8Var4;
        }
        xz8 xz8VarB2 = b(xz8Var2, xz8Var5, yz8Var.b, yz8Var2 != null ? yz8Var2.b : null);
        if (yb2Var != null && (xz8Var3 = yb2Var.c) != null) {
            xz8Var4 = xz8Var3;
        }
        return new yb2(xz8VarB, xz8VarB2, b(xz8Var4, xz8Var5, yz8Var.c, yz8Var2 != null ? yz8Var2.c : null), yz8Var, yz8Var2);
    }

    public static xz8 b(xz8 xz8Var, xz8 xz8Var2, xz8 xz8Var3, xz8 xz8Var4) {
        return xz8Var4 == null ? xz8Var3 : xz8Var instanceof xz8.b ? (((xz8Var2 instanceof xz8.c) && (xz8Var4 instanceof xz8.c)) || (xz8Var4 instanceof xz8.a)) ? xz8Var4 : xz8Var : xz8Var4;
    }

    public final void c(Function1<? super yb2, yb2> function1) {
        gse gseVar;
        Object value;
        yb2 yb2VarInvoke;
        do {
            gseVar = this.b;
            value = gseVar.getValue();
            yb2 yb2Var = (yb2) value;
            yb2VarInvoke = function1.invoke(yb2Var);
            if (wl7.b(yb2Var, yb2VarInvoke)) {
                return;
            }
        } while (!gseVar.h(value, yb2VarInvoke));
        if (yb2VarInvoke != null) {
            Iterator<Function1<yb2, j6g>> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().invoke(yb2VarInvoke);
            }
        }
    }
}
