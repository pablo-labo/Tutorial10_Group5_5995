package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.f;
import defpackage.umf;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements f.b, k, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public f a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        umf umfVarE = umf.e(context, attributeSet, b, R.attr.listViewStyle);
        TypedArray typedArray = umfVarE.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(umfVarE.b(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(umfVarE.b(1));
        }
        umfVarE.f();
    }

    @Override // androidx.appcompat.view.menu.k
    public final void a(f fVar) {
        this.a = fVar;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean b(h hVar) {
        return this.a.q(hVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        b((h) getAdapter().getItem(i));
    }
}
