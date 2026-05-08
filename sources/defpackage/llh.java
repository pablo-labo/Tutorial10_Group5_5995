package defpackage;

import defpackage.mhh;

/* JADX INFO: loaded from: classes2.dex */
public final class llh extends mhh.a {
    public final /* synthetic */ Exception e;
    public final /* synthetic */ mhh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llh(mhh mhhVar, Exception exc) {
        super(false);
        this.f = mhhVar;
        this.e = exc;
    }

    @Override // mhh.a
    public final void a() {
        this.f.f.logHealthData(5, "Error with data collection. Data lost.", new vna(this.e), new vna(null), new vna(null));
    }
}
