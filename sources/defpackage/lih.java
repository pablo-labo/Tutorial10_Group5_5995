package defpackage;

import android.os.Bundle;
import com.google.firebase.iid.zzam;

/* JADX INFO: loaded from: classes2.dex */
public final class lih extends vih<Void> {
    @Override // defpackage.vih
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            b(new zzam(4, "Invalid response to one way request"));
        }
    }

    @Override // defpackage.vih
    public final boolean c() {
        return true;
    }
}
