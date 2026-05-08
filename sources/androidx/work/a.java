package androidx.work;

import defpackage.co2;
import defpackage.ka2;
import defpackage.md2;
import defpackage.q4h;
import defpackage.r4h;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final ExecutorService a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new co2(false));
    public final ExecutorService b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new co2(true));
    public final q4h c;
    public final ka2 d;
    public final md2 e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX INFO: renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public static final class C0077a {
    }

    public interface b {
        a a();
    }

    public a(C0077a c0077a) {
        String str = r4h.a;
        this.c = new q4h();
        this.d = new ka2(25);
        this.e = new md2();
        this.f = 4;
        this.g = Integer.MAX_VALUE;
        this.h = 20;
    }
}
