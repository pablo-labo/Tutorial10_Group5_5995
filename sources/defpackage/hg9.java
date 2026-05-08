package defpackage;

import androidx.compose.ui.layout.w;
import defpackage.af1;
import defpackage.c20;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hg9 implements k0b {
    public final int a;
    public final List<w> b;
    public final long c;
    public final Object d;
    public final af1.a e;
    public final c20.c f;
    public final vl8 g;
    public final boolean h;
    public final int i;
    public final int[] j;
    public int k;
    public int l;

    public hg9() {
        throw null;
    }

    public hg9(int i, int i2, List list, long j, Object obj, c20.c cVar, vl8 vl8Var) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = c20.a.n;
        this.f = cVar;
        this.g = vl8Var;
        this.h = false;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            w wVar = (w) list.get(i3);
            iMax = Math.max(iMax, !this.h ? wVar.b : wVar.a);
        }
        this.i = iMax;
        this.j = new int[this.b.size() * 2];
        this.l = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.k += i;
        int[] iArr = this.j;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.h;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.k = i;
        boolean z = this.h;
        this.l = z ? i3 : i2;
        List<w> list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            w wVar = list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.j;
            if (z) {
                af1.a aVar = this.e;
                if (aVar == null) {
                    de7.b("null horizontalAlignment");
                    r40.e();
                    return;
                } else {
                    iArr[i6] = aVar.a(wVar.a, i2, this.g);
                    iArr[i6 + 1] = i;
                    i4 = wVar.b;
                }
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                c20.c cVar = this.f;
                if (cVar == null) {
                    de7.b("null verticalAlignment");
                    r40.e();
                    return;
                } else {
                    iArr[i7] = cVar.a(wVar.b, i3);
                    i4 = wVar.a;
                }
            }
            i += i4;
        }
    }

    @Override // defpackage.k0b
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.k0b
    public final int getOffset() {
        return this.k;
    }
}
