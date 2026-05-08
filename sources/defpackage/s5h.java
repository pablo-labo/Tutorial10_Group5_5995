package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s5h extends t {
    public final xc3 a;
    public final ue4 b;
    public ye4 c;

    public s5h(ue4 ue4Var, byte[] bArr) {
        byte[] bArr2;
        this.b = ue4Var;
        if (bArr == null) {
            bArr2 = null;
        } else {
            byte[] bArr3 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            bArr2 = bArr3;
        }
        this.a = new xc3(bArr2);
    }

    @Override // defpackage.q
    public final w a() {
        return this.a;
    }
}
