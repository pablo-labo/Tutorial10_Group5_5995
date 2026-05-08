package defpackage;

import defpackage.hva;
import defpackage.ic5;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class vaf {
    public static final x73 a(ic5.c cVar) {
        w73 w73Var = new w73(cVar.a, cVar.b);
        ic5.d dVar = cVar.c;
        ArrayList arrayList = null;
        w73 w73Var2 = new w73(dVar != null ? dVar.a : null, dVar != null ? dVar.b : null);
        if (dVar != null) {
            ArrayList<ic5.g> arrayList2 = dVar.c;
            ArrayList arrayList3 = new ArrayList(t92.r0(arrayList2, 10));
            for (ic5.g gVar : arrayList2) {
                w73 w73Var3 = new w73(gVar.a, gVar.b);
                ic5.e eVar = gVar.c;
                arrayList3.add(new y73(w73Var3, new a83(new w73(eVar != null ? eVar.a : null, eVar != null ? eVar.b : null))));
            }
            arrayList = arrayList3;
        }
        return new x73(w73Var, new z73(w73Var2, arrayList));
    }

    public static final fag b(wj8 wj8Var) throws Exception {
        xeg xegVar;
        xeg xegVar2;
        wj8Var.getClass();
        String str = wj8Var.d;
        String str2 = wj8Var.e;
        String str3 = wj8Var.b;
        String str4 = wj8Var.c;
        String str5 = wj8Var.a;
        if (str5 == null) {
            throw new Exception("Could not map LanguageSkillItem to UpdateJobSeekerProfileLanguageInput: LanguageSkillItem.id is null");
        }
        zeg zegVar = null;
        if (str4 != null) {
            xegVar = new xeg(str3 == null ? hva.a.a : new hva.c(str3), new hva.c(str4), 28);
        } else {
            xegVar = null;
        }
        zeg zegVar2 = new zeg(str3 == null ? hva.a.a : new hva.c(str3), xegVar == null ? hva.a.a : new hva.c(xegVar));
        if (str2 != null) {
            xegVar2 = new xeg(str == null ? hva.a.a : new hva.c(str), new hva.c(str2), 28);
        } else {
            xegVar2 = null;
        }
        if (str != null) {
            zegVar = new zeg(new hva.c(str), xegVar2 == null ? hva.a.a : new hva.c(xegVar2));
        }
        return new fag(str5, new hva.c(zegVar2), zegVar == null ? hva.a.a : new hva.c(zegVar));
    }
}
