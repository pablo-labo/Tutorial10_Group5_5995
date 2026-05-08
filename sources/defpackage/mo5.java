package defpackage;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class mo5 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof mo5) {
            return this.a == ((mo5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? ReactProgressBarViewManager.DEFAULT_STYLE : i == 1 ? "Italic" : "Invalid";
    }
}
