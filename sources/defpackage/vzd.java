package defpackage;

import defpackage.p2e;

/* JADX INFO: loaded from: classes.dex */
public final class vzd {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final mif f;

    public vzd(long j, int i, int i2, int i3, int i4, mif mifVar) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = mifVar;
    }

    public final p2e.a a(int i) {
        return new p2e.a(w74.n(this.f, i), i, this.a);
    }

    public final l73 b() {
        int i = this.c;
        int i2 = this.d;
        return i < i2 ? l73.b : i > i2 ? l73.a : l73.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.a);
        sb.append(", range=(");
        int i = this.c;
        sb.append(i);
        sb.append('-');
        mif mifVar = this.f;
        sb.append(w74.n(mifVar, i));
        sb.append(',');
        int i2 = this.d;
        sb.append(i2);
        sb.append('-');
        sb.append(w74.n(mifVar, i2));
        sb.append("), prevOffset=");
        return k6.h(sb, this.e, ')');
    }
}
