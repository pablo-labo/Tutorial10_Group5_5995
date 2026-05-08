package defpackage;

import defpackage.s98;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class sa8 {
    public static ra8 a(Function1 function1) {
        s98.a aVar = s98.d;
        aVar.getClass();
        function1.getClass();
        y98 y98Var = new y98();
        aa8 aa8Var = aVar.a;
        y98Var.a = aa8Var.c;
        y98Var.b = aa8Var.a;
        y98Var.c = aa8Var.b;
        String str = aa8Var.d;
        y98Var.d = aa8Var.e;
        z52 z52Var = aa8Var.g;
        boolean z = aa8Var.f;
        v1 v1Var = aVar.b;
        function1.invoke(y98Var);
        if (!wl7.b(str, "    ")) {
            l5.q("Indent should not be specified when default printing mode is used");
            return null;
        }
        aa8 aa8Var2 = new aa8(y98Var.b, y98Var.c, y98Var.a, str, y98Var.d, z, z52Var);
        v1Var.getClass();
        ra8 ra8Var = new ra8(aa8Var2, v1Var);
        if (v1Var.equals(i8e.a)) {
            return ra8Var;
        }
        v1Var.R(new qb8());
        return ra8Var;
    }
}
