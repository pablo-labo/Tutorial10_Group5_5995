package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ckh extends gkh {
    public final transient int c;
    public final transient int d;
    final /* synthetic */ gkh zzc;

    public ckh(gkh gkhVar, int i, int i2) {
        this.zzc = gkhVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.qjh
    public final int b() {
        return this.zzc.c() + this.c + this.d;
    }

    @Override // defpackage.qjh
    public final int c() {
        return this.zzc.c() + this.c;
    }

    @Override // defpackage.qjh
    public final Object[] e() {
        return this.zzc.e();
    }

    @Override // defpackage.gkh, java.util.List
    /* JADX INFO: renamed from: g */
    public final gkh subList(int i, int i2) {
        zih.b(i, i2, this.d);
        gkh gkhVar = this.zzc;
        int i3 = this.c;
        return gkhVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zih.a(i, this.d);
        return this.zzc.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
