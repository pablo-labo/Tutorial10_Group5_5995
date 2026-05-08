package defpackage;

import defpackage.mhh;

/* JADX INFO: loaded from: classes2.dex */
public final class iih extends mhh.a {
    public final /* synthetic */ jli V;
    public final /* synthetic */ mhh W;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iih(mhh mhhVar, String str, String str2, jli jliVar) {
        super(true);
        this.W = mhhVar;
        this.e = str;
        this.f = str2;
        this.V = jliVar;
    }

    @Override // mhh.a
    public final void a() {
        this.W.f.getConditionalUserProperties(this.e, this.f, this.V);
    }

    @Override // mhh.a
    public final void b() {
        this.V.a(null);
    }
}
