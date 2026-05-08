package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class u extends a0 {
    public r c;
    public q d;

    public static int e(View view, s sVar) {
        return ((sVar.c(view) / 2) + sVar.e(view)) - ((sVar.l() / 2) + sVar.k());
    }

    public static View f(RecyclerView.m mVar, s sVar) {
        int iV = mVar.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iL = (sVar.l() / 2) + sVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = mVar.u(i2);
            int iAbs = Math.abs(((sVar.c(viewU) / 2) + sVar.e(viewU)) - iL);
            if (iAbs < i) {
                view = viewU;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int[] b(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.d()) {
            iArr[0] = e(view, g(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.e()) {
            iArr[1] = e(view, h(mVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.a0
    @SuppressLint({"UnknownNullness"})
    public View c(RecyclerView.m mVar) {
        if (mVar.e()) {
            return f(mVar, h(mVar));
        }
        if (mVar.d()) {
            return f(mVar, g(mVar));
        }
        return null;
    }

    public final s g(RecyclerView.m mVar) {
        q qVar = this.d;
        if (qVar == null || qVar.a != mVar) {
            this.d = new q(mVar);
        }
        return this.d;
    }

    public final s h(RecyclerView.m mVar) {
        r rVar = this.c;
        if (rVar == null || rVar.a != mVar) {
            this.c = new r(mVar);
        }
        return this.c;
    }
}
