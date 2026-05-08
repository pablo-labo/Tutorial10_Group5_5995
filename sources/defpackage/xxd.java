package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.vuf;

/* JADX INFO: loaded from: classes.dex */
public final class xxd implements vuf {
    public final wxd a;
    public final g4b b = new g4b(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public xxd(wxd wxdVar) {
        this.a = wxdVar;
    }

    @Override // defpackage.vuf
    public final void a(int i, g4b g4bVar) {
        boolean z = (i & 1) != 0;
        int iX = z ? g4bVar.b + g4bVar.x() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            g4bVar.J(iX);
            this.d = 0;
        }
        while (g4bVar.a() > 0) {
            int i2 = this.d;
            g4b g4bVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iX2 = g4bVar.x();
                    g4bVar.J(g4bVar.b - 1);
                    if (iX2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(g4bVar.a(), 3 - this.d);
                g4bVar.h(this.d, g4bVar2.a, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    g4bVar2.J(0);
                    g4bVar2.I(3);
                    g4bVar2.K(1);
                    int iX3 = g4bVar2.x();
                    int iX4 = g4bVar2.x();
                    this.e = (iX3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
                    int i4 = (((iX3 & 15) << 8) | iX4) + 3;
                    this.c = i4;
                    byte[] bArr = g4bVar2.a;
                    if (bArr.length < i4) {
                        g4bVar2.c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(g4bVar.a(), this.c - this.d);
                g4bVar.h(this.d, g4bVar2.a, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        g4bVar2.I(i6);
                    } else {
                        if (vjg.o(0, i6, -1, g4bVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        g4bVar2.I(this.c - 4);
                    }
                    g4bVar2.J(0);
                    this.a.a(g4bVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.vuf
    public final void b(qmf qmfVar, o55 o55Var, vuf.c cVar) {
        this.a.b(qmfVar, o55Var, cVar);
        this.f = true;
    }

    @Override // defpackage.vuf
    public final void c() {
        this.f = true;
    }
}
