package androidx.compose.ui.draw;

import androidx.compose.ui.e;
import defpackage.da2;
import defpackage.dce;
import defpackage.h5;
import defpackage.ia;
import defpackage.j94;
import defpackage.qx9;
import defpackage.rh1;
import defpackage.tia;
import defpackage.us3;
import defpackage.wbe;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Lqx9;", "Lrh1;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShadowGraphicsLayerElement extends qx9<rh1> {
    public final float b;
    public final dce c;
    public final boolean d;
    public final long e;
    public final long f;

    public ShadowGraphicsLayerElement(float f, dce dceVar, boolean z, long j, long j2) {
        this.b = f;
        this.c = dceVar;
        this.d = z;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new rh1(new wbe(this));
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        rh1 rh1Var = (rh1) cVar;
        rh1Var.d0 = new wbe(this);
        tia tiaVar = us3.d(rh1Var, 2).h0;
        if (tiaVar != null) {
            tiaVar.b2(true, rh1Var.d0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return j94.c(this.b, shadowGraphicsLayerElement.b) && wl7.b(this.c, shadowGraphicsLayerElement.c) && this.d == shadowGraphicsLayerElement.d && da2.c(this.e, shadowGraphicsLayerElement.e) && da2.c(this.f, shadowGraphicsLayerElement.f);
    }

    public final int hashCode() {
        int iF = ia.f((this.c.hashCode() + (Float.hashCode(this.b) * 31)) * 31, 31, this.d);
        int i = da2.j;
        return Long.hashCode(this.f) + ia.d(iF, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) j94.e(this.b));
        sb.append(", shape=");
        sb.append(this.c);
        sb.append(", clip=");
        sb.append(this.d);
        sb.append(", ambientColor=");
        h5.j(this.e, ", spotColor=", sb);
        sb.append((Object) da2.i(this.f));
        sb.append(')');
        return sb.toString();
    }
}
