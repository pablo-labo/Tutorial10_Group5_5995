package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.swmansion.gesturehandler.core.j;

/* JADX INFO: loaded from: classes3.dex */
public final class xmd extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ j a;

    public xmd(j jVar) {
        this.a = jVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        j jVar = this.a;
        jVar.m = x;
        jVar.n = motionEvent.getY();
        jVar.o = 1;
        return true;
    }
}
