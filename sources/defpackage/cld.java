package defpackage;

import android.os.Bundle;
import defpackage.kv8;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cld {
    public final dld a;
    public final hr b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final hh1 c = new hh1(28);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public cld(dld dldVar, hr hrVar) {
        this.a = dldVar;
        this.b = hrVar;
    }

    public final void a() {
        dld dldVar = this.a;
        if (dldVar.getLifecycle().b() != kv8.b.b) {
            r6.g("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                r6.g("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            dldVar.getLifecycle().a(new wf2(this, 1));
            this.e = true;
        }
    }
}
