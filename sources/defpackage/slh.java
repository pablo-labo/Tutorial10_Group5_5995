package defpackage;

import defpackage.mhh;

/* JADX INFO: loaded from: classes2.dex */
public final class slh extends mhh.a {
    public final /* synthetic */ mhh V;
    public final /* synthetic */ String e;
    public final /* synthetic */ jli f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slh(mhh mhhVar, String str, jli jliVar) {
        super(true);
        this.V = mhhVar;
        this.e = str;
        this.f = jliVar;
    }

    @Override // mhh.a
    public final void a() {
        this.V.f.getMaxUserProperties(this.e, this.f);
    }

    @Override // mhh.a
    public final void b() {
        this.f.a(null);
    }
}
