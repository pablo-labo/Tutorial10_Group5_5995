package defpackage;

import android.R;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes2.dex */
public final class jkc implements ActionMode.Callback {
    public final /* synthetic */ ikc a;

    public jkc(ikc ikcVar) {
        this.a = ikcVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        actionMode.getClass();
        menuItem.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getClass();
        menu.getClass();
        if (this.a.w0) {
            return false;
        }
        menu.removeItem(R.id.pasteAsPlainText);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        actionMode.getClass();
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getClass();
        menu.getClass();
        return true;
    }
}
