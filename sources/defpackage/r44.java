package defpackage;

import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class r44 extends elg {
    public final d9a h;
    public final int i;
    public final double j;
    public final double k;
    public double l;

    public r44(ReadableMap readableMap, d9a d9aVar) {
        super(null);
        this.h = d9aVar;
        this.i = readableMap.getInt("input");
        this.j = readableMap.getDouble(BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY);
        this.k = readableMap.getDouble(BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY);
        this.e = this.l;
    }

    @Override // defpackage.elg, defpackage.hd0
    public final String d() {
        int i = this.d;
        double d = this.l;
        String strD = super.d();
        StringBuilder sbF = uz.f("DiffClampAnimatedNode[", i, "]: InputNodeTag: ", this.i, " min: ");
        sbF.append(this.j);
        sbF.append(" max: ");
        sbF.append(this.k);
        sbF.append(" lastValue: ");
        sbF.append(d);
        sbF.append(" super: ");
        sbF.append(strD);
        return sbF.toString();
    }

    @Override // defpackage.hd0
    public final void e() {
        hd0 hd0VarJ = this.h.j(this.i);
        if (hd0VarJ == null || !(hd0VarJ instanceof elg)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
        }
        double dG = ((elg) hd0VarJ).g();
        double d = dG - this.l;
        this.l = dG;
        this.e = Math.min(Math.max(this.e + d, this.j), this.k);
    }
}
