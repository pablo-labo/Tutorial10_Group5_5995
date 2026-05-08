package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s2 extends ka6 {
    public final v1 d;
    public final /* synthetic */ t2 e;
    public final /* synthetic */ String f;

    public s2(t2 t2Var, String str) {
        this.e = t2Var;
        this.f = str;
        this.d = t2Var.b.b;
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void A(int i) {
        J1(Integer.toUnsignedString(i));
    }

    public final void J1(String str) {
        str.getClass();
        this.e.X(this.f, new ta8(str, false, null));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final v1 a() {
        return this.d;
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void e(byte b) {
        J1(String.valueOf(b & 255));
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void j(long j) {
        J1(Long.toUnsignedString(j));
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void o(short s) {
        J1(String.valueOf(s & 65535));
    }
}
