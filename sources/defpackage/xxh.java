package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xxh implements ag5 {
    public final String a;
    public final int b;

    public xxh(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.ag5
    public final String asString() {
        return this.b == 0 ? "" : this.a;
    }

    @Override // defpackage.ag5
    public final int g() {
        return this.b;
    }
}
