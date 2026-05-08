package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class hbh extends mbh {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ vv8 b;

    public hbh(Intent intent, vv8 vv8Var) {
        this.a = intent;
        this.b = vv8Var;
    }

    @Override // defpackage.mbh
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
