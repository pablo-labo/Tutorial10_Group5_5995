package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class qb4 implements k07 {
    public final Drawable a;

    public interface a {
        long a();
    }

    public qb4(Drawable drawable) {
        this.a = drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k07
    public final long a() {
        Drawable drawable = this.a;
        long jA = drawable instanceof a ? ((a) drawable).a() : ((long) ukg.b(drawable)) * 4 * ((long) ukg.a(drawable));
        if (jA < 0) {
            return 0L;
        }
        return jA;
    }

    @Override // defpackage.k07
    public final boolean b() {
        return false;
    }

    @Override // defpackage.k07
    public final void c(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb4) && wl7.b(this.a, ((qb4) obj).a);
    }

    @Override // defpackage.k07
    public final int getHeight() {
        return ukg.a(this.a);
    }

    @Override // defpackage.k07
    public final int getWidth() {
        return ukg.b(this.a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
