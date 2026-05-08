package androidx.compose.material3.pulltorefresh;

import androidx.compose.ui.e;
import defpackage.gu5;
import defpackage.ia;
import defpackage.j6g;
import defpackage.j94;
import defpackage.qx9;
import defpackage.t7c;
import defpackage.u63;
import defpackage.v7c;
import defpackage.w40;
import defpackage.w7c;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;", "Lqx9;", "Lt7c;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PullToRefreshElement extends qx9<t7c> {
    public final boolean b;
    public final gu5<j6g> c;
    public final boolean d = true;
    public final w7c e;
    public final float f;

    public PullToRefreshElement(boolean z, gu5 gu5Var, w7c w7cVar, float f) {
        this.b = z;
        this.c = gu5Var;
        this.e = w7cVar;
        this.f = f;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new t7c(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        t7c t7cVar = (t7c) cVar;
        t7cVar.g0 = this.c;
        t7cVar.h0 = this.d;
        t7cVar.i0 = this.e;
        t7cVar.j0 = this.f;
        boolean z = t7cVar.f0;
        boolean z2 = this.b;
        if (z != z2) {
            t7cVar.f0 = z2;
            u63.Y(t7cVar.Q1(), null, null, new v7c(t7cVar, null), 3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return this.b == pullToRefreshElement.b && wl7.b(this.c, pullToRefreshElement.c) && this.d == pullToRefreshElement.d && wl7.b(this.e, pullToRefreshElement.e) && j94.c(this.f, pullToRefreshElement.f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + ((this.e.hashCode() + ia.f(w40.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        return "PullToRefreshElement(isRefreshing=" + this.b + ", onRefresh=" + this.c + ", enabled=" + this.d + ", state=" + this.e + ", threshold=" + ((Object) j94.e(this.f)) + ')';
    }
}
