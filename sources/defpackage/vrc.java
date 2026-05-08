package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class vrc<T extends View> implements wrg<T> {
    public final T b;

    /* JADX WARN: Multi-variable type inference failed */
    public vrc(View view) {
        this.b = view;
    }

    @Override // defpackage.wrg
    public final T b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vrc) && wl7.b(this.b, ((vrc) obj).b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.b.hashCode() * 31);
    }

    @Override // defpackage.wrg
    public final boolean t() {
        return true;
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.b + ", subtractPadding=true)";
    }
}
