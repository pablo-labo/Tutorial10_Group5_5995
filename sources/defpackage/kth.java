package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kth extends oth {
    public final transient int c;
    public final transient int d;
    final /* synthetic */ oth zzc;

    public kth(oth othVar, int i, int i2) {
        this.zzc = othVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.gth
    public final int b() {
        return this.zzc.c() + this.c + this.d;
    }

    @Override // defpackage.gth
    public final int c() {
        return this.zzc.c() + this.c;
    }

    @Override // defpackage.gth
    public final boolean e() {
        return true;
    }

    @Override // defpackage.gth
    public final Object[] f() {
        return this.zzc.f();
    }

    @Override // defpackage.oth, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final oth subList(int i, int i2) {
        beb.q(i, i2, this.d);
        oth othVar = this.zzc;
        int i3 = this.c;
        return othVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        beb.p(i, this.d);
        return this.zzc.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
