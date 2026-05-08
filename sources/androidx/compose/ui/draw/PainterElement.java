package androidx.compose.ui.draw;

import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.fb4;
import defpackage.ft2;
import defpackage.ga2;
import defpackage.ia;
import defpackage.k6;
import defpackage.kie;
import defpackage.qx9;
import defpackage.us3;
import defpackage.wl7;
import defpackage.x2b;
import defpackage.y2b;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Lqx9;", "Ly2b;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class PainterElement extends qx9<y2b> {
    public final x2b b;
    public final boolean c = true;
    public final c20 d;
    public final ft2 e;
    public final float f;
    public final ga2 g;

    public PainterElement(x2b x2bVar, c20 c20Var, ft2 ft2Var, float f, ga2 ga2Var) {
        this.b = x2bVar;
        this.d = c20Var;
        this.e = ft2Var;
        this.f = f;
        this.g = ga2Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        y2b y2bVar = new y2b();
        y2bVar.d0 = this.b;
        y2bVar.e0 = this.c;
        y2bVar.f0 = this.d;
        y2bVar.g0 = this.e;
        y2bVar.h0 = this.f;
        y2bVar.i0 = this.g;
        return y2bVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        y2b y2bVar = (y2b) cVar;
        boolean z = y2bVar.e0;
        x2b x2bVar = this.b;
        boolean z2 = this.c;
        boolean z3 = z != z2 || (z2 && !kie.a(y2bVar.d0.h(), x2bVar.h()));
        y2bVar.d0 = x2bVar;
        y2bVar.e0 = z2;
        y2bVar.f0 = this.d;
        y2bVar.g0 = this.e;
        y2bVar.h0 = this.f;
        y2bVar.i0 = this.g;
        if (z3) {
            us3.f(y2bVar).S();
        }
        fb4.a(y2bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return wl7.b(this.b, painterElement.b) && this.c == painterElement.c && wl7.b(this.d, painterElement.d) && wl7.b(this.e, painterElement.e) && Float.compare(this.f, painterElement.f) == 0 && wl7.b(this.g, painterElement.g);
    }

    public final int hashCode() {
        int iC = k6.c((this.e.hashCode() + ((this.d.hashCode() + ia.f(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31, this.f, 31);
        ga2 ga2Var = this.g;
        return iC + (ga2Var == null ? 0 : ga2Var.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.b + ", sizeToIntrinsics=" + this.c + ", alignment=" + this.d + ", contentScale=" + this.e + ", alpha=" + this.f + ", colorFilter=" + this.g + ')';
    }
}
