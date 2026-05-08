package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.input.key.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class osb {
    public static final void a(final jhf jhfVar, final gu5 gu5Var, final z13 z13Var, final Function1 function1, final String str, String str2, b bVar, final int i) {
        final String str3;
        gu5Var.getClass();
        z13Var.getClass();
        function1.getClass();
        str.getClass();
        c cVarH = bVar.h(1925746172);
        int i2 = i | (cVarH.K(jhfVar) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.K(z13Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            fm5 fm5Var = (fm5) cVarH.M(um2.i);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new bj(5);
                cVarH.p(objV);
            }
            e eVarA = androidx.compose.ui.focus.b.a((Function1) objV);
            boolean zX = cVarH.x(fm5Var);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new o0(fm5Var, 2);
                cVarH.p(objV2);
            }
            e eVarA2 = a.a(eVarA, (Function1) objV2);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA2);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            String strI = ak2.I(R.string.contact_information_phone_number_label, cVarH);
            int i3 = z13Var.a;
            String strI2 = ak2.I(R.string.desc_clear_text_input, cVarH);
            String strI3 = ak2.I(R.string.desc_phone_number_input, cVarH);
            String strI4 = ak2.I(R.string.desc_phone_number_country_code_input, cVarH);
            ah2 ah2VarC = bh2.c(-1318134206, new vl4(1, z13Var, o97Var), cVarH);
            int i4 = (i2 & 14) | 1572864;
            int i5 = i2 << 12;
            tv6.a(jhfVar, i3, strI3, strI2, strI4, gu5Var, ah2VarC, function1, null, null, strI, cVarH, i4 | (458752 & i5) | (i5 & 29360128));
            cVarH.U(true);
            str3 = "";
        } else {
            cVarH.D();
            str3 = str2;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(gu5Var, z13Var, function1, str, str3, i) { // from class: nsb
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ z13 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(196609);
                    osb.a(this.a, this.b, this.c, this.d, this.e, this.f, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
