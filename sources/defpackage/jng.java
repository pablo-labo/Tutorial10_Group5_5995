package defpackage;

import defpackage.jwa;

/* JADX INFO: loaded from: classes.dex */
public final class jng implements dce {
    public static final jng a = new jng();

    @Override // defpackage.dce
    public final jwa a(long j, vl8 vl8Var, iy3 iy3Var) {
        float fX0 = iy3Var.x0(30.0f);
        return new jwa.b(new qtc(-fX0, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fX0, Float.intBitsToFloat((int) (j & 4294967295L))));
    }
}
