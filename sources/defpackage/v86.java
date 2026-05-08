package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import defpackage.z86;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v86 extends Drawable implements z86.b, Animatable {
    public final int V;
    public boolean W;
    public Paint X;
    public Rect Y;
    public final a a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;

    public v86() {
        throw null;
    }

    public v86(a aVar) {
        this.e = true;
        this.V = -1;
        this.a = aVar;
    }

    @Override // z86.b
    public final void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        z86.a aVar = this.a.a.i;
        if ((aVar != null ? aVar.e : -1) == r0.a.l.c - 1) {
            this.f++;
        }
        int i = this.V;
        if (i == -1 || this.f < i) {
            return;
        }
        stop();
    }

    public final void b() {
        beb.c("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.d);
        z86 z86Var = this.a.a;
        if (z86Var.a.l.c == 1) {
            invalidateSelf();
            return;
        }
        if (this.b) {
            return;
        }
        this.b = true;
        ArrayList arrayList = z86Var.c;
        if (z86Var.j) {
            r6.g("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            r6.g("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !z86Var.f) {
            z86Var.f = true;
            z86Var.j = false;
            z86Var.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.d) {
            return;
        }
        if (this.W) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.Y == null) {
                this.Y = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.Y);
            this.W = false;
        }
        z86 z86Var = this.a.a;
        z86.a aVar = z86Var.i;
        Bitmap bitmap = aVar != null ? aVar.V : z86Var.l;
        if (this.Y == null) {
            this.Y = new Rect();
        }
        Rect rect = this.Y;
        if (this.X == null) {
            this.X = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.X);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.a.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.W = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.X == null) {
            this.X = new Paint(2);
        }
        this.X.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.X == null) {
            this.X = new Paint(2);
        }
        this.X.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        beb.c("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.d);
        this.e = z;
        if (!z) {
            this.b = false;
            z86 z86Var = this.a.a;
            ArrayList arrayList = z86Var.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                z86Var.f = false;
            }
        } else if (this.c) {
            b();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.c = true;
        this.f = 0;
        if (this.e) {
            b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c = false;
        this.b = false;
        z86 z86Var = this.a.a;
        ArrayList arrayList = z86Var.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            z86Var.f = false;
        }
    }

    public static final class a extends Drawable.ConstantState {
        public final z86 a;

        public a(z86 z86Var) {
            this.a = z86Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new v86(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new v86(this);
        }
    }
}
