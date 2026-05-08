package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ti5 extends ActionMode.Callback2 implements ActionMode.Callback {
    public final ccf a;

    public ti5(ccf ccfVar) {
        this.a = ccfVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.a.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.a.b(menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.c();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        qtc qtcVarA = this.a.a();
        rect.set(Math.round(qtcVarA.a), Math.round(qtcVarA.b), Math.round(qtcVarA.c), Math.round(qtcVarA.d));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.a.d(menu);
    }
}
