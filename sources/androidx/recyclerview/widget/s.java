package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.l5;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public final RecyclerView.m a;
    public int b = Integer.MIN_VALUE;
    public final Rect c = new Rect();

    public s(RecyclerView.m mVar) {
        this.a = mVar;
    }

    public static s a(RecyclerView.m mVar, int i) {
        if (i == 0) {
            return new q(mVar);
        }
        if (i == 1) {
            return new r(mVar);
        }
        l5.q("invalid orientation");
        return null;
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);
}
