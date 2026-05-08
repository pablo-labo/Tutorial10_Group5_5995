package defpackage;

import android.content.Context;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ft2;
import defpackage.w27;

/* JADX INFO: loaded from: classes.dex */
public final class mkg {
    public static final y03 a;

    static {
        y03 y03VarJ1;
        try {
            eq3 eq3Var = a74.a;
            y03VarJ1 = m89.a.J1();
            y03VarJ1.A1(vr4.a);
        } catch (Throwable unused) {
            y03VarJ1 = a74.b;
        }
        a = y03VarJ1;
    }

    public static final qv0 a(Object obj, m17 m17Var, b bVar) {
        return new qv0(obj, (jv0) bVar.M(i09.a), m17Var);
    }

    public static final e13 b(b bVar) {
        v03 v03VarJ1;
        v03 v03VarD1;
        Object objV = bVar.v();
        Object obj = b.a.a;
        if (objV == obj) {
            m74 m74Var = to4.a;
            objV = new e(new k(bVar.l()));
            bVar.p(objV);
        }
        e13 e13Var = ((e) objV).a;
        boolean zBooleanValue = ((Boolean) bVar.M(uf7.a)).booleanValue();
        boolean zK = bVar.K(e13Var) | bVar.a(zBooleanValue);
        Object objV2 = bVar.v();
        if (zK || objV2 == obj) {
            if (zBooleanValue) {
                v03VarD1 = e13Var.getCoroutineContext().d1(a74.b);
            } else {
                v03 coroutineContext = e13Var.getCoroutineContext();
                y03 y03Var = (y03) coroutineContext.h1(y03.b);
                if (y03Var instanceof k89) {
                    try {
                        v03VarJ1 = ((k89) y03Var).J1();
                    } catch (UnsupportedOperationException unused) {
                        v03VarJ1 = a;
                    }
                    v03VarD1 = coroutineContext.d1(v03VarJ1);
                } else {
                    v03VarJ1 = a;
                    v03VarD1 = coroutineContext.d1(v03VarJ1);
                }
            }
            objV2 = f13.a(v03VarD1);
            bVar.p(objV2);
        }
        return (e13) objV2;
    }

    public static final w27 c(Object obj, b bVar) {
        bVar.L(1319639034);
        if (obj instanceof w27) {
            bVar.L(-72322677);
            w27 w27Var = (w27) obj;
            bVar.F();
            bVar.F();
            return w27Var;
        }
        bVar.L(-72283431);
        Context context = (Context) bVar.M(AndroidCompositionLocals_androidKt.b);
        boolean zK = bVar.K(context) | bVar.K(obj);
        Object objV = bVar.v();
        if (zK || objV == b.a.a) {
            w27.a aVar = new w27.a(context);
            aVar.c = obj;
            objV = aVar.a();
            bVar.p(objV);
        }
        w27 w27Var2 = (w27) objV;
        bVar.F();
        bVar.F();
        return w27Var2;
    }

    public static final w27 d(Object obj, ft2 ft2Var, b bVar) {
        rie rieVar;
        bVar.L(-329318062);
        boolean z = obj instanceof w27;
        if (z) {
            w27 w27Var = (w27) obj;
            if (w27Var.t.g != null) {
                bVar.F();
                return w27Var;
            }
        }
        boolean zB = wl7.b(ft2Var, ft2.a.f);
        Object obj2 = b.a.a;
        if (zB) {
            bVar.L(-858313867);
            bVar.F();
            rieVar = rie.a;
        } else {
            bVar.L(-858270839);
            Object objV = bVar.v();
            if (objV == obj2) {
                objV = new nq2();
                bVar.p(objV);
            }
            rieVar = (nq2) objV;
            bVar.F();
        }
        if (z) {
            bVar.L(-858186178);
            w27 w27Var2 = (w27) obj;
            boolean zK = bVar.K(w27Var2) | bVar.K(rieVar);
            Object objV2 = bVar.v();
            if (zK || objV2 == obj2) {
                w27.a aVarA = w27.a(w27Var2);
                aVarA.m = rieVar;
                objV2 = aVarA.a();
                bVar.p(objV2);
            }
            w27 w27Var3 = (w27) objV2;
            bVar.F();
            bVar.F();
            return w27Var3;
        }
        bVar.L(-858022374);
        Context context = (Context) bVar.M(AndroidCompositionLocals_androidKt.b);
        boolean zK2 = bVar.K(context) | bVar.K(obj) | bVar.K(rieVar);
        Object objV3 = bVar.v();
        if (zK2 || objV3 == obj2) {
            w27.a aVar = new w27.a(context);
            aVar.c = obj;
            aVar.m = rieVar;
            objV3 = aVar.a();
            bVar.p(objV3);
        }
        w27 w27Var4 = (w27) objV3;
        bVar.F();
        bVar.F();
        return w27Var4;
    }
}
