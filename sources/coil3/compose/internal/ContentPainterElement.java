package coil3.compose.internal;

import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.et2;
import defpackage.fb4;
import defpackage.ft2;
import defpackage.ga2;
import defpackage.k6;
import defpackage.kie;
import defpackage.qx9;
import defpackage.us3;
import defpackage.wl7;
import defpackage.x2b;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/compose/internal/ContentPainterElement;", "Lqx9;", "Let2;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ContentPainterElement extends qx9<et2> {
    public final x2b b;
    public final c20 c;
    public final ft2 d;
    public final float e;
    public final ga2 f;

    public ContentPainterElement(x2b x2bVar, c20 c20Var, ft2 ft2Var, float f, ga2 ga2Var) {
        this.b = x2bVar;
        this.c = c20Var;
        this.d = ft2Var;
        this.e = f;
        this.f = ga2Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        et2 et2Var = new et2();
        et2Var.d0 = this.b;
        et2Var.e0 = this.c;
        et2Var.f0 = this.d;
        et2Var.g0 = this.e;
        et2Var.h0 = this.f;
        return et2Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        et2 et2Var = (et2) cVar;
        long jH = et2Var.d0.h();
        x2b x2bVar = this.b;
        boolean zA = kie.a(jH, x2bVar.h());
        et2Var.d0 = x2bVar;
        et2Var.e0 = this.c;
        et2Var.f0 = this.d;
        et2Var.g0 = this.e;
        et2Var.h0 = this.f;
        if (!zA) {
            us3.f(et2Var).S();
        }
        fb4.a(et2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return wl7.b(this.b, contentPainterElement.b) && wl7.b(this.c, contentPainterElement.c) && wl7.b(this.d, contentPainterElement.d) && Float.compare(this.e, contentPainterElement.e) == 0 && wl7.b(this.f, contentPainterElement.f);
    }

    public final int hashCode() {
        int iC = k6.c((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, this.e, 31);
        ga2 ga2Var = this.f;
        return iC + (ga2Var == null ? 0 : ga2Var.hashCode());
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.b + ", alignment=" + this.c + ", contentScale=" + this.d + ", alpha=" + this.e + ", colorFilter=" + this.f + ')';
    }
}
