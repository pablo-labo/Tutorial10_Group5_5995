package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import com.indeed.android.jobsearch.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class yt7 extends wt7 {
    public static Handler p0;
    public final Window j0;
    public long k0;
    public long l0;
    public long m0;
    public final ss5 n0;
    public final xt7 o0;

    /* JADX WARN: Type inference failed for: r4v2, types: [xt7] */
    public yt7(final ut7 ut7Var, View view, Window window) {
        super(ut7Var, view);
        this.j0 = window;
        ArrayList arrayList = this.i0;
        arrayList.getClass();
        ss5 ss5Var = new ss5(arrayList);
        ss5Var.e = 0L;
        this.n0 = ss5Var;
        this.o0 = new Window.OnFrameMetricsAvailableListener() { // from class: xt7
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i) {
                frameMetrics.getClass();
                long metric = frameMetrics.getMetric(10);
                yt7 yt7Var = this.a;
                long jMax = Math.max(metric, yt7Var.m0);
                if (jMax < yt7Var.l0 || jMax == yt7Var.k0) {
                    return;
                }
                float fM = yt7Var.M(frameMetrics);
                ut7 ut7Var2 = ut7Var;
                ss5 ss5VarN = yt7Var.N(jMax, (long) (fM * ut7Var2.d), frameMetrics);
                ss5VarN.getClass();
                ut7Var2.a.onFrame(ss5VarN);
                yt7Var.k0 = jMax;
            }
        };
    }

    public static ys3 O(Window window) {
        ys3 ys3Var = (ys3) window.getDecorView().getTag(R.id.metricsDelegator);
        if (ys3Var != null) {
            return ys3Var;
        }
        ys3 ys3Var2 = new ys3(new ArrayList());
        if (p0 == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            handlerThread.start();
            p0 = new Handler(handlerThread.getLooper());
        }
        window.addOnFrameMetricsAvailableListener(ys3Var2, p0);
        window.getDecorView().setTag(R.id.metricsDelegator, ys3Var2);
        return ys3Var2;
    }

    public static void P(Window window, xt7 xt7Var) {
        ys3 ys3Var = (ys3) window.getDecorView().getTag(R.id.metricsDelegator);
        if (ys3Var != null) {
            xt7Var.getClass();
            synchronized (ys3Var) {
                try {
                    if (ys3Var.b) {
                        ys3Var.d.add(xt7Var);
                    } else {
                        boolean zIsEmpty = ys3Var.a.isEmpty();
                        ys3Var.a.remove(xt7Var);
                        if (!zIsEmpty && ys3Var.a.isEmpty()) {
                            window.removeOnFrameMetricsAvailableListener(ys3Var);
                            window.getDecorView().setTag(R.id.metricsDelegator, null);
                        }
                        j6g j6gVar = j6g.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public long M(FrameMetrics frameMetrics) {
        View view = this.g0.get();
        int i = at3.a;
        if (hh2.f0 < 0) {
            Window window = null;
            if ((view != null ? view.getContext() : null) instanceof Activity) {
                Context context = view.getContext();
                context.getClass();
                window = ((Activity) context).getWindow();
            }
            float f = 60.0f;
            float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
            if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                f = refreshRate;
            }
            hh2.f0 = (long) ((1000.0f / f) * 1000000.0f);
        }
        return hh2.f0;
    }

    public ss5 N(long j, long j2, FrameMetrics frameMetrics) {
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long j3 = j + metric;
        this.m0 = j3;
        a8b a8bVar = this.h0.a;
        if (a8bVar != null) {
            a8bVar.b(j, j3, this.i0);
        }
        boolean z = metric > j2;
        long metric2 = frameMetrics.getMetric(8);
        ss5 ss5Var = this.n0;
        ss5Var.b = j;
        ss5Var.c = metric;
        ss5Var.d = z;
        ss5Var.e = metric2;
        return ss5Var;
    }

    public final void Q(boolean z) {
        synchronized (this.j0) {
            try {
                if (!z) {
                    P(this.j0, this.o0);
                    this.l0 = 0L;
                } else if (this.l0 == 0) {
                    ys3 ys3VarO = O(this.j0);
                    xt7 xt7Var = this.o0;
                    xt7Var.getClass();
                    synchronized (ys3VarO) {
                        try {
                            if (ys3VarO.b) {
                                ys3VarO.c.add(xt7Var);
                            } else {
                                ys3VarO.a.add(xt7Var);
                            }
                        } finally {
                        }
                    }
                    this.l0 = System.nanoTime();
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
