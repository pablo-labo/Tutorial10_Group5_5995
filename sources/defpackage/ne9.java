package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes2.dex */
public final class ne9 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ oe9 a;

    public ne9(oe9 oe9Var) {
        this.a = oe9Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        oe9 oe9Var = this.a;
        dz8 dz8Var = oe9Var.e;
        oe9.a(oe9Var, i < 0 ? !dz8Var.n0.isShowing() ? null : dz8Var.c.getSelectedItem() : oe9Var.getAdapter().getItem(i));
        AdapterView.OnItemClickListener onItemClickListener = oe9Var.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                view = !dz8Var.n0.isShowing() ? null : dz8Var.c.getSelectedView();
                i = !dz8Var.n0.isShowing() ? -1 : dz8Var.c.getSelectedItemPosition();
                j = !dz8Var.n0.isShowing() ? Long.MIN_VALUE : dz8Var.c.getSelectedItemId();
            }
            onItemClickListener.onItemClick(dz8Var.c, view, i, j);
        }
        dz8Var.dismiss();
    }
}
