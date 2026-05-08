package com.swmansion.gesturehandler.core;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;

    public static final class a {
        public static k a(MotionEvent motionEvent) {
            double dAtan;
            double dAtan2 = 1.5707963267948966d;
            double axisValue = 1.5707963267948966d - ((double) motionEvent.getAxisValue(25));
            double pressure = motionEvent.getPressure(0);
            double orientation = (((double) motionEvent.getOrientation(0)) + 1.5707963267948966d) % 6.283185307179586d;
            if (orientation != 0.0d && Math.signum(orientation) != Math.signum(6.283185307179586d)) {
                orientation += 6.283185307179586d;
            }
            double d = orientation;
            if (axisValue < 1.0E-9d) {
                double d2 = (d < 1.0E-9d || Math.abs(d - 6.283185307179586d) < 1.0E-9d) ? 1.5707963267948966d : 0.0d;
                double d3 = d - 1.5707963267948966d;
                double d4 = Math.abs(d3) < 1.0E-9d ? 1.5707963267948966d : 0.0d;
                double d5 = d - 3.141592653589793d;
                dAtan = -1.5707963267948966d;
                if (Math.abs(d5) < 1.0E-9d) {
                    d2 = -1.5707963267948966d;
                }
                double d6 = d - 4.71238898038469d;
                if (Math.abs(d6) < 1.0E-9d) {
                    d4 = -1.5707963267948966d;
                }
                if (d > 1.0E-9d && Math.abs(d3) < 1.0E-9d) {
                    d4 = 1.5707963267948966d;
                    d2 = 1.5707963267948966d;
                }
                if (Math.abs(d3) > 1.0E-9d && Math.abs(d5) < 1.0E-9d) {
                    d4 = 1.5707963267948966d;
                    d2 = -1.5707963267948966d;
                }
                if (Math.abs(d5) > 1.0E-9d && Math.abs(d6) < 1.0E-9d) {
                    d4 = -1.5707963267948966d;
                    d2 = -1.5707963267948966d;
                }
                if (Math.abs(d6) <= 1.0E-9d || Math.abs(d - 6.283185307179586d) >= 1.0E-9d) {
                    dAtan = d4;
                    dAtan2 = d2;
                }
            } else {
                double dTan = Math.tan(axisValue);
                dAtan2 = Math.atan(Math.cos(d) / dTan);
                dAtan = Math.atan(Math.sin(d) / dTan);
            }
            Pair pair = new Pair(Double.valueOf(Math.rint(dAtan2 * 57.29577951308232d)), Double.valueOf(Math.rint(dAtan * 57.29577951308232d)));
            return new k(((Number) pair.d()).doubleValue(), ((Number) pair.e()).doubleValue(), axisValue, d, pressure);
        }
    }

    public /* synthetic */ k(int i) {
        this(0.0d, 0.0d, 0.0d, 0.0d, -1.0d);
    }

    public final WritableMap a() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("tiltX", this.a);
        writableMapCreateMap.putDouble("tiltY", this.b);
        writableMapCreateMap.putDouble("altitudeAngle", this.c);
        writableMapCreateMap.putDouble("azimuthAngle", this.d);
        writableMapCreateMap.putDouble("pressure", this.e);
        return writableMapCreateMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Double.compare(this.a, kVar.a) == 0 && Double.compare(this.b, kVar.b) == 0 && Double.compare(this.c, kVar.c) == 0 && Double.compare(this.d, kVar.d) == 0 && Double.compare(this.e, kVar.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + ((Double.hashCode(this.d) + ((Double.hashCode(this.c) + ((Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StylusData(tiltX=" + this.a + ", tiltY=" + this.b + ", altitudeAngle=" + this.c + ", azimuthAngle=" + this.d + ", pressure=" + this.e + ")";
    }

    public k(double d, double d2, double d3, double d4, double d5) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
    }
}
