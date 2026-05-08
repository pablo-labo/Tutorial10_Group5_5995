package defpackage;

import androidx.compose.ui.layout.c;
import androidx.compose.ui.layout.d;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.layout.i0;

/* JADX INFO: loaded from: classes.dex */
public final class qe7 implements utc {
    public final utc[] a;
    public final i0 b;
    public final e c;
    public final i0 d;
    public final e e;

    public qe7(utc[] utcVarArr) {
        this.a = utcVarArr;
        int length = utcVarArr.length;
        i0[] i0VarArr = new i0[length];
        for (int i = 0; i < length; i++) {
            i0VarArr[i] = this.a[i].a();
        }
        this.b = new i0(new g0(i0VarArr));
        int length2 = this.a.length;
        e[] eVarArr = new e[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            eVarArr[i2] = this.a[i2].b();
        }
        this.c = new e(new c(eVarArr));
        int length3 = this.a.length;
        i0[] i0VarArr2 = new i0[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            i0VarArr2[i3] = this.a[i3].d();
        }
        this.d = new i0(new h0(i0VarArr2));
        int length4 = this.a.length;
        e[] eVarArr2 = new e[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            eVarArr2[i4] = this.a[i4].c();
        }
        this.e = new e(new d(eVarArr2));
    }

    @Override // defpackage.utc
    public final i0 a() {
        return this.b;
    }

    @Override // defpackage.utc
    public final e b() {
        return this.c;
    }

    @Override // defpackage.utc
    public final e c() {
        return this.e;
    }

    @Override // defpackage.utc
    public final i0 d() {
        return this.d;
    }

    public final String toString() {
        return ut0.t0(this.a, null, "innermostOf(", ")", null, 57);
    }
}
