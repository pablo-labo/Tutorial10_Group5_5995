package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class ej0 {
    public final dj0 a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public ej0(dj0 dj0Var) {
        this.a = dj0Var;
    }

    public final void a() {
        dj0 dj0Var = this.a;
        Drawable checkMarkDrawable = dj0Var.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.d) {
                    drawableMutate.setTintList(this.b);
                }
                if (this.e) {
                    drawableMutate.setTintMode(this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(dj0Var.getDrawableState());
                }
                dj0Var.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
