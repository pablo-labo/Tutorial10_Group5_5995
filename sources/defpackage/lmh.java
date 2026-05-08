package defpackage;

import android.os.Bundle;
import defpackage.mhh;

/* JADX INFO: loaded from: classes2.dex */
public final class lmh extends mhh.a {
    public final /* synthetic */ Bundle V;
    public final /* synthetic */ boolean W;
    public final /* synthetic */ mhh X;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmh(mhh mhhVar, String str, String str2, Bundle bundle, boolean z) {
        super(true);
        this.X = mhhVar;
        this.e = str;
        this.f = str2;
        this.V = bundle;
        this.W = z;
    }

    @Override // mhh.a
    public final void a() {
        this.X.f.logEvent(this.e, this.f, this.V, this.W, true, this.a);
    }
}
