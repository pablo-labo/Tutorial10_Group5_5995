package defpackage;

import com.google.android.gms.measurement.internal.zzn;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class m33 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m33(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return q33.a((q33) obj2, (qbe) obj);
            case 1:
                h1i h1iVar = (h1i) obj2;
                h1iVar.a.F();
                return h1iVar.a.z().t(((zzn) obj).a);
            default:
                return ((fei) obj2).w((zzn) obj).r();
        }
    }
}
