package defpackage;

import android.os.Bundle;
import defpackage.ald;
import defpackage.kv8;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class bld {
    public final cld a;
    public final ald b;

    public bld(cld cldVar) {
        this.a = cldVar;
        this.b = new ald(cldVar);
    }

    public final void a(Bundle bundle) {
        cld cldVar = this.a;
        dld dldVar = cldVar.a;
        if (!cldVar.e) {
            cldVar.a();
        }
        if (dldVar.getLifecycle().b().compareTo(kv8.b.d) >= 0) {
            r40.g(dldVar.getLifecycle().b(), "performRestore cannot be called when owner is ");
            return;
        }
        if (cldVar.g) {
            r6.g("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleB = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleB = zkd.B("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        cldVar.f = bundleB;
        cldVar.g = true;
    }

    public final void b(Bundle bundle) {
        cld cldVar = this.a;
        Bundle bundleA = aq1.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = cldVar.f;
        if (bundle2 != null) {
            bundleA.putAll(bundle2);
        }
        synchronized (cldVar.c) {
            try {
                for (Map.Entry entry : cldVar.d.entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle bundleA2 = ((ald.b) entry.getValue()).a();
                    str.getClass();
                    bundleA.putBundle(str, bundleA2);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bundleA.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }
}
