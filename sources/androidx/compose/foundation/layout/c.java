package androidx.compose.foundation.layout;

import defpackage.af1;
import defpackage.bxe;
import defpackage.iq2;
import defpackage.iy3;
import defpackage.ml1;
import defpackage.sl1;
import defpackage.tf7;
import defpackage.wl7;

/* JADX INFO: loaded from: classes.dex */
public final class c implements sl1, ml1 {
    public final iy3 a;
    public final long b;

    public c(bxe bxeVar, long j) {
        this.a = bxeVar;
        this.b = j;
    }

    @Override // defpackage.sl1
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return wl7.b(this.a, cVar.a) && iq2.b(this.b, cVar.b);
    }

    @Override // defpackage.sl1
    public final float f() {
        long j = this.b;
        if (!iq2.c(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.k1(iq2.g(j));
    }

    @Override // defpackage.ml1
    public final androidx.compose.ui.e h(androidx.compose.ui.e eVar, af1 af1Var) {
        return eVar.o(new BoxChildDataElement(af1Var, false, tf7.a));
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) iq2.k(this.b)) + ')';
    }
}
