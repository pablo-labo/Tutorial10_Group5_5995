package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class lrg {
    public final View a;
    public int b;
    public int c;
    public int d;

    public lrg(View view) {
        this.a = view;
    }

    public final void a() {
        int i = this.d;
        View view = this.a;
        int top = i - (view.getTop() - this.b);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.c));
    }
}
