package defpackage;

import defpackage.mhh;

/* JADX INFO: loaded from: classes2.dex */
public final class ljh extends mhh.a {
    public final /* synthetic */ String e;
    public final /* synthetic */ mhh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljh(mhh mhhVar, String str) {
        super(true);
        this.f = mhhVar;
        this.e = str;
    }

    @Override // mhh.a
    public final void a() {
        this.f.f.beginAdUnitExposure(this.e, this.b);
    }
}
