package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class h74 {
    public final Context a;

    public h74(Context context) {
        this.a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h74) {
            return wl7.b(this.a, ((h74) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
