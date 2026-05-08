package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v3e {
    public final long a;
    public final long b;
    public final sl8 c;
    public final boolean d;
    public final p2e e;
    public final f4e f;
    public final i3a g;
    public final ArrayList h;
    public int i;
    public int j;
    public int k;

    public v3e(long j, long j2, sl8 sl8Var, boolean z, p2e p2eVar, f4e f4eVar) {
        this.a = j;
        this.b = j2;
        this.c = sl8Var;
        this.d = z;
        this.e = p2eVar;
        this.f = f4eVar;
        int i = f59.a;
        this.g = new i3a(6);
        this.h = new ArrayList();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    public final int a(int i, n54 n54Var, n54 n54Var2) {
        if (i == -1) {
            int iOrdinal = w3e.a(n54Var, n54Var2).ordinal();
            if (iOrdinal == 0) {
                return this.k - 1;
            }
            if (iOrdinal == 1) {
                return this.k;
            }
            if (iOrdinal != 2) {
                l.g();
                return 0;
            }
        }
        return i;
    }
}
