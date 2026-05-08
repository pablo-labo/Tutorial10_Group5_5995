package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.zm5;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class w35 extends y5 {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final a o = new a();
    public static final b p = new b();
    public final AccessibilityManager h;
    public final View i;
    public c j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public class a implements zm5.a<t6> {
    }

    public class b {
    }

    public class c extends u6 {
        public c() {
        }

        @Override // defpackage.u6
        public final t6 b(int i) {
            return new t6(AccessibilityNodeInfo.obtain(w35.this.q(i).a));
        }

        @Override // defpackage.u6
        public final t6 c(int i) {
            w35 w35Var = w35.this;
            int i2 = i == 2 ? w35Var.k : w35Var.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        @Override // defpackage.u6
        public final boolean d(int i, int i2, Bundle bundle) {
            int i3;
            w35 w35Var = w35.this;
            View view = w35Var.i;
            if (i == -1) {
                WeakHashMap<View, prg> weakHashMap = epg.a;
                return view.performAccessibilityAction(i2, bundle);
            }
            if (i2 == 1) {
                return w35Var.w(i);
            }
            if (i2 == 2) {
                return w35Var.j(i);
            }
            if (i2 != 64) {
                if (i2 != 128) {
                    return w35Var.s(i, i2);
                }
                if (w35Var.k != i) {
                    return false;
                }
                w35Var.k = Integer.MIN_VALUE;
                view.invalidate();
                w35Var.x(i, 65536);
                return true;
            }
            AccessibilityManager accessibilityManager = w35Var.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = w35Var.k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                w35Var.k = Integer.MIN_VALUE;
                view.invalidate();
                w35Var.x(i3, 65536);
            }
            w35Var.k = i;
            view.invalidate();
            w35Var.x(i, 32768);
            return true;
        }
    }

    public w35(View view) {
        if (view == null) {
            l5.q("View may not be null");
            throw null;
        }
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.y5
    public u6 b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // defpackage.y5
    public void d(t6 t6Var, View view) {
        this.a.onInitializeAccessibilityNodeInfo(view, t6Var.a);
        t(t6Var);
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        v(i, false);
        x(i, 8);
        return true;
    }

    public final t6 k(int i) {
        t6 t6VarJ = t6.j();
        AccessibilityNodeInfo accessibilityNodeInfo = t6VarJ.a;
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setFocusable(true);
        t6VarJ.n("android.view.View");
        Rect rect = n;
        t6VarJ.l(rect);
        accessibilityNodeInfo.setBoundsInScreen(rect);
        t6VarJ.b = -1;
        View view = this.i;
        accessibilityNodeInfo.setParent(view);
        u(i, t6VarJ);
        if (t6VarJ.h() == null && accessibilityNodeInfo.getContentDescription() == null) {
            b0.o("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.e;
        t6VarJ.g(rect2);
        if (rect2.equals(rect)) {
            b0.o("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfo.getActions();
        if ((actions & 64) != 0) {
            b0.o("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            b0.o("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfo.setPackageName(view.getContext().getPackageName());
        t6VarJ.c = i;
        accessibilityNodeInfo.setSource(view, i);
        if (this.k == i) {
            accessibilityNodeInfo.setAccessibilityFocused(true);
            t6VarJ.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        } else {
            accessibilityNodeInfo.setAccessibilityFocused(false);
            t6VarJ.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            t6VarJ.a(2);
        } else if (accessibilityNodeInfo.isFocusable()) {
            t6VarJ.a(1);
        }
        accessibilityNodeInfo.setFocused(z);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            t6VarJ.g(rect3);
            if (t6VarJ.b != -1) {
                t6 t6VarJ2 = t6.j();
                for (int i2 = t6VarJ.b; i2 != -1; i2 = t6VarJ2.b) {
                    t6VarJ2.b = -1;
                    t6VarJ2.a.setParent(view, -1);
                    t6VarJ2.l(rect);
                    u(i2, t6VarJ2);
                    t6VarJ2.g(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfo.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfo.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return t6VarJ;
    }

    public final boolean l(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iN = n(motionEvent.getX(), motionEvent.getY());
            int i2 = this.m;
            if (i2 != iN) {
                this.m = iN;
                x(iN, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                x(i2, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            }
            if (iN == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.m = Integer.MIN_VALUE;
                x(Integer.MIN_VALUE, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                x(i, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(android.view.KeyEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L75
            int r0 = r7.getKeyCode()
            r3 = 61
            r4 = 0
            if (r0 == r3) goto L5e
            r3 = 66
            if (r0 == r3) goto L46
            switch(r0) {
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L19;
                case 23: goto L46;
                default: goto L18;
            }
        L18:
            goto L75
        L19:
            boolean r5 = r7.hasNoModifiers()
            if (r5 == 0) goto L75
            r5 = 19
            if (r0 == r5) goto L31
            r5 = 21
            if (r0 == r5) goto L2e
            r5 = 22
            if (r0 == r5) goto L33
            r3 = 130(0x82, float:1.82E-43)
            goto L33
        L2e:
            r3 = 17
            goto L33
        L31:
            r3 = 33
        L33:
            int r7 = r7.getRepeatCount()
            int r7 = r7 + r2
            r0 = r1
        L39:
            if (r1 >= r7) goto L45
            boolean r5 = r6.p(r3, r4)
            if (r5 == 0) goto L45
            int r1 = r1 + 1
            r0 = r2
            goto L39
        L45:
            return r0
        L46:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L75
            int r7 = r7.getRepeatCount()
            if (r7 != 0) goto L75
            int r7 = r6.l
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r0) goto L5d
            r0 = 16
            r6.s(r7, r0)
        L5d:
            return r2
        L5e:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L6a
            r7 = 2
            boolean r6 = r6.p(r7, r4)
            return r6
        L6a:
            boolean r7 = r7.hasModifiers(r2)
            if (r7 == 0) goto L75
            boolean r6 = r6.p(r2, r4)
            return r6
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w35.m(android.view.KeyEvent):boolean");
    }

    public abstract int n(float f, float f2);

    public abstract void o(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(int r21, android.graphics.Rect r22) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w35.p(int, android.graphics.Rect):boolean");
    }

    public final t6 q(int i) {
        if (i != -1) {
            return k(i);
        }
        View view = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        t6 t6Var = new t6(accessibilityNodeInfoObtain);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            b0.o("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            t6Var.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return t6Var;
    }

    public final void r(boolean z, int i, Rect rect) {
        int i2 = this.l;
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (z) {
            p(i, rect);
        }
    }

    public abstract boolean s(int i, int i2);

    public void t(t6 t6Var) {
    }

    public abstract void u(int i, t6 t6Var);

    public void v(int i, boolean z) {
    }

    public final boolean w(int i) {
        int i2;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        v(i, true);
        x(i, 8);
        return true;
    }

    public final void x(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            t6 t6VarQ = q(i);
            accessibilityEventObtain.getText().add(t6VarQ.h());
            AccessibilityNodeInfo accessibilityNodeInfo = t6VarQ.a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                b0.o("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                return;
            } else {
                accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
                accessibilityEventObtain.setSource(view, i);
                accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
            }
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
