package defpackage;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public class elg extends hd0 {
    public double e;
    public double f;
    public id0 g;

    public elg(ReadableMap readableMap) {
        this.e = readableMap != null ? readableMap.getDouble("value") : Double.NaN;
        this.f = readableMap != null ? readableMap.getDouble("offset") : 0.0d;
    }

    @Override // defpackage.hd0
    public String d() {
        return "ValueAnimatedNode[" + this.d + "]: value: " + this.e + " offset: " + this.f;
    }

    public Object f() {
        return null;
    }

    public final double g() {
        if (Double.isNaN(this.f + this.e)) {
            e();
        }
        return this.f + this.e;
    }

    public elg() {
        this(null);
    }
}
