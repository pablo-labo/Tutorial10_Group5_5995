package defpackage;

import android.icu.util.ULocale;
import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.o97;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class s12 {
    public static final void a(final String str, final boolean z, final gu5 gu5Var, final String str2, b bVar, final int i) {
        boolean z2;
        c cVarF = q6.f(-237457857, gu5Var, bVar, str);
        int i2 = i | (cVarF.K(str) ? 4 : 2) | (cVarF.a(z) ? 32 : 16) | (cVarF.x(gu5Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarF.K(str2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarF.o(i2 & 1, (i2 & 1171) != 1170)) {
            o97 o97Var = (o97) cVarF.M(p97.a);
            e.a aVar = e.a.b;
            b.a.C0020a c0020a = b.a.a;
            if (z) {
                cVarF.L(-295629343);
                String displayLanguage = ULocale.getDisplayLanguage(str, str);
                displayLanguage.getClass();
                z2 = (i2 & 896) == 256;
                Object objV = cVarF.v();
                if (z2 || objV == c0020a) {
                    objV = new hh(3, gu5Var);
                    cVarF.p(objV);
                }
                gu5 gu5Var2 = (gu5) objV;
                o97.g gVar = o97Var.i;
                e eVarG = f.g(aVar, 4.0f, 4.0f);
                Object objV2 = cVarF.v();
                if (objV2 == c0020a) {
                    objV2 = new hu(5);
                    cVarF.p(objV2);
                }
                gt6.h(displayLanguage, gu5Var2, androidx.compose.ui.platform.f.a(b5e.b(eVarG, false, (Function1) objV2), str2), null, false, false, null, null, null, cVarF, 0, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                cVarF.U(false);
            } else {
                cVarF.L(-295272161);
                String displayLanguage2 = ULocale.getDisplayLanguage(str, str);
                displayLanguage2.getClass();
                z2 = (i2 & 896) == 256;
                Object objV3 = cVarF.v();
                if (z2 || objV3 == c0020a) {
                    objV3 = new nt(2, gu5Var);
                    cVarF.p(objV3);
                }
                gu5 gu5Var3 = (gu5) objV3;
                o97.g gVar2 = o97Var.i;
                e eVarG2 = f.g(aVar, 4.0f, 4.0f);
                Object objV4 = cVarF.v();
                if (objV4 == c0020a) {
                    objV4 = new lg(2);
                    cVarF.p(objV4);
                }
                gt6.j(displayLanguage2, gu5Var3, androidx.compose.ui.platform.f.a(b5e.b(eVarG2, false, (Function1) objV4), str2), null, false, false, null, null, null, cVarF, 0, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                cVarF.U(false);
            }
        } else {
            cVarF.D();
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, z, gu5Var, str2, i) { // from class: r12
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ String d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    s12.a(this.a, this.b, this.c, this.d, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
