package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public class krg<V extends View> extends CoordinatorLayout.c<V> {
    public lrg a;
    public int b;

    public krg() {
        this.b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v, int i) {
        u(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new lrg(v);
        }
        lrg lrgVar = this.a;
        View view = lrgVar.a;
        lrgVar.b = view.getTop();
        lrgVar.c = view.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        lrg lrgVar2 = this.a;
        if (lrgVar2.d != i2) {
            lrgVar2.d = i2;
            lrgVar2.a();
        }
        this.b = 0;
        return true;
    }

    public final int s() {
        lrg lrgVar = this.a;
        if (lrgVar != null) {
            return lrgVar.d;
        }
        return 0;
    }

    public int t() {
        return s();
    }

    public void u(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.q(v, i);
    }

    public krg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }
}
