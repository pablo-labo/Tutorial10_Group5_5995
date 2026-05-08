package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class aad {
    public static final void a(final s88 s88Var, final n9d n9dVar, final Function1 function1, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final boolean z, b bVar, final int i) {
        int i2;
        boolean z2;
        boolean z3;
        s88Var.getClass();
        n9dVar.getClass();
        function1.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        c cVarH = bVar.h(-252514446);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(s88Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? cVarH.K(n9dVar) : cVarH.x(n9dVar) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(gu5Var2) ? 16384 : 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.x(gu5Var3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= cVarH.a(z) ? 8388608 : 4194304;
        }
        if (cVarH.o(i2 & 1, (4727827 & i2) != 4727826)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = 29360128 & i2;
            boolean z4 = i3 == 8388608;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z4 || objV == c0020a) {
                objV = new y9d(z, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, boolValueOf, (Function2) objV);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean z5 = i3 == 8388608;
            Object objV2 = cVarH.v();
            if (z5 || objV2 == c0020a) {
                objV2 = new Function1() { // from class: w9d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((m74) obj).getClass();
                        return new c8d(1, z);
                    }
                };
                cVarH.p(objV2);
            }
            to4.b(boolValueOf2, (Function1) objV2, cVarH);
            o97 o97Var = (o97) cVarH.M(p97.a);
            j6g j6gVar = j6g.a;
            boolean z6 = (3670016 & i2) == 1048576;
            Object objV3 = cVarH.v();
            if (z6 || objV3 == c0020a) {
                objV3 = new z9d(gu5Var3, null);
                cVarH.p(objV3);
            }
            to4.d(cVarH, j6gVar, (Function2) objV3);
            e.a aVar = e.a.b;
            e eVarF = g.f(aVar, 1.0f);
            o97.g gVar = o97Var.i;
            e eVarF2 = f.f(eVarF, 24.0f);
            vs0.k kVar = vs0.c;
            af1.a aVar2 = c20.a.m;
            ob2 ob2VarA = mb2.a(kVar, aVar2, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF2);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            int i4 = i2;
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ob2VarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            if (v1c.h(s88Var.b)) {
                cVarH.L(-1809245152);
                ob2 ob2VarA2 = mb2.a(new vs0.i(4.0f, true, new us0(0)), aVar2, cVarH, 0);
                int iHashCode2 = Long.hashCode(cVarH.T);
                t8b t8bVarP2 = cVarH.P();
                e eVarC2 = androidx.compose.ui.c.c(cVarH, aVar);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar3);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ob2VarA2, dVar);
                ygg.y(cVarH, t8bVarP2, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                    ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
                }
                ygg.y(cVarH, eVarC2, eVar);
                String str = s88Var.a;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = s88Var.h;
                if (str3 == null) {
                    str3 = "";
                }
                Locale locale = Locale.US;
                locale.getClass();
                TimeZone timeZone = TimeZone.getDefault();
                timeZone.getClass();
                String str4 = s88Var.d;
                if (str4 != null) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, yyyy", locale);
                    simpleDateFormat.setTimeZone(timeZone);
                    Date date = new Date(Long.parseLong(str4));
                    if (wl7.b(simpleDateFormat.format(date), simpleDateFormat.format(new Date(System.currentTimeMillis())))) {
                        str2 = "today";
                    } else {
                        str2 = simpleDateFormat.format(date);
                        str2.getClass();
                    }
                }
                d8d.a(str, str2, str3, n9dVar, gu5Var2, cVarH, ((i4 << 6) & 7168) | 4096 | (i4 & 57344));
                z2 = true;
                if (((kr7) cr8.p(kr7.class)).e("pcs_qualifications_disclaimer").a == 1) {
                    z3 = false;
                    cVarH.L(1070146601);
                } else {
                    cVarH.L(1074565062);
                    z3 = false;
                    tr6.c(fv6.e4, o97Var.c.a.c, f.j(aVar, 0.0f, 12.0f, 0.0f, 0.0f, 13), null, null, ak2.I(R.string.resume_visibility_info, cVarH), ak2.I(R.string.resume_visibility_info, cVarH), null, cVarH, 6, 0, 3032);
                }
                cVarH.U(z3);
                cVarH.U(true);
                cVarH.U(z3);
            } else {
                z2 = true;
                cVarH.L(-1808134391);
                b(gu5Var, cVarH, (i4 >> 9) & 14);
                cVarH.U(false);
            }
            cVarH.U(z2);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: x9d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aad.a(s88Var, n9dVar, function1, gu5Var, gu5Var2, gu5Var3, z, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(gu5<j6g> gu5Var, b bVar, int i) {
        int i2;
        c cVar;
        int i3;
        c cVarH = bVar.h(-1677964651);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e.a aVar = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarH, aVar);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ob2VarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            f17.a(z2b.a(R.drawable.ic_resume_upload_background, 0, cVarH), ak2.I(R.string.upload_resume, cVarH), null, null, null, 0.0f, null, cVarH, 0, 124);
            o97.g gVar = o97Var.i;
            cif.b(ak2.I(R.string.resume_upload_resume_desc, cVarH), f.j(aVar, 12.0f, 12.0f, 12.0f, 0.0f, 8), o97Var.c.a.a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, cVarH, 0, 0, 65528);
            i3 = 1;
            e eVarF = g.f(f.h(aVar, 0.0f, 12.0f, 1), 1.0f);
            ehd ehdVarA = chd.a(vs0.e, c20.a.j, cVarH, 6);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarF);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            mv.a(ak2.I(R.string.upload_resume, cVarH), gu5Var, false, R.drawable.ic_idl_upload_24, null, androidx.compose.ui.platform.f.a(aVar, "UploadResumeBarButtonOnResumeSubTab"), fv6.W9, cVarH, ((i2 << 3) & 112) | 1769856, 16);
            cVar = cVarH;
            cVar.U(true);
            cVar.U(true);
        } else {
            cVar = cVarH;
            i3 = 1;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new k12(i, i3, gu5Var);
        }
    }
}
