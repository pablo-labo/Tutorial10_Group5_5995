package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import defpackage.bg;
import defpackage.d82;
import defpackage.ka2;
import defpackage.lg5;
import defpackage.vjg;
import defpackage.wng;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final c a;
    public final wng b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public d82 l = d82.a;

    public static class a {
        public long a = -9223372036854775807L;
        public long b = -9223372036854775807L;
    }

    public e(Context context, c cVar, long j) {
        this.a = cVar;
        this.c = j;
        this.b = new wng(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(long r27, long r29, long r31, long r33, boolean r35, boolean r36, androidx.media3.exoplayer.video.e.a r37) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.e.a(long, long, long, long, boolean, boolean, androidx.media3.exoplayer.video.e$a):int");
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (!this.m && this.n))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        if (this.l.d() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        this.j = z;
        long j = this.c;
        this.i = j > 0 ? this.l.d() + j : -9223372036854775807L;
    }

    public final void d() {
        this.d = true;
        this.g = vjg.O(this.l.d());
        wng wngVar = this.b;
        wngVar.d = true;
        wngVar.m = 0L;
        wngVar.p = -1L;
        wngVar.n = -1L;
        wng.b bVar = wngVar.b;
        if (bVar != null) {
            DisplayManager displayManager = bVar.a;
            wng.c cVar = wngVar.c;
            cVar.getClass();
            cVar.b.sendEmptyMessage(2);
            displayManager.registerDisplayListener(bVar, vjg.p(null));
            wng.a(wng.this, displayManager.getDisplay(0));
        }
        wngVar.d(false);
    }

    public final void e() {
        this.d = false;
        this.i = -9223372036854775807L;
        wng wngVar = this.b;
        wngVar.d = false;
        wng.b bVar = wngVar.b;
        if (bVar != null) {
            bVar.a.unregisterDisplayListener(bVar);
            wng.c cVar = wngVar.c;
            cVar.getClass();
            cVar.b.sendEmptyMessage(3);
        }
        wngVar.b();
    }

    public final void f(int i) {
        if (i == 0) {
            this.e = 1;
            return;
        }
        if (i == 1) {
            this.e = 0;
        } else if (i == 2) {
            this.e = Math.min(this.e, 2);
        } else {
            bg.h();
        }
    }

    public final void g(float f) {
        wng wngVar = this.b;
        wngVar.f = f;
        lg5 lg5Var = wngVar.a;
        lg5Var.a.c();
        lg5Var.b.c();
        lg5Var.c = false;
        lg5Var.d = -9223372036854775807L;
        lg5Var.e = 0;
        wngVar.c();
    }

    public final void h(Surface surface) {
        this.m = surface != null;
        this.n = false;
        wng wngVar = this.b;
        if (wngVar.e != surface) {
            wngVar.b();
            wngVar.e = surface;
            wngVar.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void i(float f) {
        ka2.l(f > 0.0f);
        if (f == this.k) {
            return;
        }
        this.k = f;
        wng wngVar = this.b;
        wngVar.i = f;
        wngVar.m = 0L;
        wngVar.p = -1L;
        wngVar.n = -1L;
        wngVar.d(false);
    }
}
