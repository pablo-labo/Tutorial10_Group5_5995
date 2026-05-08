package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class bjh extends vih<Bundle> {
    @Override // defpackage.vih
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // defpackage.vih
    public final boolean c() {
        return false;
    }
}
