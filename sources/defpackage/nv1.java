package defpackage;

import defpackage.go5;
import defpackage.vyf;

/* JADX INFO: loaded from: classes.dex */
public final class nv1 {
    public final vyf.a a;
    public final a4d b;

    public nv1(vyf.a aVar, a4d a4dVar) {
        this.a = aVar;
        this.b = a4dVar;
    }

    public final void a(go5.a aVar) {
        int i = aVar.b;
        a4d a4dVar = this.b;
        vyf.a aVar2 = this.a;
        if (i == 0) {
            a4dVar.execute(new l8(1, aVar2, aVar.a));
        } else {
            a4dVar.execute(new mv1(aVar2, i, 0));
        }
    }
}
