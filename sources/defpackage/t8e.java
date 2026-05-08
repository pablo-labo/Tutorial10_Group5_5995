package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t8e {
    public final Context a;
    public mqf b;
    public iq4 c;
    public cxe d;
    public oqf e;
    public final nqf f;
    public final pfa g;
    public final dxe h;
    public final jq4 i;
    public final y8e j;
    public final mw5 k;
    public final ArrayList l;

    public t8e(Context context, pfa pfaVar, List list) {
        new d2f(new o8e(this));
        new d2f(new s8e(this));
        new d2f(new r8e(this));
        this.l = new ArrayList();
        this.a = context;
        this.f = new nqf();
        this.g = new pfa();
        this.h = new dxe();
        this.i = new jq4();
        this.j = new y8e(null, null);
        this.k = new mw5();
        b().j(pfaVar);
        f(list);
        c();
    }

    public final jq4 a() {
        jq4 jq4Var = this.i;
        if (jq4Var != null) {
            return jq4Var;
        }
        wl7.g("emitterConfiguration");
        throw null;
    }

    public final pfa b() {
        pfa pfaVar = this.g;
        if (pfaVar != null) {
            return pfaVar;
        }
        wl7.g("networkConfiguration");
        throw null;
    }

    public final mqf c() {
        iq4 iq4Var;
        yq2<y9e> yq2VarE;
        mqf mqfVar = this.b;
        if (mqfVar != null) {
            return mqfVar;
        }
        iq4 iq4Var2 = this.c;
        Context context = this.a;
        if (iq4Var2 == null) {
            String strB = b().b();
            if (strB == null) {
                strB = "";
            }
            iq4 iq4Var3 = new iq4(a().f(), context, strB, new p8e(this));
            if (a().m()) {
                iq4Var3.d.set(true);
            }
            this.c = iq4Var3;
            iq4Var = iq4Var3;
        } else {
            iq4Var = iq4Var2;
        }
        cxe cxeVar = this.d;
        if (cxeVar == null) {
            dxe dxeVar = this.h;
            if (dxeVar == null) {
                wl7.g("subjectConfiguration");
                throw null;
            }
            cxeVar = new cxe(context, dxeVar);
            this.d = cxeVar;
        }
        mqf mqfVar2 = new mqf(iq4Var, e().f(), e().s(), e().t(), this.a, new q8e(cxeVar, this));
        if (e().B() && mqfVar2.f.compareAndSet(true, false)) {
            mqfVar2.b();
            mqfVar2.h.d();
        }
        if (d().f()) {
            mqfVar2.b();
        }
        u8e u8eVar = mqfVar2.j;
        if (u8eVar != null && (yq2VarE = d().e()) != null) {
            u8eVar.o = yq2VarE;
        }
        this.b = mqfVar2;
        return mqfVar2;
    }

    public final y8e d() {
        y8e y8eVar = this.j;
        if (y8eVar != null) {
            return y8eVar;
        }
        wl7.g("sessionConfiguration");
        throw null;
    }

    public final nqf e() {
        nqf nqfVar = this.f;
        if (nqfVar != null) {
            return nqfVar;
        }
        wl7.g("trackerConfiguration");
        throw null;
    }

    public final void f(List<? extends do2> list) {
        for (do2 do2Var : list) {
            if (do2Var instanceof pfa) {
                b().j((pfa) do2Var);
            } else if (do2Var instanceof nqf) {
                e().J((nqf) do2Var);
            } else if (do2Var instanceof dxe) {
                dxe dxeVar = this.h;
                if (dxeVar == null) {
                    wl7.g("subjectConfiguration");
                    throw null;
                }
                dxeVar.l((dxe) do2Var);
            } else if (do2Var instanceof y8e) {
                d().g((y8e) do2Var);
            } else if (do2Var instanceof jq4) {
                a().n((jq4) do2Var);
            } else if (do2Var instanceof mw5) {
                mw5 mw5Var = this.k;
                if (mw5Var == null) {
                    wl7.g("gdprConfiguration");
                    throw null;
                }
                mw5Var.f((mw5) do2Var);
            } else {
                boolean z = do2Var instanceof t96;
                ArrayList arrayList = this.l;
                if (z) {
                    Iterator it = ((t96) do2Var).a().iterator();
                    while (it.hasNext()) {
                        arrayList.add((s96) it.next());
                    }
                } else if (do2Var instanceof ceb) {
                    arrayList.add(do2Var);
                }
            }
        }
    }
}
