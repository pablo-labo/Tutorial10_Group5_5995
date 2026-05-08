package defpackage;

import android.graphics.Rect;
import com.airbnb.lottie.parser.moshi.a;
import com.airbnb.lottie.parser.moshi.c;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.hl8;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a79 {
    public static final a.C0108a a = a.C0108a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final a.C0108a b = a.C0108a.a("id", "layers", "w", "h", "p", "u");
    public static final a.C0108a c = a.C0108a.a("list");
    public static final a.C0108a d = a.C0108a.a("cm", "tm", "dr");

    public static s69 a(c cVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float fC = ckg.c();
        r59<hl8> r59Var = new r59<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        loe<mn5> loeVar = new loe<>();
        s69 s69Var = new s69();
        cVar.h();
        float fNextDouble = 0.0f;
        int iNextDouble = 0;
        int iNextDouble2 = 0;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        while (cVar.hasNext()) {
            float f8 = fC;
            switch (cVar.N(a)) {
                case 0:
                    f7 = fNextDouble;
                    iNextDouble = (int) cVar.nextDouble();
                    fC = f8;
                    fNextDouble = f7;
                    break;
                case 1:
                    f7 = fNextDouble;
                    iNextDouble2 = (int) cVar.nextDouble();
                    fC = f8;
                    fNextDouble = f7;
                    break;
                case 2:
                    f7 = fNextDouble;
                    fNextDouble2 = (float) cVar.nextDouble();
                    fC = f8;
                    fNextDouble = f7;
                    break;
                case 3:
                    f7 = fNextDouble;
                    fNextDouble3 = ((float) cVar.nextDouble()) - 0.01f;
                    fC = f8;
                    fNextDouble = f7;
                    break;
                case 4:
                    fNextDouble = (float) cVar.nextDouble();
                    fC = f8;
                    break;
                case 5:
                    f = fNextDouble;
                    f2 = fNextDouble2;
                    f3 = fNextDouble3;
                    String[] strArrSplit = cVar.I0().split("\\.");
                    int i = Integer.parseInt(strArrSplit[0]);
                    int i2 = Integer.parseInt(strArrSplit[1]);
                    int i3 = Integer.parseInt(strArrSplit[2]);
                    if (i < 4 || (i <= 4 && (i2 < 4 || (i2 <= 4 && i3 < 0)))) {
                        s69Var.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fC = f8;
                    fNextDouble2 = f2;
                    fNextDouble = f;
                    fNextDouble3 = f3;
                    break;
                case 6:
                    f = fNextDouble;
                    f2 = fNextDouble2;
                    f3 = fNextDouble3;
                    cVar.a();
                    int i4 = 0;
                    while (cVar.hasNext()) {
                        hl8 hl8VarA = il8.a(cVar, s69Var);
                        if (hl8VarA.e == hl8.a.b) {
                            i4++;
                        }
                        arrayList.add(hl8VarA);
                        r59Var.h(hl8VarA, hl8VarA.d);
                        if (i4 > 4) {
                            a49.b("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    cVar.p();
                    fC = f8;
                    fNextDouble2 = f2;
                    fNextDouble = f;
                    fNextDouble3 = f3;
                    break;
                case 7:
                    f = fNextDouble;
                    f2 = fNextDouble2;
                    f3 = fNextDouble3;
                    cVar.a();
                    while (cVar.hasNext()) {
                        ArrayList arrayList3 = new ArrayList();
                        r59 r59Var2 = new r59();
                        cVar.h();
                        String strI0 = null;
                        String strI02 = null;
                        String strI03 = null;
                        int iNextInt = 0;
                        int iNextInt2 = 0;
                        while (cVar.hasNext()) {
                            int iN = cVar.N(b);
                            if (iN == 0) {
                                strI0 = cVar.I0();
                            } else if (iN == 1) {
                                cVar.a();
                                while (cVar.hasNext()) {
                                    hl8 hl8VarA2 = il8.a(cVar, s69Var);
                                    r59Var2.h(hl8VarA2, hl8VarA2.d);
                                    arrayList3.add(hl8VarA2);
                                }
                                cVar.p();
                            } else if (iN == 2) {
                                iNextInt = cVar.nextInt();
                            } else if (iN == 3) {
                                iNextInt2 = cVar.nextInt();
                            } else if (iN == 4) {
                                strI02 = cVar.I0();
                            } else if (iN != 5) {
                                cVar.P();
                                cVar.I();
                            } else {
                                strI03 = cVar.I0();
                            }
                        }
                        cVar.s();
                        if (strI02 != null) {
                            map2.put(strI0, new n79(strI0, iNextInt, strI02, iNextInt2, strI03));
                        } else {
                            map.put(strI0, arrayList3);
                        }
                    }
                    cVar.p();
                    fC = f8;
                    fNextDouble2 = f2;
                    fNextDouble = f;
                    fNextDouble3 = f3;
                    break;
                case 8:
                    f = fNextDouble;
                    float f9 = fNextDouble2;
                    float f10 = fNextDouble3;
                    cVar.h();
                    while (cVar.hasNext()) {
                        if (cVar.N(c) != 0) {
                            cVar.P();
                            cVar.I();
                        } else {
                            cVar.a();
                            while (cVar.hasNext()) {
                                a.C0108a c0108a = yn5.a;
                                cVar.h();
                                String strI04 = null;
                                String strI05 = null;
                                String strI06 = null;
                                while (cVar.hasNext()) {
                                    float f11 = f9;
                                    int iN2 = cVar.N(yn5.a);
                                    if (iN2 != 0) {
                                        float f12 = f10;
                                        if (iN2 == 1) {
                                            strI05 = cVar.I0();
                                        } else if (iN2 == 2) {
                                            strI06 = cVar.I0();
                                        } else if (iN2 != 3) {
                                            cVar.P();
                                            cVar.I();
                                        } else {
                                            cVar.nextDouble();
                                        }
                                        f9 = f11;
                                        f10 = f12;
                                    } else {
                                        strI04 = cVar.I0();
                                        f9 = f11;
                                    }
                                }
                                cVar.s();
                                map3.put(strI05, new kn5(strI04, strI05, strI06));
                                f9 = f9;
                            }
                            cVar.p();
                        }
                    }
                    f2 = f9;
                    f3 = f10;
                    cVar.s();
                    fC = f8;
                    fNextDouble2 = f2;
                    fNextDouble = f;
                    fNextDouble3 = f3;
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    f = fNextDouble;
                    f4 = fNextDouble2;
                    f5 = fNextDouble3;
                    cVar.a();
                    while (cVar.hasNext()) {
                        a.C0108a c0108a2 = nn5.a;
                        ArrayList arrayList4 = new ArrayList();
                        cVar.h();
                        double dNextDouble = 0.0d;
                        String strI07 = null;
                        String strI08 = null;
                        char cCharAt = 0;
                        while (cVar.hasNext()) {
                            int iN3 = cVar.N(nn5.a);
                            if (iN3 == 0) {
                                cCharAt = cVar.I0().charAt(0);
                            } else if (iN3 == 1) {
                                cVar.nextDouble();
                            } else if (iN3 == 2) {
                                dNextDouble = cVar.nextDouble();
                            } else if (iN3 == 3) {
                                strI07 = cVar.I0();
                            } else if (iN3 == 4) {
                                strI08 = cVar.I0();
                            } else if (iN3 != 5) {
                                cVar.P();
                                cVar.I();
                            } else {
                                cVar.h();
                                while (cVar.hasNext()) {
                                    if (cVar.N(nn5.b) != 0) {
                                        cVar.P();
                                        cVar.I();
                                    } else {
                                        cVar.a();
                                        while (cVar.hasNext()) {
                                            arrayList4.add((nce) dt2.a(cVar, s69Var));
                                        }
                                        cVar.p();
                                    }
                                }
                                cVar.s();
                            }
                        }
                        cVar.s();
                        mn5 mn5Var = new mn5(arrayList4, cCharAt, dNextDouble, strI07, strI08);
                        loeVar.g(mn5Var.hashCode(), mn5Var);
                    }
                    cVar.p();
                    f2 = f4;
                    f3 = f5;
                    fC = f8;
                    fNextDouble2 = f2;
                    fNextDouble = f;
                    fNextDouble3 = f3;
                    break;
                case 10:
                    cVar.a();
                    while (cVar.hasNext()) {
                        cVar.h();
                        String strI09 = null;
                        float fNextDouble4 = 0.0f;
                        while (cVar.hasNext()) {
                            int iN4 = cVar.N(d);
                            if (iN4 != 0) {
                                f6 = fNextDouble;
                                if (iN4 == 1) {
                                    fNextDouble3 = fNextDouble3;
                                    fNextDouble4 = (float) cVar.nextDouble();
                                    fNextDouble = f6;
                                    fNextDouble2 = fNextDouble2;
                                } else if (iN4 != 2) {
                                    cVar.P();
                                    cVar.I();
                                } else {
                                    cVar.nextDouble();
                                }
                            } else {
                                f6 = fNextDouble;
                                strI09 = cVar.I0();
                            }
                            fNextDouble = f6;
                        }
                        cVar.s();
                        arrayList2.add(new be9(strI09, fNextDouble4));
                        fNextDouble2 = fNextDouble2;
                        fNextDouble3 = fNextDouble3;
                        fNextDouble = fNextDouble;
                    }
                    f = fNextDouble;
                    f4 = fNextDouble2;
                    f5 = fNextDouble3;
                    cVar.p();
                    f2 = f4;
                    f3 = f5;
                    fC = f8;
                    fNextDouble2 = f2;
                    fNextDouble = f;
                    fNextDouble3 = f3;
                    break;
                default:
                    cVar.P();
                    cVar.I();
                    f = fNextDouble;
                    f2 = fNextDouble2;
                    f3 = fNextDouble3;
                    fC = f8;
                    fNextDouble2 = f2;
                    fNextDouble = f;
                    fNextDouble3 = f3;
                    break;
            }
        }
        float f13 = fC;
        float f14 = fNextDouble;
        Rect rect = new Rect(0, 0, (int) (iNextDouble * f13), (int) (iNextDouble2 * f13));
        float fC2 = ckg.c();
        s69Var.k = rect;
        s69Var.l = fNextDouble2;
        s69Var.m = fNextDouble3;
        s69Var.n = f14;
        s69Var.j = arrayList;
        s69Var.i = r59Var;
        s69Var.c = map;
        s69Var.d = map2;
        s69Var.e = fC2;
        s69Var.h = loeVar;
        s69Var.f = map3;
        s69Var.g = arrayList2;
        return s69Var;
    }
}
