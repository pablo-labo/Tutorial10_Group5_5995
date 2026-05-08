package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class ng8 {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        if (obj instanceof ng8) {
            return wl7.b(this.a, ((ng8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
