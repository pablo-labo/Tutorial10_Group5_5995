package defpackage;

import defpackage.mhh;

/* JADX INFO: loaded from: classes2.dex */
public final class jmh extends mhh.a {
    public final /* synthetic */ Object e;
    public final /* synthetic */ mhh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmh(mhh mhhVar, Object obj) {
        super(true);
        this.f = mhhVar;
        this.e = obj;
    }

    @Override // mhh.a
    public final void a() {
        this.f.f.setUserProperty("fcm", "_ln", new vna(this.e), true, this.a);
    }
}
