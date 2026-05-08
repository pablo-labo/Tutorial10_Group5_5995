package defpackage;

import android.view.ViewGroup;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public final class jzg {
    public final WindowId a;

    public jzg(ViewGroup viewGroup) {
        this.a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jzg) && ((jzg) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
