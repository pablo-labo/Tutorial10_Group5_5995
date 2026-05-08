package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class rb0 {
    public static final a a = new a();

    public static final class a implements sea {
    }

    public static final void a(View view, pm8 pm8Var) {
        long jA0 = pm8Var.t0.c.a0(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jA0 >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jA0 & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }
}
