package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class ga6 extends EdgeEffect {
    public final float a;
    public float b;

    public ga6(Context context) {
        super(context);
        this.a = h4.b(context).a * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.b = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.b = 0.0f;
        super.onPull(f);
    }
}
