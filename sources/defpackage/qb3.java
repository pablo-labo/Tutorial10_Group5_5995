package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.swmansion.rnscreens.e;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class qb3 extends SearchView {
    public SearchView.j Z0;
    public View.OnClickListener a1;
    public final tq5 b1;

    public qb3(Context context, e eVar) {
        super(context, null);
        this.b1 = new tq5(eVar, new pb3(this));
        int i = 0;
        super.setOnSearchClickListener(new nb3(this, i));
        super.setOnCloseListener(new ob3(this, i));
        setMaxWidth(Integer.MAX_VALUE);
    }

    public final boolean getOverrideBackAction() {
        return this.b1.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.H0) {
            return;
        }
        this.b1.a();
    }

    @Override // androidx.appcompat.widget.SearchView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tq5 tq5Var = this.b1;
        if (tq5Var.c) {
            tq5Var.b.e();
            tq5Var.c = false;
        }
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnCloseListener(SearchView.j jVar) {
        this.Z0 = jVar;
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.a1 = onClickListener;
    }

    public final void setOverrideBackAction(boolean z) {
        this.b1.d = z;
    }

    public final void setText(String str) {
        str.getClass();
        r(str);
    }
}
