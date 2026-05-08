package defpackage;

import defpackage.kza;
import defpackage.xz8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gh5<T> {
    public int a;
    public int b;
    public final zs0<nrf<T>> c = new zs0<>();
    public final h3a d = new h3a();
    public yz8 e;
    public boolean f;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void a(kza<T> kzaVar) {
        kzaVar.getClass();
        this.f = true;
        boolean z = kzaVar instanceof kza.b;
        h3a h3aVar = this.d;
        zs0<nrf<T>> zs0Var = this.c;
        if (!z) {
            if (kzaVar instanceof kza.a) {
                h3aVar.c(null, xz8.c.c);
                throw null;
            }
            if (kzaVar instanceof kza.c) {
                kza.c cVar = (kza.c) kzaVar;
                h3aVar.b(cVar.a);
                this.e = cVar.b;
                return;
            } else {
                if (kzaVar instanceof kza.d) {
                    zs0Var.clear();
                    this.b = 0;
                    this.a = 0;
                    new nrf(0, null);
                    throw null;
                }
                return;
            }
        }
        kza.b bVar = (kza.b) kzaVar;
        yz8 yz8Var = bVar.e;
        int i = bVar.c;
        int i2 = bVar.d;
        List<nrf<T>> list = bVar.b;
        h3aVar.b(yz8Var);
        this.e = bVar.f;
        int iOrdinal = bVar.a.ordinal();
        if (iOrdinal == 0) {
            zs0Var.clear();
            this.b = i2;
            this.a = i;
            zs0Var.addAll(list);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return;
            }
            this.b = i2;
            zs0Var.addAll(list);
            return;
        }
        this.a = i;
        int size = list.size() - 1;
        nh7 nh7Var = new nh7(size, ojh.o(size, 0, -1), -1);
        while (nh7Var.c) {
            zs0Var.addFirst(list.get(nh7Var.nextInt()));
        }
    }

    public final List<kza<T>> b() {
        if (!this.f) {
            return zr4.a;
        }
        ArrayList arrayList = new ArrayList();
        yz8 yz8VarD = this.d.d();
        zs0<nrf<T>> zs0Var = this.c;
        if (zs0Var.isEmpty()) {
            arrayList.add(new kza.c(yz8VarD, this.e));
            return arrayList;
        }
        kza.b<Object> bVar = kza.b.g;
        arrayList.add(new kza.b(zz8.a, z92.z1(zs0Var), this.a, this.b, yz8VarD, this.e));
        return arrayList;
    }
}
