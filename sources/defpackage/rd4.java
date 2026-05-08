package defpackage;

import androidx.media3.common.a;
import defpackage.sd4;
import defpackage.vuf;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class rd4 implements jp4 {
    public final g4b a;
    public final String c;
    public final int d;
    public String f;
    public zpf g;
    public int i;
    public int j;
    public long k;
    public a l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public rd4(String str, int i, int i2) {
        this.a = new g4b(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04b9  */
    @Override // defpackage.jp4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.g4b r39) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 1414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd4.a(g4b):void");
    }

    public final boolean b(g4b g4bVar, byte[] bArr, int i) {
        int iMin = Math.min(g4bVar.a(), i - this.i);
        g4bVar.h(this.i, bArr, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    @Override // defpackage.jp4
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.jp4
    public final void d(boolean z) {
    }

    @Override // defpackage.jp4
    public final void e(o55 o55Var, vuf.c cVar) {
        cVar.a();
        cVar.b();
        this.f = cVar.e;
        cVar.b();
        this.g = o55Var.o(cVar.d, 1);
    }

    @Override // defpackage.jp4
    public final void f(int i, long j) {
        this.q = j;
    }

    @RequiresNonNull({"output"})
    public final void g(sd4.a aVar) {
        int i = aVar.b;
        String str = aVar.a;
        int i2 = aVar.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        a aVar2 = this.l;
        if (aVar2 != null && i2 == aVar2.F && i == aVar2.G && str.equals(aVar2.n)) {
            return;
        }
        a aVar3 = this.l;
        a.C0036a c0036a = aVar3 == null ? new a.C0036a() : aVar3.a();
        c0036a.a = this.f;
        c0036a.l = st9.p(this.e);
        c0036a.m = st9.p(str);
        c0036a.E = i2;
        c0036a.F = i;
        c0036a.d = this.c;
        c0036a.f = this.d;
        a aVar4 = new a(c0036a);
        this.l = aVar4;
        this.g.d(aVar4);
    }
}
