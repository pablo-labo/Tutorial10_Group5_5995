package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sg6<V extends View> extends krg<V> {
    public a c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public VelocityTracker i;

    public class a implements Runnable {
        public final CoordinatorLayout a;
        public final V b;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.a = coordinatorLayout;
            this.b = v;
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg6 sg6Var;
            OverScroller overScroller;
            V v = this.b;
            if (v == null || (overScroller = (sg6Var = sg6.this).d) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.a;
            if (!zComputeScrollOffset) {
                sg6Var.y(coordinatorLayout, v);
                return;
            }
            sg6Var.A(coordinatorLayout, v, sg6Var.d.getCurrY());
            WeakHashMap<View, prg> weakHashMap = epg.a;
            v.postOnAnimation(this);
        }
    }

    public sg6() {
        this.f = -1;
        this.h = -1;
    }

    public final void A(CoordinatorLayout coordinatorLayout, View view, int i) {
        z(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            int r0 = r6.h
            if (r0 >= 0) goto L12
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.h = r0
        L12:
            int r0 = r9.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L40
            boolean r0 = r6.e
            if (r0 == 0) goto L40
            int r0 = r6.f
            if (r0 != r3) goto L25
            goto L8e
        L25:
            int r0 = r9.findPointerIndex(r0)
            if (r0 != r3) goto L2c
            goto L8e
        L2c:
            float r0 = r9.getY(r0)
            int r0 = (int) r0
            int r1 = r6.g
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r6.h
            if (r1 <= r5) goto L40
            r6.g = r0
            return r2
        L40:
            int r0 = r9.getActionMasked()
            if (r0 != 0) goto L87
            r6.f = r3
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            boolean r3 = r6.v(r8)
            if (r3 == 0) goto L60
            boolean r7 = r7.l(r8, r0, r1)
            if (r7 == 0) goto L60
            r7 = r2
            goto L61
        L60:
            r7 = r4
        L61:
            r6.e = r7
            if (r7 == 0) goto L87
            r6.g = r1
            int r7 = r9.getPointerId(r4)
            r6.f = r7
            android.view.VelocityTracker r7 = r6.i
            if (r7 != 0) goto L77
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r6.i = r7
        L77:
            android.widget.OverScroller r7 = r6.d
            if (r7 == 0) goto L87
            boolean r7 = r7.isFinished()
            if (r7 != 0) goto L87
            android.widget.OverScroller r6 = r6.d
            r6.abortAnimation()
            return r2
        L87:
            android.view.VelocityTracker r6 = r6.i
            if (r6 == 0) goto L8e
            r6.addMovement(r9)
        L8e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg6.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r19, V r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg6.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean v(V v) {
        return false;
    }

    public int w(V v) {
        return -v.getHeight();
    }

    public int x(V v) {
        return v.getHeight();
    }

    public void y(CoordinatorLayout coordinatorLayout, V v) {
    }

    public int z(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int i4;
        int iS = s();
        if (i2 == 0 || iS < i2 || iS > i3 || iS == (i4 = ie7.i(i, i2, i3))) {
            return 0;
        }
        lrg lrgVar = this.a;
        if (lrgVar == null) {
            this.b = i4;
        } else if (lrgVar.d != i4) {
            lrgVar.d = i4;
            lrgVar.a();
        }
        return iS - i4;
    }

    public sg6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1;
        this.h = -1;
    }
}
