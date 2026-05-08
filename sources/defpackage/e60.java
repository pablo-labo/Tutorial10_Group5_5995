package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class e60 implements l74 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ g60 b;

    public e60(Context context, g60 g60Var) {
        this.a = context;
        this.b = g60Var;
    }

    @Override // defpackage.l74
    public final void dispose() {
        this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
    }
}
