package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lyd {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public lyd f;
    public lyd g;

    public lyd(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final lyd a() {
        lyd lydVar = this.f;
        if (lydVar == this) {
            lydVar = null;
        }
        lyd lydVar2 = this.g;
        lydVar2.getClass();
        lydVar2.f = this.f;
        lyd lydVar3 = this.f;
        lydVar3.getClass();
        lydVar3.g = this.g;
        this.f = null;
        this.g = null;
        return lydVar;
    }

    public final void b(lyd lydVar) {
        lydVar.getClass();
        lydVar.g = this;
        lydVar.f = this.f;
        lyd lydVar2 = this.f;
        lydVar2.getClass();
        lydVar2.g = lydVar;
        this.f = lydVar;
    }

    public final lyd c() {
        this.d = true;
        return new lyd(this.a, this.b, this.c, true, false);
    }

    public final void d(lyd lydVar, int i) {
        lydVar.getClass();
        byte[] bArr = lydVar.a;
        if (!lydVar.e) {
            r6.g("only owner can write");
            return;
        }
        int i2 = lydVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (lydVar.d) {
                o6.h();
                return;
            }
            int i4 = lydVar.b;
            if (i3 - i4 > 8192) {
                o6.h();
                return;
            } else {
                pyd.g(0, i4, i2, bArr, bArr);
                lydVar.c -= lydVar.b;
                lydVar.b = 0;
            }
        }
        int i5 = lydVar.c;
        int i6 = this.b;
        pyd.g(i5, i6, i6 + i, this.a, bArr);
        lydVar.c += i;
        this.b += i;
    }

    public lyd() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
