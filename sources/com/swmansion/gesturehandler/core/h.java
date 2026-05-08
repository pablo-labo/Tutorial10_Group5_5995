package com.swmansion.gesturehandler.core;

import android.view.MotionEvent;
import com.swmansion.gesturehandler.core.i;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public final a a;
    public long b;
    public long c;
    public double d;
    public double e;
    public float f;
    public float g;
    public boolean h;
    public final int[] i = new int[2];
    public boolean j;

    public interface a {
        void a(h hVar);

        void b(h hVar);

        void c(h hVar);
    }

    public h(i.b bVar) {
        this.a = bVar;
    }

    public final void a(MotionEvent motionEvent) {
        this.c = this.b;
        this.b = motionEvent.getEventTime();
        int[] iArr = this.i;
        int iFindPointerIndex = motionEvent.findPointerIndex(iArr[0]);
        int iFindPointerIndex2 = motionEvent.findPointerIndex(iArr[1]);
        if (iFindPointerIndex == -1 || iFindPointerIndex2 == -1) {
            return;
        }
        float x = motionEvent.getX(iFindPointerIndex);
        float y = motionEvent.getY(iFindPointerIndex);
        float x2 = motionEvent.getX(iFindPointerIndex2);
        float y2 = motionEvent.getY(iFindPointerIndex2);
        this.f = (x + x2) * 0.5f;
        this.g = (y + y2) * 0.5f;
        double d = -Math.atan2(y2 - y, x2 - x);
        if (this.j) {
            this.d = d;
            this.j = false;
        }
        double d2 = Double.isNaN(this.d) ? 0.0d : this.d - d;
        this.e = d2;
        this.d = d;
        if (d2 > 3.141592653589793d) {
            this.e = d2 - 3.141592653589793d;
        } else if (d2 < -3.141592653589793d) {
            this.e = d2 + 3.141592653589793d;
        }
        double d3 = this.e;
        if (d3 > 1.5707963267948966d) {
            this.e = d3 - 3.141592653589793d;
        } else if (d3 < -1.5707963267948966d) {
            this.e = d3 + 3.141592653589793d;
        }
    }
}
