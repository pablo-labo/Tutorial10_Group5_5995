package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class spb {
    public final ContentResolver a;
    public final Resources b;
    public final AssetManager c;
    public final cr1 d;
    public final t07 e;
    public final j3c f;
    public final f94 g;
    public final boolean h;
    public final s15 i;
    public final yn9 j;
    public final gze<f64> k;
    public final up1 l;
    public final up1 m;
    public final am3 n;
    public final bbb o;
    public final o82 p;
    public final int q;

    public spb(Context context, cr1 cr1Var, t07 t07Var, j3c j3cVar, f94 f94Var, boolean z, s15 s15Var, yn9 yn9Var, up1 up1Var, up1 up1Var2, gze gzeVar, am3 am3Var, bbb bbbVar, o82 o82Var) {
        this.a = context.getApplicationContext().getContentResolver();
        this.b = context.getApplicationContext().getResources();
        this.c = context.getApplicationContext().getAssets();
        this.d = cr1Var;
        this.e = t07Var;
        this.f = j3cVar;
        this.g = f94Var;
        this.h = z;
        this.i = s15Var;
        this.j = yn9Var;
        this.m = up1Var;
        this.l = up1Var2;
        this.k = gzeVar;
        this.n = am3Var;
        this.o = bbbVar;
        new mh2();
        new mh2();
        this.q = 2048;
        this.p = o82Var;
    }

    public final je3 a() {
        ExecutorService executorServiceH = this.i.h();
        executorServiceH.getClass();
        yn9 yn9Var = this.j;
        yn9Var.getClass();
        return new je3(executorServiceH, yn9Var, 1);
    }

    public final w4d b(opb<vs4> opbVar, boolean z, m37 m37Var) {
        return new w4d(this.i.g(), this.j, opbVar, z, m37Var);
    }
}
