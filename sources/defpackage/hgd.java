package defpackage;

import defpackage.uce;

/* JADX INFO: loaded from: classes2.dex */
public final class hgd extends ie7 {
    public hgd() {
        super(16);
    }

    @Override // defpackage.ie7
    public final void m(uce uceVar, float f, float f2) {
        uceVar.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        uce.c cVar = new uce.c(0.0f, 0.0f, f3, f3);
        cVar.f = 180.0f;
        cVar.g = 90.0f;
        uceVar.f.add(cVar);
        uce.a aVar = new uce.a(cVar);
        float f4 = 180.0f + 90.0f;
        boolean z = 90.0f < 0.0f;
        float f5 = z ? (180.0f + 180.0f) % 360.0f : 180.0f;
        float f6 = z ? (180.0f + f4) % 360.0f : f4;
        uceVar.a(f5);
        uceVar.g.add(aVar);
        uceVar.d = f6;
        double d = f4;
        uceVar.b = (((f3 - 0.0f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((0.0f + f3) * 0.5f);
        uceVar.c = (((f3 - 0.0f) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((0.0f + f3) * 0.5f);
    }
}
