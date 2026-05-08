package defpackage;

import defpackage.p85;

/* JADX INFO: loaded from: classes.dex */
public final class yq1 implements p85 {
    public final byte[] a;
    public final nva b;

    public static final class a implements p85.a<byte[]> {
        @Override // p85.a
        public final p85 a(Object obj, nva nvaVar, xqc xqcVar) {
            return new yq1((byte[]) obj, nvaVar);
        }
    }

    public yq1(byte[] bArr, nva nvaVar) {
        this.a = bArr;
        this.b = nvaVar;
    }

    @Override // defpackage.p85
    public final Object a(lu2<? super l85> lu2Var) {
        zn1 zn1Var = new zn1();
        byte[] bArr = this.a;
        bArr.getClass();
        zn1Var.write(bArr, 0, bArr.length);
        return new rne(new une(zn1Var, this.b.f, null), null, we3.b);
    }
}
