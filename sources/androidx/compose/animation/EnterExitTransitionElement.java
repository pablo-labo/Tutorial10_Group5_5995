package androidx.compose.animation;

import androidx.compose.ui.e;
import defpackage.csf;
import defpackage.de0;
import defpackage.gu5;
import defpackage.iu4;
import defpackage.kv4;
import defpackage.lh7;
import defpackage.lv4;
import defpackage.qx9;
import defpackage.r25;
import defpackage.th7;
import defpackage.w40;
import defpackage.wl7;
import defpackage.yc6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Lqx9;", "Lkv4;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class EnterExitTransitionElement extends qx9<kv4> {
    public final csf<iu4> b;
    public final csf<iu4>.a<th7, de0> c;
    public final csf<iu4>.a<lh7, de0> d;
    public final csf<iu4>.a<lh7, de0> e;
    public final lv4 f;
    public final r25 g;
    public final gu5<Boolean> h;
    public final yc6 i;

    public EnterExitTransitionElement(csf<iu4> csfVar, csf<iu4>.a<th7, de0> aVar, csf<iu4>.a<lh7, de0> aVar2, csf<iu4>.a<lh7, de0> aVar3, lv4 lv4Var, r25 r25Var, gu5<Boolean> gu5Var, yc6 yc6Var) {
        this.b = csfVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = lv4Var;
        this.g = r25Var;
        this.h = gu5Var;
        this.i = yc6Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new kv4(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        kv4 kv4Var = (kv4) cVar;
        kv4Var.d0 = this.b;
        kv4Var.e0 = this.c;
        kv4Var.f0 = this.d;
        kv4Var.g0 = this.e;
        kv4Var.h0 = this.f;
        kv4Var.i0 = this.g;
        kv4Var.j0 = this.h;
        kv4Var.k0 = this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return wl7.b(this.b, enterExitTransitionElement.b) && wl7.b(this.c, enterExitTransitionElement.c) && wl7.b(this.d, enterExitTransitionElement.d) && wl7.b(this.e, enterExitTransitionElement.e) && wl7.b(this.f, enterExitTransitionElement.f) && wl7.b(this.g, enterExitTransitionElement.g) && wl7.b(this.h, enterExitTransitionElement.h) && wl7.b(this.i, enterExitTransitionElement.i);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        csf<iu4>.a<th7, de0> aVar = this.c;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        csf<iu4>.a<lh7, de0> aVar2 = this.d;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        csf<iu4>.a<lh7, de0> aVar3 = this.e;
        return this.i.hashCode() + w40.d((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.h);
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.b + ", sizeAnimation=" + this.c + ", offsetAnimation=" + this.d + ", slideAnimation=" + this.e + ", enter=" + this.f + ", exit=" + this.g + ", isEnabled=" + this.h + ", graphicsLayerBlock=" + this.i + ')';
    }
}
