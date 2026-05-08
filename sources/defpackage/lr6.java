package defpackage;

import androidx.work.impl.WorkDatabase;
import com.facebook.react.runtime.ReactHostImpl;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lr6 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lr6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                WorkDatabase workDatabase = (WorkDatabase) ((wy3) obj).b;
                Long lB = workDatabase.z().b("next_alarm_manager_id");
                int iLongValue = lB != null ? (int) lB.longValue() : 0;
                workDatabase.z().c(new ijb("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            default:
                AtomicInteger atomicInteger = ReactHostImpl.A;
                return ((ReactHostImpl) obj).y(0);
        }
    }
}
