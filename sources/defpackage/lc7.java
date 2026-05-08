package defpackage;

import androidx.compose.runtime.b;
import defpackage.jc7;
import jc7.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lc7 {
    public static final jc7.a a(jc7 jc7Var, float f, ic7 ic7Var, String str, b bVar, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        int i3 = i << 3;
        return b(jc7Var, Float.valueOf(0.0f), Float.valueOf(f), q92.c0, ic7Var, str2, bVar, (i & 1022) | (57344 & i3) | (i3 & 458752), 0);
    }

    public static final jc7.a b(jc7 jc7Var, Number number, Number number2, mvf mvfVar, ic7 ic7Var, String str, b bVar, int i, int i2) {
        jc7 jc7Var2;
        Object obj;
        Object objV = bVar.v();
        b.a.C0020a c0020a = b.a.a;
        if (objV == c0020a) {
            jc7Var2 = jc7Var;
            jc7.a aVar = jc7Var2.new a(number, number2, mvfVar, ic7Var);
            obj = number2;
            bVar.p(aVar);
            objV = aVar;
        } else {
            jc7Var2 = jc7Var;
            obj = number2;
        }
        jc7.a aVar2 = (jc7.a) objV;
        boolean z = ((((i & 112) ^ 48) > 32 && bVar.x(number)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && bVar.x(obj)) || (i & 384) == 256) | ((((57344 & i) ^ 24576) > 16384 && bVar.x(ic7Var)) || (i & 24576) == 16384);
        Object objV2 = bVar.v();
        if (z || objV2 == c0020a) {
            jc jcVar = new jc(number, aVar2, obj, ic7Var, 1);
            bVar.p(jcVar);
            objV2 = jcVar;
        }
        m74 m74Var = to4.a;
        bVar.E((gu5) objV2);
        boolean zX = bVar.x(jc7Var2);
        Object objV3 = bVar.v();
        if (zX || objV3 == c0020a) {
            objV3 = new kc(1, jc7Var2, aVar2);
            bVar.p(objV3);
        }
        to4.b(aVar2, (Function1) objV3, bVar);
        return aVar2;
    }

    public static final jc7 c(String str, b bVar, int i) {
        Object objV = bVar.v();
        if (objV == b.a.a) {
            objV = new jc7();
            bVar.p(objV);
        }
        jc7 jc7Var = (jc7) objV;
        jc7Var.a(0, bVar);
        return jc7Var;
    }
}
