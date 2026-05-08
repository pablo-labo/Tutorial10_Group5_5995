package defpackage;

import android.os.Trace;
import defpackage.lz8;
import defpackage.v20;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lg2 implements jg2, lz8.a {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lg2(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        String str = (String) this.a;
        uf2 uf2Var = (uf2) this.b;
        try {
            Trace.beginSection(str);
            return uf2Var.f.d(l7dVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((v20) obj).l((v20.a) this.a, (nj9) this.b);
    }
}
