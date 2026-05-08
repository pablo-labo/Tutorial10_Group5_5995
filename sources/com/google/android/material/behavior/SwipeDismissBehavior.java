package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.epg;
import defpackage.m1f;
import defpackage.prg;
import defpackage.t6;
import defpackage.tpg;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public tpg a;
    public boolean b;
    public int c = 2;
    public final float d = 0.5f;
    public float e = 0.0f;
    public float f = 0.5f;
    public final a g = new a();

    public class a extends tpg.c {
        public int a;
        public int b = -1;

        public a() {
        }

        @Override // tpg.c
        public final int a(View view, int i) {
            int width;
            int width2;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            boolean z = view.getLayoutDirection() == 1;
            int i2 = SwipeDismissBehavior.this.c;
            if (i2 == 0) {
                width = this.a;
                if (z) {
                    width -= view.getWidth();
                    width2 = this.a;
                } else {
                    width2 = view.getWidth() + width;
                }
            } else {
                int i3 = this.a;
                if (i2 != 1) {
                    width = i3 - view.getWidth();
                    width2 = this.a + view.getWidth();
                } else if (z) {
                    width2 = view.getWidth() + i3;
                    width = i3;
                } else {
                    width = i3 - view.getWidth();
                    width2 = this.a;
                }
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // tpg.c
        public final int b(View view, int i) {
            return view.getTop();
        }

        @Override // tpg.c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // tpg.c
        public final void g(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // tpg.c
        public final void h(int i) {
        }

        @Override // tpg.c
        public final void i(View view, int i, int i2) {
            float f = this.a;
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f2 = (width * swipeDismissBehavior.e) + f;
            float width2 = (view.getWidth() * swipeDismissBehavior.f) + this.a;
            float f3 = i;
            if (f3 <= f2) {
                view.setAlpha(1.0f);
            } else if (f3 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f3 - f2) / (width2 - f2))), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
        @Override // tpg.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void j(android.view.View r9, float r10, float r11) {
            /*
                r8 = this;
                r11 = -1
                r8.b = r11
                int r11 = r9.getWidth()
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 0
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r4 = 1
                if (r1 == 0) goto L39
                java.util.WeakHashMap<android.view.View, prg> r5 = defpackage.epg.a
                int r5 = r9.getLayoutDirection()
                if (r5 != r4) goto L1a
                r5 = r4
                goto L1b
            L1a:
                r5 = r2
            L1b:
                int r6 = r3.c
                r7 = 2
                if (r6 != r7) goto L21
                goto L52
            L21:
                if (r6 != 0) goto L2d
                if (r5 == 0) goto L2a
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 >= 0) goto L5f
                goto L52
            L2a:
                if (r1 <= 0) goto L5f
                goto L52
            L2d:
                if (r6 != r4) goto L5f
                if (r5 == 0) goto L34
                if (r1 <= 0) goto L5f
                goto L52
            L34:
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 >= 0) goto L5f
                goto L52
            L39:
                int r10 = r9.getLeft()
                int r0 = r8.a
                int r10 = r10 - r0
                int r0 = r9.getWidth()
                float r0 = (float) r0
                float r1 = r3.d
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                int r10 = java.lang.Math.abs(r10)
                if (r10 < r0) goto L5f
            L52:
                int r10 = r9.getLeft()
                int r8 = r8.a
                if (r10 >= r8) goto L5c
                int r8 = r8 - r11
                goto L5d
            L5c:
                int r8 = r8 + r11
            L5d:
                r2 = r4
                goto L61
            L5f:
                int r8 = r8.a
            L61:
                tpg r10 = r3.a
                int r11 = r9.getTop()
                boolean r8 = r10.q(r8, r11)
                if (r8 == 0) goto L77
                com.google.android.material.behavior.SwipeDismissBehavior$b r8 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                r8.<init>(r9, r2)
                java.util.WeakHashMap<android.view.View, prg> r10 = defpackage.epg.a
                r9.postOnAnimation(r8)
            L77:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.j(android.view.View, float, float):void");
        }

        @Override // tpg.c
        public final boolean k(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.s(view);
        }
    }

    public class b implements Runnable {
        public final View a;

        public b(View view, boolean z) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            tpg tpgVar = SwipeDismissBehavior.this.a;
            if (tpgVar == null || !tpgVar.g()) {
                return;
            }
            WeakHashMap<View, prg> weakHashMap = epg.a;
            this.a.postOnAnimation(this);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zL = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zL = coordinatorLayout.l(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = zL;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (!zL) {
            return false;
        }
        if (this.a == null) {
            this.a = new tpg(coordinatorLayout.getContext(), coordinatorLayout, this.g);
        }
        return this.a.r(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v, int i) {
        WeakHashMap<View, prg> weakHashMap = epg.a;
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            epg.l(v, 1048576);
            epg.h(v, 0);
            if (s(v)) {
                epg.m(v, t6.a.o, new m1f(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        tpg tpgVar = this.a;
        if (tpgVar == null) {
            return false;
        }
        tpgVar.k(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}
