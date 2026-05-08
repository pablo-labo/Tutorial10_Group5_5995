package defpackage;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class nrd {
    public final g4a a = r.f(Boolean.FALSE);

    public final void a(AndroidComposeView androidComposeView, j5e j5eVar, v03 v03Var, Consumer consumer) {
        j4a j4aVar = new j4a(new ord[16]);
        boa.R(j5eVar.a(), 0, new mrd(1, j4aVar, j4a.class, "add", "add(Ljava/lang/Object;)Z", 8));
        Arrays.sort(j4aVar.a, 0, j4aVar.c, ak2.h(a7b.d, vm5.d));
        int i = j4aVar.c;
        ord ordVar = (ord) (i == 0 ? null : j4aVar.a[i - 1]);
        if (ordVar == null) {
            return;
        }
        ph7 ph7Var = ordVar.c;
        xk2 xk2Var = new xk2(ordVar.a, ph7Var, f13.a(v03Var), this, androidComposeView);
        tia tiaVar = ordVar.d;
        qtc qtcVarJ = ojh.m(tiaVar).J(tiaVar, true);
        long jA = ph7Var.a();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(androidComposeView, wab.x(mh2.x(qtcVarJ)), new Point((int) (jA >> 32), (int) (jA & 4294967295L)), xk2Var);
        scrollCaptureTarget.setScrollBounds(wab.x(ph7Var));
        consumer.accept(scrollCaptureTarget);
    }
}
