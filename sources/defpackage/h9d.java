package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import io.jsonwebtoken.JwtParser;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class h9d {
    public static final void a(final Uri uri, final String str, final gu5<j6g> gu5Var, final gu5<j6g> gu5Var2, final Function1<? super Uri, j6g> function1, b bVar, final int i) {
        boolean z;
        uri.getClass();
        str.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        function1.getClass();
        c cVarH = bVar.h(-437592380);
        int i2 = i | (cVarH.x(uri) ? 4 : 2) | (cVarH.K(str) ? 32 : 16) | (cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function1) ? 16384 : 8192);
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            hne hneVar = (hne) cVarH.M(um2.p);
            int i3 = i2 & 112;
            boolean zK = cVarH.K(uri) | (i3 == 32);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zK || objV == c0020a) {
                ContentResolver contentResolver = context.getContentResolver();
                contentResolver.getClass();
                String type = contentResolver.getType(uri);
                if (type == null || zve.U(type)) {
                    String lowerCase = zve.o0(JwtParser.SEPARATOR_CHAR, str, "").toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    if (type == null) {
                        type = "application/octet-stream";
                    }
                }
                objV = type;
                cVarH.p(objV);
            }
            p8 p8Var = new p8((String) objV);
            boolean z2 = (i2 & 57344) == 16384;
            Object objV2 = cVarH.v();
            if (z2 || objV2 == c0020a) {
                objV2 = new rc4(function1, 1);
                cVarH.p(objV2);
            }
            ra9 ra9VarL = ypd.L(p8Var, (Function1) objV2, cVarH);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, e.a.b);
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
            nx6.c(ak2.I(R.string.resume_preview_options_sheet_title, cVarH), null, true, false, false, null, null, bh2.c(-1108576606, new qb1(hneVar, gu5Var), cVarH), null, null, cVarH, 12586368, 882);
            cVarH = cVarH;
            String strI = ak2.I(R.string.resume_preview_save_as, cVarH);
            fv6 fv6Var = fv6.d3;
            boolean zK2 = cVarH.K(hneVar) | cVarH.x(ra9VarL) | (i3 == 32);
            Object objV3 = cVarH.v();
            if (zK2 || objV3 == c0020a) {
                z = true;
                ub ubVar = new ub(hneVar, gu5Var2, ra9VarL, str, 1);
                cVarH.p(ubVar);
                objV3 = ubVar;
            } else {
                z = true;
            }
            fx6.a(u63.Z(new ax6(strI, (gu5) objV3, fv6Var, false, false, 500)), null, false, null, cVarH, 392, 10);
            cVarH.U(z);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(uri, str, gu5Var, gu5Var2, function1, i) { // from class: g9d
                public final /* synthetic */ Uri a;
                public final /* synthetic */ String b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(3073);
                    h9d.a(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
