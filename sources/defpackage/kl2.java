package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kl2 extends hl2 {
    public final boolean c;

    public kl2(rb8 rb8Var, boolean z) {
        super(rb8Var);
        this.c = z;
    }

    @Override // defpackage.hl2
    public final void c(byte b) {
        if (this.c) {
            h(String.valueOf(b & 255));
            return;
        }
        String strValueOf = String.valueOf(b & 255);
        strValueOf.getClass();
        ((rb8) this.b).c(strValueOf);
    }

    @Override // defpackage.hl2
    public final void e(int i) {
        boolean z = this.c;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            h(unsignedString);
        } else {
            unsignedString.getClass();
            ((rb8) this.b).c(unsignedString);
        }
    }

    @Override // defpackage.hl2
    public final void f(long j) {
        boolean z = this.c;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            h(unsignedString);
        } else {
            unsignedString.getClass();
            ((rb8) this.b).c(unsignedString);
        }
    }

    @Override // defpackage.hl2
    public final void g(short s) {
        if (this.c) {
            h(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        ((rb8) this.b).c(strValueOf);
    }
}
