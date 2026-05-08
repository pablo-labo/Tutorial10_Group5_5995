package defpackage;

import android.R;
import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.b;
import defpackage.cdc;
import defpackage.wad;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class rz5 {
    public static final PointF m = new PointF();
    public static final float[] n = new float[2];
    public static final Matrix o = new Matrix();
    public static final float[] p = new float[2];
    public static final qz5 q = new qz5(0);
    public final ddc a;
    public final bdc b;
    public final beb c;
    public float d;
    public final ArrayList<GestureHandler> e;
    public final ArrayList<GestureHandler> f;
    public final ArrayList<GestureHandler> g;
    public final HashSet<Integer> h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;

    public static final class a {
        public static final boolean a(int i) {
            PointF pointF = rz5.m;
            return i == 3 || i == 1 || i == 5;
        }

        public static final boolean b(GestureHandler gestureHandler, GestureHandler gestureHandler2) {
            PointF pointF = rz5.m;
            gestureHandler.getClass();
            int[] iArr = gestureHandler.a;
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                if (iArr[i] != -1 && gestureHandler2.a[i] != -1) {
                    if (gestureHandler == gestureHandler2 || gestureHandler.D(gestureHandler2) || gestureHandler2.D(gestureHandler)) {
                        return false;
                    }
                    if (gestureHandler == gestureHandler2) {
                        return true;
                    }
                    if (gestureHandler.H || gestureHandler.f == 4) {
                        return gestureHandler.C(gestureHandler2);
                    }
                    return true;
                }
            }
            return false;
        }

        public static final boolean c(GestureHandler gestureHandler, GestureHandler gestureHandler2) {
            ycc yccVar;
            int[] iArr;
            PointF pointF = rz5.m;
            if (gestureHandler != gestureHandler2) {
                gestureHandler.getClass();
                gestureHandler2.getClass();
                if (gestureHandler2 != gestureHandler && (yccVar = gestureHandler.C) != null && (iArr = yccVar.a.get(gestureHandler.d)) != null) {
                    for (int i : iArr) {
                        if (i == gestureHandler2.d) {
                            return true;
                        }
                    }
                }
                if (gestureHandler2.E(gestureHandler)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean d(View view, float f, float f2) {
            return 0.0f <= f && f <= ((float) view.getWidth()) && 0.0f <= f2 && f2 <= ((float) view.getHeight());
        }
    }

    public rz5(ddc ddcVar, bdc bdcVar, beb bebVar) {
        bdcVar.getClass();
        this.a = ddcVar;
        this.b = bdcVar;
        this.c = bebVar;
        this.e = new ArrayList<>();
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.h = new HashSet<>();
    }

    public final void a() {
        ArrayList<GestureHandler> arrayList = this.f;
        for (GestureHandler gestureHandler : z92.z1(arrayList)) {
            if (!gestureHandler.H) {
                arrayList.remove(gestureHandler);
                this.h.remove(Integer.valueOf(gestureHandler.d));
            }
        }
    }

    public final void b() {
        ArrayList<GestureHandler> arrayList = this.e;
        Iterator it = w92.y0(arrayList).iterator();
        while (true) {
            ListIterator<T> listIterator = ((wad.a) it).a;
            if (!listIterator.hasPrevious()) {
                w92.B0(arrayList, new lt(3));
                this.k = false;
                return;
            }
            GestureHandler gestureHandler = (GestureHandler) listIterator.previous();
            if (a.a(gestureHandler.f) && !gestureHandler.H) {
                gestureHandler.e = null;
                gestureHandler.A = null;
                Arrays.fill(gestureHandler.a, -1);
                gestureHandler.b = 0;
                gestureHandler.o = 0;
                GestureHandler.b[] bVarArr = gestureHandler.p;
                pyd.q(null, 0, bVarArr, bVarArr.length);
                gestureHandler.n = 0;
                gestureHandler.w();
                gestureHandler.G = false;
                gestureHandler.H = false;
                gestureHandler.F = Integer.MAX_VALUE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.view.ViewGroup r10, float[] r11, int r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz5.c(android.view.ViewGroup, float[], int, android.view.MotionEvent):boolean");
    }

    public final void d(GestureHandler gestureHandler, View view) {
        ArrayList<GestureHandler> arrayList = this.e;
        if (arrayList.contains(gestureHandler)) {
            return;
        }
        arrayList.add(gestureHandler);
        gestureHandler.G = false;
        gestureHandler.H = false;
        gestureHandler.F = Integer.MAX_VALUE;
        if (gestureHandler.e != null || gestureHandler.A != null) {
            r6.g("Already prepared or hasn't been reset");
            return;
        }
        Arrays.fill(gestureHandler.a, -1);
        gestureHandler.b = 0;
        gestureHandler.f = 0;
        gestureHandler.e = view;
        gestureHandler.A = this;
        Activity activityM = GestureHandler.m(view.getContext());
        View viewFindViewById = activityM != null ? activityM.findViewById(R.id.content) : null;
        int[] iArr = gestureHandler.c;
        if (viewFindViewById != null) {
            viewFindViewById.getLocationOnScreen(iArr);
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        gestureHandler.v();
    }

    public final boolean e(View view, float[] fArr, int i, MotionEvent motionEvent) {
        boolean z;
        ArrayList<GestureHandler> arrayListE = this.b.e(view);
        if (arrayListE != null) {
            synchronized (arrayListE) {
                try {
                    Iterator<GestureHandler> it = arrayListE.iterator();
                    it.getClass();
                    z = false;
                    while (it.hasNext()) {
                        GestureHandler next = it.next();
                        if (next.j && next.p(view, fArr[0], fArr[1])) {
                            int action = motionEvent.getAction();
                            if ((next instanceof b) || (next instanceof cdc.a) || !u63.a0(10, 9, 7).contains(Integer.valueOf(action))) {
                                d(next, view);
                                next.F(i);
                                z = true;
                            }
                        }
                    }
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            z = false;
        }
        float width = view.getWidth();
        float f = fArr[0];
        if (0.0f <= f && f <= width) {
            float height = view.getHeight();
            float f2 = fArr[1];
            if (0.0f <= f2 && f2 <= height) {
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup ? (ViewGroup) parent : null) != null) {
                    Matrix matrix = view.getMatrix();
                    float[] fArr2 = n;
                    fArr2[0] = 0.0f;
                    fArr2[1] = 0.0f;
                    matrix.mapPoints(fArr2);
                    float left = fArr2[0] + view.getLeft();
                    float top = fArr2[1] + view.getTop();
                    if (left < 0.0f || left + view.getWidth() > r14.getWidth() || top < 0.0f || top + view.getHeight() > r14.getHeight()) {
                        boolean z2 = false;
                        for (ViewParent parent2 = view.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 instanceof ViewGroup) {
                                ViewGroup viewGroup = (ViewGroup) parent2;
                                ArrayList<GestureHandler> arrayListE2 = this.b.e((View) parent2);
                                if (arrayListE2 != null) {
                                    synchronized (arrayListE2) {
                                        try {
                                            Iterator<GestureHandler> it2 = arrayListE2.iterator();
                                            it2.getClass();
                                            while (it2.hasNext()) {
                                                GestureHandler next2 = it2.next();
                                                if (next2.j && next2.p(view, fArr[0], fArr[1])) {
                                                    d(next2, viewGroup);
                                                    next2.F(i);
                                                    z2 = true;
                                                }
                                            }
                                            j6g j6gVar2 = j6g.a;
                                        } finally {
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        if (z2) {
                            return true;
                        }
                    }
                }
            }
        }
        return z;
    }

    public final void f(View view, MotionEvent motionEvent) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (!wl7.b(viewGroup, this.a)) {
            f(viewGroup, motionEvent);
        }
        if (viewGroup != null) {
            motionEvent.setLocation((motionEvent.getX() + viewGroup.getScrollX()) - view.getLeft(), (motionEvent.getY() + viewGroup.getScrollY()) - view.getTop());
        }
        if (view.getMatrix().isIdentity()) {
            return;
        }
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = o;
        matrix.invert(matrix2);
        motionEvent.transform(matrix2);
    }

    public final void g(View view, PointF pointF) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (!wl7.b(viewGroup, this.a)) {
            g(viewGroup, pointF);
        }
        if (viewGroup != null) {
            pointF.x += viewGroup.getScrollX() - view.getLeft();
            pointF.y += viewGroup.getScrollY() - view.getTop();
        }
        if (view.getMatrix().isIdentity()) {
            return;
        }
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = o;
        matrix.invert(matrix2);
        float f = pointF.x;
        float[] fArr = p;
        fArr[0] = f;
        fArr[1] = pointF.y;
        matrix2.mapPoints(fArr);
        pointF.x = fArr[0];
        pointF.y = fArr[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(android.view.View r10, float[] r11, int r12, android.view.MotionEvent r13) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.rnc
            qeb r1 = defpackage.qeb.e
            if (r0 == 0) goto Le
            r0 = r10
            rnc r0 = (defpackage.rnc) r0
            qeb r0 = r0.getPointerEvents()
            goto Lf
        Le:
            r0 = r1
        Lf:
            boolean r2 = r10.isEnabled()
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            seb r7 = defpackage.seb.a
            seb r8 = defpackage.seb.b
            if (r2 != 0) goto L26
            if (r0 != r1) goto L21
        L1f:
            r7 = r8
            goto L3b
        L21:
            qeb r1 = defpackage.qeb.d
            if (r0 != r1) goto L26
            goto L3b
        L26:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L3b
            if (r0 == r5) goto L1f
            if (r0 == r4) goto L39
            if (r0 != r3) goto L35
            seb r7 = defpackage.seb.d
            goto L3b
        L35:
            defpackage.l.g()
            return r6
        L39:
            seb r7 = defpackage.seb.c
        L3b:
            int r0 = r7.ordinal()
            if (r0 == 0) goto La8
            if (r0 == r5) goto L8e
            if (r0 == r4) goto L73
            if (r0 != r3) goto L6f
            boolean r0 = r10 instanceof android.view.ViewGroup
            if (r0 == 0) goto L53
            r1 = r10
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r1 = r9.c(r1, r11, r12, r13)
            goto L54
        L53:
            r1 = r6
        L54:
            boolean r9 = r9.e(r10, r11, r12, r13)
            if (r9 != 0) goto L8d
            if (r1 != 0) goto L8d
            if (r0 == 0) goto L64
            android.graphics.drawable.Drawable r9 = r10.getBackground()
            if (r9 == 0) goto La8
        L64:
            r9 = r11[r6]
            r11 = r11[r5]
            boolean r9 = rz5.a.d(r10, r9, r11)
            if (r9 == 0) goto La8
            goto L8d
        L6f:
            defpackage.l.g()
            return r6
        L73:
            boolean r9 = r9.e(r10, r11, r12, r13)
            if (r9 != 0) goto L8d
            boolean r9 = r10 instanceof android.view.ViewGroup
            if (r9 == 0) goto L83
            android.graphics.drawable.Drawable r9 = r10.getBackground()
            if (r9 == 0) goto La8
        L83:
            r9 = r11[r6]
            r11 = r11[r5]
            boolean r9 = rz5.a.d(r10, r9, r11)
            if (r9 == 0) goto La8
        L8d:
            return r5
        L8e:
            boolean r0 = r10 instanceof android.view.ViewGroup
            if (r0 == 0) goto L9f
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r0 = r9.c(r0, r11, r12, r13)
            if (r0 == 0) goto L9e
            r9.e(r10, r11, r12, r13)
        L9e:
            return r0
        L9f:
            boolean r0 = r10 instanceof android.widget.EditText
            if (r0 == 0) goto La8
            boolean r9 = r9.e(r10, r11, r12, r13)
            return r9
        La8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz5.h(android.view.View, float[], int, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x007d, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0138 A[EDGE_INSN: B:101:0x0138->B:83:0x0138 BREAK  A[LOOP:1: B:78:0x011e->B:102:0x011e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116 A[EDGE_INSN: B:95:0x0116->B:77:0x0116 BREAK  A[LOOP:0: B:72:0x00fb->B:97:0x00fb], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(com.swmansion.gesturehandler.core.GestureHandler r12) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz5.i(com.swmansion.gesturehandler.core.GestureHandler):void");
    }
}
