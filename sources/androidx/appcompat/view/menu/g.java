package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.d.a;
import androidx.appcompat.view.menu.j;

/* JADX INFO: loaded from: classes.dex */
public final class g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {
    public m a;
    public androidx.appcompat.app.c b;
    public d c;

    @Override // androidx.appcompat.view.menu.j.a
    public final void c(f fVar, boolean z) {
        androidx.appcompat.app.c cVar;
        if ((z || fVar == this.a) && (cVar = this.b) != null) {
            cVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final boolean d(f fVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        m mVar = this.a;
        d dVar = this.c;
        if (dVar.f == null) {
            dVar.f = dVar.new a();
        }
        mVar.q(dVar.f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.c(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        m mVar = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                mVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return mVar.performShortcut(i, keyEvent, 0);
    }
}
