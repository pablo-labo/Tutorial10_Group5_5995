package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class khh extends shh {
    public final transient int V;
    public final transient int f;
    final /* synthetic */ shh zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khh(shh shhVar, int i, int i2) {
        super(1);
        this.zzc = shhVar;
        this.f = i;
        this.V = i2;
    }

    @Override // defpackage.l7h
    public final Object[] e() {
        return this.zzc.e();
    }

    @Override // defpackage.l7h
    public final int f() {
        return this.zzc.f() + this.f;
    }

    @Override // defpackage.l7h
    public final int g() {
        return this.zzc.f() + this.f + this.V;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qki.a(i, this.V);
        return this.zzc.get(i + this.f);
    }

    @Override // defpackage.shh, java.util.List
    /* JADX INFO: renamed from: k */
    public final shh subList(int i, int i2) {
        qki.b(i, i2, this.V);
        shh shhVar = this.zzc;
        int i3 = this.f;
        return shhVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.V;
    }
}
