package defpackage;

import android.os.Bundle;
import defpackage.ald;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class xkd implements ald.b {
    public final ald a;
    public boolean b;
    public Bundle c;
    public final d2f d;

    public xkd(ald aldVar, jrg jrgVar) {
        aldVar.getClass();
        this.a = aldVar;
        this.d = new d2f(new oa(jrgVar, 24));
    }

    @Override // ald.b
    public final Bundle a() {
        Bundle bundleA = aq1.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleA.putAll(bundle);
        }
        for (Map.Entry entry : ((ykd) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA2 = ((qkd) entry.getValue()).b.e.a();
            if (!bundleA2.isEmpty()) {
                str.getClass();
                bundleA.putBundle(str, bundleA2);
            }
        }
        this.b = false;
        return bundleA;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleA2 = aq1.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleA2.putAll(bundle);
        }
        if (bundleA != null) {
            bundleA2.putAll(bundleA);
        }
        this.c = bundleA2;
        this.b = true;
    }
}
