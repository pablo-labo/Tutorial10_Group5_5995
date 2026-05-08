package defpackage;

import android.content.Context;
import defpackage.go5;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class eo5 implements Callable<go5.a> {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;

    public eo5(String str, Context context, List list, int i) {
        this.a = str;
        this.b = context;
        this.c = list;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final go5.a call() {
        try {
            return go5.b(this.a, this.b, this.c, this.d);
        } catch (Throwable unused) {
            return new go5.a(-3);
        }
    }
}
