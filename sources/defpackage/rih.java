package defpackage;

import android.app.Activity;
import defpackage.mhh;

/* JADX INFO: loaded from: classes2.dex */
public final class rih extends mhh.a {
    public final /* synthetic */ String V;
    public final /* synthetic */ mhh W;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rih(mhh mhhVar, Activity activity, String str, String str2) {
        super(true);
        this.W = mhhVar;
        this.e = activity;
        this.f = str;
        this.V = str2;
    }

    @Override // mhh.a
    public final void a() {
        this.W.f.setCurrentScreen(new vna(this.e), this.f, this.V, this.a);
    }
}
