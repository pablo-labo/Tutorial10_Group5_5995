package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.e;
import defpackage.ia;
import defpackage.oa2;
import defpackage.pn5;
import defpackage.qx9;
import defpackage.sjf;
import defpackage.t40;
import defpackage.tjf;
import defpackage.w40;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Lqx9;", "Lsjf;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextStringSimpleElement extends qx9<sjf> {
    public final String b;
    public final tjf c;
    public final pn5.a d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final oa2 i;

    public TextStringSimpleElement(String str, tjf tjfVar, pn5.a aVar, int i, boolean z, int i2, int i3, oa2 oa2Var) {
        this.b = str;
        this.c = tjfVar;
        this.d = aVar;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = oa2Var;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        sjf sjfVar = new sjf();
        sjfVar.d0 = this.b;
        sjfVar.e0 = this.c;
        sjfVar.f0 = this.d;
        sjfVar.g0 = this.e;
        sjfVar.h0 = this.f;
        sjfVar.i0 = this.g;
        sjfVar.j0 = this.h;
        sjfVar.k0 = this.i;
        return sjfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // defpackage.qx9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.compose.ui.e.c r11) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.b(androidx.compose.ui.e$c):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return wl7.b(this.i, textStringSimpleElement.i) && wl7.b(this.b, textStringSimpleElement.b) && wl7.b(this.c, textStringSimpleElement.c) && wl7.b(this.d, textStringSimpleElement.d) && this.e == textStringSimpleElement.e && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g && this.h == textStringSimpleElement.h;
    }

    public final int hashCode() {
        int iF = (((ia.f(w40.c(this.e, (this.d.hashCode() + t40.c(this.b.hashCode() * 31, 31, this.c)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
        oa2 oa2Var = this.i;
        return iF + (oa2Var != null ? oa2Var.hashCode() : 0);
    }
}
