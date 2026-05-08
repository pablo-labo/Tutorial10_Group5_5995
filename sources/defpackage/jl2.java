package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jl2 extends hl2 {
    public final boolean c;

    public jl2(rb8 rb8Var, boolean z) {
        super(rb8Var);
        this.c = z;
    }

    @Override // defpackage.hl2
    public final void h(String str) {
        str.getClass();
        rb8 rb8Var = (rb8) this.b;
        if (this.c) {
            rb8Var.e(str);
        } else {
            rb8Var.c(str);
        }
    }
}
