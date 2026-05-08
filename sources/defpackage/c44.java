package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c44 {
    public static final String a = z39.f("DiagnosticsWrkr");

    public static final String a(a3h a3hVar, a4h a4hVar, v2f v2fVar, List list) throws IOException {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r3h r3hVar = (r3h) it.next();
            r2h r2hVarD = yid.d(r3hVar);
            String str = r3hVar.a;
            u2f u2fVarC = v2fVar.c(r2hVarD);
            Integer numValueOf = u2fVarC != null ? Integer.valueOf(u2fVarC.c) : null;
            String strW0 = z92.W0(a3hVar.b(str), ",", null, null, null, 62);
            String strW02 = z92.W0(a4hVar.a(str), ",", null, null, null, 62);
            StringBuilder sbM = akb.m("\n", str, "\t ");
            sbM.append(r3hVar.c);
            sbM.append("\t ");
            sbM.append(numValueOf);
            sbM.append("\t ");
            sbM.append(r3hVar.b.name());
            sbM.append("\t ");
            sbM.append(strW0);
            sbM.append("\t ");
            sbM.append(strW02);
            sbM.append('\t');
            sb.append(sbM.toString());
        }
        return sb.toString();
    }
}
