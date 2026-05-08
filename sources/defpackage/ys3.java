package defpackage;

import android.view.FrameMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.indeed.android.jobsearch.R;
import defpackage.a8b;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ys3 implements Window.OnFrameMetricsAvailableListener {
    public final ArrayList a;
    public boolean b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public ys3(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        View decorView;
        synchronized (this) {
            try {
                this.b = true;
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((Window.OnFrameMetricsAvailableListener) it.next()).onFrameMetricsAvailable(window, frameMetrics, i);
                }
                if (!this.c.isEmpty()) {
                    Iterator it2 = this.c.iterator();
                    while (it2.hasNext()) {
                        this.a.add((Window.OnFrameMetricsAvailableListener) it2.next());
                    }
                    this.c.clear();
                }
                if (!this.d.isEmpty()) {
                    boolean zIsEmpty = this.a.isEmpty();
                    Iterator it3 = this.d.iterator();
                    while (it3.hasNext()) {
                        this.a.remove((Window.OnFrameMetricsAvailableListener) it3.next());
                    }
                    this.d.clear();
                    if (!zIsEmpty && this.a.isEmpty()) {
                        if (window != null) {
                            window.removeOnFrameMetricsAvailableListener(this);
                        }
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            decorView.setTag(R.id.metricsDelegator, null);
                        }
                    }
                }
                this.b = false;
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.getClass();
            ViewParent parent = decorView2.getParent();
            while (parent instanceof View) {
                decorView2 = parent;
                parent = decorView2.getParent();
            }
            Object tag = decorView2.getTag(R.id.metricsStateHolder);
            if (tag == null) {
                tag = new a8b.a();
                decorView2.setTag(R.id.metricsStateHolder, tag);
            }
            a8b a8bVar = ((a8b.a) tag).a;
            if (a8bVar != null) {
                synchronized (a8bVar.b) {
                    try {
                        for (int size = a8bVar.b.size() - 1; -1 < size; size--) {
                            if (((a8b.b) a8bVar.b.get(size)).a != -1) {
                                a8bVar.c((a8b.b) a8bVar.b.remove(size));
                            }
                        }
                        j6g j6gVar2 = j6g.a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }
}
