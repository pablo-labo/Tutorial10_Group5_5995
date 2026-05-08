package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class t6b implements k0d {
    public final Set<k0d> a;
    public final j4a<l0d> b = new j4a<>(new l0d[16]);

    public t6b(Set<k0d> set) {
        this.a = set;
    }

    @Override // defpackage.k0d
    public final void b() {
        j4a<l0d> j4aVar = this.b;
        l0d[] l0dVarArr = j4aVar.a;
        int i = j4aVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            k0d k0dVar = l0dVarArr[i2].a;
            this.a.remove(k0dVar);
            k0dVar.b();
        }
    }

    @Override // defpackage.k0d
    public final void d() {
    }

    @Override // defpackage.k0d
    public final void e() {
    }
}
