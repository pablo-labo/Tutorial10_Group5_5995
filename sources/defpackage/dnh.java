package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dnh extends mnh {
    public final transient int c;
    public final transient int d;
    final /* synthetic */ mnh zzc;

    public dnh(mnh mnhVar, int i, int i2) {
        this.zzc = mnhVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.wmh
    public final int b() {
        return this.zzc.c() + this.c + this.d;
    }

    @Override // defpackage.wmh
    public final int c() {
        return this.zzc.c() + this.c;
    }

    @Override // defpackage.wmh
    public final Object[] d() {
        return this.zzc.d();
    }

    @Override // defpackage.mnh, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final mnh subList(int i, int i2) {
        zlh.c(i, i2, this.d);
        mnh mnhVar = this.zzc;
        int i3 = this.c;
        return mnhVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zlh.a(i, this.d);
        return this.zzc.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
