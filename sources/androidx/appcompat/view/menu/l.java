package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import com.indeed.android.jobsearch.R;
import defpackage.fd4;
import defpackage.ko9;
import defpackage.lo9;
import defpackage.r6;
import defpackage.uj0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends ko9 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final int V;
    public final lo9 W;
    public PopupWindow.OnDismissListener Z;
    public View a0;
    public final Context b;
    public View b0;
    public final f c;
    public j.a c0;
    public final e d;
    public ViewTreeObserver d0;
    public final boolean e;
    public boolean e0;
    public final int f;
    public boolean f0;
    public int g0;
    public boolean i0;
    public final a X = new a();
    public final b Y = new b();
    public int h0 = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            l lVar = l.this;
            lo9 lo9Var = lVar.W;
            if (!lVar.a() || lo9Var.m0) {
                return;
            }
            View view = lVar.b0;
            if (view == null || !view.isShown()) {
                lVar.dismiss();
            } else {
                lo9Var.b();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            l lVar = l.this;
            ViewTreeObserver viewTreeObserver = lVar.d0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    lVar.d0 = view.getViewTreeObserver();
                }
                lVar.d0.removeGlobalOnLayoutListener(lVar.X);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, f fVar, View view, int i, boolean z) {
        this.b = context;
        this.c = fVar;
        this.e = z;
        this.d = new e(fVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.V = i;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a0 = view;
        this.W = new lo9(context, null, i, 0);
        fVar.b(this, context);
    }

    @Override // defpackage.vee
    public final boolean a() {
        return !this.e0 && this.W.n0.isShowing();
    }

    @Override // defpackage.vee
    public final void b() {
        View view;
        if (a()) {
            return;
        }
        if (this.e0 || (view = this.a0) == null) {
            r6.g("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.b0 = view;
        lo9 lo9Var = this.W;
        uj0 uj0Var = lo9Var.n0;
        uj0 uj0Var2 = lo9Var.n0;
        uj0Var.setOnDismissListener(this);
        lo9Var.e0 = this;
        lo9Var.m0 = true;
        uj0Var2.setFocusable(true);
        View view2 = this.b0;
        boolean z = this.d0 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.d0 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.X);
        }
        view2.addOnAttachStateChangeListener(this.Y);
        lo9Var.d0 = view2;
        lo9Var.a0 = this.h0;
        boolean z2 = this.f0;
        Context context = this.b;
        e eVar = this.d;
        if (!z2) {
            this.g0 = ko9.n(eVar, context, this.f);
            this.f0 = true;
        }
        lo9Var.r(this.g0);
        uj0Var2.setInputMethodMode(2);
        Rect rect = this.a;
        lo9Var.l0 = rect != null ? new Rect(rect) : null;
        lo9Var.b();
        fd4 fd4Var = lo9Var.c;
        fd4Var.setOnKeyListener(this);
        if (this.i0) {
            f fVar = this.c;
            if (fVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) fd4Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(fVar.m);
                }
                frameLayout.setEnabled(false);
                fd4Var.addHeaderView(frameLayout, null, false);
            }
        }
        lo9Var.m(eVar);
        lo9Var.b();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z) {
        if (fVar != this.c) {
            return;
        }
        dismiss();
        j.a aVar = this.c0;
        if (aVar != null) {
            aVar.c(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(j.a aVar) {
        this.c0 = aVar;
    }

    @Override // defpackage.vee
    public final void dismiss() {
        if (a()) {
            this.W.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(m mVar) {
        boolean z;
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.b, mVar, this.b0, this.e, this.V, 0);
            j.a aVar = this.c0;
            iVar.h = aVar;
            ko9 ko9Var = iVar.i;
            if (ko9Var != null) {
                ko9Var.d(aVar);
            }
            int size = mVar.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = mVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            iVar.g = z;
            ko9 ko9Var2 = iVar.i;
            if (ko9Var2 != null) {
                ko9Var2.q(z);
            }
            iVar.j = this.Z;
            this.Z = null;
            this.c.c(false);
            lo9 lo9Var = this.W;
            int width = lo9Var.f;
            int iL = lo9Var.l();
            if ((Gravity.getAbsoluteGravity(this.h0, this.a0.getLayoutDirection()) & 7) == 5) {
                width += this.a0.getWidth();
            }
            if (!iVar.b()) {
                if (iVar.e != null) {
                    iVar.d(width, iL, true, true);
                }
            }
            j.a aVar2 = this.c0;
            if (aVar2 != null) {
                aVar2.d(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable h() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(boolean z) {
        this.f0 = false;
        e eVar = this.d;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k() {
        return false;
    }

    @Override // defpackage.ko9
    public final void m(f fVar) {
    }

    @Override // defpackage.vee
    public final fd4 o() {
        return this.W.c;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.e0 = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.d0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d0 = this.b0.getViewTreeObserver();
            }
            this.d0.removeGlobalOnLayoutListener(this.X);
            this.d0 = null;
        }
        this.b0.removeOnAttachStateChangeListener(this.Y);
        PopupWindow.OnDismissListener onDismissListener = this.Z;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.ko9
    public final void p(View view) {
        this.a0 = view;
    }

    @Override // defpackage.ko9
    public final void q(boolean z) {
        this.d.c = z;
    }

    @Override // defpackage.ko9
    public final void r(int i) {
        this.h0 = i;
    }

    @Override // defpackage.ko9
    public final void s(int i) {
        this.W.f = i;
    }

    @Override // defpackage.ko9
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.Z = onDismissListener;
    }

    @Override // defpackage.ko9
    public final void u(boolean z) {
        this.i0 = z;
    }

    @Override // defpackage.ko9
    public final void v(int i) {
        this.W.i(i);
    }
}
