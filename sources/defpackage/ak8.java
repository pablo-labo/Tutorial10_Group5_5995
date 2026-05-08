package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.xj8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ak8 implements ga<xj8> {
    public static final List<String> a = u63.a0("id", "taxonomyConceptLanguage", "taxonomyConceptProficiency");

    public static xj8 c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        xj8.e eVar = null;
        xj8.h hVar = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            if (iD1 != 0) {
                mb8.a aVar = mb8.a.Y;
                if (iD1 == 1) {
                    dk8 dk8Var = dk8.a;
                    ha.g gVar = ha.a;
                    ena enaVar = new ena(dk8Var, false);
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA2 = null;
                    } else {
                        objA2 = enaVar.a(mb8Var, lb3Var);
                    }
                    eVar = (xj8.e) objA2;
                } else {
                    if (iD1 != 2) {
                        break;
                    }
                    gk8 gk8Var = gk8.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar2 = new ena(gk8Var, false);
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar2.a(mb8Var, lb3Var);
                    }
                    hVar = (xj8.h) objA;
                }
            } else {
                str = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new xj8(str, eVar, hVar);
        }
        mh2.q(mb8Var, "id");
        throw null;
    }
}
