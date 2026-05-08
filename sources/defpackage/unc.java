package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class unc extends loc {
    public String n0;

    @snc(name = "text")
    public final void setText(String str) {
        this.n0 = str;
        b0();
    }

    @Override // defpackage.loc
    public final String toString() {
        String str = this.b;
        hh1.n(str);
        return o6.f(str, " [text: ", this.n0, "]");
    }
}
