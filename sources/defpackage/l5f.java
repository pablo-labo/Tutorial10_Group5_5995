package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.af1;
import defpackage.c20;
import defpackage.fl1;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.sx8;
import defpackage.vcf;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l5f {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[vcf.c.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[vcf.f.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[vcf.d.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            a = iArr3;
            int[] iArr4 = new int[vcf.e.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public static final void a(final tg2 tg2Var, final String str, final vcf.c cVar, final vcf.d dVar, final vcf.e eVar, final vcf.f fVar, final String str2, b bVar, final int i) {
        int i2;
        c cVar2;
        boolean z;
        tg2Var.getClass();
        str.getClass();
        c cVarH = bVar.h(1933423186);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(tg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(cVar == null ? -1 : cVar.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.d(dVar == null ? -1 : dVar.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.d(eVar == null ? -1 : eVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.d(fVar != null ? fVar.ordinal() : -1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.K(str2) ? 1048576 : 524288;
        }
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            ie7.e(str2, null, null, cVarH, (i2 >> 18) & 14);
            boolean zB = tg2Var.b(y74.class);
            boolean zA = tg2Var.a();
            tg2 tg2Var2 = tg2Var.b;
            while (true) {
                if (tg2Var2 == null) {
                    z = false;
                    break;
                }
                d4f d4fVar = tg2Var2.a;
                if (fl1.class.isInstance(d4fVar)) {
                    d4fVar.getClass();
                    if (((fl1) d4fVar).l == fl1.d.c) {
                        z = true;
                        break;
                    }
                }
                tg2Var2 = tg2Var2.b;
            }
            cVar2 = cVarH;
            b(str, cVar, dVar, eVar, fVar, (zB || z) ? false : true, (zB || zA) ? false : true, cVar2, (i2 >> 3) & 65534);
        } else {
            cVar2 = cVarH;
            cVar2.D();
        }
        i iVarW = cVar2.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: j5f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l5f.a(tg2Var, str, cVar, dVar, eVar, fVar, str2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final String str, final vcf.c cVar, final vcf.d dVar, final vcf.e eVar, final vcf.f fVar, final boolean z, final boolean z2, b bVar, final int i) {
        int i2;
        af1.a aVar;
        int i3;
        e eVarW;
        e eVarJ;
        vcf.c cVar2;
        iz6 iz6Var;
        boolean z3;
        str.getClass();
        c cVarH = bVar.h(-278875912);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.d(cVar == null ? -1 : cVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(dVar == null ? -1 : dVar.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.d(eVar == null ? -1 : eVar.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.d(fVar != null ? fVar.ordinal() : -1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.a(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.a(z2) ? 1048576 : 524288;
        }
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            vcf.c cVar3 = cVar == null ? vcf.c.b : cVar;
            vcf.d dVar2 = dVar == null ? vcf.d.b : dVar;
            vcf.e eVar2 = eVar == null ? vcf.e.b : eVar;
            vcf.f fVar2 = fVar == null ? vcf.f.b : fVar;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(Boolean.FALSE);
                cVarH.p(objV2);
            }
            g4a g4aVar2 = (g4a) objV2;
            String str2 = ((Boolean) g4aVar2.getValue()).booleanValue() ? "Read Less" : "Read More";
            int iOrdinal = eVar2.ordinal();
            af1.a aVar2 = c20.a.m;
            if (iOrdinal == 0) {
                aVar = aVar2;
            } else if (iOrdinal == 1) {
                aVar = c20.a.n;
            } else {
                if (iOrdinal != 2) {
                    l.g();
                    return;
                }
                aVar = c20.a.o;
            }
            e.a aVar3 = e.a.b;
            if (z2) {
                o97.g gVar = o97Var.i;
                eVarJ = f.j(aVar3, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                i3 = i2;
                eVarW = aVar3;
            } else {
                i3 = i2;
                eVarW = aVar3;
                eVarJ = eVarW;
            }
            if (z) {
                cVar2 = cVar3;
                eVarW = g.w(g.f(eVarW, 1.0f), aVar, 2);
            } else {
                cVar2 = cVar3;
            }
            ob2 ob2VarA = mb2.a(vs0.c, aVar2, cVarH, 0);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarJ);
            gl2.j.getClass();
            e eVar3 = eVarW;
            pm8.a aVar4 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar4);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            gz6 gz6VarC = c(cVar2);
            int iOrdinal2 = fVar2.ordinal();
            if (iOrdinal2 == 0) {
                iz6Var = iz6.a;
            } else if (iOrdinal2 == 1) {
                iz6Var = iz6.b;
            } else if (iOrdinal2 == 2) {
                iz6Var = iz6.c;
            } else if (iOrdinal2 == 3) {
                iz6Var = iz6.d;
            } else {
                if (iOrdinal2 != 4) {
                    l.g();
                    return;
                }
                iz6Var = iz6.e;
            }
            int[] iArr = a.a;
            to5 to5Var = iArr[dVar2.ordinal()] == 1 ? to5.d0 : to5.b0;
            int i4 = iArr[dVar2.ordinal()] == 2 ? 1 : 0;
            odf odfVar = iArr[dVar2.ordinal()] == 3 ? odf.d : odf.b;
            int i5 = ((Boolean) g4aVar2.getValue()).booleanValue() ? Integer.MAX_VALUE : 3;
            mo5 mo5Var = new mo5(i4);
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = new yd(4, g4aVar);
                cVarH.p(objV3);
            }
            fz6.a(str, gz6VarC, iz6Var, eVar3, to5Var, mo5Var, odfVar, i5, 0, (Function1) objV3, cVarH, (i3 & 14) | 805306368, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            cVarH = cVarH;
            if (((Boolean) g4aVar.getValue()).booleanValue()) {
                cVarH.L(-1288286901);
                tjf tjfVarB = fz6.b(c(cVar2), o97Var);
                Object objV4 = cVarH.v();
                if (objV4 == c0020a) {
                    objV4 = new dw(2, g4aVar2);
                    cVarH.p(objV4);
                }
                d5f.b(str2, tjfVarB, (gu5) objV4, null, sx8.c.b, false, cVarH, 221568, 8);
                z3 = false;
            } else {
                z3 = false;
                cVarH.L(-1294906796);
            }
            cVarH.U(z3);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: k5f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l5f.b(str, cVar, dVar, eVar, fVar, z, z2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final gz6 c(vcf.c cVar) {
        switch (cVar.ordinal()) {
            case 0:
                return gz6.a;
            case 1:
                return gz6.b;
            case 2:
                return gz6.c;
            case 3:
                return gz6.d;
            case 4:
                return gz6.e;
            case 5:
                return gz6.f;
            case 6:
                return gz6.V;
            case 7:
                return gz6.W;
            default:
                l.g();
                return null;
        }
    }
}
