package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d1g implements c1g {
    public final g3a<jz2<j6g>> a;
    public final g3a b;
    public boolean c;

    public d1g() {
        g3a<jz2<j6g>> g3aVar = new g3a<>();
        this.a = g3aVar;
        this.b = g3aVar;
    }

    @Override // defpackage.c1g
    public final void a() {
        if (!this.c) {
            ArrayList arrayList = lz2.a;
            lz2.d("UIPDeepLinksImpl", "No deep link handling in progress: no-op.", false, null);
        } else {
            ArrayList arrayList2 = lz2.a;
            lz2.d("UIPDeepLinksImpl", "Publishing deep-link-load-complete event.", false, null);
            this.a.k(new jz2<>(j6g.a));
        }
    }
}
