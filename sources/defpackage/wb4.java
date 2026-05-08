package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class wb4<T extends Drawable> implements f5d<T>, kd7 {
    public final T a;

    public wb4(T t) {
        beb.e(t, "Argument must not be null");
        this.a = t;
    }

    @Override // defpackage.f5d
    public final Object get() {
        T t = this.a;
        Drawable.ConstantState constantState = t.getConstantState();
        return constantState == null ? t : constantState.newDrawable();
    }

    public void initialize() {
        T t = this.a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof v86) {
            ((v86) t).a.a.l.prepareToDraw();
        }
    }
}
