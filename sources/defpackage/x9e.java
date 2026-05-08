package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class x9e {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final d9e d;

    static {
        String str = vjg.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public x9e(int i, Bundle bundle, long j, d9e d9eVar) {
        ka2.l(d9eVar == null || i < 0);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (d9eVar == null && i < 0) {
            d9eVar = new d9e(i);
        }
        this.d = d9eVar;
    }

    public static x9e a(Bundle bundle) {
        int i = bundle.getInt(e, -1);
        Bundle bundle2 = bundle.getBundle(f);
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        d9e d9eVarA = bundle3 != null ? d9e.a(bundle3) : i != 0 ? new d9e(i) : null;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new x9e(i, bundle2, j, d9eVarA);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(e, this.a);
        bundle.putBundle(f, this.b);
        bundle.putLong(g, this.c);
        d9e d9eVar = this.d;
        if (d9eVar != null) {
            bundle.putBundle(h, d9eVar.b());
        }
        return bundle;
    }

    public x9e(int i, Bundle bundle) {
        this(i, bundle, SystemClock.elapsedRealtime(), null);
    }

    public x9e(int i) {
        this(i, Bundle.EMPTY);
    }
}
