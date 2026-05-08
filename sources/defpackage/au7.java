package defpackage;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class au7 extends zt7 {
    public final ts5 q0;

    public au7(ut7 ut7Var, View view, Window window) {
        super(ut7Var, view, window);
        ArrayList arrayList = this.i0;
        arrayList.getClass();
        ts5 ts5Var = new ts5(arrayList);
        ts5Var.e = 0L;
        ts5Var.f = 0L;
        ts5Var.g = 0L;
        this.q0 = ts5Var;
    }

    @Override // defpackage.yt7
    public final long M(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(13);
    }

    @Override // defpackage.yt7
    public final ss5 N(long j, long j2, FrameMetrics frameMetrics) {
        long j3;
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long j4 = j + metric;
        this.m0 = j4;
        a8b a8bVar = this.h0.a;
        if (a8bVar != null) {
            j3 = j;
            a8bVar.b(j3, j4, this.i0);
        } else {
            j3 = j;
        }
        boolean z = metric > j2;
        long metric2 = frameMetrics.getMetric(8);
        long metric3 = frameMetrics.getMetric(7) + (metric2 - frameMetrics.getMetric(12));
        long metric4 = metric2 - frameMetrics.getMetric(13);
        ts5 ts5Var = this.q0;
        ts5Var.b = j3;
        ts5Var.c = metric;
        ts5Var.d = z;
        ts5Var.e = metric3;
        ts5Var.f = metric2;
        ts5Var.g = metric4;
        return ts5Var;
    }
}
