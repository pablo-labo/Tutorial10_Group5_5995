package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n7h extends o7h {
    public final transient int V;
    final /* synthetic */ o7h c;
    public final transient int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7h(o7h o7hVar, int i, int i2) {
        super(0);
        this.c = o7hVar;
        this.f = i;
        this.V = i2;
    }

    @Override // defpackage.l7h
    public final int b() {
        return this.c.c() + this.f + this.V;
    }

    @Override // defpackage.l7h
    public final int c() {
        return this.c.c() + this.f;
    }

    @Override // defpackage.l7h
    public final Object[] d() {
        return this.c.d();
    }

    @Override // java.util.List
    public final Object get(int i) {
        j7h.a(i, this.V);
        return this.c.get(i + this.f);
    }

    @Override // defpackage.o7h, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final o7h subList(int i, int i2) {
        j7h.b(i, i2, this.V);
        o7h o7hVar = this.c;
        int i3 = this.f;
        return o7hVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.V;
    }
}
