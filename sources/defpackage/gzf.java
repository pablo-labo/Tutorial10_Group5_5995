package defpackage;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX INFO: loaded from: classes.dex */
public final class gzf {
    public final pn5 a;
    public final to5 b;
    public final int c;
    public final int d;
    public final Object e;

    public gzf(pn5 pn5Var, to5 to5Var, int i, int i2, Object obj) {
        this.a = pn5Var;
        this.b = to5Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzf)) {
            return false;
        }
        gzf gzfVar = (gzf) obj;
        return wl7.b(this.a, gzfVar.a) && wl7.b(this.b, gzfVar.b) && this.c == gzfVar.c && this.d == gzfVar.d && wl7.b(this.e, gzfVar.e);
    }

    public final int hashCode() {
        pn5 pn5Var = this.a;
        int iC = w40.c(this.d, w40.c(this.c, (((pn5Var == null ? 0 : pn5Var.hashCode()) * 31) + this.b.a) * 31, 31), 31);
        Object obj = this.e;
        return iC + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.c;
        sb.append((Object) (i == 0 ? ReactProgressBarViewManager.DEFAULT_STYLE : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
