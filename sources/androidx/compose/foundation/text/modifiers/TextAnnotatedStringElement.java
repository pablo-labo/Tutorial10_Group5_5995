package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.b;
import androidx.compose.ui.e;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Lqx9;", "Landroidx/compose/foundation/text/modifiers/b;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextAnnotatedStringElement extends qx9<b> {
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
    public final oa2 l;
    public final Function1<b.a, j6g> m;

    public TextAnnotatedStringElement(le0 le0Var, tjf tjfVar, pn5.a aVar, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, oa2 oa2Var, Function1 function13) {
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
        this.l = oa2Var;
        this.m = function13;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null, this.l, this.m);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // defpackage.qx9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.compose.ui.e.c r10) {
        /*
            r9 = this;
            r0 = r10
            androidx.compose.foundation.text.modifiers.b r0 = (androidx.compose.foundation.text.modifiers.b) r0
            oa2 r10 = r0.o0
            oa2 r1 = r9.l
            boolean r10 = defpackage.wl7.b(r1, r10)
            r0.o0 = r1
            if (r10 == 0) goto L25
            tjf r10 = r0.e0
            tjf r1 = r9.c
            if (r1 == r10) goto L20
            foe r1 = r1.a
            foe r10 = r10.a
            boolean r10 = r1.b(r10)
            if (r10 == 0) goto L25
            goto L23
        L20:
            r1.getClass()
        L23:
            r10 = 0
            goto L26
        L25:
            r10 = 1
        L26:
            le0 r1 = r9.b
            boolean r8 = r0.h2(r1)
            pn5$a r6 = r9.d
            int r7 = r9.f
            tjf r1 = r9.c
            java.util.List<le0$c<sab>> r2 = r9.j
            int r3 = r9.i
            int r4 = r9.h
            boolean r5 = r9.g
            boolean r1 = r0.g2(r1, r2, r3, r4, r5, r6, r7)
            r2 = 0
            kotlin.jvm.functions.Function1<androidx.compose.foundation.text.modifiers.b$a, j6g> r3 = r9.m
            kotlin.jvm.functions.Function1<mif, j6g> r4 = r9.e
            kotlin.jvm.functions.Function1<java.util.List<qtc>, j6g> r9 = r9.k
            boolean r9 = r0.f2(r4, r9, r2, r3)
            r0.c2(r10, r8, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.b(androidx.compose.ui.e$c):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return wl7.b(this.l, textAnnotatedStringElement.l) && wl7.b(this.b, textAnnotatedStringElement.b) && wl7.b(this.c, textAnnotatedStringElement.c) && wl7.b(this.j, textAnnotatedStringElement.j) && wl7.b(this.d, textAnnotatedStringElement.d) && this.e == textAnnotatedStringElement.e && this.m == textAnnotatedStringElement.m && this.f == textAnnotatedStringElement.f && this.g == textAnnotatedStringElement.g && this.h == textAnnotatedStringElement.h && this.i == textAnnotatedStringElement.i && this.k == textAnnotatedStringElement.k;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + t40.c(this.b.hashCode() * 31, 31, this.c)) * 31;
        Function1<mif, j6g> function1 = this.e;
        int iF = (((ia.f(w40.c(this.f, (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.g) + this.h) * 31) + this.i) * 31;
        List<le0.c<sab>> list = this.j;
        int iHashCode2 = (iF + (list != null ? list.hashCode() : 0)) * 31;
        Function1<List<qtc>, j6g> function12 = this.k;
        int iHashCode3 = (iHashCode2 + (function12 != null ? function12.hashCode() : 0)) * 961;
        oa2 oa2Var = this.l;
        int iHashCode4 = (iHashCode3 + (oa2Var != null ? oa2Var.hashCode() : 0)) * 31;
        Function1<b.a, j6g> function13 = this.m;
        return iHashCode4 + (function13 != null ? function13.hashCode() : 0);
    }
}
