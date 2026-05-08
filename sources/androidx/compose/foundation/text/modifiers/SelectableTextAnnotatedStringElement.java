package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.e;
import defpackage.h3e;
import defpackage.ia;
import defpackage.j6g;
import defpackage.le0;
import defpackage.mif;
import defpackage.oa2;
import defpackage.pn5;
import defpackage.qtc;
import defpackage.qx9;
import defpackage.sab;
import defpackage.t40;
import defpackage.tjf;
import defpackage.w40;
import defpackage.wl7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Lqx9;", "Landroidx/compose/foundation/text/modifiers/a;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectableTextAnnotatedStringElement extends qx9<a> {
    public final le0 b;
    public final tjf c;
    public final pn5.a d;
    public final Function1<mif, j6g> e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final List<le0.c<sab>> j;
    public final Function1<List<qtc>, j6g> k;
    public final h3e l;
    public final oa2 m;

    public SelectableTextAnnotatedStringElement(le0 le0Var, tjf tjfVar, pn5.a aVar, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, h3e h3eVar, oa2 oa2Var) {
        this.b = le0Var;
        this.c = tjfVar;
        this.d = aVar;
        this.e = function1;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = list;
        this.k = function12;
        this.l = h3eVar;
        this.m = oa2Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // defpackage.qx9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.compose.ui.e.c r12) {
        /*
            r11 = this;
            androidx.compose.foundation.text.modifiers.a r12 = (androidx.compose.foundation.text.modifiers.a) r12
            androidx.compose.foundation.text.modifiers.b r0 = r12.g0
            oa2 r1 = r0.o0
            oa2 r2 = r11.m
            boolean r1 = defpackage.wl7.b(r2, r1)
            r0.o0 = r2
            tjf r4 = r11.c
            if (r1 == 0) goto L26
            tjf r1 = r0.e0
            if (r4 == r1) goto L21
            foe r2 = r4.a
            foe r1 = r1.a
            boolean r1 = r2.b(r1)
            if (r1 == 0) goto L26
            goto L24
        L21:
            r4.getClass()
        L24:
            r1 = 0
            goto L27
        L26:
            r1 = 1
        L27:
            le0 r2 = r11.b
            boolean r2 = r0.h2(r2)
            androidx.compose.foundation.text.modifiers.b r3 = r12.g0
            java.util.List<le0$c<sab>> r5 = r11.j
            int r6 = r11.i
            int r7 = r11.h
            boolean r8 = r11.g
            pn5$a r9 = r11.d
            int r10 = r11.f
            boolean r3 = r3.g2(r4, r5, r6, r7, r8, r9, r10)
            r4 = 0
            kotlin.jvm.functions.Function1<mif, j6g> r5 = r11.e
            kotlin.jvm.functions.Function1<java.util.List<qtc>, j6g> r6 = r11.k
            h3e r11 = r11.l
            boolean r4 = r0.f2(r5, r6, r11, r4)
            r0.c2(r1, r2, r3, r4)
            r12.f0 = r11
            pm8 r11 = defpackage.us3.f(r12)
            r11.S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement.b(androidx.compose.ui.e$c):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return wl7.b(this.m, selectableTextAnnotatedStringElement.m) && wl7.b(this.b, selectableTextAnnotatedStringElement.b) && wl7.b(this.c, selectableTextAnnotatedStringElement.c) && wl7.b(this.j, selectableTextAnnotatedStringElement.j) && wl7.b(this.d, selectableTextAnnotatedStringElement.d) && this.e == selectableTextAnnotatedStringElement.e && this.f == selectableTextAnnotatedStringElement.f && this.g == selectableTextAnnotatedStringElement.g && this.h == selectableTextAnnotatedStringElement.h && this.i == selectableTextAnnotatedStringElement.i && this.k == selectableTextAnnotatedStringElement.k && wl7.b(this.l, selectableTextAnnotatedStringElement.l);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + t40.c(this.b.hashCode() * 31, 31, this.c)) * 31;
        Function1<mif, j6g> function1 = this.e;
        int iF = (((ia.f(w40.c(this.f, (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.g) + this.h) * 31) + this.i) * 31;
        List<le0.c<sab>> list = this.j;
        int iHashCode2 = (iF + (list != null ? list.hashCode() : 0)) * 31;
        Function1<List<qtc>, j6g> function12 = this.k;
        int iHashCode3 = (iHashCode2 + (function12 != null ? function12.hashCode() : 0)) * 31;
        h3e h3eVar = this.l;
        int iHashCode4 = (iHashCode3 + (h3eVar != null ? h3eVar.hashCode() : 0)) * 961;
        oa2 oa2Var = this.m;
        return iHashCode4 + (oa2Var != null ? oa2Var.hashCode() : 0);
    }
}
