package defpackage;

import android.app.Activity;
import defpackage.mhh;

/* JADX INFO: loaded from: classes2.dex */
public final class vmh extends mhh.a {
    public final /* synthetic */ mhh.b V;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ jli f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmh(mhh.b bVar, Activity activity, jli jliVar) {
        super(true);
        this.V = bVar;
        this.e = activity;
        this.f = jliVar;
    }

    @Override // mhh.a
    public final void a() {
        mhh.this.f.onActivitySaveInstanceState(new vna(this.e), this.f, this.b);
    }
}
