package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class ake<T> {
    public final b a;

    public final boolean equals(Object obj) {
        if (obj instanceof ake) {
            return wl7.b(this.a, ((ake) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.a + ')';
    }
}
