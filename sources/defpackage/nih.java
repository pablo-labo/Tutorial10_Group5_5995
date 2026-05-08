package defpackage;

import android.os.Bundle;
import defpackage.mhh;

/* JADX INFO: loaded from: classes2.dex */
public final class nih extends mhh.a {
    public final /* synthetic */ Bundle V;
    public final /* synthetic */ mhh W;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nih(mhh mhhVar, String str, String str2, Bundle bundle) {
        super(true);
        this.W = mhhVar;
        this.e = str;
        this.f = str2;
        this.V = bundle;
    }

    @Override // mhh.a
    public final void a() {
        this.W.f.clearConditionalUserProperty(this.e, this.f, this.V);
    }
}
