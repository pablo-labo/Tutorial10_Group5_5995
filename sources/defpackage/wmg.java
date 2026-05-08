package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* JADX INFO: loaded from: classes2.dex */
public final class wmg {
    public VelocityTracker a;
    public float b;
    public float c;

    public final void a(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.a == null) {
            this.a = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 1 || action == 3) {
                velocityTracker.computeCurrentVelocity(1);
                this.b = velocityTracker.getXVelocity();
                this.c = velocityTracker.getYVelocity();
                velocityTracker.recycle();
                this.a = null;
            }
        }
    }
}
