package defpackage;

import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class fp7 implements ep7, qo3 {
    public boolean a;
    public final kp7 b = new kp7();

    @Override // defpackage.ep7
    public final rp7 a() {
        String lowerCase = "prod".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!lowerCase.equals("qa")) {
            return rp7.c;
        }
        List<String> list = w8c.a;
        xh3 xh3Var = xh3.b;
        xh3Var.getClass();
        return wl7.b((String) xh3.d.a(xh3.c[0], xh3Var), "e2eqa") ? rp7.b : rp7.a;
    }

    @Override // defpackage.ep7
    public final h97 b() {
        return new h97(d93.a(), d93.e(), d93.b());
    }

    @Override // defpackage.ep7
    public final jp7 c() {
        String lowerCase = "release".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase.equals(RumEventDeserializer.TELEMETRY_TYPE_DEBUG) ? jp7.a : jp7.b;
    }

    @Override // defpackage.ep7
    public final kp7 d() {
        return this.b;
    }

    public final void e(boolean z) {
        ((np7) cr8.p(np7.class)).e("JSTAppModelImpl", z ? "App brought to foreground" : "App backgrounded");
        this.a = z;
    }

    @Override // defpackage.qo3
    public final void onCreate(zv8 zv8Var) {
        zv8Var.getClass();
    }

    @Override // defpackage.qo3
    public final void onDestroy(zv8 zv8Var) {
    }

    @Override // defpackage.qo3
    public final void onPause(zv8 zv8Var) {
    }

    @Override // defpackage.qo3
    public final void onResume(zv8 zv8Var) {
        zv8Var.getClass();
    }

    @Override // defpackage.qo3
    public final void onStart(zv8 zv8Var) {
        zv8Var.getClass();
        e(true);
    }

    @Override // defpackage.qo3
    public final void onStop(zv8 zv8Var) {
        e(false);
    }
}
