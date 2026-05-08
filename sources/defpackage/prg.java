package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class prg {
    public final WeakReference<View> a;

    public prg(View view) {
        this.a = new WeakReference<>(view);
    }

    public final void a(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(rrg rrgVar) {
        View view = this.a.get();
        if (view != null) {
            if (rrgVar != null) {
                view.animate().setListener(new asf(rrgVar, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
