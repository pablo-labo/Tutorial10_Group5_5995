package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gt6 {

    public static final class a implements wu5<fhd, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ fv6 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ fv6 d;
        public final /* synthetic */ String e;

        public a(boolean z, fv6 fv6Var, String str, fv6 fv6Var2, String str2) {
            this.a = z;
            this.b = fv6Var;
            this.c = str;
            this.d = fv6Var2;
            this.e = str2;
        }

        @Override // defpackage.wu5
        public final j6g q(fhd fhdVar, androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            fhdVar.getClass();
            if ((iIntValue & 17) == 16 && bVar2.i()) {
                bVar2.D();
            } else {
                gt6.p(this.a, true, bh2.c(-16783130, new ft6(this.b, this.c, this.d, this.e), bVar2), bVar2, 432, 0);
            }
            return j6g.a;
        }
    }

    public static final class b implements wu5<fhd, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ fv6 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ fv6 d;
        public final /* synthetic */ String e;

        public b(boolean z, fv6 fv6Var, String str, fv6 fv6Var2, String str2) {
            this.a = z;
            this.b = fv6Var;
            this.c = str;
            this.d = fv6Var2;
            this.e = str2;
        }

        @Override // defpackage.wu5
        public final j6g q(fhd fhdVar, androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            fhdVar.getClass();
            if ((iIntValue & 17) == 16 && bVar2.i()) {
                bVar2.D();
            } else {
                gt6.p(this.a, false, bh2.c(-1694850602, new jt6(this.b, this.c, this.d, this.e), bVar2), bVar2, 432, 0);
            }
            return j6g.a;
        }
    }

    public static final void a(fv6 fv6Var, String str, fv6 fv6Var2, String str2, androidx.compose.runtime.b bVar, int i) {
        int i2;
        e.a aVar;
        c cVarH = bVar.h(-12688857);
        int i3 = (cVarH.d(fv6Var2 != null ? fv6Var2.ordinal() : -1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | i | (cVarH.d(fv6Var == null ? -1 : fv6Var.ordinal()) ? 4 : 2) | (cVarH.K(str) ? 32 : 16) | (cVarH.K(str2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if ((i3 & 1171) == 1170 && cVarH.i()) {
            cVarH.D();
        } else {
            String str3 = str2 == null ? "ButtonContent" : str2;
            ne4 ne4Var = p97.a;
            o97 o97Var = (o97) cVarH.M(ne4Var);
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e.a aVar2 = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarH, aVar2);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            cVarH.L(1613124849);
            if (fv6Var != null) {
                int i4 = i3 & 14;
                i2 = i3;
                aVar = aVar2;
                ev6.b(fv6Var, f.a(aVar2, str3.concat("_IconBefore")), null, null, ((da2) cVarH.M(qs2.a)).a, null, cVarH, i4, 44);
                jh2.f(cVarH, g.n(aVar, hq1.e));
            } else {
                i2 = i3;
                aVar = aVar2;
            }
            cVarH.U(false);
            cif.b(str, f.a(aVar, str3.concat("_Text")), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(((o97) cVarH.M(ne4Var)).j.f, 0L, 0L, o97Var.f.c, null, o97Var.d.a, 0L, 0, 0L, null, null, 0, 16777179), cVarH, (i2 >> 3) & 14, 0, 65532);
            cVarH = cVarH;
            cVarH.L(1613144238);
            if (fv6Var2 != null) {
                jh2.f(cVarH, g.n(aVar, hq1.e));
                ev6.b(fv6Var2, f.a(aVar, str3.concat("_IconAfter")), null, null, ((da2) cVarH.M(qs2.a)).a, null, cVarH, (i2 >> 6) & 14, 44);
            }
            cVarH.U(false);
            cVarH.U(true);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new fi6(fv6Var, str, fv6Var2, str2, i);
        }
    }

    public static final void b(final String str, final gu5 gu5Var, final e eVar, final vt6 vt6Var, final fv6 fv6Var, final fv6 fv6Var2, androidx.compose.runtime.b bVar, final int i) {
        int i2;
        c cVarF = q6.f(-1461445988, gu5Var, bVar, str);
        if ((i & 6) == 0) {
            i2 = (cVarF.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarF.x(gu5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarF.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarF.d(vt6Var.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i3 = i2 | 221184;
        if ((1572864 & i) == 0) {
            i3 |= cVarF.d(fv6Var == null ? -1 : fv6Var.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= cVarF.d(fv6Var2 != null ? fv6Var2.ordinal() : -1) ? 8388608 : 4194304;
        }
        int i4 = i3 | 100663296;
        if ((38347923 & i4) == 38347922 && cVarF.i()) {
            cVarF.D();
        } else {
            o97 o97Var = (o97) cVarF.M(p97.a);
            cVarF.L(1849434622);
            Object objV = cVarF.v();
            if (objV == b.a.a) {
                objV = v40.a(cVarF);
            }
            d3a d3aVar = (d3a) objV;
            cVarF.U(false);
            o97.a aVar = o97Var.c;
            o97.a.e eVar2 = aVar.a;
            long j = aVar.b.g.h.c;
            float fQ = q(vt6Var, o97Var);
            hza hzaVar = new hza(16.0f, fQ, 16.0f, fQ);
            e eVarA = f.a(androidx.compose.foundation.e.a(g.b(eVar, vt6Var.a(), 1), d3aVar, r(j, cVarF)), "IdlDestructivePrimaryButton");
            hza hzaVar2 = hq1.a;
            long j2 = aVar.b.g.h.a;
            nq1.a(gu5Var, eVarA, true, ggd.a(o97Var.h.b), hq1.a(j2, eVar2.f, da2.b(j2, 0.4f), eVar2.f, cVarF, 0), null, null, hzaVar, d3aVar, bh2.c(1931544204, new ts6(fv6Var, str, fv6Var2, "IdlDestructivePrimaryButton"), cVarF), cVarF, ((i4 >> 3) & 14) | 905969664, 96);
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ns6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gt6.b(str, gu5Var, eVar, vt6Var, fv6Var, fv6Var2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final String str, final gu5 gu5Var, final e eVar, vt6 vt6Var, fv6 fv6Var, fv6 fv6Var2, androidx.compose.runtime.b bVar, final int i, final int i2) {
        int i3;
        final fv6 fv6Var3;
        final fv6 fv6Var4;
        c cVarF = q6.f(1214712142, gu5Var, bVar, str);
        if ((i & 6) == 0) {
            i3 = (cVarF.K(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cVarF.x(gu5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cVarF.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= cVarF.d(vt6Var == null ? -1 : vt6Var.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i5 = 221184 | i3;
        int i6 = i2 & 64;
        if (i6 != 0) {
            i5 = 1794048 | i3;
        } else if ((1572864 & i) == 0) {
            i5 |= cVarF.d(fv6Var == null ? -1 : fv6Var.ordinal()) ? 1048576 : 524288;
        }
        int i7 = i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 != 0) {
            i5 |= 12582912;
        } else if ((12582912 & i) == 0) {
            i5 |= cVarF.d(fv6Var2 != null ? fv6Var2.ordinal() : -1) ? 8388608 : 4194304;
        }
        int i8 = i5 | 100663296;
        if ((i8 & 38347923) == 38347922 && cVarF.i()) {
            cVarF.D();
            fv6Var3 = fv6Var;
            fv6Var4 = fv6Var2;
        } else {
            vt6 vt6Var2 = i4 != 0 ? vt6.Md : vt6Var;
            fv6 fv6Var5 = i6 != 0 ? null : fv6Var;
            fv6 fv6Var6 = i7 != 0 ? null : fv6Var2;
            o97 o97Var = (o97) cVarF.M(p97.a);
            cVarF.L(1849434622);
            Object objV = cVarF.v();
            if (objV == b.a.a) {
                objV = v40.a(cVarF);
            }
            d3a d3aVar = (d3a) objV;
            cVarF.U(false);
            o97.a aVar = o97Var.c;
            float f = o97Var.h.b;
            o97.a.C0340a c0340a = aVar.b;
            o97.a.e eVar2 = aVar.a;
            long j = aVar.b.g.c;
            g4a g4aVarH = r03.h(d3aVar, cVarF);
            float fQ = q(vt6Var2, o97Var);
            vt6Var = vt6Var2;
            hza hzaVar = new hza(16.0f, fQ, 16.0f, fQ);
            e eVarA = f.a(ygg.h(androidx.compose.foundation.e.a(ygg.h(g.b(eVar, vt6Var.a(), 1), ggd.a(f)), d3aVar, r(j, cVarF)), ggd.a(f)), "IdlDestructiveSecondaryButton");
            hza hzaVar2 = hq1.a;
            fv6 fv6Var7 = fv6Var5;
            fq1 fq1VarF = hq1.f(c0340a.g.a, ((Boolean) g4aVarH.getValue()).booleanValue() ? eVar2.g.g.c : eVar2.g.g.a, c0340a.g.a, da2.b(eVar2.g.g.a, 0.4f), cVarF, 0);
            cVarF = cVarF;
            fgd fgdVarA = ggd.a(f);
            boolean zBooleanValue = ((Boolean) g4aVarH.getValue()).booleanValue();
            o97.a.b bVar2 = aVar.c;
            nq1.b(gu5Var, eVarA, true, fgdVarA, fq1VarF, null, ee3.f(zBooleanValue ? bVar2.f.d.c : bVar2.f.d.a, 1.0f), hzaVar, d3aVar, bh2.c(-529669184, new vs6(fv6Var7, str, fv6Var6, "IdlDestructiveSecondaryButton"), cVarF), cVarF, ((i8 >> 3) & 14) | 905969664, 32);
            fv6Var3 = fv6Var7;
            fv6Var4 = fv6Var6;
        }
        final vt6 vt6Var3 = vt6Var;
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ks6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gt6.c(str, gu5Var, eVar, vt6Var3, fv6Var3, fv6Var4, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(String str, gu5 gu5Var, e eVar, vt6 vt6Var, fv6 fv6Var, fv6 fv6Var2, androidx.compose.runtime.b bVar, int i) {
        int i2;
        c cVarF = q6.f(1517133834, gu5Var, bVar, str);
        if ((i & 6) == 0) {
            i2 = (cVarF.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarF.x(gu5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarF.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarF.d(vt6Var.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i3 = i2 | 221184;
        if ((1572864 & i) == 0) {
            i3 |= cVarF.d(fv6Var == null ? -1 : fv6Var.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= cVarF.d(fv6Var2 != null ? fv6Var2.ordinal() : -1) ? 8388608 : 4194304;
        }
        int i4 = i3 | 100663296;
        if ((38347923 & i4) == 38347922 && cVarF.i()) {
            cVarF.D();
        } else {
            o97 o97Var = (o97) cVarF.M(p97.a);
            cVarF.L(1849434622);
            Object objV = cVarF.v();
            if (objV == b.a.a) {
                objV = v40.a(cVarF);
            }
            d3a d3aVar = (d3a) objV;
            cVarF.U(false);
            int i5 = o97Var.a;
            float f = o97Var.h.b;
            o97.a aVar = o97Var.c;
            o97.a.e eVar2 = aVar.a;
            o97.a.C0340a c0340a = aVar.b;
            long j = i5 >= 7 ? c0340a.g.c : c0340a.g.h.d.c;
            g4a g4aVarH = r03.h(d3aVar, cVarF);
            float fQ = q(vt6Var, o97Var);
            hza hzaVar = new hza(16.0f, fQ, 16.0f, fQ);
            e eVarA = f.a(ygg.h(androidx.compose.foundation.e.a(ygg.h(g.b(eVar, vt6Var.a(), 1), ggd.a(f)), d3aVar, r(j, cVarF)), ggd.a(f)), "IdlDestructiveTertiaryButton");
            hza hzaVar2 = hq1.a;
            nq1.c(gu5Var, eVarA, true, ggd.a(f), hq1.f(0L, ((Boolean) g4aVarH.getValue()).booleanValue() ? eVar2.g.g.c : eVar2.g.g.a, 0L, da2.b(eVar2.g.g.a, 0.4f), cVarF, 5), null, null, hzaVar, d3aVar, bh2.c(647210541, new xs6(fv6Var, str, fv6Var2, "IdlDestructiveTertiaryButton"), cVarF), cVarF, ((i4 >> 3) & 14) | 905969664, 96);
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new os6(str, gu5Var, eVar, vt6Var, fv6Var, fv6Var2, i, 0);
        }
    }

    public static final void e(final String str, final gu5 gu5Var, final e eVar, vt6 vt6Var, fv6 fv6Var, fv6 fv6Var2, androidx.compose.runtime.b bVar, final int i, final int i2) {
        int i3;
        final vt6 vt6Var2;
        final fv6 fv6Var3;
        final fv6 fv6Var4;
        c cVarF = q6.f(1368552357, gu5Var, bVar, str);
        if ((i & 6) == 0) {
            i3 = (cVarF.K(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cVarF.x(gu5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cVarF.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= cVarF.d(vt6Var == null ? -1 : vt6Var.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i5 = 221184 | i3;
        int i6 = i2 & 64;
        if (i6 != 0) {
            i5 = 1794048 | i3;
        } else if ((1572864 & i) == 0) {
            i5 |= cVarF.d(fv6Var == null ? -1 : fv6Var.ordinal()) ? 1048576 : 524288;
        }
        int i7 = i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 != 0) {
            i5 |= 12582912;
        } else if ((12582912 & i) == 0) {
            i5 |= cVarF.d(fv6Var2 != null ? fv6Var2.ordinal() : -1) ? 8388608 : 4194304;
        }
        if (((100663296 | i5) & 38347923) == 38347922 && cVarF.i()) {
            cVarF.D();
            vt6Var2 = vt6Var;
            fv6Var3 = fv6Var;
            fv6Var4 = fv6Var2;
        } else {
            vt6 vt6Var3 = i4 != 0 ? vt6.Md : vt6Var;
            fv6 fv6Var5 = i6 != 0 ? null : fv6Var;
            fv6 fv6Var6 = i7 != 0 ? null : fv6Var2;
            o97 o97Var = (o97) cVarF.M(p97.a);
            cVarF.L(1849434622);
            Object objV = cVarF.v();
            if (objV == b.a.a) {
                objV = v40.a(cVarF);
            }
            d3a d3aVar = (d3a) objV;
            cVarF.U(false);
            g4a g4aVarH = r03.h(d3aVar, cVarF);
            o97.g gVar = o97Var.i;
            rm2.a(rdd.b.a(null), bh2.c(1755604709, new at6(vt6Var3, eVar, "IdlDestructiveTextButton", o97Var, gu5Var, androidx.compose.foundation.layout.f.a(0.0f, 6.0f, 1), d3aVar, g4aVarH, fv6Var5, str, fv6Var6), cVarF), cVarF, 56);
            vt6Var2 = vt6Var3;
            fv6Var3 = fv6Var5;
            fv6Var4 = fv6Var6;
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: js6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gt6.e(str, gu5Var, eVar, vt6Var2, fv6Var3, fv6Var4, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }

    public static final void f(final String str, final gu5 gu5Var, final e eVar, final vt6 vt6Var, final fv6 fv6Var, final fv6 fv6Var2, androidx.compose.runtime.b bVar, final int i) {
        int i2;
        c cVarF = q6.f(1508292550, gu5Var, bVar, str);
        if ((i & 6) == 0) {
            i2 = (cVarF.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarF.x(gu5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarF.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarF.d(vt6Var.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i3 = i2 | 221184;
        if ((1572864 & i) == 0) {
            i3 |= cVarF.d(fv6Var == null ? -1 : fv6Var.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= cVarF.d(fv6Var2 != null ? fv6Var2.ordinal() : -1) ? 8388608 : 4194304;
        }
        int i4 = i3 | 100663296;
        if ((38347923 & i4) == 38347922 && cVarF.i()) {
            cVarF.D();
        } else {
            o97 o97Var = (o97) cVarF.M(p97.a);
            cVarF.L(1849434622);
            Object objV = cVarF.v();
            if (objV == b.a.a) {
                objV = v40.a(cVarF);
            }
            d3a d3aVar = (d3a) objV;
            cVarF.U(false);
            o97.a aVar = o97Var.c;
            float f = o97Var.h.b;
            long j = aVar.b.g.i.c;
            float fQ = q(vt6Var, o97Var);
            hza hzaVar = new hza(16.0f, fQ, 16.0f, fQ);
            e eVarA = f.a(ygg.h(androidx.compose.foundation.e.a(ygg.h(g.b(eVar, vt6Var.a(), 1), ggd.a(f)), d3aVar, r(j, cVarF)), ggd.a(f)), "IdlInverseButton");
            hza hzaVar2 = hq1.a;
            long j2 = aVar.a.f;
            long j3 = aVar.b.g.i.a;
            nq1.b(gu5Var, eVarA, true, ggd.a(f), hq1.f(j3, j2, j3, j2, cVarF, 0), null, ee3.f(aVar.c.c, 1.0f), hzaVar, d3aVar, bh2.c(-2141991916, new ct6(fv6Var, str, fv6Var2, "IdlInverseButton"), cVarF), cVarF, ((i4 >> 3) & 14) | 905969664, 32);
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ms6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gt6.f(str, gu5Var, eVar, vt6Var, fv6Var, fv6Var2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(final defpackage.fv6 r20, final defpackage.gu5 r21, androidx.compose.ui.e r22, java.lang.String r23, final defpackage.vt6 r24, java.lang.String r25, androidx.compose.runtime.b r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt6.g(fv6, gu5, androidx.compose.ui.e, java.lang.String, vt6, java.lang.String, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a8 A[PHI: r15
  0x00a8: PHI (r15v13 int) = (r15v0 int), (r15v5 int), (r15v6 int) binds: [B:64:0x00a6, B:74:0x00be, B:73:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(final java.lang.String r27, final defpackage.gu5<defpackage.j6g> r28, androidx.compose.ui.e r29, defpackage.vt6 r30, boolean r31, boolean r32, defpackage.fv6 r33, defpackage.fv6 r34, java.lang.String r35, androidx.compose.runtime.b r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt6.h(java.lang.String, gu5, androidx.compose.ui.e, vt6, boolean, boolean, fv6, fv6, java.lang.String, androidx.compose.runtime.b, int, int):void");
    }

    public static final void i(fv6 fv6Var, gu5 gu5Var, e eVar, String str, vt6 vt6Var, androidx.compose.runtime.b bVar, int i, int i2) {
        int i3;
        long j;
        fv6 fv6Var2;
        vt6 vt6Var2;
        String str2;
        fv6Var.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(-1277381100);
        if ((i & 6) == 0) {
            i3 = (cVarH.d(fv6Var.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cVarH.x(gu5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cVarH.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i4 = i3 | 3072;
        int i5 = i2 & 16;
        if (i5 != 0) {
            i4 = i3 | 27648;
        } else if ((i & 24576) == 0) {
            i4 |= cVarH.d(vt6Var == null ? -1 : vt6Var.ordinal()) ? 16384 : 8192;
        }
        int i6 = 14352384 | i4;
        if ((4793491 & i6) == 4793490 && cVarH.i()) {
            cVarH.D();
            fv6Var2 = fv6Var;
            str2 = str;
            vt6Var2 = vt6Var;
        } else {
            vt6 vt6Var3 = i5 != 0 ? vt6.Md : vt6Var;
            o97 o97Var = (o97) cVarH.M(p97.a);
            cVarH.L(1849434622);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = v40.a(cVarH);
            }
            d3a d3aVar = (d3a) objV;
            cVarH.U(false);
            o97.a aVar = o97Var.c;
            o97.a.e eVar2 = aVar.a;
            e eVarA = f.a(androidx.compose.foundation.e.a(g.a(eVar, vt6Var3.a(), vt6Var3.a()), d3aVar, r(aVar.b.g.g.c, cVarH)), "IdlPrimaryIconButton");
            long j2 = aVar.b.g.g.a;
            vt6 vt6Var4 = vt6Var3;
            long j3 = eVar2.f;
            long jB = da2.b(j2, 0.4f);
            long j4 = eVar2.f;
            qa2 qa2Var = (qa2) cVarH.M(sa2.a);
            nq6 nq6Var = qa2Var.T;
            if (nq6Var == null) {
                ra2 ra2Var = ra2.V;
                long jC = sa2.c(qa2Var, ra2Var);
                long jA = sa2.a(qa2Var, sa2.c(qa2Var, ra2Var));
                ra2 ra2Var2 = ra2.c;
                nq6Var = new nq6(jC, jA, da2.b(sa2.c(qa2Var, ra2Var2), 0.12f), da2.b(sa2.c(qa2Var, ra2Var2), 0.38f));
                qa2Var.T = nq6Var;
                j = j4;
            } else {
                j = j4;
            }
            fv6Var2 = fv6Var;
            rq6.a(gu5Var, eVarA, true, ggd.a(o97Var.h.b), nq6Var.a(j2, j3, jB, j), d3aVar, bh2.c(760986356, new it6(fv6Var2, "IdlPrimaryIconButton"), cVarH), cVarH, ((i6 >> 3) & 14) | 1769472, 0);
            vt6Var2 = vt6Var4;
            str2 = "";
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ls6(fv6Var2, gu5Var, eVar, str2, vt6Var2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a8 A[PHI: r15
  0x00a8: PHI (r15v13 int) = (r15v0 int), (r15v5 int), (r15v6 int) binds: [B:64:0x00a6, B:74:0x00be, B:73:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(final java.lang.String r26, final defpackage.gu5<defpackage.j6g> r27, androidx.compose.ui.e r28, defpackage.vt6 r29, boolean r30, boolean r31, defpackage.fv6 r32, defpackage.fv6 r33, java.lang.String r34, androidx.compose.runtime.b r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt6.j(java.lang.String, gu5, androidx.compose.ui.e, vt6, boolean, boolean, fv6, fv6, java.lang.String, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089 A[PHI: r8
  0x0089: PHI (r8v13 int) = (r8v0 int), (r8v5 int), (r8v6 int) binds: [B:49:0x0087, B:59:0x009f, B:58:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(final java.lang.String r27, final defpackage.gu5 r28, final androidx.compose.ui.e r29, defpackage.vt6 r30, boolean r31, defpackage.fv6 r32, defpackage.fv6 r33, androidx.compose.runtime.b r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt6.k(java.lang.String, gu5, androidx.compose.ui.e, vt6, boolean, fv6, fv6, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(final defpackage.fv6 r19, final defpackage.gu5 r20, androidx.compose.ui.e r21, java.lang.String r22, defpackage.vt6 r23, androidx.compose.runtime.b r24, final int r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt6.l(fv6, gu5, androidx.compose.ui.e, java.lang.String, vt6, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m(final java.lang.String r17, final defpackage.gu5 r18, androidx.compose.ui.e r19, defpackage.vt6 r20, boolean r21, defpackage.fv6 r22, defpackage.fv6 r23, androidx.compose.runtime.b r24, final int r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt6.m(java.lang.String, gu5, androidx.compose.ui.e, vt6, boolean, fv6, fv6, androidx.compose.runtime.b, int, int):void");
    }

    public static final void n(final String str, final gu5 gu5Var, final e eVar, final vt6 vt6Var, final fv6 fv6Var, fv6 fv6Var2, androidx.compose.runtime.b bVar, final int i, final int i2) {
        int i3;
        final fv6 fv6Var3;
        c cVarF = q6.f(1421350658, gu5Var, bVar, str);
        if ((i & 6) == 0) {
            i3 = (cVarF.K(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cVarF.x(gu5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cVarF.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i3 |= cVarF.d(vt6Var.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i4 = i3 | 221184;
        if ((1572864 & i) == 0) {
            i4 |= cVarF.d(fv6Var == null ? -1 : fv6Var.ordinal()) ? 1048576 : 524288;
        }
        int i5 = i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i5 != 0) {
            i4 |= 12582912;
        } else if ((12582912 & i) == 0) {
            i4 |= cVarF.d(fv6Var2 != null ? fv6Var2.ordinal() : -1) ? 8388608 : 4194304;
        }
        int i6 = i4 | 100663296;
        if ((38347923 & i6) == 38347922 && cVarF.i()) {
            cVarF.D();
            fv6Var3 = fv6Var2;
        } else {
            fv6 fv6Var4 = i5 != 0 ? null : fv6Var2;
            o97 o97Var = (o97) cVarF.M(p97.a);
            cVarF.L(1849434622);
            Object objV = cVarF.v();
            if (objV == b.a.a) {
                objV = v40.a(cVarF);
            }
            d3a d3aVar = (d3a) objV;
            cVarF.U(false);
            o97.a aVar = o97Var.c;
            float f = o97Var.h.b;
            long j = aVar.b.g.e.c;
            float fQ = q(vt6Var, o97Var);
            hza hzaVar = new hza(16.0f, fQ, 16.0f, fQ);
            e eVarA = f.a(ygg.h(androidx.compose.foundation.e.a(ygg.h(g.b(eVar, vt6Var.a(), 1), ggd.a(f)), d3aVar, r(j, cVarF)), ggd.a(f)), "IdlUtilityButton");
            hza hzaVar2 = hq1.a;
            o97.a aVar2 = o97Var.c;
            long j2 = aVar2.a.c;
            fv6 fv6Var5 = fv6Var4;
            fq1 fq1VarF = hq1.f(aVar2.b.g.e.a, j2, 0L, da2.b(j2, 0.4f), cVarF, 4);
            cVarF = cVarF;
            nq1.c(gu5Var, eVarA, true, ggd.a(f), fq1VarF, hq1.b(29), null, hzaVar, d3aVar, bh2.c(-130811483, new st6(fv6Var, str, fv6Var5, "IdlUtilityButton"), cVarF), cVarF, ((i6 >> 3) & 14) | 905969664, 64);
            fv6Var3 = fv6Var5;
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ds6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gt6.n(str, gu5Var, eVar, vt6Var, fv6Var, fv6Var3, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void o(final defpackage.fv6 r23, final defpackage.gu5 r24, androidx.compose.ui.e r25, java.lang.String r26, defpackage.vt6 r27, java.lang.String r28, androidx.compose.runtime.b r29, final int r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt6.o(fv6, gu5, androidx.compose.ui.e, java.lang.String, vt6, java.lang.String, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void p(final boolean r17, boolean r18, defpackage.ah2 r19, androidx.compose.runtime.b r20, final int r21, final int r22) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt6.p(boolean, boolean, ah2, androidx.compose.runtime.b, int, int):void");
    }

    public static final float q(vt6 vt6Var, o97 o97Var) {
        int iOrdinal = vt6Var.ordinal();
        if (iOrdinal == 0) {
            return 6.0f;
        }
        if (iOrdinal == 1) {
            return 10.0f;
        }
        if (iOrdinal == 2) {
            return 14.0f;
        }
        l.g();
        return 0.0f;
    }

    public static final udd r(long j, androidx.compose.runtime.b bVar) {
        bVar.L(607397617);
        udd uddVarB = rdd.b(j, 1, ((o97) bVar.M(p97.a)).h.b);
        bVar.F();
        return uddVarB;
    }
}
