package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import defpackage.epg;
import defpackage.prg;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.appcompat.app.a {
    public final androidx.appcompat.widget.c a;
    public final Window.Callback b;
    public final C0008e c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList<a.b> g = new ArrayList<>();
    public final a h = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            Window.Callback callback = eVar.b;
            Menu menuW = eVar.w();
            androidx.appcompat.view.menu.f fVar = menuW instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) menuW : null;
            if (fVar != null) {
                fVar.w();
            }
            try {
                menuW.clear();
                if (!callback.onCreatePanelMenu(0, menuW) || !callback.onPreparePanel(0, null, menuW)) {
                    menuW.clear();
                }
                if (fVar != null) {
                    fVar.v();
                }
            } catch (Throwable th) {
                if (fVar != null) {
                    fVar.v();
                }
                throw th;
            }
        }
    }

    public class b implements Toolbar.h {
        public b() {
        }
    }

    public final class c implements j.a {
        public boolean a;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z) {
            if (this.a) {
                return;
            }
            this.a = true;
            e eVar = e.this;
            eVar.a.m();
            eVar.b.onPanelClosed(108, fVar);
            this.a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            e.this.b.onMenuOpened(108, fVar);
            return true;
        }
    }

    public final class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean l(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void q(androidx.appcompat.view.menu.f fVar) {
            ActionMenuPresenter actionMenuPresenter;
            e eVar = e.this;
            Window.Callback callback = eVar.b;
            ActionMenuView actionMenuView = eVar.a.a.a;
            if (actionMenuView != null && (actionMenuPresenter = actionMenuView.l0) != null && actionMenuPresenter.m()) {
                callback.onPanelClosed(108, fVar);
            } else if (callback.onPreparePanel(0, null, fVar)) {
                callback.onMenuOpened(108, fVar);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.e$e, reason: collision with other inner class name */
    public class C0008e implements AppCompatDelegateImpl.b {
        public C0008e() {
        }
    }

    public e(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        toolbar.getClass();
        androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(toolbar, false);
        this.a = cVar;
        callback.getClass();
        this.b = callback;
        cVar.k = callback;
        toolbar.setOnMenuItemClickListener(bVar);
        cVar.setWindowTitle(charSequence);
        this.c = new C0008e();
    }

    @Override // androidx.appcompat.app.a
    public final boolean a() {
        return this.a.b();
    }

    @Override // androidx.appcompat.app.a
    public final boolean b() {
        androidx.appcompat.widget.c cVar = this.a;
        Toolbar.f fVar = cVar.a.E0;
        if (fVar == null || fVar.b == null) {
            return false;
        }
        cVar.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList<a.b> arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // androidx.appcompat.app.a
    public final int d() {
        return this.a.b;
    }

    @Override // androidx.appcompat.app.a
    public final Context e() {
        return this.a.a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public final boolean f() {
        androidx.appcompat.widget.c cVar = this.a;
        Toolbar toolbar = cVar.a;
        a aVar = this.h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = cVar.a;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        toolbar2.postOnAnimation(aVar);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public final void g() {
    }

    @Override // androidx.appcompat.app.a
    public final void h() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // androidx.appcompat.app.a
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu menuW = w();
        if (menuW == null) {
            return false;
        }
        menuW.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuW.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public final boolean k() {
        return this.a.a.w();
    }

    @Override // androidx.appcompat.app.a
    public final void l(ColorDrawable colorDrawable) {
        this.a.a.setBackground(colorDrawable);
    }

    @Override // androidx.appcompat.app.a
    public final void m(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public final void n(boolean z) {
        int i = z ? 4 : 0;
        androidx.appcompat.widget.c cVar = this.a;
        cVar.i((i & 4) | (cVar.b & (-5)));
    }

    @Override // androidx.appcompat.app.a
    public final void o() {
        androidx.appcompat.widget.c cVar = this.a;
        cVar.i(cVar.b & (-3));
    }

    @Override // androidx.appcompat.app.a
    public final void p(float f) {
        Toolbar toolbar = this.a.a;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.d.k(toolbar, 0.0f);
    }

    @Override // androidx.appcompat.app.a
    public final void q(Drawable drawable) {
        this.a.s(drawable);
    }

    @Override // androidx.appcompat.app.a
    public final void r(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public final void s(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public final void t(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public final void u(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    public final Menu w() {
        boolean z = this.e;
        androidx.appcompat.widget.c cVar = this.a;
        if (!z) {
            c cVar2 = new c();
            d dVar = new d();
            Toolbar toolbar = cVar.a;
            toolbar.F0 = cVar2;
            toolbar.G0 = dVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.m0 = cVar2;
                actionMenuView.n0 = dVar;
            }
            this.e = true;
        }
        return cVar.a.getMenu();
    }
}
