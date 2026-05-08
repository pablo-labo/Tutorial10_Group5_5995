package defpackage;

import androidx.compose.runtime.p;
import com.datadog.android.rum.internal.debug.UiRumDebugListener;

/* JADX INFO: loaded from: classes.dex */
public final class lo8 {
    public final c3a a;
    public final c3a b;
    public boolean c;
    public Object d;
    public final dr8 e;

    public lo8(int i, int i2) {
        this.a = p.a(i);
        this.b = p.a(i2);
        this.e = new dr8(i, 90, UiRumDebugListener.DEFAULT_ALPHA);
    }

    public final void a(int i, int i2) {
        if (i < 0.0f) {
            de7.a("Index should be non-negative");
        }
        ((dme) this.a).h(i);
        this.e.i(i);
        ((dme) this.b).h(i2);
    }
}
