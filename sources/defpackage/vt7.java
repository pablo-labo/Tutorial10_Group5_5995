package defpackage;

import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import com.indeed.android.jobsearch.R;
import defpackage.a8b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class vt7 extends hh2 {
    public final WeakReference<View> g0;
    public final a8b.a h0;
    public final ArrayList i0;

    public vt7(ut7 ut7Var, View view) {
        super(20);
        this.g0 = new WeakReference<>(view);
        Choreographer.getInstance().getClass();
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        Object tag = view.getTag(R.id.metricsStateHolder);
        if (tag == null) {
            tag = new a8b.a();
            view.setTag(R.id.metricsStateHolder, tag);
        }
        this.h0 = (a8b.a) tag;
        this.i0 = new ArrayList();
    }
}
