package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class r25 {
    public static final s25 a = new s25(new gsf((k65) null, (bke) null, (t12) null, (vmd) null, (LinkedHashMap) null, 63));
    public static final s25 b = new s25(new gsf((k65) null, (bke) null, (t12) null, (vmd) null, (LinkedHashMap) null, 47));

    public abstract gsf a();

    public final s25 b(r25 r25Var) {
        k65 k65Var = r25Var.a().a;
        if (k65Var == null) {
            k65Var = a().a;
        }
        bke bkeVar = r25Var.a().b;
        if (bkeVar == null) {
            bkeVar = a().b;
        }
        t12 t12Var = r25Var.a().c;
        if (t12Var == null) {
            t12Var = a().c;
        }
        vmd vmdVar = r25Var.a().d;
        if (vmdVar == null) {
            vmdVar = a().d;
        }
        return new s25(new gsf(k65Var, bkeVar, t12Var, vmdVar, r25Var.a().e || a().e, lc9.c0(a().f, r25Var.a().f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r25) && wl7.b(((r25) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        if (equals(a)) {
            return "ExitTransition.None";
        }
        if (equals(b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        gsf gsfVarA = a();
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(gsfVarA.e);
        return sb.toString();
    }
}
