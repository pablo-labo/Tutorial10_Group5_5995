package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import com.indeed.android.jobsearch.R;
import defpackage.eo9;
import defpackage.fd4;
import defpackage.ia;
import defpackage.ko9;
import defpackage.lo9;
import defpackage.uj0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ko9 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context b;
    public final int c;
    public View c0;
    public final int d;
    public View d0;
    public final boolean e;
    public int e0;
    public final Handler f;
    public boolean f0;
    public boolean g0;
    public int h0;
    public int i0;
    public boolean k0;
    public j.a l0;
    public ViewTreeObserver m0;
    public PopupWindow.OnDismissListener n0;
    public boolean o0;
    public final ArrayList V = new ArrayList();
    public final ArrayList W = new ArrayList();
    public final a X = new a();
    public final ViewOnAttachStateChangeListenerC0009b Y = new ViewOnAttachStateChangeListenerC0009b();
    public final c Z = new c();
    public int a0 = 0;
    public int b0 = 0;
    public boolean j0 = false;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            b bVar = b.this;
            ArrayList arrayList = bVar.W;
            if (!bVar.a() || arrayList.size() <= 0 || ((d) arrayList.get(0)).a.m0) {
                return;
            }
            View view = bVar.d0;
            if (view == null || !view.isShown()) {
                bVar.dismiss();
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a.b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0009b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0009b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            ViewTreeObserver viewTreeObserver = bVar.m0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    bVar.m0 = view.getViewTreeObserver();
                }
                bVar.m0.removeGlobalOnLayoutListener(bVar.X);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements eo9 {
        public c() {
        }

        @Override // defpackage.eo9
        public final void d(f fVar, h hVar) {
            b bVar = b.this;
            Handler handler = bVar.f;
            handler.removeCallbacksAndMessages(null);
            ArrayList arrayList = bVar.W;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (fVar == ((d) arrayList.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            handler.postAtTime(new androidx.appcompat.view.menu.c(this, i2 < arrayList.size() ? (d) arrayList.get(i2) : null, hVar, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // defpackage.eo9
        public final void n(f fVar, MenuItem menuItem) {
            b.this.f.removeCallbacksAndMessages(fVar);
        }
    }

    public static class d {
        public final lo9 a;
        public final f b;
        public final int c;

        public d(lo9 lo9Var, f fVar, int i) {
            this.a = lo9Var;
            this.b = fVar;
            this.c = i;
        }
    }

    public b(Context context, View view, int i, boolean z) {
        this.b = context;
        this.c0 = view;
        this.d = i;
        this.e = z;
        this.e0 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // defpackage.vee
    public final boolean a() {
        ArrayList arrayList = this.W;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).a.n0.isShowing();
    }

    @Override // defpackage.vee
    public final void b() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.V;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w((f) it.next());
        }
        arrayList.clear();
        View view = this.c0;
        this.d0 = view;
        if (view != null) {
            boolean z = this.m0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.m0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.X);
            }
            this.d0.addOnAttachStateChangeListener(this.Y);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z) {
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (fVar == ((d) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((d) arrayList.get(i2)).b.c(false);
        }
        d dVar = (d) arrayList.remove(i);
        f fVar2 = dVar.b;
        lo9 lo9Var = dVar.a;
        uj0 uj0Var = lo9Var.n0;
        fVar2.r(this);
        if (this.o0) {
            lo9.a.b(uj0Var, null);
            uj0Var.setAnimationStyle(0);
        }
        lo9Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.e0 = ((d) arrayList.get(size2 - 1)).c;
        } else {
            this.e0 = this.c0.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((d) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.l0;
        if (aVar != null) {
            aVar.c(fVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.m0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.m0.removeGlobalOnLayoutListener(this.X);
            }
            this.m0 = null;
        }
        this.d0.removeOnAttachStateChangeListener(this.Y);
        this.n0.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(j.a aVar) {
        this.l0 = aVar;
    }

    @Override // defpackage.vee
    public final void dismiss() {
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.n0.isShowing()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(m mVar) {
        for (d dVar : this.W) {
            if (mVar == dVar.b) {
                dVar.a.c.requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        m(mVar);
        j.a aVar = this.l0;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable h() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(boolean z) {
        Iterator it = this.W.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k() {
        return false;
    }

    @Override // defpackage.ko9
    public final void m(f fVar) {
        fVar.b(this, this.b);
        if (a()) {
            w(fVar);
        } else {
            this.V.add(fVar);
        }
    }

    @Override // defpackage.vee
    public final fd4 o() {
        ArrayList arrayList = this.W;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) ia.k(1, arrayList)).a.c;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i);
            if (!dVar.a.n0.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.b.c(false);
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
        if (this.c0 != view) {
            this.c0 = view;
            this.b0 = Gravity.getAbsoluteGravity(this.a0, view.getLayoutDirection());
        }
    }

    @Override // defpackage.ko9
    public final void q(boolean z) {
        this.j0 = z;
    }

    @Override // defpackage.ko9
    public final void r(int i) {
        if (this.a0 != i) {
            this.a0 = i;
            this.b0 = Gravity.getAbsoluteGravity(i, this.c0.getLayoutDirection());
        }
    }

    @Override // defpackage.ko9
    public final void s(int i) {
        this.f0 = true;
        this.h0 = i;
    }

    @Override // defpackage.ko9
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.n0 = onDismissListener;
    }

    @Override // defpackage.ko9
    public final void u(boolean z) {
        this.k0 = z;
    }

    @Override // defpackage.ko9
    public final void v(int i) {
        this.g0 = true;
        this.i0 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(androidx.appcompat.view.menu.f r20) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.w(androidx.appcompat.view.menu.f):void");
    }
}
