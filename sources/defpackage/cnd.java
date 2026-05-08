package defpackage;

import com.airbnb.lottie.parser.moshi.a;

/* JADX INFO: loaded from: classes.dex */
public final class cnd implements tlg<bnd> {
    public static final cnd a = new cnd();

    @Override // defpackage.tlg
    public final bnd a(a aVar, float f) {
        boolean z = aVar.v() == a.b.a;
        if (z) {
            aVar.a();
        }
        float fNextDouble = (float) aVar.nextDouble();
        float fNextDouble2 = (float) aVar.nextDouble();
        while (aVar.hasNext()) {
            aVar.I();
        }
        if (z) {
            aVar.p();
        }
        return new bnd((fNextDouble / 100.0f) * f, (fNextDouble2 / 100.0f) * f);
    }
}
