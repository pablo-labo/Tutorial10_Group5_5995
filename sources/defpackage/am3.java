package defpackage;

import com.facebook.imagepipeline.request.a;

/* JADX INFO: loaded from: classes2.dex */
public final class am3 {
    public static am3 a;

    public final vg1 a(a aVar, Object obj) {
        vg1 vg1Var = new vg1(aVar.b.toString(), aVar.h, aVar.i, aVar.g, null, null);
        vg1Var.g = obj;
        return vg1Var;
    }

    public final lfe b(a aVar, Object obj) {
        return new lfe(aVar.b.toString());
    }

    public final vg1 c(a aVar, Object obj) {
        ot1 ot1Var;
        String name;
        vhb vhbVar = aVar.p;
        if (vhbVar != null) {
            ot1 ot1VarC = vhbVar.c();
            name = vhbVar.getClass().getName();
            ot1Var = ot1VarC;
        } else {
            ot1Var = null;
            name = null;
        }
        vg1 vg1Var = new vg1(aVar.b.toString(), aVar.h, aVar.i, aVar.g, ot1Var, name);
        vg1Var.g = obj;
        return vg1Var;
    }
}
