package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qr4 implements b77 {
    public final boolean a;

    public qr4(boolean z) {
        this.a = z;
    }

    @Override // defpackage.b77
    public final zia a() {
        return null;
    }

    @Override // defpackage.b77
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        return w40.f(new StringBuilder("Empty{"), this.a ? "Active" : "New", '}');
    }
}
