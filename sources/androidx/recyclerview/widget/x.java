package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.t6;
import defpackage.u6;
import defpackage.y5;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x extends y5 {
    public final RecyclerView d;
    public final a e;

    public static class a extends y5 {
        public final x d;
        public final WeakHashMap e = new WeakHashMap();

        public a(x xVar) {
            this.d = xVar;
        }

        @Override // defpackage.y5
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            y5 y5Var = (y5) this.e.get(view);
            return y5Var != null ? y5Var.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // defpackage.y5
        public final u6 b(View view) {
            y5 y5Var = (y5) this.e.get(view);
            return y5Var != null ? y5Var.b(view) : super.b(view);
        }

        @Override // defpackage.y5
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            y5 y5Var = (y5) this.e.get(view);
            if (y5Var != null) {
                y5Var.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // defpackage.y5
        public final void d(@SuppressLint({"InvalidNullabilityOverride"}) t6 t6Var, @SuppressLint({"InvalidNullabilityOverride"}) View view) {
            AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
            x xVar = this.d;
            RecyclerView recyclerView = xVar.d;
            RecyclerView recyclerView2 = xVar.d;
            boolean zO = recyclerView.O();
            View.AccessibilityDelegate accessibilityDelegate = this.a;
            if (zO || recyclerView2.getLayoutManager() == null) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
            }
            recyclerView2.getLayoutManager().S(t6Var, view);
            y5 y5Var = (y5) this.e.get(view);
            if (y5Var != null) {
                y5Var.d(t6Var, view);
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            }
        }

        @Override // defpackage.y5
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            y5 y5Var = (y5) this.e.get(view);
            if (y5Var != null) {
                y5Var.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // defpackage.y5
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            y5 y5Var = (y5) this.e.get(viewGroup);
            return y5Var != null ? y5Var.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // defpackage.y5
        public final boolean g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            x xVar = this.d;
            RecyclerView recyclerView = xVar.d;
            RecyclerView recyclerView2 = xVar.d;
            if (recyclerView.O() || recyclerView2.getLayoutManager() == null) {
                return super.g(view, i, bundle);
            }
            y5 y5Var = (y5) this.e.get(view);
            if (y5Var != null) {
                if (y5Var.g(view, i, bundle)) {
                    return true;
                }
            } else if (super.g(view, i, bundle)) {
                return true;
            }
            RecyclerView.t tVar = recyclerView2.getLayoutManager().b.c;
            return false;
        }

        @Override // defpackage.y5
        public final void h(View view, int i) {
            y5 y5Var = (y5) this.e.get(view);
            if (y5Var != null) {
                y5Var.h(view, i);
            } else {
                super.h(view, i);
            }
        }

        @Override // defpackage.y5
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            y5 y5Var = (y5) this.e.get(view);
            if (y5Var != null) {
                y5Var.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public x(RecyclerView recyclerView) {
        this.d = recyclerView;
        a aVar = this.e;
        if (aVar != null) {
            this.e = aVar;
        } else {
            this.e = new a(this);
        }
    }

    @Override // defpackage.y5
    public final void c(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().Q(accessibilityEvent);
        }
    }

    @Override // defpackage.y5
    public final void d(@SuppressLint({"InvalidNullabilityOverride"}) t6 t6Var, @SuppressLint({"InvalidNullabilityOverride"}) View view) {
        this.a.onInitializeAccessibilityNodeInfo(view, t6Var.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.R(recyclerView2.c, recyclerView2.X0, t6Var);
    }

    @Override // defpackage.y5
    public final boolean g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        return layoutManager.e0(recyclerView2.c, recyclerView2.X0, i, bundle);
    }
}
