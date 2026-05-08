package defpackage;

import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class i93 {
    public static final void a(CursorAnchorInfo.Builder builder, mif mifVar, qtc qtcVar) {
        if (qtcVar.f()) {
            return;
        }
        float f = qtcVar.b;
        q1a q1aVar = mifVar.b;
        int iE = q1aVar.e(f);
        int iE2 = q1aVar.e(qtcVar.d);
        if (iE > iE2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(mifVar.e(iE), q1aVar.f(iE), mifVar.f(iE), q1aVar.b(iE));
            if (iE == iE2) {
                return;
            } else {
                iE++;
            }
        }
    }
}
