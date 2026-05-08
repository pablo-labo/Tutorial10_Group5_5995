package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class q extends s {
    @Override // androidx.recyclerview.widget.s
    public final int b(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.a.getClass();
        return view.getRight() + ((RecyclerView.n) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.a.getClass();
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.a.getClass();
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int e(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.a.getClass();
        return (view.getLeft() - ((RecyclerView.n) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int f() {
        return this.a.n;
    }

    @Override // androidx.recyclerview.widget.s
    public final int g() {
        RecyclerView.m mVar = this.a;
        return mVar.n - mVar.C();
    }

    @Override // androidx.recyclerview.widget.s
    public final int h() {
        return this.a.C();
    }

    @Override // androidx.recyclerview.widget.s
    public final int i() {
        return this.a.l;
    }

    @Override // androidx.recyclerview.widget.s
    public final int j() {
        return this.a.m;
    }

    @Override // androidx.recyclerview.widget.s
    public final int k() {
        return this.a.B();
    }

    @Override // androidx.recyclerview.widget.s
    public final int l() {
        RecyclerView.m mVar = this.a;
        return (mVar.n - mVar.B()) - mVar.C();
    }

    @Override // androidx.recyclerview.widget.s
    public final int m(View view) {
        RecyclerView.m mVar = this.a;
        Rect rect = this.c;
        mVar.H(rect, view);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.s
    public final int n(View view) {
        RecyclerView.m mVar = this.a;
        Rect rect = this.c;
        mVar.H(rect, view);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.s
    public final void o(int i) {
        this.a.L(i);
    }
}
