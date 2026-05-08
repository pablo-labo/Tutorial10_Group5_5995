package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.e;
import defpackage.dvf;
import defpackage.qx9;
import defpackage.wl7;
import defpackage.yp8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "Lqx9;", "Lyp8;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LazyLayoutAnimateItemElement extends qx9<yp8> {
    public final dvf b;
    public final dvf c;
    public final dvf d;

    public LazyLayoutAnimateItemElement(dvf dvfVar, dvf dvfVar2, dvf dvfVar3) {
        this.b = dvfVar;
        this.c = dvfVar2;
        this.d = dvfVar3;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        yp8 yp8Var = new yp8();
        yp8Var.d0 = this.b;
        yp8Var.e0 = this.c;
        yp8Var.f0 = this.d;
        return yp8Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        yp8 yp8Var = (yp8) cVar;
        yp8Var.d0 = this.b;
        yp8Var.e0 = this.c;
        yp8Var.f0 = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return wl7.b(this.b, lazyLayoutAnimateItemElement.b) && wl7.b(this.c, lazyLayoutAnimateItemElement.c) && wl7.b(this.d, lazyLayoutAnimateItemElement.d);
    }

    public final int hashCode() {
        dvf dvfVar = this.b;
        int iHashCode = (dvfVar == null ? 0 : dvfVar.hashCode()) * 31;
        dvf dvfVar2 = this.c;
        int iHashCode2 = (iHashCode + (dvfVar2 == null ? 0 : dvfVar2.hashCode())) * 31;
        dvf dvfVar3 = this.d;
        return iHashCode2 + (dvfVar3 != null ? dvfVar3.hashCode() : 0);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.b + ", placementSpec=" + this.c + ", fadeOutSpec=" + this.d + ')';
    }
}
