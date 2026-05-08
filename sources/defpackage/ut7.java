package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.indeed.android.jobsearch.R;
import defpackage.a8b;

/* JADX INFO: loaded from: classes.dex */
public final class ut7 {
    public final a a;
    public final zt7 b;
    public boolean c;
    public final float d;

    public interface a {
        void onFrame(rs5 rs5Var);
    }

    public ut7(Window window, a aVar) {
        this.a = aVar;
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            r6.g("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
            throw null;
        }
        ViewParent parent = viewPeekDecorView.getParent();
        View view = viewPeekDecorView;
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        Object tag = view.getTag(R.id.metricsStateHolder);
        if (tag == null) {
            tag = new a8b.a();
            view.setTag(R.id.metricsStateHolder, tag);
        }
        a8b.a aVar2 = (a8b.a) tag;
        if (aVar2.a == null) {
            aVar2.a = new a8b();
        }
        zt7 au7Var = Build.VERSION.SDK_INT >= 31 ? new au7(this, viewPeekDecorView, window) : new zt7(this, viewPeekDecorView, window);
        this.b = au7Var;
        au7Var.Q(true);
        this.c = true;
        this.d = 2.0f;
    }
}
