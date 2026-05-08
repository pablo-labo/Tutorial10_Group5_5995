package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d6i extends y5i {
    @Override // defpackage.y5i
    public final void d() {
        if (!this.d) {
            if (this.b.size() > 0) {
                ((cyh) f(0).getKey()).zzd();
                throw null;
            }
            Iterator it = h().iterator();
            if (it.hasNext()) {
                ((cyh) ((Map.Entry) it.next()).getKey()).zzd();
                throw null;
            }
        }
        super.d();
    }
}
