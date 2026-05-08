package defpackage;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gm7<T> {
    public final Function1<T, j6g> a;
    public final ReentrantLock b;
    public final ArrayList c;
    public boolean d;

    public gm7(Function1 function1) {
        function1.getClass();
        this.a = function1;
        this.b = new ReentrantLock();
        this.c = new ArrayList();
    }
}
