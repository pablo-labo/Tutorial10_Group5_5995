package defpackage;

import defpackage.wr3;

/* JADX INFO: loaded from: classes2.dex */
public final class mva<T> implements j6c<T>, wr3<T> {
    public static final t40 c = new t40(13);
    public static final lva d = new lva();
    public wr3.a<T> a;
    public volatile j6c<T> b;

    public mva(t40 t40Var, j6c j6cVar) {
        this.a = t40Var;
        this.b = j6cVar;
    }

    public final void a(wr3.a<T> aVar) {
        j6c<T> j6cVar;
        j6c<T> j6cVar2;
        j6c<T> j6cVar3 = this.b;
        lva lvaVar = d;
        if (j6cVar3 != lvaVar) {
            aVar.j(j6cVar3);
            return;
        }
        synchronized (this) {
            j6cVar = this.b;
            if (j6cVar != lvaVar) {
                j6cVar2 = j6cVar;
            } else {
                this.a = new c97(this.a, aVar);
                j6cVar2 = null;
            }
        }
        if (j6cVar2 != null) {
            aVar.j(j6cVar);
        }
    }

    @Override // defpackage.j6c
    public final T get() {
        return this.b.get();
    }
}
