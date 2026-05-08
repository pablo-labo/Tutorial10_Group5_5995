package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.x;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.bfa;
import defpackage.cf4;
import defpackage.cfa;
import defpackage.epg;
import defpackage.h5;
import defpackage.hac;
import defpackage.j6;
import defpackage.jfe;
import defpackage.k20;
import defpackage.l5;
import defpackage.lgb;
import defpackage.lpf;
import defpackage.m6;
import defpackage.n6;
import defpackage.o6;
import defpackage.pnb;
import defpackage.prg;
import defpackage.r40;
import defpackage.r6;
import defpackage.s6;
import defpackage.t6;
import defpackage.u63;
import defpackage.y5;
import defpackage.ysd;
import io.jsonwebtoken.JwtParser;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ysd, bfa {
    public static boolean q1 = false;
    public static boolean r1 = false;
    public static final int[] s1 = {R.attr.nestedScrollingEnabled};
    public static final float t1 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean u1 = true;
    public static final boolean v1 = true;
    public static final boolean w1 = true;
    public static final Class<?>[] x1;
    public static final c y1;
    public static final y z1;
    public i A0;
    public EdgeEffect B0;
    public EdgeEffect C0;
    public EdgeEffect D0;
    public EdgeEffect E0;
    public j F0;
    public int G0;
    public int H0;
    public VelocityTracker I0;
    public int J0;
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    public p O0;
    public final int P0;
    public final int Q0;
    public final float R0;
    public final float S0;
    public boolean T0;
    public final a0 U0;
    public final c0 V;
    public androidx.recyclerview.widget.m V0;
    public boolean W;
    public final m.b W0;
    public final x X0;
    public r Y0;
    public ArrayList Z0;
    public final float a;
    public final a a0;
    public boolean a1;
    public final v b;
    public final Rect b0;
    public boolean b1;
    public final t c;
    public final Rect c0;
    public final k c1;
    public SavedState d;
    public final RectF d0;
    public boolean d1;
    public final androidx.recyclerview.widget.a e;
    public e e0;
    public androidx.recyclerview.widget.x e1;
    public final androidx.recyclerview.widget.b f;
    public m f0;
    public final int[] f1;
    public u g0;
    public cfa g1;
    public final ArrayList h0;
    public final int[] h1;
    public final ArrayList<l> i0;
    public final int[] i1;
    public final ArrayList<q> j0;
    public final int[] j1;
    public q k0;
    public final ArrayList k1;
    public boolean l0;
    public final b l1;
    public boolean m0;
    public boolean m1;
    public boolean n0;
    public int n1;
    public int o0;
    public int o1;
    public boolean p0;
    public final d p1;
    public boolean q0;
    public boolean r0;
    public int s0;
    public boolean t0;
    public final AccessibilityManager u0;
    public ArrayList v0;
    public boolean w0;
    public boolean x0;
    public int y0;
    public int z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.n0 || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.l0) {
                recyclerView.requestLayout();
            } else if (recyclerView.q0) {
                recyclerView.p0 = true;
            } else {
                recyclerView.p();
            }
        }
    }

    public class a0 implements Runnable {
        public int a;
        public int b;
        public OverScroller c;
        public Interpolator d;
        public boolean e;
        public boolean f;

        public a0() {
            c cVar = RecyclerView.y1;
            this.d = cVar;
            this.e = false;
            this.f = false;
            this.c = new OverScroller(RecyclerView.this.getContext(), cVar);
        }

        public final void a(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.b = 0;
            this.a = 0;
            Interpolator interpolator = this.d;
            c cVar = RecyclerView.y1;
            if (interpolator != cVar) {
                this.d = cVar;
                this.c = new OverScroller(recyclerView.getContext(), cVar);
            }
            this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            b();
        }

        public final void b() {
            if (this.e) {
                this.f = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, prg> weakHashMap = epg.a;
            recyclerView.postOnAnimation(this);
        }

        public final void c(int i, int i2, int i3, Interpolator interpolator) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    iAbs = iAbs2;
                }
                i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.y1;
            }
            if (this.d != interpolator) {
                this.d = interpolator;
                this.c = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.b = 0;
            this.a = 0;
            recyclerView.setScrollState(2);
            this.c.startScroll(0, 0, i, i2, i4);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            int i4;
            RecyclerView recyclerView = RecyclerView.this;
            int[] iArr = recyclerView.j1;
            if (recyclerView.f0 == null) {
                recyclerView.removeCallbacks(this);
                this.c.abortAnimation();
                return;
            }
            this.f = false;
            this.e = true;
            recyclerView.p();
            OverScroller overScroller = this.c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i5 = currX - this.a;
                int i6 = currY - this.b;
                this.a = currX;
                this.b = currY;
                int iO = RecyclerView.o(i5, recyclerView.B0, recyclerView.D0, recyclerView.getWidth());
                int iO2 = RecyclerView.o(i6, recyclerView.C0, recyclerView.E0, recyclerView.getHeight());
                int[] iArr2 = recyclerView.j1;
                iArr2[0] = 0;
                iArr2[1] = 0;
                if (recyclerView.v(iO, iO2, 1, iArr2, null)) {
                    iO -= iArr[0];
                    iO2 -= iArr[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.n(iO, iO2);
                }
                if (recyclerView.e0 != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    recyclerView.f0(iO, iO2, iArr);
                    int i7 = iArr[0];
                    int i8 = iArr[1];
                    int i9 = iO - i7;
                    int i10 = iO2 - i8;
                    androidx.recyclerview.widget.o oVar = recyclerView.f0.e;
                    if (oVar != null && !oVar.d && oVar.e) {
                        int iB = recyclerView.X0.b();
                        if (iB == 0) {
                            oVar.d();
                        } else if (oVar.a >= iB) {
                            oVar.a = iB - 1;
                            oVar.b(i7, i8);
                        } else {
                            oVar.b(i7, i8);
                        }
                    }
                    i = i9;
                    i3 = i7;
                    i2 = i10;
                    i4 = i8;
                } else {
                    i = iO;
                    i2 = iO2;
                    i3 = 0;
                    i4 = 0;
                }
                if (!recyclerView.i0.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.j1;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.w(i3, i4, i, i2, null, 1, iArr3);
                int i11 = i - iArr[0];
                int i12 = i2 - iArr[1];
                if (i3 != 0 || i4 != 0) {
                    recyclerView.x(i3, i4);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
                androidx.recyclerview.widget.o oVar2 = recyclerView.f0.e;
                if ((oVar2 == null || !oVar2.d) && z) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                        if (i12 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i12 <= 0) {
                            currVelocity = 0;
                        }
                        if (i13 < 0) {
                            recyclerView.z();
                            if (recyclerView.B0.isFinished()) {
                                recyclerView.B0.onAbsorb(-i13);
                            }
                        } else if (i13 > 0) {
                            recyclerView.A();
                            if (recyclerView.D0.isFinished()) {
                                recyclerView.D0.onAbsorb(i13);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.B();
                            if (recyclerView.C0.isFinished()) {
                                recyclerView.C0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.y();
                            if (recyclerView.E0.isFinished()) {
                                recyclerView.E0.onAbsorb(currVelocity);
                            }
                        }
                        if (i13 != 0 || currVelocity != 0) {
                            WeakHashMap<View, prg> weakHashMap = epg.a;
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                    if (RecyclerView.w1) {
                        m.b bVar = recyclerView.W0;
                        int[] iArr4 = bVar.c;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        bVar.d = 0;
                    }
                } else {
                    b();
                    androidx.recyclerview.widget.m mVar = recyclerView.V0;
                    if (mVar != null) {
                        mVar.a(recyclerView, i3, i4);
                    }
                }
            }
            androidx.recyclerview.widget.o oVar3 = recyclerView.f0.e;
            if (oVar3 != null && oVar3.d) {
                oVar3.b(0, 0);
            }
            this.e = false;
            if (!this.f) {
                recyclerView.setScrollState(0);
                recyclerView.m0(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, prg> weakHashMap2 = epg.a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instruction units count: 274
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.b.run():void");
        }
    }

    public static abstract class b0 {
        public static final List<Object> t = Collections.EMPTY_LIST;
        public final View a;
        public WeakReference<RecyclerView> b;
        public int j;
        public RecyclerView r;
        public e<? extends b0> s;
        public int c = -1;
        public int d = -1;
        public long e = -1;
        public int f = -1;
        public int g = -1;
        public b0 h = null;
        public b0 i = null;
        public final ArrayList k = null;
        public final List<Object> l = null;
        public int m = 0;
        public t n = null;
        public boolean o = false;
        public int p = 0;
        public int q = -1;

        public b0(View view) {
            if (view != null) {
                this.a = view;
            } else {
                l5.q("itemView may not be null");
                throw null;
            }
        }

        public final void a(int i) {
            this.j = i | this.j;
        }

        public final int b() {
            int i = this.g;
            return i == -1 ? this.c : i;
        }

        public final List<Object> c() {
            ArrayList arrayList;
            return ((this.j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 || (arrayList = this.k) == null || arrayList.size() == 0) ? t : this.l;
        }

        public final boolean d() {
            View view = this.a;
            return (view.getParent() == null || view.getParent() == this.r) ? false : true;
        }

        public final boolean e() {
            return (this.j & 1) != 0;
        }

        public final boolean f() {
            return (this.j & 4) != 0;
        }

        public final boolean g() {
            if ((this.j & 16) != 0) {
                return false;
            }
            WeakHashMap<View, prg> weakHashMap = epg.a;
            return !this.a.hasTransientState();
        }

        public final boolean h() {
            return (this.j & 8) != 0;
        }

        public final boolean i() {
            return this.n != null;
        }

        public final boolean j() {
            return (this.j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
        }

        public final boolean k() {
            return (this.j & 2) != 0;
        }

        public final void l(int i, boolean z) {
            if (this.d == -1) {
                this.d = this.c;
            }
            if (this.g == -1) {
                this.g = this.c;
            }
            if (z) {
                this.g += i;
            }
            this.c += i;
            View view = this.a;
            if (view.getLayoutParams() != null) {
                ((n) view.getLayoutParams()).c = true;
            }
        }

        public final void m() {
            if (RecyclerView.q1 && j()) {
                n6.d("Attempting to reset temp-detached ViewHolder: ", this, ". ViewHolders should be fully detached before resetting.");
                return;
            }
            this.j = 0;
            this.c = -1;
            this.d = -1;
            this.e = -1L;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            ArrayList arrayList = this.k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.j &= -1025;
            this.p = 0;
            this.q = -1;
            RecyclerView.l(this);
        }

        public final void n(boolean z) {
            int i = this.m;
            int i2 = z ? i - 1 : i + 1;
            this.m = i2;
            if (i2 < 0) {
                this.m = 0;
                if (RecyclerView.q1) {
                    j6.f(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                    return;
                } else {
                    Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
            } else if (!z && i2 == 1) {
                this.j |= 16;
            } else if (z && i2 == 0) {
                this.j &= -17;
            }
            if (RecyclerView.r1) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
            }
        }

        public final boolean o() {
            return (this.j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
        }

        public final boolean p() {
            return (this.j & 32) != 0;
        }

        public final String toString() {
            StringBuilder sbG = h5.g(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbG.append(Integer.toHexString(hashCode()));
            sbG.append(" position=");
            sbG.append(this.c);
            sbG.append(" id=");
            sbG.append(this.e);
            sbG.append(", oldPos=");
            sbG.append(this.d);
            sbG.append(", pLpos:");
            sbG.append(this.g);
            StringBuilder sb = new StringBuilder(sbG.toString());
            if (i()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (f()) {
                sb.append(" invalid");
            }
            if (!e()) {
                sb.append(" unbound");
            }
            if ((this.j & 2) != 0) {
                sb.append(" update");
            }
            if (h()) {
                sb.append(" removed");
            }
            if (o()) {
                sb.append(" ignored");
            }
            if (j()) {
                sb.append(" tmpDetached");
            }
            if (!g()) {
                sb.append(" not recyclable(" + this.m + ")");
            }
            if ((this.j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 || f()) {
                sb.append(" undefined adapter position");
            }
            if (this.a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class d {
        public d() {
        }

        public final void a(b0 b0Var, j.b bVar, j.b bVar2) {
            boolean zG;
            int i;
            int i2;
            b0Var.n(false);
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.z zVar = (androidx.recyclerview.widget.z) recyclerView.F0;
            zVar.getClass();
            if (bVar == null || ((i = bVar.a) == (i2 = bVar2.a) && bVar.b == bVar2.b)) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) zVar;
                kVar.l(b0Var);
                b0Var.a.setAlpha(0.0f);
                kVar.i.add(b0Var);
                zG = true;
            } else {
                zG = zVar.g(b0Var, i, bVar.b, i2, bVar2.b);
            }
            if (zG) {
                recyclerView.W();
            }
        }

        public final void b(b0 b0Var, j.b bVar, j.b bVar2) {
            boolean zG;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.c.l(b0Var);
            recyclerView.h(b0Var);
            b0Var.n(false);
            androidx.recyclerview.widget.z zVar = (androidx.recyclerview.widget.z) recyclerView.F0;
            zVar.getClass();
            int i = bVar.a;
            int i2 = bVar.b;
            View view = b0Var.a;
            int left = bVar2 == null ? view.getLeft() : bVar2.a;
            int top = bVar2 == null ? view.getTop() : bVar2.b;
            if (b0Var.h() || (i == left && i2 == top)) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) zVar;
                kVar.l(b0Var);
                kVar.h.add(b0Var);
                zG = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                zG = zVar.g(b0Var, i, i2, left, top);
            }
            if (zG) {
                recyclerView.W();
            }
        }
    }

    public static abstract class e<VH extends b0> {
        public final f a = new f();
        public boolean b = false;
        public final a c = a.a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a a;
            public static final /* synthetic */ a[] b;

            static {
                a aVar = new a("ALLOW", 0);
                a = aVar;
                b = new a[]{aVar, new a("PREVENT_WHEN_EMPTY", 1), new a("PREVENT", 2)};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) b.clone();
            }
        }

        public abstract int c();

        public long d(int i) {
            return -1L;
        }

        public int e(int i) {
            return 0;
        }

        public void f(RecyclerView recyclerView) {
        }

        public abstract void g(VH vh, int i);

        public abstract VH h(ViewGroup viewGroup, int i);

        public void i(RecyclerView recyclerView) {
        }

        public boolean j(VH vh) {
            return false;
        }

        public void k(VH vh) {
        }

        public void l(VH vh) {
        }

        public void m(VH vh) {
        }
    }

    public static class f extends Observable<g> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public final void c(int i) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).c(i);
            }
        }
    }

    public static abstract class g {
        public void a() {
        }

        public void b() {
        }

        public void c(int i) {
            b();
        }
    }

    public interface h {
    }

    public static class i {
    }

    public static abstract class j {
        public k a;
        public ArrayList<a> b;
        public long c;
        public long d;
        public long e;
        public long f;

        public interface a {
            void a();
        }

        public static class b {
            public int a;
            public int b;

            public final void a(b0 b0Var) {
                View view = b0Var.a;
                this.a = view.getLeft();
                this.b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void b(b0 b0Var) {
            RecyclerView recyclerView;
            int i = b0Var.j;
            if (b0Var.f() || (i & 4) != 0 || (recyclerView = b0Var.r) == null) {
                return;
            }
            recyclerView.J(b0Var);
        }

        public abstract boolean a(b0 b0Var, b0 b0Var2, b bVar, b bVar2);

        /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(androidx.recyclerview.widget.RecyclerView.b0 r10) {
            /*
                r9 = this;
                androidx.recyclerview.widget.RecyclerView$k r9 = r9.a
                if (r9 == 0) goto Laa
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                r0 = 1
                r10.n(r0)
                android.view.View r1 = r10.a
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r10.h
                r3 = 0
                if (r2 == 0) goto L17
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r10.i
                if (r2 != 0) goto L17
                r10.h = r3
            L17:
                r10.i = r3
                int r2 = r10.j
                r2 = r2 & 16
                if (r2 == 0) goto L21
                goto Laa
            L21:
                androidx.recyclerview.widget.RecyclerView$t r2 = r9.c
                r9.k0()
                androidx.recyclerview.widget.b r3 = r9.f
                androidx.recyclerview.widget.b$a r4 = r3.b
                androidx.recyclerview.widget.v r5 = r3.a
                int r6 = r3.d
                r7 = 0
                if (r6 != r0) goto L3d
                android.view.View r0 = r3.e
                if (r0 != r1) goto L37
            L35:
                r0 = r7
                goto L66
            L37:
                java.lang.String r9 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
                defpackage.r6.g(r9)
                return
            L3d:
                r8 = 2
                if (r6 == r8) goto La5
                r3.d = r8     // Catch: java.lang.Throwable -> L51
                androidx.recyclerview.widget.RecyclerView r6 = r5.a     // Catch: java.lang.Throwable -> L51
                int r6 = r6.indexOfChild(r1)     // Catch: java.lang.Throwable -> L51
                r8 = -1
                if (r6 != r8) goto L53
                r3.j(r1)     // Catch: java.lang.Throwable -> L51
            L4e:
                r3.d = r7
                goto L66
            L51:
                r9 = move-exception
                goto La2
            L53:
                boolean r8 = r4.d(r6)     // Catch: java.lang.Throwable -> L51
                if (r8 == 0) goto L63
                r4.f(r6)     // Catch: java.lang.Throwable -> L51
                r3.j(r1)     // Catch: java.lang.Throwable -> L51
                r5.a(r6)     // Catch: java.lang.Throwable -> L51
                goto L4e
            L63:
                r3.d = r7
                goto L35
            L66:
                if (r0 == 0) goto L91
                androidx.recyclerview.widget.RecyclerView$b0 r3 = androidx.recyclerview.widget.RecyclerView.M(r1)
                r2.l(r3)
                r2.i(r3)
                boolean r2 = androidx.recyclerview.widget.RecyclerView.r1
                if (r2 == 0) goto L91
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "after removing animated view: "
                r2.<init>(r3)
                r2.append(r1)
                java.lang.String r3 = ", "
                r2.append(r3)
                r2.append(r9)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "RecyclerView"
                android.util.Log.d(r3, r2)
            L91:
                r2 = r0 ^ 1
                r9.l0(r2)
                if (r0 != 0) goto Laa
                boolean r10 = r10.j()
                if (r10 == 0) goto Laa
                r9.removeDetachedView(r1, r7)
                return
            La2:
                r3.d = r7
                throw r9
            La5:
                java.lang.String r9 = "Cannot call removeViewIfHidden within removeViewIfHidden"
                defpackage.r6.g(r9)
            Laa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.j.c(androidx.recyclerview.widget.RecyclerView$b0):void");
        }

        public abstract void d(b0 b0Var);

        public abstract void e();

        public abstract boolean f();
    }

    public class k {
        public k() {
        }
    }

    public static abstract class l {
        public void c(Canvas canvas, RecyclerView recyclerView) {
        }

        public void d(Canvas canvas) {
        }
    }

    public static abstract class m {
        public androidx.recyclerview.widget.b a;
        public RecyclerView b;
        public final androidx.recyclerview.widget.b0 c;
        public final androidx.recyclerview.widget.b0 d;
        public androidx.recyclerview.widget.o e;
        public boolean f;
        public boolean g;
        public final boolean h;
        public final boolean i;
        public int j;
        public boolean k;
        public int l;
        public int m;
        public int n;
        public int o;

        public class a implements b0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final View a(int i) {
                return m.this.u(i);
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int b(View view) {
                return (view.getLeft() - ((n) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int c() {
                return m.this.B();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int d() {
                m mVar = m.this;
                return mVar.n - mVar.C();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int e(View view) {
                return view.getRight() + ((n) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements b0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final View a(int i) {
                return m.this.u(i);
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int b(View view) {
                return (view.getTop() - ((n) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int c() {
                return m.this.D();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int d() {
                m mVar = m.this;
                return mVar.o - mVar.A();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int e(View view) {
                return view.getBottom() + ((n) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).bottomMargin;
            }
        }

        public static class c {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public m() {
            a aVar = new a();
            b bVar = new b();
            this.c = new androidx.recyclerview.widget.b0(aVar);
            this.d = new androidx.recyclerview.widget.b0(bVar);
            this.f = false;
            this.g = false;
            this.h = true;
            this.i = true;
        }

        public static int E(View view) {
            return ((n) view.getLayoutParams()).a.b();
        }

        public static c F(Context context, AttributeSet attributeSet, int i, int i2) {
            c cVar = new c();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hac.a, i, i2);
            cVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
            cVar.b = typedArrayObtainStyledAttributes.getInt(10, 1);
            cVar.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            cVar.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return cVar;
        }

        public static boolean J(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public static void K(View view, int i, int i2, int i3, int i4) {
            n nVar = (n) view.getLayoutParams();
            Rect rect = nVar.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) nVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) nVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) nVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public static int g(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int w(int r4, int r5, int r6, boolean r7, int r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r7 == 0) goto L1d
                if (r8 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r8 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r8 = r5
                goto L30
            L1d:
                if (r8 < 0) goto L20
                goto L10
            L20:
                if (r8 != r1) goto L24
            L22:
                r8 = r4
                goto L30
            L24:
                if (r8 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r8 = r4
                r5 = r6
                goto L30
            L2e:
                r8 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.w(int, int, int, boolean, int):int");
        }

        public static void y(Rect rect, View view) {
            boolean z = RecyclerView.q1;
            n nVar = (n) view.getLayoutParams();
            Rect rect2 = nVar.b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public final int A() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int B() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int C() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int D() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int G(t tVar, x xVar) {
            return -1;
        }

        public final void H(Rect rect, View view) {
            Matrix matrix;
            Rect rect2 = ((n) view.getLayoutParams()).b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.d0;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean I() {
            return false;
        }

        public void L(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int iE = recyclerView.f.e();
                for (int i2 = 0; i2 < iE; i2++) {
                    recyclerView.f.d(i2).offsetLeftAndRight(i);
                }
            }
        }

        public void M(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int iE = recyclerView.f.e();
                for (int i2 = 0; i2 < iE; i2++) {
                    recyclerView.f.d(i2).offsetTopAndBottom(i);
                }
            }
        }

        public void N() {
        }

        @SuppressLint({"UnknownNullness"})
        public void O(RecyclerView recyclerView) {
        }

        public View P(View view, int i, t tVar, x xVar) {
            return null;
        }

        public void Q(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            t tVar = recyclerView.c;
            if (accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            e eVar = this.b.e0;
            if (eVar != null) {
                accessibilityEvent.setItemCount(eVar.c());
            }
        }

        public void R(t tVar, x xVar, t6 t6Var) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                t6Var.a(8192);
                t6Var.w(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                t6Var.a(4096);
                t6Var.w(true);
            }
            t6Var.p(t6.e.a(G(tVar, xVar), x(tVar, xVar), 0));
        }

        public final void S(t6 t6Var, View view) {
            b0 b0VarM = RecyclerView.M(view);
            if (b0VarM == null || b0VarM.h()) {
                return;
            }
            androidx.recyclerview.widget.b bVar = this.a;
            if (bVar.c.contains(b0VarM.a)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            T(recyclerView.c, recyclerView.X0, view, t6Var);
        }

        public void T(t tVar, x xVar, View view, t6 t6Var) {
        }

        public void U(int i, int i2) {
        }

        public void V() {
        }

        public void W(int i, int i2) {
        }

        public void X(int i, int i2) {
        }

        public void Y(int i, int i2) {
        }

        @SuppressLint({"UnknownNullness"})
        public void Z(t tVar, x xVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        @SuppressLint({"UnknownNullness"})
        public void a0(x xVar) {
        }

        public final void b(View view, int i, boolean z) {
            b0 b0VarM = RecyclerView.M(view);
            if (z || b0VarM.h()) {
                jfe<b0, c0.a> jfeVar = this.b.V.a;
                c0.a aVarA = jfeVar.get(b0VarM);
                if (aVarA == null) {
                    aVarA = c0.a.a();
                    jfeVar.put(b0VarM, aVarA);
                }
                aVarA.a |= 1;
            } else {
                this.b.V.c(b0VarM);
            }
            n nVar = (n) view.getLayoutParams();
            if (b0VarM.p() || b0VarM.i()) {
                if (b0VarM.i()) {
                    b0VarM.n.l(b0VarM);
                } else {
                    b0VarM.j &= -33;
                }
                this.a.b(view, i, view.getLayoutParams(), false);
            } else {
                ViewParent parent = view.getParent();
                RecyclerView recyclerView = this.b;
                androidx.recyclerview.widget.b bVar = this.a;
                if (parent == recyclerView) {
                    b.a aVar = bVar.b;
                    int iIndexOfChild = bVar.a.a.indexOfChild(view);
                    int iB = (iIndexOfChild == -1 || aVar.d(iIndexOfChild)) ? -1 : iIndexOfChild - aVar.b(iIndexOfChild);
                    if (i == -1) {
                        i = this.a.e();
                    }
                    if (iB == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.C());
                    }
                    if (iB != i) {
                        m mVar = this.b.f0;
                        View viewU = mVar.u(iB);
                        if (viewU == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + mVar.b.toString());
                        }
                        mVar.u(iB);
                        mVar.a.c(iB);
                        n nVar2 = (n) viewU.getLayoutParams();
                        b0 b0VarM2 = RecyclerView.M(viewU);
                        boolean zH = b0VarM2.h();
                        RecyclerView recyclerView2 = mVar.b;
                        if (zH) {
                            jfe<b0, c0.a> jfeVar2 = recyclerView2.V.a;
                            c0.a aVarA2 = jfeVar2.get(b0VarM2);
                            if (aVarA2 == null) {
                                aVarA2 = c0.a.a();
                                jfeVar2.put(b0VarM2, aVarA2);
                            }
                            aVarA2.a = 1 | aVarA2.a;
                        } else {
                            recyclerView2.V.c(b0VarM2);
                        }
                        mVar.a.b(viewU, i, nVar2, b0VarM2.h());
                    }
                } else {
                    bVar.a(view, i, false);
                    nVar.c = true;
                    androidx.recyclerview.widget.o oVar = this.e;
                    if (oVar != null && oVar.e) {
                        oVar.b.getClass();
                        b0 b0VarM3 = RecyclerView.M(view);
                        if ((b0VarM3 != null ? b0VarM3.b() : -1) == oVar.a) {
                            oVar.f = view;
                            if (RecyclerView.r1) {
                                Log.d("RecyclerView", "smooth scroll target view has been attached");
                            }
                        }
                    }
                }
            }
            if (nVar.d) {
                if (RecyclerView.r1) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + nVar.a);
                }
                b0VarM.a.invalidate();
                nVar.d = false;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void b0(Parcelable parcelable) {
        }

        @SuppressLint({"UnknownNullness"})
        public void c(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.k(str);
            }
        }

        public Parcelable c0() {
            return null;
        }

        public boolean d() {
            return false;
        }

        public void d0(int i) {
        }

        public boolean e() {
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[PHI: r3
  0x0062: PHI (r3v8 int) = (r3v5 int), (r3v11 int) binds: [B:28:0x007e, B:20:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean e0(androidx.recyclerview.widget.RecyclerView.t r3, androidx.recyclerview.widget.RecyclerView.x r4, int r5, android.os.Bundle r6) {
            /*
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r3 = r2.b
                r4 = 0
                if (r3 != 0) goto L7
                goto L8f
            L7:
                int r3 = r2.o
                int r6 = r2.n
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                androidx.recyclerview.widget.RecyclerView r1 = r2.b
                android.graphics.Matrix r1 = r1.getMatrix()
                boolean r1 = r1.isIdentity()
                if (r1 == 0) goto L2c
                androidx.recyclerview.widget.RecyclerView r1 = r2.b
                boolean r1 = r1.getGlobalVisibleRect(r0)
                if (r1 == 0) goto L2c
                int r3 = r0.height()
                int r6 = r0.width()
            L2c:
                r0 = 4096(0x1000, float:5.74E-42)
                r1 = 1
                if (r5 == r0) goto L64
                r0 = 8192(0x2000, float:1.14794E-41)
                if (r5 == r0) goto L38
                r3 = r4
                r5 = r3
                goto L8b
            L38:
                androidx.recyclerview.widget.RecyclerView r5 = r2.b
                r0 = -1
                boolean r5 = r5.canScrollVertically(r0)
                if (r5 == 0) goto L4d
                int r5 = r2.D()
                int r3 = r3 - r5
                int r5 = r2.A()
                int r3 = r3 - r5
                int r3 = -r3
                goto L4e
            L4d:
                r3 = r4
            L4e:
                androidx.recyclerview.widget.RecyclerView r5 = r2.b
                boolean r5 = r5.canScrollHorizontally(r0)
                if (r5 == 0) goto L62
                int r5 = r2.B()
                int r6 = r6 - r5
                int r5 = r2.C()
                int r6 = r6 - r5
                int r5 = -r6
                goto L8b
            L62:
                r5 = r4
                goto L8b
            L64:
                androidx.recyclerview.widget.RecyclerView r5 = r2.b
                boolean r5 = r5.canScrollVertically(r1)
                if (r5 == 0) goto L77
                int r5 = r2.D()
                int r3 = r3 - r5
                int r5 = r2.A()
                int r3 = r3 - r5
                goto L78
            L77:
                r3 = r4
            L78:
                androidx.recyclerview.widget.RecyclerView r5 = r2.b
                boolean r5 = r5.canScrollHorizontally(r1)
                if (r5 == 0) goto L62
                int r5 = r2.B()
                int r6 = r6 - r5
                int r5 = r2.C()
                int r5 = r6 - r5
            L8b:
                if (r3 != 0) goto L90
                if (r5 != 0) goto L90
            L8f:
                return r4
            L90:
                androidx.recyclerview.widget.RecyclerView r2 = r2.b
                r2.i0(r5, r3, r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.e0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x, int, android.os.Bundle):boolean");
        }

        public boolean f(n nVar) {
            return nVar != null;
        }

        public final void f0(t tVar) {
            for (int iV = v() - 1; iV >= 0; iV--) {
                if (!RecyclerView.M(u(iV)).o()) {
                    View viewU = u(iV);
                    i0(iV);
                    tVar.h(viewU);
                }
            }
        }

        public final void g0(t tVar) {
            ArrayList<b0> arrayList;
            int size = tVar.a.size();
            int i = size - 1;
            while (true) {
                arrayList = tVar.a;
                if (i < 0) {
                    break;
                }
                View view = arrayList.get(i).a;
                b0 b0VarM = RecyclerView.M(view);
                if (!b0VarM.o()) {
                    b0VarM.n(false);
                    if (b0VarM.j()) {
                        this.b.removeDetachedView(view, false);
                    }
                    j jVar = this.b.F0;
                    if (jVar != null) {
                        jVar.d(b0VarM);
                    }
                    b0VarM.n(true);
                    b0 b0VarM2 = RecyclerView.M(view);
                    b0VarM2.n = null;
                    b0VarM2.o = false;
                    b0VarM2.j &= -33;
                    tVar.i(b0VarM2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList<b0> arrayList2 = tVar.b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.b.invalidate();
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void h(int i, int i2, x xVar, m.b bVar) {
        }

        public final void h0(View view, t tVar) {
            androidx.recyclerview.widget.b bVar = this.a;
            androidx.recyclerview.widget.v vVar = bVar.a;
            int i = bVar.d;
            if (i == 1) {
                r6.g("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i == 2) {
                r6.g("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                bVar.d = 1;
                bVar.e = view;
                int iIndexOfChild = vVar.a.indexOfChild(view);
                if (iIndexOfChild >= 0) {
                    if (bVar.b.f(iIndexOfChild)) {
                        bVar.j(view);
                    }
                    vVar.a(iIndexOfChild);
                }
                bVar.d = 0;
                bVar.e = null;
                tVar.h(view);
            } catch (Throwable th) {
                bVar.d = 0;
                bVar.e = null;
                throw th;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void i(int i, m.b bVar) {
        }

        public final void i0(int i) {
            if (u(i) != null) {
                androidx.recyclerview.widget.b bVar = this.a;
                androidx.recyclerview.widget.v vVar = bVar.a;
                int i2 = bVar.d;
                if (i2 == 1) {
                    r6.g("Cannot call removeView(At) within removeView(At)");
                    return;
                }
                if (i2 == 2) {
                    r6.g("Cannot call removeView(At) within removeViewIfHidden");
                    return;
                }
                try {
                    int iF = bVar.f(i);
                    View childAt = vVar.a.getChildAt(iF);
                    if (childAt == null) {
                        bVar.d = 0;
                        bVar.e = null;
                        return;
                    }
                    bVar.d = 1;
                    bVar.e = childAt;
                    if (bVar.b.f(iF)) {
                        bVar.j(childAt);
                    }
                    vVar.a(iF);
                    bVar.d = 0;
                    bVar.e = null;
                } catch (Throwable th) {
                    bVar.d = 0;
                    bVar.e = null;
                    throw th;
                }
            }
        }

        public int j(x xVar) {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean j0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.B()
                int r1 = r8.D()
                int r2 = r8.n
                int r3 = r8.C()
                int r2 = r2 - r3
                int r3 = r8.o
                int r4 = r8.A()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.z()
                r7 = 1
                if (r3 != r7) goto L5c
                if (r2 == 0) goto L57
                goto L64
            L57:
                int r2 = java.lang.Math.max(r6, r10)
                goto L64
            L5c:
                if (r6 == 0) goto L5f
                goto L63
            L5f:
                int r6 = java.lang.Math.min(r4, r2)
            L63:
                r2 = r6
            L64:
                if (r1 == 0) goto L67
                goto L6b
            L67:
                int r1 = java.lang.Math.min(r5, r11)
            L6b:
                int[] r10 = new int[]{r2, r1}
                r11 = r10[r0]
                r10 = r10[r7]
                if (r13 == 0) goto Lae
                android.view.View r13 = r9.getFocusedChild()
                if (r13 != 0) goto L7c
                goto Lb3
            L7c:
                int r1 = r8.B()
                int r2 = r8.D()
                int r3 = r8.n
                int r4 = r8.C()
                int r3 = r3 - r4
                int r4 = r8.o
                int r5 = r8.A()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r8 = r8.b
                android.graphics.Rect r8 = r8.b0
                y(r8, r13)
                int r13 = r8.left
                int r13 = r13 - r11
                if (r13 >= r3) goto Lb3
                int r13 = r8.right
                int r13 = r13 - r11
                if (r13 <= r1) goto Lb3
                int r13 = r8.top
                int r13 = r13 - r10
                if (r13 >= r4) goto Lb3
                int r8 = r8.bottom
                int r8 = r8 - r10
                if (r8 > r2) goto Lae
                goto Lb3
            Lae:
                if (r11 != 0) goto Lb4
                if (r10 == 0) goto Lb3
                goto Lb4
            Lb3:
                return r0
            Lb4:
                if (r12 == 0) goto Lba
                r9.scrollBy(r11, r10)
                return r7
            Lba:
                r9.i0(r11, r10, r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.j0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public int k(x xVar) {
            return 0;
        }

        public final void k0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int l(x xVar) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public int l0(int i, t tVar, x xVar) {
            return 0;
        }

        public int m(x xVar) {
            return 0;
        }

        public void m0(int i) {
            if (RecyclerView.r1) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public int n(x xVar) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public int n0(int i, t tVar, x xVar) {
            return 0;
        }

        public int o(x xVar) {
            return 0;
        }

        public final void o0(RecyclerView recyclerView) {
            p0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void p(t tVar) {
            for (int iV = v() - 1; iV >= 0; iV--) {
                View viewU = u(iV);
                b0 b0VarM = RecyclerView.M(viewU);
                if (b0VarM.o()) {
                    if (RecyclerView.r1) {
                        Log.d("RecyclerView", "ignoring view " + b0VarM);
                    }
                } else if (!b0VarM.f() || b0VarM.h() || this.b.e0.b) {
                    u(iV);
                    this.a.c(iV);
                    tVar.j(viewU);
                    this.b.V.c(b0VarM);
                } else {
                    i0(iV);
                    tVar.i(b0VarM);
                }
            }
        }

        public final void p0(int i, int i2) {
            this.n = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.l = mode;
            if (mode == 0 && !RecyclerView.u1) {
                this.n = 0;
            }
            this.o = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.m = mode2;
            if (mode2 != 0 || RecyclerView.u1) {
                return;
            }
            this.o = 0;
        }

        public View q(int i) {
            int iV = v();
            for (int i2 = 0; i2 < iV; i2++) {
                View viewU = u(i2);
                b0 b0VarM = RecyclerView.M(viewU);
                if (b0VarM != null && b0VarM.b() == i && !b0VarM.o() && (this.b.X0.g || !b0VarM.h())) {
                    return viewU;
                }
            }
            return null;
        }

        public void q0(Rect rect, int i, int i2) {
            int iC = C() + B() + rect.width();
            int iA = A() + D() + rect.height();
            RecyclerView recyclerView = this.b;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            this.b.setMeasuredDimension(g(i, iC, recyclerView.getMinimumWidth()), g(i2, iA, this.b.getMinimumHeight()));
        }

        @SuppressLint({"UnknownNullness"})
        public abstract n r();

        public final void r0(int i, int i2) {
            int iV = v();
            if (iV == 0) {
                this.b.q(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < iV; i7++) {
                View viewU = u(i7);
                Rect rect = this.b.b0;
                y(rect, viewU);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.b.b0.set(i6, i4, i3, i5);
            q0(this.b.b0, i, i2);
        }

        @SuppressLint({"UnknownNullness"})
        public n s(Context context, AttributeSet attributeSet) {
            return new n(context, attributeSet);
        }

        public final void s0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.n = 0;
                this.o = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.f;
                this.n = recyclerView.getWidth();
                this.o = recyclerView.getHeight();
            }
            this.l = 1073741824;
            this.m = 1073741824;
        }

        @SuppressLint({"UnknownNullness"})
        public n t(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof n ? new n((n) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new n((ViewGroup.MarginLayoutParams) layoutParams) : new n(layoutParams);
        }

        public final boolean t0(View view, int i, int i2, n nVar) {
            return (!view.isLayoutRequested() && this.h && J(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) nVar).width) && J(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        public final View u(int i) {
            androidx.recyclerview.widget.b bVar = this.a;
            if (bVar != null) {
                return bVar.d(i);
            }
            return null;
        }

        public boolean u0() {
            return false;
        }

        public final int v() {
            androidx.recyclerview.widget.b bVar = this.a;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public final boolean v0(View view, int i, int i2, n nVar) {
            return (this.h && J(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) nVar).width) && J(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public void w0(RecyclerView recyclerView, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int x(t tVar, x xVar) {
            return -1;
        }

        @SuppressLint({"UnknownNullness"})
        public final void x0(androidx.recyclerview.widget.o oVar) {
            androidx.recyclerview.widget.o oVar2 = this.e;
            if (oVar2 != null && oVar != oVar2 && oVar2.e) {
                oVar2.d();
            }
            this.e = oVar;
            RecyclerView recyclerView = this.b;
            a0 a0Var = recyclerView.U0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.c.abortAnimation();
            if (oVar.h) {
                Log.w("RecyclerView", "An instance of " + oVar.getClass().getSimpleName() + " was started more than once. Each instance of" + oVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            oVar.b = recyclerView;
            oVar.c = this;
            int i = oVar.a;
            if (i == -1) {
                l5.q("Invalid target position");
                return;
            }
            recyclerView.X0.a = i;
            oVar.e = true;
            oVar.d = true;
            oVar.f = recyclerView.f0.q(i);
            oVar.b.U0.b();
            oVar.h = true;
        }

        public boolean y0() {
            return false;
        }

        public final int z() {
            RecyclerView recyclerView = this.b;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            return recyclerView.getLayoutDirection();
        }
    }

    public interface o {
        void a(View view);
    }

    public static abstract class p {
    }

    public interface q {
        void a(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent);
    }

    public static abstract class r {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class s {
        public SparseArray<a> a;
        public int b;
        public Set<e<?>> c;

        public static class a {
            public final ArrayList<b0> a = new ArrayList<>();
            public final int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public final a a(int i) {
            SparseArray<a> sparseArray = this.a;
            a aVar = sparseArray.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i, aVar2);
            return aVar2;
        }
    }

    public final class t {
        public final ArrayList<b0> a;
        public ArrayList<b0> b;
        public final ArrayList<b0> c;
        public final List<b0> d;
        public int e;
        public int f;
        public s g;

        public t() {
            ArrayList<b0> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList<>();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public final void a(b0 b0Var, boolean z) {
            RecyclerView.l(b0Var);
            View view = b0Var.a;
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.x xVar = recyclerView.e1;
            if (xVar != null) {
                x.a aVar = xVar.e;
                epg.o(view, aVar != null ? (y5) aVar.e.remove(view) : null);
            }
            if (z) {
                u uVar = recyclerView.g0;
                ArrayList arrayList = recyclerView.h0;
                if (uVar != null) {
                    uVar.a();
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((u) arrayList.get(i)).a();
                }
                e eVar = recyclerView.e0;
                if (eVar != null) {
                    eVar.m(b0Var);
                }
                if (recyclerView.X0 != null) {
                    recyclerView.V.d(b0Var);
                }
                if (RecyclerView.r1) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + b0Var);
                }
            }
            b0Var.s = null;
            b0Var.r = null;
            s sVarC = c();
            sVarC.getClass();
            int i2 = b0Var.f;
            ArrayList<b0> arrayList2 = sVarC.a(i2).a;
            if (sVarC.a.get(i2).b <= arrayList2.size()) {
                pnb.o(view);
            } else if (RecyclerView.q1 && arrayList2.contains(b0Var)) {
                l5.q("this scrap item already exists");
            } else {
                b0Var.m();
                arrayList2.add(b0Var);
            }
        }

        public final int b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            x xVar = recyclerView.X0;
            if (i >= 0 && i < xVar.b()) {
                return !xVar.g ? i : recyclerView.e.f(i, 0);
            }
            StringBuilder sbG = o6.g(i, "invalid position ", ". State item count is ");
            sbG.append(xVar.b());
            sbG.append(recyclerView.C());
            throw new IndexOutOfBoundsException(sbG.toString());
        }

        public final s c() {
            if (this.g == null) {
                s sVar = new s();
                sVar.a = new SparseArray<>();
                sVar.b = 0;
                sVar.c = Collections.newSetFromMap(new IdentityHashMap());
                this.g = sVar;
                d();
            }
            return this.g;
        }

        public final void d() {
            RecyclerView recyclerView;
            e<?> eVar;
            s sVar = this.g;
            if (sVar == null || (eVar = (recyclerView = RecyclerView.this).e0) == null || !recyclerView.l0) {
                return;
            }
            sVar.c.add(eVar);
        }

        public final void e(e<?> eVar, boolean z) {
            s sVar = this.g;
            if (sVar != null) {
                SparseArray<s.a> sparseArray = sVar.a;
                Set<e<?>> set = sVar.c;
                set.remove(eVar);
                if (set.size() != 0 || z) {
                    return;
                }
                for (int i = 0; i < sparseArray.size(); i++) {
                    ArrayList<b0> arrayList = sparseArray.get(sparseArray.keyAt(i)).a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        pnb.o(arrayList.get(i2).a);
                    }
                }
            }
        }

        public final void f() {
            ArrayList<b0> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                g(size);
            }
            arrayList.clear();
            if (RecyclerView.w1) {
                m.b bVar = RecyclerView.this.W0;
                int[] iArr = bVar.c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.d = 0;
            }
        }

        public final void g(int i) {
            if (RecyclerView.r1) {
                Log.d("RecyclerView", "Recycling cached view at index " + i);
            }
            ArrayList<b0> arrayList = this.c;
            b0 b0Var = arrayList.get(i);
            if (RecyclerView.r1) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + b0Var);
            }
            a(b0Var, true);
            arrayList.remove(i);
        }

        public final void h(View view) {
            b0 b0VarM = RecyclerView.M(view);
            boolean zJ = b0VarM.j();
            RecyclerView recyclerView = RecyclerView.this;
            if (zJ) {
                recyclerView.removeDetachedView(view, false);
            }
            if (b0VarM.i()) {
                b0VarM.n.l(b0VarM);
            } else if (b0VarM.p()) {
                b0VarM.j &= -33;
            }
            i(b0VarM);
            if (recyclerView.F0 == null || b0VarM.g()) {
                return;
            }
            recyclerView.F0.d(b0VarM);
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x00d4, code lost:
        
            r6 = r6 - 1;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void i(androidx.recyclerview.widget.RecyclerView.b0 r13) {
            /*
                Method dump skipped, instruction units count: 332
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.i(androidx.recyclerview.widget.RecyclerView$b0):void");
        }

        public final void j(View view) {
            j jVar;
            b0 b0VarM = RecyclerView.M(view);
            int i = b0VarM.j & 12;
            RecyclerView recyclerView = RecyclerView.this;
            if (i == 0 && b0VarM.k() && (jVar = recyclerView.F0) != null) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) jVar;
                if (b0VarM.c().isEmpty() && kVar.g && !b0VarM.f()) {
                    if (this.b == null) {
                        this.b = new ArrayList<>();
                    }
                    b0VarM.n = this;
                    b0VarM.o = true;
                    this.b.add(b0VarM);
                    return;
                }
            }
            if (b0VarM.f() && !b0VarM.h() && !recyclerView.e0.b) {
                l5.q("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.C()));
                return;
            }
            b0VarM.n = this;
            b0VarM.o = false;
            this.a.add(b0VarM);
        }

        /* JADX WARN: Removed duplicated region for block: B:120:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x023a  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0245  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x034e  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x0351  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x0400  */
        /* JADX WARN: Removed duplicated region for block: B:238:0x0412  */
        /* JADX WARN: Removed duplicated region for block: B:239:0x0415  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x0418  */
        /* JADX WARN: Removed duplicated region for block: B:249:0x0443  */
        /* JADX WARN: Removed duplicated region for block: B:251:0x0449  */
        /* JADX WARN: Removed duplicated region for block: B:269:0x0497  */
        /* JADX WARN: Removed duplicated region for block: B:275:0x04ae  */
        /* JADX WARN: Removed duplicated region for block: B:347:0x05d8  */
        /* JADX WARN: Removed duplicated region for block: B:348:0x05e2  */
        /* JADX WARN: Removed duplicated region for block: B:354:0x05f8 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:356:0x05fc  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.recyclerview.widget.RecyclerView.b0 k(int r29, long r30) {
            /*
                Method dump skipped, instruction units count: 1570
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.k(int, long):androidx.recyclerview.widget.RecyclerView$b0");
        }

        public final void l(b0 b0Var) {
            if (b0Var.o) {
                this.b.remove(b0Var);
            } else {
                this.a.remove(b0Var);
            }
            b0Var.n = null;
            b0Var.o = false;
            b0Var.j &= -33;
        }

        public final void m() {
            m mVar = RecyclerView.this.f0;
            this.f = this.e + (mVar != null ? mVar.j : 0);
            ArrayList<b0> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
                g(size);
            }
        }
    }

    public interface u {
        void a();
    }

    public class v extends g {
        public v() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.k(null);
            recyclerView.X0.f = true;
            recyclerView.Y(true);
            if (recyclerView.e.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.k(null);
            androidx.recyclerview.widget.a aVar = recyclerView.e;
            ArrayList<a.C0075a> arrayList = aVar.b;
            arrayList.add(aVar.h(4, i, 1));
            aVar.f |= 4;
            if (arrayList.size() == 1) {
                if (!RecyclerView.v1 || !recyclerView.m0 || !recyclerView.l0) {
                    recyclerView.t0 = true;
                    recyclerView.requestLayout();
                } else {
                    a aVar2 = recyclerView.a0;
                    WeakHashMap<View, prg> weakHashMap = epg.a;
                    recyclerView.postOnAnimation(aVar2);
                }
            }
        }
    }

    public static abstract class w {
        public int a = -1;
        public RecyclerView b;
        public m c;
        public boolean d;
        public boolean e;
        public View f;
        public final a g;
        public boolean h;

        public static class a {
            public int a;
            public int b;
            public int c;
            public int d;
            public Interpolator e;
            public boolean f;
            public int g;

            public final void a(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.Q(i);
                    this.f = false;
                    return;
                }
                if (!this.f) {
                    this.g = 0;
                    return;
                }
                Interpolator interpolator = this.e;
                if (interpolator != null && this.c < 1) {
                    r6.g("If you provide an interpolator, you must set a positive duration");
                    return;
                }
                int i2 = this.c;
                if (i2 < 1) {
                    r6.g("Scroll duration must be a positive number");
                    return;
                }
                recyclerView.U0.c(this.a, this.b, i2, interpolator);
                int i3 = this.g + 1;
                this.g = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f = false;
            }
        }

        public interface b {
            PointF a(int i);
        }

        public w() {
            a aVar = new a();
            aVar.d = -1;
            aVar.f = false;
            aVar.g = 0;
            aVar.a = 0;
            aVar.b = 0;
            aVar.c = Integer.MIN_VALUE;
            aVar.e = null;
            this.g = aVar;
        }

        public final PointF a(int i) {
            Object obj = this.c;
            if (obj instanceof b) {
                return ((b) obj).a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(int r9, int r10) {
            /*
                Method dump skipped, instruction units count: 280
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.b(int, int):void");
        }

        public abstract void c(View view, a aVar);

        public final void d() {
            if (this.e) {
                this.e = false;
                androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) this;
                oVar.p = 0;
                oVar.o = 0;
                oVar.k = null;
                this.b.X0.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                m mVar = this.c;
                if (mVar.e == this) {
                    mVar.e = null;
                }
                this.c = null;
                this.b = null;
            }
        }
    }

    public static class x {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public int l;
        public long m;
        public int n;

        public final void a(int i) {
            if ((this.d & i) != 0) {
                return;
            }
            r40.i("Layout state should be one of ", Integer.toBinaryString(i), " but it is ", Integer.toBinaryString(this.d));
        }

        public final int b() {
            return this.g ? this.b - this.c : this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.a);
            sb.append(", mData=null, mItemCount=");
            sb.append(this.e);
            sb.append(", mIsMeasuring=");
            sb.append(this.i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.c);
            sb.append(", mStructureChanged=");
            sb.append(this.f);
            sb.append(", mInPreLayout=");
            sb.append(this.g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.j);
            sb.append(", mRunPredictiveAnimations=");
            return m6.i(sb, this.k, '}');
        }
    }

    public static class y extends i {
    }

    public static abstract class z {
    }

    static {
        Class cls = Integer.TYPE;
        x1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        y1 = new c();
        z1 = new y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context context, AttributeSet attributeSet, int i2) throws NoSuchMethodException {
        char c2;
        char c3;
        char c4;
        TypedArray typedArray;
        int i3;
        Object[] objArr;
        Constructor constructor;
        super(context, attributeSet, i2);
        this.b = new v();
        this.c = new t();
        this.V = new c0();
        this.a0 = new a();
        this.b0 = new Rect();
        this.c0 = new Rect();
        this.d0 = new RectF();
        this.h0 = new ArrayList();
        this.i0 = new ArrayList<>();
        this.j0 = new ArrayList<>();
        this.o0 = 0;
        this.w0 = false;
        this.x0 = false;
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = z1;
        androidx.recyclerview.widget.k kVar = new androidx.recyclerview.widget.k();
        kVar.a = null;
        kVar.b = new ArrayList<>();
        kVar.c = 120L;
        kVar.d = 120L;
        kVar.e = 250L;
        kVar.f = 250L;
        kVar.g = true;
        kVar.h = new ArrayList<>();
        kVar.i = new ArrayList<>();
        kVar.j = new ArrayList<>();
        kVar.k = new ArrayList<>();
        kVar.l = new ArrayList<>();
        kVar.m = new ArrayList<>();
        kVar.n = new ArrayList<>();
        kVar.o = new ArrayList<>();
        kVar.p = new ArrayList<>();
        kVar.q = new ArrayList<>();
        kVar.r = new ArrayList<>();
        this.F0 = kVar;
        this.G0 = 0;
        this.H0 = -1;
        this.R0 = Float.MIN_VALUE;
        this.S0 = Float.MIN_VALUE;
        this.T0 = true;
        this.U0 = new a0();
        this.W0 = w1 ? new m.b() : null;
        x xVar = new x();
        xVar.a = -1;
        xVar.b = 0;
        xVar.c = 0;
        xVar.d = 1;
        xVar.e = 0;
        xVar.f = false;
        xVar.g = false;
        xVar.h = false;
        xVar.i = false;
        xVar.j = false;
        xVar.k = false;
        this.X0 = xVar;
        this.a1 = false;
        this.b1 = false;
        k kVar2 = new k();
        this.c1 = kVar2;
        this.d1 = false;
        this.f1 = new int[2];
        this.h1 = new int[2];
        this.i1 = new int[2];
        this.j1 = new int[2];
        this.k1 = new ArrayList();
        this.l1 = new b();
        this.n1 = 0;
        this.o1 = 0;
        this.p1 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.N0 = viewConfiguration.getScaledTouchSlop();
        this.R0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.S0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.P0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.Q0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.F0.a = kVar2;
        this.e = new androidx.recyclerview.widget.a(new androidx.recyclerview.widget.w(this));
        this.f = new androidx.recyclerview.widget.b(new androidx.recyclerview.widget.v(this));
        WeakHashMap<View, prg> weakHashMap = epg.a;
        if (epg.g.a(this) == 0) {
            epg.g.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.u0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.x(this));
        int[] iArr = hac.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        epg.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.W = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                l5.q("Trying to set fast scroller without both required drawables.".concat(C()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c2 = 3;
            c4 = 2;
            c3 = 1;
            typedArray = typedArrayObtainStyledAttributes;
            i3 = 4;
            new androidx.recyclerview.widget.l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.indeed.android.jobsearch.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.indeed.android.jobsearch.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.indeed.android.jobsearch.R.dimen.fastscroll_margin));
        } else {
            c2 = 3;
            c3 = 1;
            c4 = 2;
            typedArray = typedArrayObtainStyledAttributes;
            i3 = 4;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + JwtParser.SEPARATOR_CHAR + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(m.class);
                    try {
                        Constructor constructor2 = clsAsSubclass.getConstructor(x1);
                        objArr = new Object[i3];
                        objArr[0] = context;
                        objArr[c3] = attributeSet;
                        objArr[c4] = Integer.valueOf(i2);
                        objArr[c2] = 0;
                        constructor = constructor2;
                    } catch (NoSuchMethodException e2) {
                        try {
                            objArr = null;
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e3);
                        }
                    }
                    constructor.setAccessible(c3);
                    setLayoutManager((m) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    s6.h(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e4);
                    throw null;
                } catch (ClassNotFoundException e5) {
                    s6.h(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e5);
                    throw null;
                } catch (IllegalAccessException e6) {
                    s6.h(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e6);
                    throw null;
                } catch (InstantiationException e7) {
                    s6.h(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                } catch (InvocationTargetException e8) {
                    s6.h(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e8);
                    throw null;
                }
            }
        }
        int[] iArr2 = s1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        epg.n(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i2);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(com.indeed.android.jobsearch.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewH = H(viewGroup.getChildAt(i2));
            if (recyclerViewH != null) {
                return recyclerViewH;
            }
        }
        return null;
    }

    public static b0 M(View view) {
        if (view == null) {
            return null;
        }
        return ((n) view.getLayoutParams()).a;
    }

    private cfa getScrollingChildHelper() {
        if (this.g1 == null) {
            this.g1 = new cfa(this);
        }
        return this.g1;
    }

    public static void l(b0 b0Var) {
        WeakReference<RecyclerView> weakReference = b0Var.b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == b0Var.a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            b0Var.b = null;
        }
    }

    public static int o(int i2, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i3) {
        if (i2 > 0 && edgeEffect != null && cf4.a(edgeEffect) != 0.0f) {
            int iRound = Math.round(cf4.b(edgeEffect, ((-i2) * 4.0f) / i3, 0.5f) * ((-i3) / 4.0f));
            if (iRound != i2) {
                edgeEffect.finish();
            }
            return i2 - iRound;
        }
        if (i2 >= 0 || edgeEffect2 == null || cf4.a(edgeEffect2) == 0.0f) {
            return i2;
        }
        float f2 = i3;
        int iRound2 = Math.round(cf4.b(edgeEffect2, (i2 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
        if (iRound2 != i2) {
            edgeEffect2.finish();
        }
        return i2 - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        q1 = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        r1 = z2;
    }

    public final void A() {
        if (this.D0 != null) {
            return;
        }
        ((y) this.A0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.D0 = edgeEffect;
        if (this.W) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.C0 != null) {
            return;
        }
        ((y) this.A0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.C0 = edgeEffect;
        if (this.W) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.e0 + ", layout:" + this.f0 + ", context:" + getContext();
    }

    public final void D(x xVar) {
        if (getScrollState() != 2) {
            xVar.getClass();
            return;
        }
        OverScroller overScroller = this.U0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        xVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean F(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<q> arrayList = this.j0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            q qVar = arrayList.get(i2);
            if (qVar.b(motionEvent) && action != 3) {
                this.k0 = qVar;
                return true;
            }
        }
        return false;
    }

    public final void G(int[] iArr) {
        androidx.recyclerview.widget.b bVar = this.f;
        int iE = bVar.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < iE; i4++) {
            b0 b0VarM = M(bVar.d(i4));
            if (!b0VarM.o()) {
                int iB = b0VarM.b();
                if (iB < i2) {
                    i2 = iB;
                }
                if (iB > i3) {
                    i3 = iB;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public final b0 I(int i2) {
        b0 b0Var = null;
        if (this.w0) {
            return null;
        }
        androidx.recyclerview.widget.b bVar = this.f;
        int iH = bVar.h();
        for (int i3 = 0; i3 < iH; i3++) {
            b0 b0VarM = M(bVar.g(i3));
            if (b0VarM != null && !b0VarM.h() && J(b0VarM) == i2) {
                if (!bVar.c.contains(b0VarM.a)) {
                    return b0VarM;
                }
                b0Var = b0VarM;
            }
        }
        return b0Var;
    }

    public final int J(b0 b0Var) {
        if ((b0Var.j & 524) == 0 && b0Var.e()) {
            int i2 = b0Var.c;
            ArrayList<a.C0075a> arrayList = this.e.b;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                a.C0075a c0075a = arrayList.get(i3);
                int i4 = c0075a.a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = c0075a.b;
                        if (i5 <= i2) {
                            int i6 = c0075a.c;
                            if (i5 + i6 <= i2) {
                                i2 -= i6;
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i7 = c0075a.b;
                        if (i7 == i2) {
                            i2 = c0075a.c;
                        } else {
                            if (i7 < i2) {
                                i2--;
                            }
                            if (c0075a.c <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (c0075a.b <= i2) {
                    i2 += c0075a.c;
                }
            }
            return i2;
        }
        return -1;
    }

    public final long K(b0 b0Var) {
        return this.e0.b ? b0Var.e : b0Var.c;
    }

    public final b0 L(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return M(view);
        }
        h5.m("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect N(View view) {
        n nVar = (n) view.getLayoutParams();
        boolean z2 = nVar.c;
        Rect rect = nVar.b;
        if (!z2 || (this.X0.g && (nVar.a.k() || nVar.a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<l> arrayList = this.i0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Rect rect2 = this.b0;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i2).getClass();
            ((n) view.getLayoutParams()).a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        nVar.c = false;
        return rect;
    }

    public final boolean O() {
        return !this.n0 || this.w0 || this.e.g();
    }

    public final boolean P() {
        return this.y0 > 0;
    }

    public final void Q(int i2) {
        if (this.f0 == null) {
            return;
        }
        setScrollState(2);
        this.f0.m0(i2);
        awakenScrollBars();
    }

    public final void R() {
        androidx.recyclerview.widget.b bVar = this.f;
        int iH = bVar.h();
        for (int i2 = 0; i2 < iH; i2++) {
            ((n) bVar.g(i2).getLayoutParams()).c = true;
        }
        ArrayList<b0> arrayList = this.c.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = (n) arrayList.get(i3).a.getLayoutParams();
            if (nVar != null) {
                nVar.c = true;
            }
        }
    }

    public final void S(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        androidx.recyclerview.widget.b bVar = this.f;
        int iH = bVar.h();
        for (int i5 = 0; i5 < iH; i5++) {
            b0 b0VarM = M(bVar.g(i5));
            if (b0VarM != null && !b0VarM.o()) {
                int i6 = b0VarM.c;
                x xVar = this.X0;
                if (i6 >= i4) {
                    if (r1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i5 + " holder " + b0VarM + " now at position " + (b0VarM.c - i3));
                    }
                    b0VarM.l(-i3, z2);
                    xVar.f = true;
                } else if (i6 >= i2) {
                    if (r1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i5 + " holder " + b0VarM + " now REMOVED");
                    }
                    b0VarM.a(8);
                    b0VarM.l(-i3, z2);
                    b0VarM.c = i2 - 1;
                    xVar.f = true;
                }
            }
        }
        t tVar = this.c;
        ArrayList<b0> arrayList = tVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0 b0Var = arrayList.get(size);
            if (b0Var != null) {
                int i7 = b0Var.c;
                if (i7 >= i4) {
                    if (r1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + b0Var + " now at position " + (b0Var.c - i3));
                    }
                    b0Var.l(-i3, z2);
                } else if (i7 >= i2) {
                    b0Var.a(8);
                    tVar.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void T() {
        this.y0++;
    }

    public final void U(boolean z2) {
        int i2;
        AccessibilityManager accessibilityManager;
        int i3 = this.y0 - 1;
        this.y0 = i3;
        if (i3 < 1) {
            if (q1 && i3 < 0) {
                r6.g("layout or scroll counter cannot go below zero.Some calls are not matching".concat(C()));
                return;
            }
            this.y0 = 0;
            if (z2) {
                int i4 = this.s0;
                this.s0 = 0;
                if (i4 != 0 && (accessibilityManager = this.u0) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i4);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.k1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b0 b0Var = (b0) arrayList.get(size);
                    if (b0Var.a.getParent() == this && !b0Var.o() && (i2 = b0Var.q) != -1) {
                        View view = b0Var.a;
                        WeakHashMap<View, prg> weakHashMap = epg.a;
                        view.setImportantForAccessibility(i2);
                        b0Var.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.H0 = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.L0 = x2;
            this.J0 = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.M0 = y2;
            this.K0 = y2;
        }
    }

    public final void W() {
        if (this.d1 || !this.l0) {
            return;
        }
        WeakHashMap<View, prg> weakHashMap = epg.a;
        postOnAnimation(this.l1);
        this.d1 = true;
    }

    public final void X() {
        boolean z2;
        boolean z3 = this.w0;
        androidx.recyclerview.widget.a aVar = this.e;
        boolean z4 = false;
        if (z3) {
            aVar.k(aVar.b);
            aVar.k(aVar.c);
            aVar.f = 0;
            if (this.x0) {
                this.f0.V();
            }
        }
        if (this.F0 != null && this.f0.y0()) {
            aVar.j();
        } else {
            aVar.c();
        }
        boolean z5 = this.a1 || this.b1;
        boolean z6 = this.n0 && this.F0 != null && ((z2 = this.w0) || z5 || this.f0.f) && (!z2 || this.e0.b);
        x xVar = this.X0;
        xVar.j = z6;
        if (z6 && z5 && !this.w0 && this.F0 != null && this.f0.y0()) {
            z4 = true;
        }
        xVar.k = z4;
    }

    public final void Y(boolean z2) {
        this.x0 = z2 | this.x0;
        this.w0 = true;
        androidx.recyclerview.widget.b bVar = this.f;
        int iH = bVar.h();
        for (int i2 = 0; i2 < iH; i2++) {
            b0 b0VarM = M(bVar.g(i2));
            if (b0VarM != null && !b0VarM.o()) {
                b0VarM.a(6);
            }
        }
        R();
        t tVar = this.c;
        ArrayList<b0> arrayList = tVar.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            b0 b0Var = arrayList.get(i3);
            if (b0Var != null) {
                b0Var.a(6);
                b0Var.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            }
        }
        e eVar = RecyclerView.this.e0;
        if (eVar == null || !eVar.b) {
            tVar.f();
        }
    }

    public final void Z(b0 b0Var, j.b bVar) {
        b0Var.j &= -8193;
        boolean z2 = this.X0.h;
        c0 c0Var = this.V;
        if (z2 && b0Var.k() && !b0Var.h() && !b0Var.o()) {
            c0Var.b.h(b0Var, K(b0Var));
        }
        jfe<b0, c0.a> jfeVar = c0Var.a;
        c0.a aVarA = jfeVar.get(b0Var);
        if (aVarA == null) {
            aVarA = c0.a.a();
            jfeVar.put(b0Var, aVarA);
        }
        aVarA.b = bVar;
        aVarA.a |= 4;
    }

    public final int a0(float f2, int i2) {
        float height = f2 / getHeight();
        float width = i2 / getWidth();
        EdgeEffect edgeEffect = this.B0;
        float f3 = 0.0f;
        if (edgeEffect == null || cf4.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.D0;
            if (edgeEffect2 != null && cf4.a(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.D0;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fB = cf4.b(edgeEffect3, width, height);
                    if (cf4.a(this.D0) == 0.0f) {
                        this.D0.onRelease();
                    }
                    f3 = fB;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.B0;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -cf4.b(edgeEffect4, -width, 1.0f - height);
                if (cf4.a(this.B0) == 0.0f) {
                    this.B0.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        m mVar = this.f0;
        if (mVar != null) {
            mVar.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final int b0(float f2, int i2) {
        float width = f2 / getWidth();
        float height = i2 / getHeight();
        EdgeEffect edgeEffect = this.C0;
        float f3 = 0.0f;
        if (edgeEffect == null || cf4.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.E0;
            if (edgeEffect2 != null && cf4.a(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.E0;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fB = cf4.b(edgeEffect3, height, 1.0f - width);
                    if (cf4.a(this.E0) == 0.0f) {
                        this.E0.onRelease();
                    }
                    f3 = fB;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.C0;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -cf4.b(edgeEffect4, -height, width);
                if (cf4.a(this.C0) == 0.0f) {
                    this.C0.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    public final void c0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.b0;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n) {
            n nVar = (n) layoutParams;
            if (!nVar.c) {
                Rect rect2 = nVar.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f0.j0(this, view, this.b0, !this.n0, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof n) && this.f0.f((n) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        m mVar = this.f0;
        if (mVar != null && mVar.d()) {
            return this.f0.j(this.X0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        m mVar = this.f0;
        if (mVar != null && mVar.d()) {
            return this.f0.k(this.X0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        m mVar = this.f0;
        if (mVar != null && mVar.d()) {
            return this.f0.l(this.X0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        m mVar = this.f0;
        if (mVar != null && mVar.e()) {
            return this.f0.m(this.X0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        m mVar = this.f0;
        if (mVar != null && mVar.e()) {
            return this.f0.n(this.X0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        m mVar = this.f0;
        if (mVar != null && mVar.e()) {
            return this.f0.o(this.X0);
        }
        return 0;
    }

    public final void d0() {
        VelocityTracker velocityTracker = this.I0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m0(0);
        EdgeEffect edgeEffect = this.B0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.B0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.C0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.C0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.D0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.D0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.E0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.E0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList<l> arrayList = this.i0;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).d(canvas);
        }
        EdgeEffect edgeEffect = this.B0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.W ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.B0;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.C0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.W) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.C0;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.D0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.W ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.D0;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.E0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.W) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.E0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.F0 == null || arrayList.size() <= 0 || !this.F0.f()) ? z2 : true) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e0(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.e0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void f0(int i2, int i3, int[] iArr) {
        b0 b0Var;
        k0();
        T();
        int i4 = lpf.a;
        Trace.beginSection("RV Scroll");
        x xVar = this.X0;
        D(xVar);
        t tVar = this.c;
        int iL0 = i2 != 0 ? this.f0.l0(i2, tVar, xVar) : 0;
        int iN0 = i3 != 0 ? this.f0.n0(i3, tVar, xVar) : 0;
        Trace.endSection();
        androidx.recyclerview.widget.b bVar = this.f;
        int iE = bVar.e();
        for (int i5 = 0; i5 < iE; i5++) {
            View viewD = bVar.d(i5);
            b0 b0VarL = L(viewD);
            if (b0VarL != null && (b0Var = b0VarL.i) != null) {
                View view = b0Var.a;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        U(true);
        l0(false);
        if (iArr != null) {
            iArr[0] = iL0;
            iArr[1] = iN0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(int i2) {
        androidx.recyclerview.widget.o oVar;
        if (this.q0) {
            return;
        }
        setScrollState(0);
        a0 a0Var = this.U0;
        RecyclerView.this.removeCallbacks(a0Var);
        a0Var.c.abortAnimation();
        m mVar = this.f0;
        if (mVar != null && (oVar = mVar.e) != null) {
            oVar.d();
        }
        m mVar2 = this.f0;
        if (mVar2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            mVar2.m0(i2);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.f0;
        if (mVar != null) {
            return mVar.r();
        }
        r6.g("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.f0;
        if (mVar != null) {
            return mVar.s(getContext(), attributeSet);
        }
        r6.g("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e getAdapter() {
        return this.e0;
    }

    @Override // android.view.View
    public int getBaseline() {
        m mVar = this.f0;
        if (mVar == null) {
            return super.getBaseline();
        }
        mVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.W;
    }

    public androidx.recyclerview.widget.x getCompatAccessibilityDelegate() {
        return this.e1;
    }

    public i getEdgeEffectFactory() {
        return this.A0;
    }

    public j getItemAnimator() {
        return this.F0;
    }

    public int getItemDecorationCount() {
        return this.i0.size();
    }

    public m getLayoutManager() {
        return this.f0;
    }

    public int getMaxFlingVelocity() {
        return this.Q0;
    }

    public int getMinFlingVelocity() {
        return this.P0;
    }

    public long getNanoTime() {
        if (w1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public p getOnFlingListener() {
        return this.O0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.T0;
    }

    public s getRecycledViewPool() {
        return this.c.c();
    }

    public int getScrollState() {
        return this.G0;
    }

    public final void h(b0 b0Var) {
        View view = b0Var.a;
        boolean z2 = view.getParent() == this;
        this.c.l(L(view));
        boolean zJ = b0Var.j();
        androidx.recyclerview.widget.b bVar = this.f;
        if (zJ) {
            bVar.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            bVar.a(view, -1, true);
            return;
        }
        int iIndexOfChild = bVar.a.a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            akb.o(view, "view is not a child, cannot hide ");
        } else {
            bVar.b.h(iIndexOfChild);
            bVar.i(view);
        }
    }

    public final boolean h0(EdgeEffect edgeEffect, int i2, int i3) {
        if (i2 > 0) {
            return true;
        }
        float fA = cf4.a(edgeEffect) * i3;
        float fAbs = Math.abs(-i2) * 0.35f;
        float f2 = this.a * 0.015f;
        double dLog = Math.log(fAbs / f2);
        double d2 = t1;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f2))) < fA;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(l lVar) {
        m mVar = this.f0;
        if (mVar != null) {
            mVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<l> arrayList = this.i0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(lVar);
        R();
        requestLayout();
    }

    public final void i0(int i2, int i3, boolean z2) {
        m mVar = this.f0;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.q0) {
            return;
        }
        if (!mVar.d()) {
            i2 = 0;
        }
        if (!this.f0.e()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (z2) {
            int i4 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i4 |= 2;
            }
            getScrollingChildHelper().g(i4, 1);
        }
        this.U0.c(i2, i3, Integer.MIN_VALUE, null);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.l0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.q0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(r rVar) {
        if (this.Z0 == null) {
            this.Z0 = new ArrayList();
        }
        this.Z0.add(rVar);
    }

    public final void j0(int i2) {
        if (this.q0) {
            return;
        }
        m mVar = this.f0;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            mVar.w0(this, i2);
        }
    }

    public final void k(String str) {
        if (!P()) {
            if (this.z0 > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(C()));
            }
        } else if (str == null) {
            r6.g("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(C()));
        } else {
            r6.g(str);
        }
    }

    public final void k0() {
        int i2 = this.o0 + 1;
        this.o0 = i2;
        if (i2 != 1 || this.q0) {
            return;
        }
        this.p0 = false;
    }

    public final void l0(boolean z2) {
        if (this.o0 < 1) {
            if (q1) {
                r6.g("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(C()));
                return;
            }
            this.o0 = 1;
        }
        if (!z2 && !this.q0) {
            this.p0 = false;
        }
        if (this.o0 == 1) {
            if (z2 && this.p0 && !this.q0 && this.f0 != null && this.e0 != null) {
                s();
            }
            if (!this.q0) {
                this.p0 = false;
            }
        }
        this.o0--;
    }

    public final void m() {
        androidx.recyclerview.widget.b bVar = this.f;
        int iH = bVar.h();
        for (int i2 = 0; i2 < iH; i2++) {
            b0 b0VarM = M(bVar.g(i2));
            if (!b0VarM.o()) {
                b0VarM.d = -1;
                b0VarM.g = -1;
            }
        }
        t tVar = this.c;
        ArrayList<b0> arrayList = tVar.a;
        ArrayList<b0> arrayList2 = tVar.c;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            b0 b0Var = arrayList2.get(i3);
            b0Var.d = -1;
            b0Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            b0 b0Var2 = arrayList.get(i4);
            b0Var2.d = -1;
            b0Var2.g = -1;
        }
        ArrayList<b0> arrayList3 = tVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                b0 b0Var3 = tVar.b.get(i5);
                b0Var3.d = -1;
                b0Var3.g = -1;
            }
        }
    }

    public final void m0(int i2) {
        getScrollingChildHelper().h(i2);
    }

    public final void n(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.B0;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.B0.onRelease();
            zIsFinished = this.B0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.D0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.D0.onRelease();
            zIsFinished |= this.D0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.C0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.C0.onRelease();
            zIsFinished |= this.C0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.E0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.E0.onRelease();
            zIsFinished |= this.E0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.y0 = r0
            r1 = 1
            r5.l0 = r1
            boolean r2 = r5.n0
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.n0 = r2
            androidx.recyclerview.widget.RecyclerView$t r2 = r5.c
            r2.d()
            androidx.recyclerview.widget.RecyclerView$m r2 = r5.f0
            if (r2 == 0) goto L23
            r2.g = r1
        L23:
            r5.d1 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.w1
            if (r0 == 0) goto L7b
            java.lang.ThreadLocal<androidx.recyclerview.widget.m> r0 = androidx.recyclerview.widget.m.e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.m r1 = (androidx.recyclerview.widget.m) r1
            r5.V0 = r1
            if (r1 != 0) goto L63
            androidx.recyclerview.widget.m r1 = new androidx.recyclerview.widget.m
            r1.<init>()
            r5.V0 = r1
            java.util.WeakHashMap<android.view.View, prg> r1 = defpackage.epg.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L55
            if (r1 == 0) goto L55
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L55
            goto L57
        L55:
            r1 = 1114636288(0x42700000, float:60.0)
        L57:
            androidx.recyclerview.widget.m r2 = r5.V0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L63:
            androidx.recyclerview.widget.m r0 = r5.V0
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.a
            boolean r1 = androidx.recyclerview.widget.RecyclerView.q1
            if (r1 == 0) goto L78
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L72
            goto L78
        L72:
            java.lang.String r5 = "RecyclerView already present in worker list!"
            defpackage.r6.g(r5)
            return
        L78:
            r0.add(r5)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        androidx.recyclerview.widget.m mVar;
        androidx.recyclerview.widget.o oVar;
        super.onDetachedFromWindow();
        j jVar = this.F0;
        if (jVar != null) {
            jVar.e();
        }
        int i2 = 0;
        setScrollState(0);
        a0 a0Var = this.U0;
        RecyclerView.this.removeCallbacks(a0Var);
        a0Var.c.abortAnimation();
        m mVar2 = this.f0;
        if (mVar2 != null && (oVar = mVar2.e) != null) {
            oVar.d();
        }
        this.l0 = false;
        m mVar3 = this.f0;
        if (mVar3 != null) {
            mVar3.g = false;
            mVar3.O(this);
        }
        this.k1.clear();
        removeCallbacks(this.l1);
        this.V.getClass();
        while (c0.a.d.acquire() != null) {
        }
        t tVar = this.c;
        ArrayList<b0> arrayList = tVar.c;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            pnb.o(arrayList.get(i3).a);
        }
        tVar.e(RecyclerView.this.e0, false);
        while (i2 < getChildCount()) {
            int i4 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt == null) {
                k20.o();
                return;
            }
            ArrayList<lgb> arrayList2 = pnb.C(childAt).a;
            for (int iJ = u63.J(arrayList2); -1 < iJ; iJ--) {
                arrayList2.get(iJ).a();
            }
            i2 = i4;
        }
        if (!w1 || (mVar = this.V0) == null) {
            return;
        }
        boolean zRemove = mVar.a.remove(this);
        if (!q1 || zRemove) {
            this.V0 = null;
        } else {
            r6.g("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<l> arrayList = this.i0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).c(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (!this.q0) {
            this.k0 = null;
            if (F(motionEvent)) {
                d0();
                setScrollState(0);
                return true;
            }
            m mVar = this.f0;
            if (mVar != null) {
                boolean zD = mVar.d();
                boolean zE = this.f0.e();
                if (this.I0 == null) {
                    this.I0 = VelocityTracker.obtain();
                }
                this.I0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.r0) {
                        this.r0 = false;
                    }
                    this.H0 = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.L0 = x2;
                    this.J0 = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.M0 = y2;
                    this.K0 = y2;
                    EdgeEffect edgeEffect = this.B0;
                    if (edgeEffect == null || cf4.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z2 = false;
                    } else {
                        cf4.b(this.B0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z2 = true;
                    }
                    EdgeEffect edgeEffect2 = this.D0;
                    boolean z4 = z2;
                    if (edgeEffect2 != null) {
                        z4 = z2;
                        if (cf4.a(edgeEffect2) != 0.0f) {
                            z4 = z2;
                            if (!canScrollHorizontally(1)) {
                                cf4.b(this.D0, 0.0f, motionEvent.getY() / getHeight());
                                z4 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect3 = this.C0;
                    boolean z5 = z4;
                    if (edgeEffect3 != null) {
                        z5 = z4;
                        if (cf4.a(edgeEffect3) != 0.0f) {
                            z5 = z4;
                            if (!canScrollVertically(-1)) {
                                cf4.b(this.C0, 0.0f, motionEvent.getX() / getWidth());
                                z5 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect4 = this.E0;
                    boolean z6 = z5;
                    if (edgeEffect4 != null) {
                        z6 = z5;
                        if (cf4.a(edgeEffect4) != 0.0f) {
                            z6 = z5;
                            if (!canScrollVertically(1)) {
                                cf4.b(this.E0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                                z6 = true;
                            }
                        }
                    }
                    if (z6 || this.G0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m0(1);
                    }
                    int[] iArr = this.i1;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i2 = zD;
                    if (zE) {
                        i2 = (zD ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i2, 0);
                } else if (actionMasked == 1) {
                    this.I0.clear();
                    m0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.H0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.H0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.G0 != 1) {
                        int i3 = x3 - this.J0;
                        int i4 = y3 - this.K0;
                        if (!zD || Math.abs(i3) <= this.N0) {
                            z3 = false;
                        } else {
                            this.L0 = x3;
                            z3 = true;
                        }
                        if (zE && Math.abs(i4) > this.N0) {
                            this.M0 = y3;
                            z3 = true;
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    d0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.H0 = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.L0 = x4;
                    this.J0 = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.M0 = y4;
                    this.K0 = y4;
                } else if (actionMasked == 6) {
                    V(motionEvent);
                }
                if (this.G0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = lpf.a;
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.n0 = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        m mVar = this.f0;
        if (mVar == null) {
            q(i2, i3);
            return;
        }
        boolean zI = mVar.I();
        boolean z2 = false;
        x xVar = this.X0;
        if (zI) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.f0.b.q(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.m1 = z2;
            if (z2 || this.e0 == null) {
                return;
            }
            if (xVar.d == 1) {
                t();
            }
            this.f0.p0(i2, i3);
            xVar.i = true;
            u();
            this.f0.r0(i2, i3);
            if (this.f0.u0()) {
                this.f0.p0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                xVar.i = true;
                u();
                this.f0.r0(i2, i3);
            }
            this.n1 = getMeasuredWidth();
            this.o1 = getMeasuredHeight();
            return;
        }
        if (this.m0) {
            this.f0.b.q(i2, i3);
            return;
        }
        if (this.t0) {
            k0();
            T();
            X();
            U(true);
            if (xVar.k) {
                xVar.g = true;
            } else {
                this.e.c();
                xVar.g = false;
            }
            this.t0 = false;
            l0(false);
        } else if (xVar.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        e eVar = this.e0;
        if (eVar != null) {
            xVar.e = eVar.c();
        } else {
            xVar.e = 0;
        }
        k0();
        this.f0.b.q(i2, i3);
        l0(false);
        xVar.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.d = savedState;
        super.onRestoreInstanceState(savedState.a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.d;
        if (savedState2 != null) {
            savedState.c = savedState2.c;
            return savedState;
        }
        m mVar = this.f0;
        if (mVar != null) {
            savedState.c = mVar.c0();
            return savedState;
        }
        savedState.c = null;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.E0 = null;
        this.C0 = null;
        this.D0 = null;
        this.B0 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x02ae, code lost:
    
        if (r5 == 0) goto L282;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0292 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fb A[PHI: r1
  0x00fb: PHI (r1v69 int) = (r1v53 int), (r1v73 int) binds: [B:51:0x00e6, B:56:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v9, types: [androidx.recyclerview.widget.RecyclerView$m] */
    /* JADX WARN: Type inference failed for: r1v17, types: [cfa] */
    /* JADX WARN: Type inference failed for: r1v21, types: [cfa] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.recyclerview.widget.a0, androidx.recyclerview.widget.u] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r26) {
        /*
            Method dump skipped, instruction units count: 1121
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (!this.n0 || this.w0) {
            int i2 = lpf.a;
            Trace.beginSection("RV FullInvalidate");
            s();
            Trace.endSection();
            return;
        }
        androidx.recyclerview.widget.a aVar = this.e;
        if (aVar.g()) {
            int i3 = aVar.f;
            if ((i3 & 4) == 0 || (i3 & 11) != 0) {
                if (aVar.g()) {
                    int i4 = lpf.a;
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i5 = lpf.a;
            Trace.beginSection("RV PartialInvalidate");
            k0();
            T();
            aVar.j();
            if (!this.p0) {
                androidx.recyclerview.widget.b bVar = this.f;
                int iE = bVar.e();
                int i6 = 0;
                while (true) {
                    if (i6 < iE) {
                        b0 b0VarM = M(bVar.d(i6));
                        if (b0VarM != null && !b0VarM.o() && b0VarM.k()) {
                            s();
                            break;
                        }
                        i6++;
                    } else {
                        aVar.b();
                        break;
                    }
                }
            }
            l0(true);
            U(true);
            Trace.endSection();
        }
    }

    public final void q(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        setMeasuredDimension(m.g(i2, paddingRight, getMinimumWidth()), m.g(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void r(View view) {
        b0 b0VarM = M(view);
        e eVar = this.e0;
        if (eVar != null && b0VarM != null) {
            eVar.l(b0VarM);
        }
        ArrayList arrayList = this.v0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((o) this.v0.get(size)).getClass();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        b0 b0VarM = M(view);
        if (b0VarM != null) {
            if (b0VarM.j()) {
                b0VarM.j &= -257;
            } else if (!b0VarM.o()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(b0VarM);
                r40.k(sb, C());
                return;
            }
        } else if (q1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            r40.k(sb2, C());
            return;
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        androidx.recyclerview.widget.o oVar = this.f0.e;
        if ((oVar == null || !oVar.e) && !P() && view2 != null) {
            c0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f0.j0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList<q> arrayList = this.j0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.o0 != 0 || this.q0) {
            this.p0 = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0390  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 1013
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s():void");
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        m mVar = this.f0;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.q0) {
            return;
        }
        boolean zD = mVar.d();
        boolean zE = this.f0.e();
        if (zD || zE) {
            if (!zD) {
                i2 = 0;
            }
            if (!zE) {
                i3 = 0;
            }
            e0(i2, i3, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!P()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.s0 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.x xVar) {
        this.e1 = xVar;
        epg.o(this, xVar);
    }

    public void setAdapter(e eVar) {
        setLayoutFrozen(false);
        e eVar2 = this.e0;
        v vVar = this.b;
        if (eVar2 != null) {
            eVar2.a.unregisterObserver(vVar);
            this.e0.i(this);
        }
        j jVar = this.F0;
        if (jVar != null) {
            jVar.e();
        }
        m mVar = this.f0;
        t tVar = this.c;
        if (mVar != null) {
            mVar.f0(tVar);
            this.f0.g0(tVar);
        }
        tVar.a.clear();
        tVar.f();
        androidx.recyclerview.widget.a aVar = this.e;
        aVar.k(aVar.b);
        aVar.k(aVar.c);
        aVar.f = 0;
        e<?> eVar3 = this.e0;
        this.e0 = eVar;
        if (eVar != null) {
            eVar.a.registerObserver(vVar);
            eVar.f(this);
        }
        m mVar2 = this.f0;
        if (mVar2 != null) {
            mVar2.N();
        }
        e eVar4 = this.e0;
        tVar.a.clear();
        tVar.f();
        tVar.e(eVar3, true);
        s sVarC = tVar.c();
        if (eVar3 != null) {
            sVarC.b--;
        }
        if (sVarC.b == 0) {
            SparseArray<s.a> sparseArray = sVarC.a;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                s.a aVarValueAt = sparseArray.valueAt(i2);
                Iterator<b0> it = aVarValueAt.a.iterator();
                while (it.hasNext()) {
                    pnb.o(it.next().a);
                }
                aVarValueAt.a.clear();
            }
        }
        if (eVar4 != null) {
            sVarC.b++;
        }
        tVar.d();
        this.X0.f = true;
        Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(h hVar) {
        if (hVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.W) {
            this.E0 = null;
            this.C0 = null;
            this.D0 = null;
            this.B0 = null;
        }
        this.W = z2;
        super.setClipToPadding(z2);
        if (this.n0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(i iVar) {
        iVar.getClass();
        this.A0 = iVar;
        this.E0 = null;
        this.C0 = null;
        this.D0 = null;
        this.B0 = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.m0 = z2;
    }

    public void setItemAnimator(j jVar) {
        j jVar2 = this.F0;
        if (jVar2 != null) {
            jVar2.e();
            this.F0.a = null;
        }
        this.F0 = jVar;
        if (jVar != null) {
            jVar.a = this.c1;
        }
    }

    public void setItemViewCacheSize(int i2) {
        t tVar = this.c;
        tVar.e = i2;
        tVar.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(m mVar) {
        RecyclerView recyclerView;
        androidx.recyclerview.widget.o oVar;
        if (mVar == this.f0) {
            return;
        }
        setScrollState(0);
        a0 a0Var = this.U0;
        RecyclerView.this.removeCallbacks(a0Var);
        a0Var.c.abortAnimation();
        m mVar2 = this.f0;
        if (mVar2 != null && (oVar = mVar2.e) != null) {
            oVar.d();
        }
        m mVar3 = this.f0;
        t tVar = this.c;
        if (mVar3 != null) {
            j jVar = this.F0;
            if (jVar != null) {
                jVar.e();
            }
            this.f0.f0(tVar);
            this.f0.g0(tVar);
            tVar.a.clear();
            tVar.f();
            if (this.l0) {
                m mVar4 = this.f0;
                mVar4.g = false;
                mVar4.O(this);
            }
            this.f0.s0(null);
            this.f0 = null;
        } else {
            tVar.a.clear();
            tVar.f();
        }
        androidx.recyclerview.widget.b bVar = this.f;
        bVar.b.g();
        ArrayList arrayList = bVar.c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = bVar.a.a;
            if (size < 0) {
                break;
            }
            b0 b0VarM = M((View) arrayList.get(size));
            if (b0VarM != null) {
                int i2 = b0VarM.p;
                if (recyclerView.P()) {
                    b0VarM.q = i2;
                    recyclerView.k1.add(b0VarM);
                } else {
                    View view = b0VarM.a;
                    WeakHashMap<View, prg> weakHashMap = epg.a;
                    view.setImportantForAccessibility(i2);
                }
                b0VarM.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f0 = mVar;
        if (mVar != null) {
            if (mVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(mVar);
                String strC = mVar.b.C();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(strC);
                throw new IllegalArgumentException(sb.toString());
            }
            mVar.s0(this);
            if (this.l0) {
                this.f0.g = true;
            }
        }
        tVar.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            l5.q("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        cfa scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.d.o(viewGroup);
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(p pVar) {
        this.O0 = pVar;
    }

    @Deprecated
    public void setOnScrollListener(r rVar) {
        this.Y0 = rVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.T0 = z2;
    }

    public void setRecycledViewPool(s sVar) {
        t tVar = this.c;
        RecyclerView recyclerView = RecyclerView.this;
        tVar.e(recyclerView.e0, false);
        if (tVar.g != null) {
            r1.b--;
        }
        tVar.g = sVar;
        if (sVar != null && recyclerView.getAdapter() != null) {
            tVar.g.b++;
        }
        tVar.d();
    }

    @Deprecated
    public void setRecyclerListener(u uVar) {
        this.g0 = uVar;
    }

    public void setScrollState(int i2) {
        androidx.recyclerview.widget.o oVar;
        if (i2 == this.G0) {
            return;
        }
        if (r1) {
            StringBuilder sbG = o6.g(i2, "setting scroll state to ", " from ");
            sbG.append(this.G0);
            Log.d("RecyclerView", sbG.toString(), new Exception());
        }
        this.G0 = i2;
        if (i2 != 2) {
            a0 a0Var = this.U0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.c.abortAnimation();
            m mVar = this.f0;
            if (mVar != null && (oVar = mVar.e) != null) {
                oVar.d();
            }
        }
        m mVar2 = this.f0;
        if (mVar2 != null) {
            mVar2.d0(i2);
        }
        r rVar = this.Y0;
        if (rVar != null) {
            rVar.a(this, i2);
        }
        ArrayList arrayList = this.Z0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((r) this.Z0.get(size)).a(this, i2);
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.N0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.N0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(z zVar) {
        this.c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        androidx.recyclerview.widget.o oVar;
        if (z2 != this.q0) {
            k("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.q0 = false;
                if (this.p0 && this.f0 != null && this.e0 != null) {
                    requestLayout();
                }
                this.p0 = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.q0 = true;
            this.r0 = true;
            setScrollState(0);
            a0 a0Var = this.U0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.c.abortAnimation();
            m mVar = this.f0;
            if (mVar == null || (oVar = mVar.e) == null) {
                return;
            }
            oVar.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t() {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t():void");
    }

    public final void u() {
        k0();
        T();
        x xVar = this.X0;
        xVar.a(6);
        this.e.c();
        xVar.e = this.e0.c();
        xVar.c = 0;
        if (this.d != null) {
            e eVar = this.e0;
            int iOrdinal = eVar.c.ordinal();
            if (iOrdinal == 1 ? eVar.c() > 0 : iOrdinal != 2) {
                Parcelable parcelable = this.d.c;
                if (parcelable != null) {
                    this.f0.b0(parcelable);
                }
                this.d = null;
            }
        }
        xVar.g = false;
        this.f0.Z(this.c, xVar);
        xVar.f = false;
        xVar.j = xVar.j && this.F0 != null;
        xVar.d = 4;
        U(true);
        l0(false);
    }

    public final boolean v(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, i4, iArr, iArr2);
    }

    public final void w(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public final void x(int i2, int i3) {
        this.z0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        r rVar = this.Y0;
        if (rVar != null) {
            rVar.b(this, i2, i3);
        }
        ArrayList arrayList = this.Z0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((r) this.Z0.get(size)).b(this, i2, i3);
            }
        }
        this.z0--;
    }

    public final void y() {
        if (this.E0 != null) {
            return;
        }
        ((y) this.A0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.E0 = edgeEffect;
        if (this.W) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.B0 != null) {
            return;
        }
        ((y) this.A0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.B0 = edgeEffect;
        if (this.W) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Parcelable c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, 0);
        }

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }
    }

    public static class n extends ViewGroup.MarginLayoutParams {
        public b0 a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public n(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public n(n nVar) {
            super((ViewGroup.LayoutParams) nVar);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.f0;
        if (mVar != null) {
            return mVar.t(layoutParams);
        }
        r6.g("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.indeed.android.jobsearch.R.attr.recyclerViewStyle);
    }
}
