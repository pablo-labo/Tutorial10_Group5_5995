package defpackage;

import defpackage.mhh;

/* JADX INFO: loaded from: classes2.dex */
public final class zjh extends mhh.a {
    public final /* synthetic */ jli e;
    public final /* synthetic */ mhh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjh(mhh mhhVar, jli jliVar) {
        super(true);
        this.f = mhhVar;
        this.e = jliVar;
    }

    @Override // mhh.a
    public final void a() {
        this.f.f.getCachedAppInstanceId(this.e);
    }

    @Override // mhh.a
    public final void b() {
        this.e.a(null);
    }
}
