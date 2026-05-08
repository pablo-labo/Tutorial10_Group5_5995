package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class vm6 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ vm6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ArrayList) obj2).get(((Number) obj).intValue());
                return null;
            case 1:
                in9 in9Var = (in9) obj;
                in9Var.getClass();
                return in9Var.b((n8a) obj2, dia.e);
            default:
                ((String) obj).getClass();
                return Integer.valueOf(((AtomicInteger) ((a6) obj2).b).getAndIncrement());
        }
    }
}
