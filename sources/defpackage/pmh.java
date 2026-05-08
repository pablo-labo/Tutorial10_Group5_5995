package defpackage;

import android.app.Activity;
import android.os.Bundle;
import defpackage.mhh;

/* JADX INFO: loaded from: classes2.dex */
public final class pmh extends mhh.a {
    public final /* synthetic */ mhh.b V;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ Bundle f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmh(mhh.b bVar, Activity activity, Bundle bundle) {
        super(true);
        this.V = bVar;
        this.e = activity;
        this.f = bundle;
    }

    @Override // mhh.a
    public final void a() {
        mhh.this.f.onActivityCreated(new vna(this.e), this.f, this.b);
    }
}
