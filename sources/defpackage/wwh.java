package defpackage;

import android.os.Bundle;
import defpackage.wl0;

/* JADX INFO: loaded from: classes2.dex */
public final class wwh implements wl0.a {
    public final /* synthetic */ q0i a;

    public wwh(q0i q0iVar) {
        this.a = q0iVar;
    }

    @Override // defpackage.g4i
    public final void a(long j, Bundle bundle, String str, String str2) {
        if (str == null || str.equals("crash") || wkh.a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.a.a.c(3, bundle2);
    }
}
