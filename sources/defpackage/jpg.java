package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.indeed.android.jobsearch.R;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jpg implements View.OnAttachStateChangeListener {
    public final /* synthetic */ n1 a;

    public jpg(n1 n1Var) {
        this.a = n1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        n1 n1Var = this.a;
        Iterator it = v6e.O(n1Var.getParent(), nqg.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object obj = (ViewParent) it.next();
            if (obj instanceof View) {
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R.id.is_pooling_container_tag);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null ? bool.booleanValue() : false) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return;
        }
        n1Var.e();
    }
}
