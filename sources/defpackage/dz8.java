package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class dz8 implements vee {
    public static final Method o0;
    public static final Method p0;
    public int V;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Context a;
    public ListAdapter b;
    public fd4 c;
    public d c0;
    public View d0;
    public AdapterView.OnItemClickListener e0;
    public int f;
    public final Handler j0;
    public Rect l0;
    public boolean m0;
    public final uj0 n0;
    public final int d = -2;
    public int e = -2;
    public final int W = 1002;
    public int a0 = 0;
    public final int b0 = Integer.MAX_VALUE;
    public final g f0 = new g();
    public final f g0 = new f();
    public final e h0 = new e();
    public final c i0 = new c();
    public final Rect k0 = new Rect();

    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            fd4 fd4Var = dz8.this.c;
            if (fd4Var != null) {
                fd4Var.setListSelectionHidden(true);
                fd4Var.requestLayout();
            }
        }
    }

    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            dz8 dz8Var = dz8.this;
            if (dz8Var.n0.isShowing()) {
                dz8Var.b();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            dz8.this.dismiss();
        }
    }

    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            dz8 dz8Var = dz8.this;
            g gVar = dz8Var.f0;
            uj0 uj0Var = dz8Var.n0;
            if (i != 1 || uj0Var.getInputMethodMode() == 2 || uj0Var.getContentView() == null) {
                return;
            }
            dz8Var.j0.removeCallbacks(gVar);
            gVar.run();
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            dz8 dz8Var = dz8.this;
            g gVar = dz8Var.f0;
            Handler handler = dz8Var.j0;
            uj0 uj0Var = dz8Var.n0;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && uj0Var != null && uj0Var.isShowing() && x >= 0 && x < uj0Var.getWidth() && y >= 0 && y < uj0Var.getHeight()) {
                handler.postDelayed(gVar, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            handler.removeCallbacks(gVar);
            return false;
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            dz8 dz8Var = dz8.this;
            fd4 fd4Var = dz8Var.c;
            if (fd4Var == null || !fd4Var.isAttachedToWindow() || dz8Var.c.getCount() <= dz8Var.c.getChildCount() || dz8Var.c.getChildCount() > dz8Var.b0) {
                return;
            }
            dz8Var.n0.setInputMethodMode(2);
            dz8Var.b();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                o0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                p0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public dz8(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.a = context;
        this.j0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wac.o, i, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.V = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.X = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        uj0 uj0Var = new uj0(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, wac.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            uj0Var.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        uj0Var.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : pnb.A(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.n0 = uj0Var;
        uj0Var.setInputMethodMode(1);
    }

    @Override // defpackage.vee
    public final boolean a() {
        return this.n0.isShowing();
    }

    @Override // defpackage.vee
    public final void b() {
        int i;
        int paddingBottom;
        fd4 fd4Var;
        fd4 fd4Var2 = this.c;
        Context context = this.a;
        uj0 uj0Var = this.n0;
        if (fd4Var2 == null) {
            fd4 fd4VarQ = q(context, !this.m0);
            this.c = fd4VarQ;
            fd4VarQ.setAdapter(this.b);
            this.c.setOnItemClickListener(this.e0);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new cz8(this));
            this.c.setOnScrollListener(this.h0);
            uj0Var.setContentView(this.c);
        }
        Drawable background = uj0Var.getBackground();
        Rect rect = this.k0;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.X) {
                this.V = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = a.a(uj0Var, this.d0, this.V, uj0Var.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.e;
            int iA2 = this.c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = uj0Var.getInputMethodMode() == 2;
        uj0Var.setWindowLayoutType(this.W);
        if (uj0Var.isShowing()) {
            if (this.d0.isAttachedToWindow()) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.d0.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.e;
                    if (z) {
                        uj0Var.setWidth(i5 == -1 ? -1 : 0);
                        uj0Var.setHeight(0);
                    } else {
                        uj0Var.setWidth(i5 == -1 ? -1 : 0);
                        uj0Var.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                uj0Var.setOutsideTouchable(true);
                int i6 = width;
                View view = this.d0;
                int i7 = this.f;
                int i8 = this.V;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                uj0Var.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.d0.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        uj0Var.setWidth(width2);
        uj0Var.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = o0;
            if (method != null) {
                try {
                    method.invoke(uj0Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(uj0Var, true);
        }
        uj0Var.setOutsideTouchable(true);
        uj0Var.setTouchInterceptor(this.g0);
        if (this.Z) {
            uj0Var.setOverlapAnchor(this.Y);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = p0;
            if (method2 != null) {
                try {
                    method2.invoke(uj0Var, this.l0);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            b.a(uj0Var, this.l0);
        }
        uj0Var.showAsDropDown(this.d0, this.f, this.V, this.a0);
        this.c.setSelection(-1);
        if ((!this.m0 || this.c.isInTouchMode()) && (fd4Var = this.c) != null) {
            fd4Var.setListSelectionHidden(true);
            fd4Var.requestLayout();
        }
        if (this.m0) {
            return;
        }
        this.j0.post(this.i0);
    }

    public final int c() {
        return this.f;
    }

    @Override // defpackage.vee
    public final void dismiss() {
        uj0 uj0Var = this.n0;
        uj0Var.dismiss();
        uj0Var.setContentView(null);
        this.c = null;
        this.j0.removeCallbacks(this.f0);
    }

    public final void e(int i) {
        this.f = i;
    }

    public final Drawable g() {
        return this.n0.getBackground();
    }

    public final void i(int i) {
        this.V = i;
        this.X = true;
    }

    public final int l() {
        if (this.X) {
            return this.V;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        d dVar = this.c0;
        if (dVar == null) {
            this.c0 = new d();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.c0);
        }
        fd4 fd4Var = this.c;
        if (fd4Var != null) {
            fd4Var.setAdapter(this.b);
        }
    }

    @Override // defpackage.vee
    public final fd4 o() {
        return this.c;
    }

    public final void p(Drawable drawable) {
        this.n0.setBackgroundDrawable(drawable);
    }

    public fd4 q(Context context, boolean z) {
        return new fd4(context, z);
    }

    public final void r(int i) {
        Drawable background = this.n0.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.k0;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }
}
