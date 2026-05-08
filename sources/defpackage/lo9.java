package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class lo9 extends dz8 implements eo9 {
    public static final Method r0;
    public b.c q0;

    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    public static class c extends fd4 {
        public final int e0;
        public final int f0;
        public eo9 g0;
        public h h0;

        public c(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.e0 = 21;
                this.f0 = 22;
            } else {
                this.e0 = 22;
                this.f0 = 21;
            }
        }

        @Override // defpackage.fd4, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            e eVar;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.g0 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    eVar = (e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (e) adapter;
                    headersCount = 0;
                }
                h item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= eVar.getCount()) ? null : eVar.getItem(i);
                h hVar = this.h0;
                if (hVar != item) {
                    f fVar = eVar.a;
                    if (hVar != null) {
                        this.g0.n(fVar, hVar);
                    }
                    this.h0 = item;
                    if (item != null) {
                        this.g0.d(fVar, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.e0) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f0) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (e) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (e) adapter).a.c(false);
            return true;
        }

        public void setHoverListener(eo9 eo9Var) {
            this.g0 = eo9Var;
        }

        @Override // defpackage.fd4, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                r0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.eo9
    public final void d(f fVar, h hVar) {
        b.c cVar = this.q0;
        if (cVar != null) {
            cVar.d(fVar, hVar);
        }
    }

    @Override // defpackage.eo9
    public final void n(f fVar, MenuItem menuItem) {
        b.c cVar = this.q0;
        if (cVar != null) {
            cVar.n(fVar, menuItem);
        }
    }

    @Override // defpackage.dz8
    public final fd4 q(Context context, boolean z) {
        c cVar = new c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }
}
