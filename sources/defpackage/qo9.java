package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class qo9 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ro9 a;

    public qo9(ro9 ro9Var) {
        this.a = ro9Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        motionEvent.getClass();
        ro9 ro9Var = this.a;
        if (ro9Var.f) {
            ro9Var.h();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        motionEvent.getClass();
        ro9 ro9Var = this.a;
        if (ro9Var.f) {
            return true;
        }
        ro9Var.h();
        return true;
    }
}
