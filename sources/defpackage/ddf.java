package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ddf {
    public static final ddf a = new ddf();

    public static final class a implements Function2<androidx.compose.runtime.b, Integer, String> {
        public final /* synthetic */ TextClassification a;

        public a(TextClassification textClassification) {
            this.a = textClassification;
        }

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            num.intValue();
            bVar2.L(950061013);
            String strValueOf = String.valueOf(this.a.getLabel());
            bVar2.F();
            return strValueOf;
        }
    }

    public static final class b implements wu5<da2, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ Drawable a;

        public b(Drawable drawable) {
            this.a = drawable;
        }

        @Override // defpackage.wu5
        public final j6g q(da2 da2Var, androidx.compose.runtime.b bVar, Integer num) {
            long j = da2Var.a;
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                ddf.a.a(this.a, bVar2, 48);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class c implements Function2<androidx.compose.runtime.b, Integer, String> {
        public final /* synthetic */ RemoteAction a;

        public c(RemoteAction remoteAction) {
            this.a = remoteAction;
        }

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            num.intValue();
            bVar2.L(-1376593684);
            String string = this.a.getTitle().toString();
            bVar2.F();
            return string;
        }
    }

    public static final class d implements wu5<da2, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ RemoteAction a;

        public d(RemoteAction remoteAction) {
            this.a = remoteAction;
        }

        @Override // defpackage.wu5
        public final j6g q(da2 da2Var, androidx.compose.runtime.b bVar, Integer num) {
            long j = da2Var.a;
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                ddf.a.b(this.a.getIcon(), bVar2, 48);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static void c(vt2 vt2Var, Context context, ldf ldfVar) {
        if (context == null) {
            return;
        }
        int i = ldfVar.c;
        TextClassification textClassification = ldfVar.b;
        if (i < 0) {
            a aVar = new a(textClassification);
            Drawable icon = textClassification.getIcon();
            vt2.b(vt2Var, aVar, icon != null ? new ah2(-1123224187, new b(icon), true) : null, new yp0(11, context, textClassification), 6);
        } else {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            vt2.b(vt2Var, new c(remoteAction), ((i == 0) || remoteAction.shouldShowIcon()) ? new ah2(-1261173016, new d(remoteAction), true) : null, new ig(remoteAction, 25), 6);
        }
    }

    public final void a(Drawable drawable, androidx.compose.runtime.b bVar, int i) {
        androidx.compose.runtime.c cVarH = bVar.h(257732500);
        int i2 = (cVarH.x(drawable) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            e eVarN = g.n(e.a.b, wt2.e);
            boolean zX = cVarH.x(drawable);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new hp0(drawable, 17);
                cVarH.p(objV);
            }
            hl1.a(androidx.compose.ui.draw.a.a(eVarN, (Function1) objV), cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ol1(this, i, 4, drawable);
        }
    }

    public final void b(Icon icon, androidx.compose.runtime.b bVar, int i) {
        i iVarW;
        Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> ucVar;
        androidx.compose.runtime.c cVarH = bVar.h(2116504409);
        int i2 = (cVarH.x(icon) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            boolean zK = cVarH.K(icon) | cVarH.K(context);
            Object objV = cVarH.v();
            if (zK || objV == b.a.a) {
                objV = icon.loadDrawable(context);
                cVarH.p(objV);
            }
            Drawable drawable = (Drawable) objV;
            if (drawable == null) {
                iVarW = cVarH.W();
                if (iVarW != null) {
                    ucVar = new gu(this, i, 5, icon);
                    iVarW.d = ucVar;
                }
                return;
            }
            a(drawable, cVarH, 48);
        } else {
            cVarH.D();
        }
        iVarW = cVarH.W();
        if (iVarW != null) {
            ucVar = new uc(this, i, 8, icon);
            iVarW.d = ucVar;
        }
    }
}
