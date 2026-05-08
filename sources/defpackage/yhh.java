package defpackage;

import android.os.Bundle;
import defpackage.mhh;

/* JADX INFO: loaded from: classes2.dex */
public final class yhh extends mhh.a {
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ mhh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhh(mhh mhhVar, Bundle bundle) {
        super(true);
        this.f = mhhVar;
        this.e = bundle;
    }

    @Override // mhh.a
    public final void a() {
        this.f.f.setConditionalUserProperty(this.e, this.a);
    }
}
