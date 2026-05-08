package defpackage;

import defpackage.qu2;

/* JADX INFO: loaded from: classes3.dex */
public final class x03 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, java.lang.Object] */
    public static final v03 a(v03 v03Var, v03 v03Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 1;
        byte b = 0;
        boolean zBooleanValue = ((Boolean) v03Var.j1(bool, new fj2(i, b))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) v03Var2.j1(bool, new fj2(i, b))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return v03Var.d1(v03Var2);
        }
        luc lucVar = new luc();
        lucVar.element = v03Var2;
        w03 w03Var = new w03(lucVar, z);
        vr4 vr4Var = vr4.a;
        v03 v03Var3 = (v03) v03Var.j1(vr4Var, w03Var);
        if (zBooleanValue2) {
            lucVar.element = ((v03) lucVar.element).j1(vr4Var, new dm0(4, b));
        }
        return v03Var3.d1((v03) lucVar.element);
    }

    public static final v03 b(e13 e13Var, v03 v03Var) {
        v03 v03VarA = a(e13Var.getCoroutineContext(), v03Var, true);
        eq3 eq3Var = a74.a;
        return (v03VarA == eq3Var || v03VarA.h1(qu2.a.a) != null) ? v03VarA : v03VarA.d1(eq3Var);
    }

    public static final z5g<?> c(lu2<?> lu2Var, v03 v03Var, Object obj) {
        z5g<?> z5gVar = null;
        if ((lu2Var instanceof h13) && v03Var.h1(b6g.a) != null) {
            h13 callerFrame = (h13) lu2Var;
            while (true) {
                if ((callerFrame instanceof w64) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof z5g) {
                    z5gVar = (z5g) callerFrame;
                    break;
                }
            }
            if (z5gVar != null) {
                z5gVar.t0(v03Var, obj);
            }
        }
        return z5gVar;
    }
}
