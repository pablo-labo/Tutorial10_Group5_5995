package defpackage;

import android.graphics.Color;
import android.view.animation.BaseInterpolator;
import com.airbnb.lottie.parser.moshi.a;
import com.airbnb.lottie.parser.moshi.c;
import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.ge9;
import defpackage.hl8;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class il8 {
    public static final a.C0108a a = a.C0108a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", BatchMetricsDispatcher.SR_TRACK_NAME, "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final a.C0108a b = a.C0108a.a("d", "a");
    public static final a.C0108a c = a.C0108a.a("ty", "nm");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static hl8 a(c cVar, s69 s69Var) {
        ArrayList arrayList;
        String str;
        boolean z;
        long j;
        Float f;
        Float f2;
        String str2;
        boolean z2;
        Float f3;
        String str3;
        String strX;
        byte b2;
        Float f4;
        String str4;
        Float f5;
        String str5;
        boolean z3;
        long j2;
        boolean z4;
        dc0 dc0Var;
        dc0 dc0Var2;
        dc0 dc0Var3;
        dc0 dc0Var4;
        Float f6;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        cVar.h();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        hl8.b bVar = hl8.b.a;
        hj8 hj8Var = hj8.a;
        rc0 rc0VarA = null;
        hl8.a aVar = null;
        String strI0 = null;
        int iC = 0;
        int iC2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        v vVar = null;
        id4 id4Var = null;
        nc0 nc0Var = null;
        mte mteVar = null;
        dc0 dc0VarQ = null;
        float fNextDouble5 = 1.0f;
        float fNextDouble6 = 0.0f;
        String strI02 = null;
        String strI03 = "UNSET";
        boolean z5 = false;
        long jNextInt = 0;
        long jNextInt2 = -1;
        while (cVar.hasNext()) {
            int i = 1;
            switch (cVar.N(a)) {
                case 0:
                    j = jNextInt2;
                    strI03 = cVar.I0();
                    jNextInt2 = j;
                    break;
                case 1:
                    f = fValueOf;
                    j = jNextInt2;
                    jNextInt = cVar.nextInt();
                    fValueOf = f;
                    jNextInt2 = j;
                    break;
                case 2:
                    j = jNextInt2;
                    strI0 = cVar.I0();
                    jNextInt2 = j;
                    break;
                case 3:
                    f2 = fValueOf;
                    str2 = strI02;
                    z2 = z5;
                    j = jNextInt2;
                    int iNextInt = cVar.nextInt();
                    aVar = iNextInt < 6 ? hl8.a.values()[iNextInt] : hl8.a.c;
                    fValueOf = f2;
                    strI02 = str2;
                    z5 = z2;
                    jNextInt2 = j;
                    break;
                case 4:
                    f4 = fValueOf;
                    str4 = strI02;
                    jNextInt2 = cVar.nextInt();
                    fValueOf = f4;
                    strI02 = str4;
                    break;
                case 5:
                    f3 = fValueOf;
                    str3 = strI02;
                    j = jNextInt2;
                    iC = (int) (ckg.c() * cVar.nextInt());
                    fValueOf = f3;
                    strI02 = str3;
                    jNextInt2 = j;
                    break;
                case 6:
                    f3 = fValueOf;
                    str3 = strI02;
                    j = jNextInt2;
                    iC2 = (int) (ckg.c() * cVar.nextInt());
                    fValueOf = f3;
                    strI02 = str3;
                    jNextInt2 = j;
                    break;
                case 7:
                    f = fValueOf;
                    j = jNextInt2;
                    color = Color.parseColor(cVar.I0());
                    fValueOf = f;
                    jNextInt2 = j;
                    break;
                case 8:
                    j = jNextInt2;
                    rc0VarA = sc0.a(cVar, s69Var);
                    jNextInt2 = j;
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    f2 = fValueOf;
                    str2 = strI02;
                    z2 = z5;
                    j = jNextInt2;
                    int iNextInt2 = cVar.nextInt();
                    if (iNextInt2 >= hl8.b.values().length) {
                        s69Var.a("Unsupported matte type: " + iNextInt2);
                    } else {
                        bVar = hl8.b.values()[iNextInt2];
                        int iOrdinal = bVar.ordinal();
                        if (iOrdinal == 3) {
                            s69Var.a("Unsupported matte type: Luma");
                        } else if (iOrdinal == 4) {
                            s69Var.a("Unsupported matte type: Luma Inverted");
                        }
                        s69Var.p++;
                    }
                    fValueOf = f2;
                    strI02 = str2;
                    z5 = z2;
                    jNextInt2 = j;
                    break;
                case 10:
                    f2 = fValueOf;
                    str2 = strI02;
                    z2 = z5;
                    j = jNextInt2;
                    cVar.a();
                    while (cVar.hasNext()) {
                        cVar.h();
                        boolean zNextBoolean2 = false;
                        ge9.a aVar2 = null;
                        lc0 lc0Var = null;
                        fc0 fc0VarS = null;
                        while (cVar.hasNext()) {
                            strX = cVar.X();
                            strX.getClass();
                            switch (strX) {
                                case "o":
                                    fc0VarS = wg2.S(cVar, s69Var);
                                    break;
                                case "pt":
                                    lc0Var = new lc0(oh8.a(cVar, s69Var, ckg.c(), jce.a, false), 0);
                                    break;
                                case "inv":
                                    zNextBoolean2 = cVar.nextBoolean();
                                    break;
                                case "mode":
                                    String strI04 = cVar.I0();
                                    strI04.getClass();
                                    switch (strI04.hashCode()) {
                                        case 97:
                                            b2 = !strI04.equals("a") ? (byte) -1 : (byte) 0;
                                            break;
                                        case 105:
                                            b2 = !strI04.equals("i") ? (byte) -1 : (byte) 1;
                                            break;
                                        case 110:
                                            b2 = !strI04.equals("n") ? (byte) -1 : (byte) 2;
                                            break;
                                        case 115:
                                            b2 = !strI04.equals("s") ? (byte) -1 : (byte) 3;
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    ge9.a aVar3 = ge9.a.a;
                                    switch (b2) {
                                        case 0:
                                            aVar2 = aVar3;
                                            break;
                                        case 1:
                                            s69Var.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            aVar2 = ge9.a.c;
                                            break;
                                        case 2:
                                            aVar2 = ge9.a.d;
                                            break;
                                        case 3:
                                            aVar2 = ge9.a.b;
                                            break;
                                        default:
                                            a49.b("Unknown mask mode " + strX + ". Defaulting to Add.");
                                            aVar2 = aVar3;
                                            break;
                                    }
                                    break;
                                default:
                                    cVar.I();
                                    break;
                            }
                        }
                        cVar.s();
                        arrayList2.add(new ge9(aVar2, lc0Var, fc0VarS, zNextBoolean2));
                    }
                    s69Var.p += arrayList2.size();
                    cVar.p();
                    fValueOf = f2;
                    strI02 = str2;
                    z5 = z2;
                    jNextInt2 = j;
                    break;
                case 11:
                    f2 = fValueOf;
                    str2 = strI02;
                    z2 = z5;
                    j = jNextInt2;
                    cVar.a();
                    while (cVar.hasNext()) {
                        ct2 ct2VarA = dt2.a(cVar, s69Var);
                        if (ct2VarA != null) {
                            arrayList3.add(ct2VarA);
                        }
                    }
                    cVar.p();
                    fValueOf = f2;
                    strI02 = str2;
                    z5 = z2;
                    jNextInt2 = j;
                    break;
                case 12:
                    f5 = fValueOf;
                    str5 = strI02;
                    z3 = z5;
                    cVar.h();
                    while (cVar.hasNext()) {
                        int iN = cVar.N(b);
                        if (iN == 0) {
                            j2 = jNextInt2;
                            nc0Var = new nc0(oh8.a(cVar, s69Var, ckg.c(), l84.a, false), 0);
                        } else if (iN != 1) {
                            cVar.P();
                            cVar.I();
                        } else {
                            cVar.a();
                            if (cVar.hasNext()) {
                                a.C0108a c0108a = oc0.a;
                                cVar.h();
                                qc0 qc0Var = null;
                                pc0 pc0Var = null;
                                while (cVar.hasNext()) {
                                    int iN2 = cVar.N(oc0.a);
                                    if (iN2 != 0) {
                                        boolean z6 = true;
                                        if (iN2 != 1) {
                                            cVar.P();
                                            cVar.I();
                                        } else {
                                            cVar.h();
                                            cc0 cc0VarP = null;
                                            cc0 cc0VarP2 = null;
                                            dc0 dc0VarQ2 = null;
                                            dc0 dc0VarQ3 = null;
                                            fc0 fc0VarS2 = null;
                                            while (cVar.hasNext()) {
                                                int iN3 = cVar.N(oc0.c);
                                                if (iN3 == 0) {
                                                    cc0VarP = wg2.P(cVar, s69Var);
                                                } else if (iN3 == z6) {
                                                    cc0VarP2 = wg2.P(cVar, s69Var);
                                                } else if (iN3 == 2) {
                                                    dc0VarQ2 = wg2.Q(cVar, s69Var, z6);
                                                } else if (iN3 == 3) {
                                                    dc0VarQ3 = wg2.Q(cVar, s69Var, z6);
                                                } else if (iN3 != 4) {
                                                    cVar.P();
                                                    cVar.I();
                                                } else {
                                                    fc0VarS2 = wg2.S(cVar, s69Var);
                                                }
                                                z6 = true;
                                            }
                                            cVar.s();
                                            qc0Var = new qc0(cc0VarP, cc0VarP2, dc0VarQ2, dc0VarQ3, fc0VarS2);
                                        }
                                    } else {
                                        cVar.h();
                                        fc0 fc0VarS3 = null;
                                        fc0 fc0VarS4 = null;
                                        fc0 fc0VarS5 = null;
                                        njf njfVar = null;
                                        while (cVar.hasNext()) {
                                            fc0 fc0Var = fc0VarS3;
                                            int iN4 = cVar.N(oc0.b);
                                            if (iN4 != 0) {
                                                long j3 = jNextInt2;
                                                if (iN4 == 1) {
                                                    fc0VarS4 = wg2.S(cVar, s69Var);
                                                } else if (iN4 == 2) {
                                                    fc0VarS5 = wg2.S(cVar, s69Var);
                                                } else if (iN4 != 3) {
                                                    cVar.P();
                                                    cVar.I();
                                                } else {
                                                    int iNextInt3 = cVar.nextInt();
                                                    njfVar = njf.b;
                                                    if (iNextInt3 != 1 && iNextInt3 != 2) {
                                                        s69Var.a("Unsupported text range units: " + iNextInt3);
                                                    } else if (iNextInt3 == 1) {
                                                        njfVar = njf.a;
                                                    }
                                                }
                                                fc0VarS3 = fc0Var;
                                                jNextInt2 = j3;
                                            } else {
                                                fc0VarS3 = wg2.S(cVar, s69Var);
                                            }
                                        }
                                        fc0 fc0Var2 = fc0VarS3;
                                        long j4 = jNextInt2;
                                        cVar.s();
                                        pc0Var = new pc0((fc0Var2 != null || fc0VarS4 == null) ? fc0Var2 : new fc0(Collections.singletonList(new lh8(0)), 0), fc0VarS4, fc0VarS5, njfVar);
                                        jNextInt2 = j4;
                                    }
                                }
                                j2 = jNextInt2;
                                cVar.s();
                                mteVar = new mte(qc0Var, pc0Var);
                            } else {
                                j2 = jNextInt2;
                            }
                            while (cVar.hasNext()) {
                                cVar.I();
                            }
                            cVar.p();
                        }
                        jNextInt2 = j2;
                    }
                    cVar.s();
                    fValueOf = f5;
                    strI02 = str5;
                    z5 = z3;
                    break;
                case 13:
                    f5 = fValueOf;
                    str5 = strI02;
                    cVar.a();
                    ArrayList arrayList4 = new ArrayList();
                    while (cVar.hasNext()) {
                        cVar.h();
                        while (cVar.hasNext()) {
                            int iN5 = cVar.N(c);
                            if (iN5 == 0) {
                                int iNextInt4 = cVar.nextInt();
                                if (iNextInt4 == 29) {
                                    a.C0108a c0108a2 = ci1.a;
                                    vVar = null;
                                    while (cVar.hasNext()) {
                                        if (cVar.N(ci1.a) != 0) {
                                            cVar.P();
                                            cVar.I();
                                        } else {
                                            cVar.a();
                                            while (cVar.hasNext()) {
                                                cVar.h();
                                                boolean z7 = false;
                                                v vVar2 = null;
                                                while (cVar.hasNext()) {
                                                    int iN6 = cVar.N(ci1.b);
                                                    if (iN6 != 0) {
                                                        boolean z8 = z7;
                                                        if (iN6 != 1) {
                                                            cVar.P();
                                                            cVar.I();
                                                        } else if (z8) {
                                                            vVar2 = new v(wg2.Q(cVar, s69Var, true));
                                                        } else {
                                                            cVar.I();
                                                        }
                                                        z7 = z8;
                                                    } else {
                                                        z7 = cVar.nextInt() == 0;
                                                    }
                                                }
                                                cVar.s();
                                                if (vVar2 != null) {
                                                    vVar = vVar2;
                                                }
                                            }
                                            cVar.p();
                                            i = 1;
                                        }
                                    }
                                } else {
                                    if (iNextInt4 == 25) {
                                        jd4 jd4Var = new jd4();
                                        while (cVar.hasNext()) {
                                            if (cVar.N(jd4.f) != 0) {
                                                cVar.P();
                                                cVar.I();
                                            } else {
                                                cVar.a();
                                                while (cVar.hasNext()) {
                                                    cVar.h();
                                                    String strI05 = "";
                                                    while (cVar.hasNext()) {
                                                        int iN7 = cVar.N(jd4.g);
                                                        if (iN7 != 0) {
                                                            boolean z9 = z5;
                                                            if (iN7 == 1) {
                                                                strI05.getClass();
                                                                switch (strI05) {
                                                                    case "Distance":
                                                                        jd4Var.d = wg2.Q(cVar, s69Var, true);
                                                                        break;
                                                                    case "Opacity":
                                                                        jd4Var.b = wg2.Q(cVar, s69Var, false);
                                                                        break;
                                                                    case "Direction":
                                                                        jd4Var.c = wg2.Q(cVar, s69Var, false);
                                                                        break;
                                                                    case "Shadow Color":
                                                                        jd4Var.a = wg2.P(cVar, s69Var);
                                                                        break;
                                                                    case "Softness":
                                                                        jd4Var.e = wg2.Q(cVar, s69Var, true);
                                                                        break;
                                                                    default:
                                                                        cVar.I();
                                                                        break;
                                                                }
                                                            } else {
                                                                cVar.P();
                                                                cVar.I();
                                                            }
                                                            z5 = z9;
                                                        } else {
                                                            strI05 = cVar.I0();
                                                        }
                                                    }
                                                    cVar.s();
                                                }
                                                cVar.p();
                                            }
                                        }
                                        z4 = z5;
                                        cc0 cc0Var = jd4Var.a;
                                        id4Var = (cc0Var == null || (dc0Var = jd4Var.b) == null || (dc0Var2 = jd4Var.c) == null || (dc0Var3 = jd4Var.d) == null || (dc0Var4 = jd4Var.e) == null) ? null : new id4(cc0Var, dc0Var, dc0Var2, dc0Var3, dc0Var4);
                                    }
                                    z5 = z4;
                                    i = 1;
                                }
                            } else if (iN5 != i) {
                                cVar.P();
                                cVar.I();
                            } else {
                                arrayList4.add(cVar.I0());
                            }
                            z4 = z5;
                            z5 = z4;
                            i = 1;
                        }
                        cVar.s();
                        i = 1;
                    }
                    z3 = z5;
                    cVar.p();
                    s69Var.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    fValueOf = f5;
                    strI02 = str5;
                    z5 = z3;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    f4 = fValueOf;
                    str4 = strI02;
                    fNextDouble5 = (float) cVar.nextDouble();
                    fValueOf = f4;
                    strI02 = str4;
                    break;
                case 15:
                    f4 = fValueOf;
                    str4 = strI02;
                    fNextDouble6 = (float) cVar.nextDouble();
                    fValueOf = f4;
                    strI02 = str4;
                    break;
                case 16:
                    f4 = fValueOf;
                    str4 = strI02;
                    fNextDouble3 = (float) (cVar.nextDouble() * ((double) ckg.c()));
                    fValueOf = f4;
                    strI02 = str4;
                    break;
                case 17:
                    f4 = fValueOf;
                    str4 = strI02;
                    fNextDouble4 = (float) (cVar.nextDouble() * ((double) ckg.c()));
                    fValueOf = f4;
                    strI02 = str4;
                    break;
                case 18:
                    f6 = fValueOf;
                    fNextDouble = (float) cVar.nextDouble();
                    fValueOf = f6;
                    break;
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    f6 = fValueOf;
                    fNextDouble2 = (float) cVar.nextDouble();
                    fValueOf = f6;
                    break;
                case 20:
                    f6 = fValueOf;
                    dc0VarQ = wg2.Q(cVar, s69Var, false);
                    fValueOf = f6;
                    break;
                case 21:
                    strI02 = cVar.I0();
                    break;
                case 22:
                    zNextBoolean = cVar.nextBoolean();
                    break;
                case 23:
                    f6 = fValueOf;
                    z5 = cVar.nextInt() == 1;
                    fValueOf = f6;
                    break;
                case 24:
                    int iNextInt5 = cVar.nextInt();
                    if (iNextInt5 >= hj8.values().length) {
                        f6 = fValueOf;
                        s69Var.a("Unsupported Blend Mode: " + iNextInt5);
                        hj8Var = hj8Var;
                    } else {
                        f6 = fValueOf;
                        hj8Var = hj8.values()[iNextInt5];
                    }
                    fValueOf = f6;
                    break;
                default:
                    cVar.P();
                    cVar.I();
                    f2 = fValueOf;
                    str2 = strI02;
                    z2 = z5;
                    j = jNextInt2;
                    fValueOf = f2;
                    strI02 = str2;
                    z5 = z2;
                    jNextInt2 = j;
                    break;
            }
        }
        Float f7 = fValueOf;
        String str6 = strI02;
        boolean z10 = z5;
        long j5 = jNextInt2;
        cVar.s();
        ArrayList arrayList5 = new ArrayList();
        if (fNextDouble > 0.0f) {
            arrayList = arrayList3;
            str = str6;
            z = z10;
            arrayList5.add(new lh8(s69Var, f7, f7, (BaseInterpolator) null, 0.0f, Float.valueOf(fNextDouble)));
        } else {
            arrayList = arrayList3;
            str = str6;
            z = z10;
        }
        if (fNextDouble2 <= 0.0f) {
            fNextDouble2 = s69Var.m;
        }
        arrayList5.add(new lh8(s69Var, fValueOf2, fValueOf2, (BaseInterpolator) null, fNextDouble, Float.valueOf(fNextDouble2)));
        arrayList5.add(new lh8(s69Var, f7, f7, (BaseInterpolator) null, fNextDouble2, Float.valueOf(Float.MAX_VALUE)));
        if (strI03.endsWith(".ai") || "ai".equals(str)) {
            s69Var.a("Convert your Illustrator layers to shape layers.");
        }
        if (z) {
            rc0 rc0Var = rc0VarA == null ? new rc0() : rc0VarA;
            rc0Var.j = z;
            rc0VarA = rc0Var;
        }
        return new hl8(arrayList, s69Var, strI03, jNextInt, aVar, j5, strI0, arrayList2, rc0VarA, iC, iC2, color, fNextDouble5, fNextDouble6, fNextDouble3, fNextDouble4, nc0Var, mteVar, arrayList5, bVar, dc0VarQ, zNextBoolean, vVar, id4Var, hj8Var);
    }
}
