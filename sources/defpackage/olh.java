package defpackage;

import defpackage.mhh;

/* JADX INFO: loaded from: classes2.dex */
public final class olh extends mhh.a {
    public final /* synthetic */ boolean V;
    public final /* synthetic */ jli W;
    public final /* synthetic */ mhh X;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olh(mhh mhhVar, String str, String str2, boolean z, jli jliVar) {
        super(true);
        this.X = mhhVar;
        this.e = str;
        this.f = str2;
        this.V = z;
        this.W = jliVar;
    }

    @Override // mhh.a
    public final void a() {
        this.X.f.getUserProperties(this.e, this.f, this.V, this.W);
    }

    @Override // mhh.a
    public final void b() {
        this.W.a(null);
    }
}
