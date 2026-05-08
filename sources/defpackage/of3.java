package defpackage;

import android.util.Base64;
import defpackage.p85;

/* JADX INFO: loaded from: classes3.dex */
public final class of3 implements p85 {
    public final String a;
    public final nva b;

    public static final class a implements p85.a<lhg> {
        @Override // p85.a
        public final p85 a(Object obj, nva nvaVar, xqc xqcVar) {
            lhg lhgVar = (lhg) obj;
            lhgVar.getClass();
            nvaVar.getClass();
            if (wl7.b(lhgVar.c, "data")) {
                return new of3(lhgVar.a, nvaVar);
            }
            return null;
        }
    }

    public of3(String str, nva nvaVar) {
        nvaVar.getClass();
        this.a = str;
        this.b = nvaVar;
    }

    @Override // defpackage.p85
    public final Object a(lu2<? super l85> lu2Var) {
        String str = this.a;
        String strQ0 = zve.q0(zve.n0(str, "data:", str), ";");
        byte[] bArrDecode = Base64.decode(zve.n0(str, "base64,", str), 0);
        zn1 zn1Var = new zn1();
        bArrDecode.getClass();
        zn1Var.write(bArrDecode, 0, bArrDecode.length);
        return new rne(new une(zn1Var, this.b.f, null), strQ0, we3.b);
    }
}
