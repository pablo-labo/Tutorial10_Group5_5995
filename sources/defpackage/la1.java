package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class la1 {
    public static final void a(gu5<j6g> gu5Var, String str, List<c9d> list, String str2, b bVar, int i) {
        String str3;
        String strI;
        gu5Var.getClass();
        str.getClass();
        c cVarH = bVar.h(-848099216);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? (cVarH.x(gu5Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            str3 = str;
            i3 |= cVarH.K(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i3 |= cVarH.x(list) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i3 |= cVarH.K(str2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            e eVarA = f.a(e.a.b, str2);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            dxb.a(gu5Var, str3, null, false, cVarH, i3 & 126, 28);
            if (c0h.G() && c0h.B()) {
                cVarH.L(-238573944);
                for (c9d c9dVar : list) {
                    fv6 fv6VarB = b(c9dVar.c);
                    String strI2 = ak2.I(c9dVar.a, cVarH);
                    Integer num = c9dVar.b;
                    if (num == null) {
                        cVarH.L(1847061797);
                        cVarH.U(false);
                        strI = null;
                    } else {
                        cVarH.L(1847061798);
                        strI = ak2.I(num.intValue(), cVarH);
                        cVarH.U(false);
                    }
                    c cVar = cVarH;
                    rzd.a(0, c9dVar.e, fv6VarB, cVar, strI2, strI);
                    cVarH = cVar;
                }
                cVarH.U(false);
            } else {
                cVarH.L(-238160032);
                cVarH.L(-284775125);
                List<c9d> list2 = list;
                ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
                for (c9d c9dVar2 : list2) {
                    fv6 fv6VarB2 = b(c9dVar2.c);
                    boolean z = fv6VarB2 == fv6.N9;
                    String strI3 = ak2.I(c9dVar2.a, cVarH);
                    boolean zK = cVarH.K(c9dVar2);
                    Object objV = cVarH.v();
                    if (zK || objV == b.a.a) {
                        objV = new qq(c9dVar2, i2);
                        cVarH.p(objV);
                    }
                    arrayList.add(new ax6(strI3, (gu5) objV, fv6VarB2, false, z, 468));
                }
                cVarH.U(false);
                fx6.a(arrayList, null, false, null, cVarH, 384, 10);
                cVarH.U(false);
            }
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ka1(gu5Var, str, list, str2, i);
        }
    }

    public static final fv6 b(int i) {
        return i == R.drawable.ic_idl_download_24 ? fv6.b3 : i == R.drawable.ic_idl_native_android_share_24 ? fv6.b6 : i == R.drawable.ic_idl_discover_24 ? fv6.T2 : i == R.drawable.ic_idl_filepreview_filled ? fv6.H3 : i == R.drawable.ic_idl_resume_24 ? fv6.j8 : i == R.drawable.ic_idl_replace_file_24 ? fv6.V7 : i == R.drawable.ic_idl_trash_can_24 ? fv6.N9 : i == R.drawable.ic_idl_downloadresume_stroke_ifl7 ? fv6.d3 : i == R.drawable.ic_idl_humansupportagent_stroke_ifl7 ? fv6.p4 : i == R.drawable.ic_idl_replacefile_stroke_ifl7 ? fv6.V7 : i == R.drawable.ic_idl_renew_stroke_ifl7 ? fv6.T7 : fv6.b3;
    }
}
