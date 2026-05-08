package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class lv4 {
    public static final mv4 a = new mv4(new gsf((k65) null, (bke) null, (t12) null, (vmd) null, (LinkedHashMap) null, 63));

    public abstract gsf a();

    public final mv4 b(lv4 lv4Var) {
        k65 k65Var = lv4Var.a().a;
        if (k65Var == null) {
            k65Var = a().a;
        }
        bke bkeVar = lv4Var.a().b;
        if (bkeVar == null) {
            bkeVar = a().b;
        }
        t12 t12Var = lv4Var.a().c;
        if (t12Var == null) {
            t12Var = a().c;
        }
        vmd vmdVar = lv4Var.a().d;
        if (vmdVar == null) {
            vmdVar = a().d;
        }
        return new mv4(new gsf(k65Var, bkeVar, t12Var, vmdVar, lc9.c0(a().f, lv4Var.a().f), 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lv4) && wl7.b(((lv4) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        if (equals(a)) {
            return "EnterTransition.None";
        }
        gsf gsfVarA = a();
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        k65 k65Var = gsfVarA.a;
        sb.append(k65Var != null ? k65Var.toString() : null);
        sb.append(",\nSlide - ");
        bke bkeVar = gsfVarA.b;
        sb.append(bkeVar != null ? bkeVar.toString() : null);
        sb.append(",\nShrink - ");
        t12 t12Var = gsfVarA.c;
        sb.append(t12Var != null ? t12Var.toString() : null);
        sb.append(",\nScale - ");
        vmd vmdVar = gsfVarA.d;
        sb.append(vmdVar != null ? vmdVar.toString() : null);
        return sb.toString();
    }
}
