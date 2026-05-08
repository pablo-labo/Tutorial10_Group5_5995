package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes2.dex */
public final class qs5 extends td0 {
    public long e;
    public double[] f;
    public double g;
    public double h;
    public int i;
    public int j;
    public int k;

    @Override // defpackage.td0
    public final void a(ReadableMap readableMap) {
        int size;
        readableMap.getClass();
        ReadableArray array = readableMap.getArray("frames");
        if (array != null && this.f.length != (size = array.size())) {
            double[] dArr = new double[size];
            for (int i = 0; i < size; i++) {
                dArr[i] = array.getDouble(i);
            }
            this.f = dArr;
        }
        this.g = (readableMap.hasKey("toValue") && readableMap.getType("toValue") == ReadableType.Number) ? readableMap.getDouble("toValue") : 0.0d;
        int i2 = (readableMap.hasKey("iterations") && readableMap.getType("iterations") == ReadableType.Number) ? readableMap.getInt("iterations") : 1;
        this.i = i2;
        this.j = 1;
        this.a = i2 == 0;
        this.e = -1L;
    }

    @Override // defpackage.td0
    public final void b(long j) {
        double d;
        elg elgVar = this.b;
        if (elgVar == null) {
            l5.q("Animated value should not be null");
            return;
        }
        if (this.e < 0) {
            this.e = j;
            if (this.j == 1) {
                this.h = elgVar.e;
            }
        }
        int iRound = (int) Math.round(((j - this.e) / 1000000) / 16.666666666666668d);
        if (iRound < 0) {
            long j2 = this.e;
            StringBuilder sbI = w40.i(j, "Calculated frame index should never be lower than 0. Called with frameTimeNanos ", " and mStartFrameTimeNanos ");
            sbI.append(j2);
            String string = sbI.toString();
            if (this.k < 100) {
                s55.n("ReactNative", string);
                this.k++;
                return;
            }
            return;
        }
        if (this.a) {
            return;
        }
        double[] dArr = this.f;
        if (iRound >= dArr.length - 1) {
            int i = this.i;
            if (i == -1 || this.j < i) {
                double d2 = this.h;
                d = ((this.g - d2) * dArr[dArr.length - 1]) + d2;
                this.e = -1L;
                this.j++;
            } else {
                d = this.g;
                this.a = true;
            }
        } else {
            double d3 = this.h;
            d = ((this.g - d3) * dArr[iRound]) + d3;
        }
        elgVar.e = d;
    }
}
