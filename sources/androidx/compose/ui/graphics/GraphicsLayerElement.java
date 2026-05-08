package androidx.compose.ui.graphics;

import androidx.compose.ui.e;
import defpackage.da2;
import defpackage.dce;
import defpackage.h5;
import defpackage.hh1;
import defpackage.ia;
import defpackage.k6;
import defpackage.mrf;
import defpackage.qx9;
import defpackage.tia;
import defpackage.ufe;
import defpackage.us3;
import defpackage.vfe;
import defpackage.w40;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Lqx9;", "Lvfe;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class GraphicsLayerElement extends qx9<vfe> {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final long j;
    public final dce k;
    public final boolean l;
    public final long m;
    public final long n;
    public final float i = 8.0f;
    public final int o = 3;

    public GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, long j, dce dceVar, boolean z, long j2, long j3) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.j = j;
        this.k = dceVar;
        this.l = z;
        this.m = j2;
        this.n = j3;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        vfe vfeVar = new vfe();
        vfeVar.d0 = this.b;
        vfeVar.e0 = this.c;
        vfeVar.f0 = this.d;
        vfeVar.g0 = this.e;
        vfeVar.h0 = this.f;
        vfeVar.i0 = this.g;
        vfeVar.j0 = this.h;
        vfeVar.k0 = this.i;
        vfeVar.l0 = this.j;
        vfeVar.m0 = this.k;
        vfeVar.n0 = this.l;
        vfeVar.o0 = this.m;
        vfeVar.p0 = this.n;
        vfeVar.q0 = this.o;
        vfeVar.r0 = new ufe(vfeVar);
        return vfeVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        vfe vfeVar = (vfe) cVar;
        vfeVar.d0 = this.b;
        vfeVar.e0 = this.c;
        vfeVar.f0 = this.d;
        vfeVar.g0 = this.e;
        vfeVar.h0 = this.f;
        vfeVar.i0 = this.g;
        vfeVar.j0 = this.h;
        vfeVar.k0 = this.i;
        vfeVar.l0 = this.j;
        vfeVar.m0 = this.k;
        vfeVar.n0 = this.l;
        vfeVar.o0 = this.m;
        vfeVar.p0 = this.n;
        vfeVar.q0 = this.o;
        tia tiaVar = us3.d(vfeVar, 2).h0;
        if (tiaVar != null) {
            tiaVar.b2(true, vfeVar.r0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.b, graphicsLayerElement.b) == 0 && Float.compare(this.c, graphicsLayerElement.c) == 0 && Float.compare(this.d, graphicsLayerElement.d) == 0 && Float.compare(this.e, graphicsLayerElement.e) == 0 && Float.compare(this.f, graphicsLayerElement.f) == 0 && Float.compare(this.g, graphicsLayerElement.g) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.h, graphicsLayerElement.h) == 0 && Float.compare(this.i, graphicsLayerElement.i) == 0 && mrf.a(this.j, graphicsLayerElement.j) && wl7.b(this.k, graphicsLayerElement.k) && this.l == graphicsLayerElement.l && da2.c(this.m, graphicsLayerElement.m) && da2.c(this.n, graphicsLayerElement.n) && this.o == graphicsLayerElement.o;
    }

    public final int hashCode() {
        int iC = k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(Float.hashCode(this.b) * 31, this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), 0.0f, 31), 0.0f, 31), this.h, 31), this.i, 31);
        int i = mrf.c;
        int iF = ia.f((this.k.hashCode() + ia.d(iC, 31, this.j)) * 31, 961, this.l);
        int i2 = da2.j;
        return w40.c(this.o, w40.c(0, ia.d(ia.d(iF, 31, this.m), 31, this.n), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.b);
        sb.append(", scaleY=");
        sb.append(this.c);
        sb.append(", alpha=");
        sb.append(this.d);
        sb.append(", translationX=");
        sb.append(this.e);
        sb.append(", translationY=");
        sb.append(this.f);
        sb.append(", shadowElevation=");
        sb.append(this.g);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.h);
        sb.append(", cameraDistance=");
        sb.append(this.i);
        sb.append(", transformOrigin=");
        sb.append((Object) mrf.b(this.j));
        sb.append(", shape=");
        sb.append(this.k);
        sb.append(", clip=");
        sb.append(this.l);
        sb.append(", renderEffect=null, ambientShadowColor=");
        h5.j(this.m, ", spotShadowColor=", sb);
        h5.j(this.n, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", sb);
        sb.append((Object) hh1.Z(this.o));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
