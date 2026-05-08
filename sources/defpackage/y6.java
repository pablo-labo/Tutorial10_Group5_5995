package defpackage;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class y6 {
    public Object a;
    public Object b;
    public final Object c;

    public y6(int i) {
        switch (i) {
            case 1:
                this.c = new awd();
                break;
            default:
                this.a = new ReentrantLock();
                this.b = hh2.e(yz8.d);
                this.c = new x6();
                break;
        }
    }

    public b19 a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((awd) this.c)) {
            try {
                b19 b19Var = (b19) this.b;
                if (b19Var != null && localeList == ((LocaleList) this.a)) {
                    return b19Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new a19(localeList.get(i)));
                }
                b19 b19Var2 = new b19(arrayList);
                this.a = localeList;
                this.b = b19Var2;
                return b19Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object b(Function1 function1) {
        x6 x6Var = (x6) this.c;
        function1.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.a;
        try {
            reentrantLock.lock();
            Object objInvoke = function1.invoke(x6Var);
            gse gseVar = (gse) this.b;
            yz8 yz8Var = new yz8(x6Var.b(zz8.a), x6Var.b(zz8.b), x6Var.b(zz8.c));
            gseVar.getClass();
            gseVar.m(null, yz8Var);
            return objInvoke;
        } finally {
            reentrantLock.unlock();
        }
    }
}
