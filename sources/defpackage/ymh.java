package defpackage;

import android.app.Activity;
import defpackage.mhh;

/* JADX INFO: loaded from: classes2.dex */
public final class ymh extends mhh.a {
    public final /* synthetic */ Activity e;
    public final /* synthetic */ mhh.b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymh(mhh.b bVar, Activity activity) {
        super(true);
        this.f = bVar;
        this.e = activity;
    }

    @Override // mhh.a
    public final void a() {
        mhh.this.f.onActivityStopped(new vna(this.e), this.b);
    }
}
