package defpackage;

import android.os.Bundle;
import androidx.media3.session.r;

/* JADX INFO: loaded from: classes3.dex */
public final class zng implements r.a {
    @Override // androidx.media3.session.r.a
    public final u37 a(r rVar, r.d dVar, v8e v8eVar, Bundle bundle) {
        rVar.getClass();
        dVar.getClass();
        bundle.getClass();
        String str = v8eVar.b;
        int iHashCode = str.hashCode();
        if (iHashCode != -1263673246) {
            if (iHashCode == 1997771742 && str.equals("SEEK_FORWARD")) {
                rVar.a().j0(rVar.a().K0() + 10000);
            }
        } else if (str.equals("SEEK_REWIND")) {
            rVar.a().j0(rVar.a().K0() - 10000);
        }
        return super.a(rVar, dVar, v8eVar, bundle);
    }
}
