package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class kub {
    public static final void a(int i, b bVar) {
        c cVar;
        c cVarH = bVar.h(-1990132557);
        if (cVarH.o(i & 1, i != 0)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            cVar = cVarH;
            cif.b(ak2.I(R.string.highlighted_option, cVarH), f.f(a.b(ygg.h(f.j(e.a.b, 0.0f, 0.0f, 0.0f, 4.0f, 7), ggd.a(4.0f)), o97Var.c.b.i.d.c, ytc.a), 4.0f), o97Var.c.a.h.d.a, 0L, null, o97Var.f.c, o97Var.d.a, 0L, null, null, 0L, 0, false, 0, 0, null, null, cVar, 0, 0, 130968);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new zh1(i, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f3  */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.cub r39, kotlin.jvm.functions.Function1 r40, defpackage.gu5 r41, defpackage.b5g r42, androidx.compose.runtime.b r43, int r44) {
        /*
            Method dump skipped, instruction units count: 1215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kub.b(cub, kotlin.jvm.functions.Function1, gu5, b5g, androidx.compose.runtime.b, int):void");
    }

    public static final void c(final cub cubVar, final gu5<j6g> gu5Var, b bVar, int i) {
        int i2;
        String strK;
        gu5<j6g> gu5Var2 = gu5Var;
        cubVar.getClass();
        gu5Var2.getClass();
        c cVarH = bVar.h(-560288615);
        int i3 = (cVarH.d(cubVar.ordinal()) ? 4 : 2) | i | (cVarH.x(gu5Var2) ? 32 : 16);
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            int iOrdinal = cubVar.ordinal();
            if (iOrdinal == 0) {
                i2 = R.drawable.ic_idl_show_24;
            } else {
                if (iOrdinal != 1) {
                    l.g();
                    return;
                }
                i2 = R.drawable.ic_idl_hide_24;
            }
            int iOrdinal2 = cubVar.ordinal();
            if (iOrdinal2 == 0) {
                strK = z3.k(cVarH, -1566431763, R.string.employers_can_find_you, cVarH, false);
            } else {
                if (iOrdinal2 != 1) {
                    cVarH.L(-1566434127);
                    cVarH.U(false);
                    l.g();
                    return;
                }
                strK = z3.k(cVarH, -1566428336, R.string.employers_cannot_find_you, cVarH, false);
            }
            o97.a aVar = o97Var.c;
            long j = aVar.b.a;
            bj1 bj1VarF = ee3.f(aVar.c.b, 1.0f);
            final int i4 = i2;
            final String str = strK;
            gu5Var2 = gu5Var;
            v1c.a(gu5Var2, androidx.compose.ui.platform.f.a(e.a.b, "ProfilePrivacySelector"), false, ggd.a(24.0f), j, bj1VarF, null, null, null, bh2.c(864171143, new wu5() { // from class: iub
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    fv6 fv6Var;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((fhd) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        o97 o97Var2 = o97Var;
                        o97.a aVar2 = o97Var2.c;
                        e.a aVar3 = e.a.b;
                        e eVarG = f.g(aVar3, 8.0f, 2.0f);
                        String str2 = str;
                        boolean zK = bVar2.K(str2);
                        Object objV = bVar2.v();
                        if (zK || objV == b.a.a) {
                            objV = new ux4(str2, 3);
                            bVar2.p(objV);
                        }
                        e eVarA = b5e.a(eVarG, (Function1) objV);
                        ehd ehdVarA = chd.a(vs0.a, c20.a.k, bVar2, 48);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarA);
                        gl2.j.getClass();
                        pm8.a aVar4 = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar4);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ehdVarA, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        ygg.y(bVar2, eVarC, gl2.a.d);
                        cub cubVar2 = cubVar;
                        cubVar2.getClass();
                        int iOrdinal3 = cubVar2.ordinal();
                        if (iOrdinal3 == 0) {
                            fv6Var = fv6.Q8;
                        } else {
                            if (iOrdinal3 != 1) {
                                l.g();
                                return null;
                            }
                            fv6Var = fv6.e4;
                        }
                        e eVarJ = f.j(aVar3, 0.0f, 0.0f, 2.0f, 0.0f, 11);
                        o97.a.e eVar = aVar2.a;
                        long j2 = eVar.c;
                        mwe.a(eVarJ, fv6Var, null, z2b.a(i4, 0, bVar2), null, new da2(j2), bVar2, 24582, 4);
                        cif.b(str2, f.j(aVar3, 0.0f, 0.0f, 2.0f, 0.0f, 11), eVar.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var2.j.h, 0L, 0L, o97Var2.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), bVar2, 48, 0, 65528);
                        mwe.a(androidx.compose.foundation.b.d(aVar3, false, null, null, gu5Var, 15), fv6.q1, null, z2b.a(R.drawable.ic_idl_caret_down_24, 0, bVar2), null, new da2(j2), bVar2, 24624, 4);
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, ((i3 >> 3) & 14) | 48, 932);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gt(cubVar, i, 5, gu5Var2);
        }
    }
}
