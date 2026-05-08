package defpackage;

import android.os.Bundle;
import defpackage.wl0;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class vrh implements wl0.a {
    public final /* synthetic */ kuh a;

    public vrh(kuh kuhVar) {
        this.a = kuhVar;
    }

    @Override // defpackage.g4i
    public final void a(long j, Bundle bundle, String str, String str2) {
        kuh kuhVar = this.a;
        if (kuhVar.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            HashSet hashSet = wkh.a;
            String strC0 = pyd.c0(str2, pg8.A0, pg8.z0);
            if (strC0 != null) {
                str2 = strC0;
            }
            bundle2.putString("events", str2);
            kuhVar.b.c(2, bundle2);
        }
    }
}
