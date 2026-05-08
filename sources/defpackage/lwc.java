package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lwc {
    public static final pz3 a = mz3.a;

    public static void a(hv1 hv1Var, StringBuilder sb) {
        hsc hscVarG = akg.g(hv1Var);
        hsc hscVarO = hv1Var.O();
        pz3 pz3Var = a;
        if (hscVarG != null) {
            ui8 type = hscVarG.getType();
            type.getClass();
            sb.append(pz3Var.X(type));
            sb.append(".");
        }
        boolean z = (hscVarG == null || hscVarO == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        if (hscVarO != null) {
            ui8 type2 = hscVarO.getType();
            type2.getClass();
            sb.append(pz3Var.X(type2));
            sb.append(".");
        }
        if (z) {
            sb.append(")");
        }
    }

    public static String b(kv5 kv5Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        a(kv5Var, sb);
        n8a name = kv5Var.getName();
        name.getClass();
        pz3 pz3Var = a;
        sb.append(pz3Var.P(name, true));
        List<rlg> listI = kv5Var.i();
        listI.getClass();
        z92.V0(listI, sb, ", ", "(", ")", np1.d, 48);
        sb.append(": ");
        ui8 returnType = kv5Var.getReturnType();
        returnType.getClass();
        sb.append(pz3Var.X(returnType));
        return sb.toString();
    }

    public static String c(d4c d4cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(d4cVar.N() ? "var " : "val ");
        a(d4cVar, sb);
        n8a name = d4cVar.getName();
        name.getClass();
        pz3 pz3Var = a;
        sb.append(pz3Var.P(name, true));
        sb.append(": ");
        ui8 type = d4cVar.getType();
        type.getClass();
        sb.append(pz3Var.X(type));
        return sb.toString();
    }
}
