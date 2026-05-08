package defpackage;

import android.content.Context;
import defpackage.mt3;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jt3 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jt3(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((lt3) obj3).a.submit(new jy0(2, (Callable) obj2, (mt3.a) obj));
            default:
                return z69.b((Context) obj3, (InputStream) obj2, (String) obj);
        }
    }
}
