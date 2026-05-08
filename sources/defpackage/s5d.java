package defpackage;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX INFO: loaded from: classes.dex */
public final class s5d implements jn5 {
    public final int a;
    public final to5 b;
    public final int c;
    public final so5 d;

    public s5d(int i, to5 to5Var, int i2, so5 so5Var) {
        this.a = i;
        this.b = to5Var;
        this.c = i2;
        this.d = so5Var;
    }

    @Override // defpackage.jn5
    public final int a() {
        return 0;
    }

    @Override // defpackage.jn5
    public final to5 b() {
        return this.b;
    }

    @Override // defpackage.jn5
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5d)) {
            return false;
        }
        s5d s5dVar = (s5d) obj;
        return this.a == s5dVar.a && wl7.b(this.b, s5dVar.b) && this.c == s5dVar.c && this.d.equals(s5dVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + w40.c(0, w40.c(this.c, ((this.a * 31) + this.b.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceFont(resId=");
        sb.append(this.a);
        sb.append(", weight=");
        sb.append(this.b);
        sb.append(", style=");
        int i = this.c;
        sb.append((Object) (i == 0 ? ReactProgressBarViewManager.DEFAULT_STYLE : i == 1 ? "Italic" : "Invalid"));
        sb.append(", loadingStrategy=Blocking)");
        return sb.toString();
    }
}
