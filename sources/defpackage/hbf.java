package defpackage;

import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.gbf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hbf implements ga<gbf.a> {
    public static final hbf a = new hbf();
    public static final List<String> b = u63.Z("__typename");

    @Override // defpackage.ga
    public final gbf.a a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            str = (String) ha.a.a(mb8Var, lb3Var);
        }
        mb8Var.k();
        xaf xafVarC = bbf.c(mb8Var, lb3Var);
        if (str != null) {
            return new gbf.a(str, xafVarC);
        }
        mh2.q(mb8Var, "__typename");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, gbf.a aVar) {
        gbf.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("__typename");
        ha.a.b(hc8Var, lb3Var, aVar2.a);
        List<String> list = bbf.a;
        xaf xafVar = aVar2.b;
        hc8Var.getClass();
        lb3Var.getClass();
        xafVar.getClass();
        hc8Var.u0("label");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, xafVar.a);
        hc8Var.u0("sectionIds");
        ena enaVar = new ena(abf.a, false);
        ArrayList arrayList = xafVar.b;
        hc8Var.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            enaVar.b(hc8Var, lb3Var, it.next());
        }
        hc8Var.l();
        hc8Var.u0("suid");
        nmaVar.b(hc8Var, lb3Var, xafVar.c);
        hc8Var.u0("taxonomyConceptId");
        nmaVar.b(hc8Var, lb3Var, xafVar.d);
        hc8Var.u0("type");
        nmaVar.b(hc8Var, lb3Var, xafVar.e);
        hc8Var.u0(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX);
        ena enaVar2 = new ena(zaf.a, false);
        ArrayList arrayList2 = xafVar.f;
        hc8Var.m();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            enaVar2.b(hc8Var, lb3Var, it2.next());
        }
        hc8Var.l();
    }
}
