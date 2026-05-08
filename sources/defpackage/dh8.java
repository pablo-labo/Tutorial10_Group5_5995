package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class dh8 {

    public static final class a implements l74 {
        public final /* synthetic */ ViewTreeObserver a;
        public final /* synthetic */ ch8 b;

        public a(ViewTreeObserver viewTreeObserver, ch8 ch8Var) {
            this.a = viewTreeObserver;
            this.b = ch8Var;
        }

        @Override // defpackage.l74
        public final void dispose() {
            this.a.removeOnGlobalLayoutListener(this.b);
        }
    }

    public static final void a(Function1<? super Boolean, j6g> function1, b bVar, int i) {
        function1.getClass();
        c cVarH = bVar.h(-1670849762);
        int i2 = (cVarH.x(function1) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            View view = (View) cVarH.M(AndroidCompositionLocals_androidKt.f);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            boolean zX = cVarH.x(view) | ((i2 & 14) == 4) | cVarH.x(viewTreeObserver);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new bh8(viewTreeObserver, view, function1, 0);
                cVarH.p(objV);
            }
            to4.b(viewTreeObserver, (Function1) objV, cVarH);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pj(function1, i, 6);
        }
    }
}
