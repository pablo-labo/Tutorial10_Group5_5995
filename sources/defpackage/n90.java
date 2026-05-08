package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n90 extends tdd implements mdd {
    public ldd n0;
    public ndd o0;

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        ldd lddVar = this.n0;
        if (lddVar != null) {
            g1();
            gg1 gg1Var = lddVar.d;
            ndd nddVar = (ndd) ((LinkedHashMap) gg1Var.a).get(this);
            if (nddVar != null) {
                nddVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) gg1Var.a;
                ndd nddVar2 = (ndd) linkedHashMap.get(this);
                if (nddVar2 != null) {
                }
                linkedHashMap.remove(this);
                lddVar.c.add(nddVar);
            }
        }
    }

    @Override // defpackage.mdd
    public final void g1() {
        this.o0 = null;
        fb4.a(this);
    }
}
