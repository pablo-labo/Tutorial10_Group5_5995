package defpackage;

import defpackage.i6b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k6b {
    public static final void a(v5b v5bVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            a(v5bVar, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d16 * dSqrt2;
        double d23 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan22 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d10;
        double d29 = d28 * dCos2;
        double d30 = d6 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d6 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = dAtan22 / ((double) iCeil);
        double d36 = d;
        double d37 = dAtan2;
        double d38 = d34;
        double d39 = d31;
        int i = 0;
        double d40 = d2;
        while (i < iCeil) {
            double d41 = d37 + d35;
            double dSin4 = Math.sin(d41);
            double dCos4 = Math.cos(d41);
            double dB = w40.b(d10, dCos2, dCos4, d26) - (d30 * dSin4);
            double d42 = dSin2;
            double dB2 = (d33 * dSin4) + w40.b(d5, d42, dCos4, d27);
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d33) + (dSin4 * d32);
            double d45 = d41 - d37;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt3 = ((Math.sqrt(w40.b(dTan, 3.0d, dTan, 4.0d)) - 1.0d) * Math.sin(d45)) / 3.0d;
            v5bVar.l((float) ((d39 * dSqrt3) + d36), (float) ((d38 * dSqrt3) + d40), (float) (dB - (dSqrt3 * d43)), (float) (dB2 - (dSqrt3 * d44)), (float) dB, (float) dB2);
            i++;
            iCeil = iCeil;
            d35 = d35;
            d26 = d26;
            d36 = dB;
            d40 = dB2;
            d37 = d41;
            dSin2 = d42;
            d39 = d43;
            d38 = d44;
            d10 = d5;
        }
    }

    public static final void b(List list, v5b v5bVar) {
        int i;
        float f;
        int i2;
        i6b i6bVar;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        v5b v5bVar2 = v5bVar;
        int i3 = v5bVar2.i();
        v5bVar2.k();
        v5bVar2.e(i3);
        i6b i6bVar2 = list2.isEmpty() ? i6b.b.c : (i6b) list2.get(0);
        int size = list2.size();
        float f10 = 0.0f;
        int i4 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i4 < size) {
            i6b i6bVar3 = (i6b) list2.get(i4);
            if (i6bVar3 instanceof i6b.b) {
                v5bVar2.close();
                i = size;
                f = f10;
                i2 = i4;
                i6bVar = i6bVar3;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (i6bVar3 instanceof i6b.n) {
                    i6b.n nVar = (i6b.n) i6bVar3;
                    float f17 = nVar.c;
                    f13 += f17;
                    float f18 = nVar.d;
                    f14 += f18;
                    v5bVar2.a(f17, f18);
                    i = size;
                    f = f10;
                    i2 = i4;
                    f15 = f13;
                    f16 = f14;
                } else {
                    if (i6bVar3 instanceof i6b.f) {
                        i6b.f fVar = (i6b.f) i6bVar3;
                        float f19 = fVar.c;
                        float f20 = fVar.d;
                        v5bVar2.j(f19, f20);
                        f14 = f20;
                        f16 = f14;
                        f13 = f19;
                        f15 = f13;
                    } else if (i6bVar3 instanceof i6b.m) {
                        i6b.m mVar = (i6b.m) i6bVar3;
                        float f21 = mVar.d;
                        float f22 = mVar.c;
                        v5bVar2.m(f22, f21);
                        f13 += f22;
                        f14 += f21;
                    } else if (i6bVar3 instanceof i6b.e) {
                        i6b.e eVar = (i6b.e) i6bVar3;
                        float f23 = eVar.d;
                        float f24 = eVar.c;
                        v5bVar2.n(f24, f23);
                        f13 = f24;
                        f14 = f23;
                    } else if (i6bVar3 instanceof i6b.l) {
                        float f25 = ((i6b.l) i6bVar3).c;
                        v5bVar2.m(f25, f10);
                        f13 += f25;
                    } else if (i6bVar3 instanceof i6b.d) {
                        float f26 = ((i6b.d) i6bVar3).c;
                        v5bVar2.n(f26, f14);
                        f13 = f26;
                    } else if (i6bVar3 instanceof i6b.r) {
                        float f27 = ((i6b.r) i6bVar3).c;
                        v5bVar2.m(f10, f27);
                        f14 += f27;
                    } else if (i6bVar3 instanceof i6b.s) {
                        float f28 = ((i6b.s) i6bVar3).c;
                        v5bVar2.n(f13, f28);
                        f14 = f28;
                    } else {
                        if (i6bVar3 instanceof i6b.k) {
                            i6b.k kVar = (i6b.k) i6bVar3;
                            v5bVar2.b(kVar.c, kVar.d, kVar.e, kVar.f, kVar.g, kVar.h);
                            f7 = kVar.e + f13;
                            f8 = kVar.f + f14;
                            f13 += kVar.g;
                            f9 = kVar.h;
                        } else if (i6bVar3 instanceof i6b.c) {
                            i6b.c cVar = (i6b.c) i6bVar3;
                            v5bVar.l(cVar.c, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h);
                            float f29 = cVar.e;
                            float f30 = cVar.f;
                            float f31 = cVar.g;
                            float f32 = cVar.h;
                            f13 = f31;
                            f14 = f32;
                            i = size;
                            f = f10;
                            i2 = i4;
                            i6bVar = i6bVar3;
                            f11 = f29;
                            f12 = f30;
                        } else if (i6bVar3 instanceof i6b.p) {
                            if (i6bVar2.a) {
                                float f33 = f13 - f11;
                                f6 = f14 - f12;
                                f5 = f33;
                            } else {
                                f5 = f10;
                                f6 = f5;
                            }
                            i6b.p pVar = (i6b.p) i6bVar3;
                            v5bVar.b(f5, f6, pVar.c, pVar.d, pVar.e, pVar.f);
                            f7 = pVar.c + f13;
                            f8 = pVar.d + f14;
                            f13 += pVar.e;
                            f9 = pVar.f;
                        } else {
                            if (i6bVar3 instanceof i6b.h) {
                                if (i6bVar2.a) {
                                    f13 = (f13 * 2.0f) - f11;
                                    f14 = (2.0f * f14) - f12;
                                }
                                i6b.h hVar = (i6b.h) i6bVar3;
                                v5bVar.l(f13, f14, hVar.c, hVar.d, hVar.e, hVar.f);
                                f4 = hVar.c;
                                float f34 = hVar.d;
                                float f35 = hVar.e;
                                float f36 = hVar.f;
                                f13 = f35;
                                f14 = f36;
                                i = size;
                                f = f10;
                                i2 = i4;
                                i6bVar = i6bVar3;
                                f12 = f34;
                            } else if (i6bVar3 instanceof i6b.o) {
                                i6b.o oVar = (i6b.o) i6bVar3;
                                float f37 = oVar.f;
                                float f38 = oVar.e;
                                float f39 = oVar.d;
                                float f40 = oVar.c;
                                v5bVar.h(f40, f39, f38, f37);
                                float f41 = f40 + f13;
                                float f42 = f39 + f14;
                                f13 += f38;
                                f14 += f37;
                                f11 = f41;
                                f12 = f42;
                            } else {
                                if (i6bVar3 instanceof i6b.g) {
                                    i6b.g gVar = (i6b.g) i6bVar3;
                                    float f43 = gVar.f;
                                    float f44 = gVar.e;
                                    float f45 = gVar.d;
                                    f4 = gVar.c;
                                    v5bVar.f(f4, f45, f44, f43);
                                    f14 = f43;
                                    f13 = f44;
                                    f12 = f45;
                                } else if (i6bVar3 instanceof i6b.q) {
                                    if (i6bVar2.b) {
                                        f2 = f13 - f11;
                                        f3 = f14 - f12;
                                    } else {
                                        f2 = f10;
                                        f3 = f2;
                                    }
                                    i6b.q qVar = (i6b.q) i6bVar3;
                                    float f46 = qVar.d;
                                    float f47 = qVar.c;
                                    v5bVar.h(f2, f3, f47, f46);
                                    f4 = f2 + f13;
                                    float f48 = f3 + f14;
                                    f13 += f47;
                                    f14 += f46;
                                    f12 = f48;
                                } else if (i6bVar3 instanceof i6b.i) {
                                    if (i6bVar2.b) {
                                        f13 = (f13 * 2.0f) - f11;
                                        f14 = (2.0f * f14) - f12;
                                    }
                                    i6b.i iVar = (i6b.i) i6bVar3;
                                    float f49 = iVar.d;
                                    float f50 = iVar.c;
                                    v5bVar.f(f13, f14, f50, f49);
                                    i = size;
                                    f = f10;
                                    i2 = i4;
                                    f12 = f14;
                                    i6bVar = i6bVar3;
                                    f14 = f49;
                                    f11 = f13;
                                    f13 = f50;
                                } else if (i6bVar3 instanceof i6b.j) {
                                    i6b.j jVar = (i6b.j) i6bVar3;
                                    float f51 = jVar.h + f13;
                                    float f52 = jVar.i + f14;
                                    f = f10;
                                    i = size;
                                    i2 = i4;
                                    a(v5bVar, f13, f14, f51, f52, jVar.c, jVar.d, jVar.e, jVar.f, jVar.g);
                                    f11 = f51;
                                    f13 = f11;
                                    f12 = f52;
                                    f14 = f12;
                                    i6bVar = i6bVar3;
                                } else {
                                    i = size;
                                    f = f10;
                                    i2 = i4;
                                    if (!(i6bVar3 instanceof i6b.a)) {
                                        l.g();
                                        return;
                                    }
                                    i6b.a aVar = (i6b.a) i6bVar3;
                                    float f53 = aVar.i;
                                    float f54 = aVar.h;
                                    i6bVar = i6bVar3;
                                    a(v5bVar, f13, f14, f54, f53, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g);
                                    f12 = f53;
                                    f14 = f12;
                                    f11 = f54;
                                    f13 = f11;
                                }
                                i = size;
                                f = f10;
                                i2 = i4;
                                i6bVar = i6bVar3;
                            }
                            f11 = f4;
                        }
                        f14 += f9;
                        f11 = f7;
                        f12 = f8;
                    }
                    i = size;
                    f = f10;
                    i2 = i4;
                }
                i6bVar = i6bVar3;
            }
            i4 = i2 + 1;
            list2 = list;
            v5bVar2 = v5bVar;
            size = i;
            i6bVar2 = i6bVar;
            f10 = f;
        }
    }
}
