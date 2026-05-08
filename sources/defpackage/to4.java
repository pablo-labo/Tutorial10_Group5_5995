package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class to4 {
    public static final m74 a = new m74();

    public static final void a(Object obj, Object obj2, Function1 function1, b bVar) {
        boolean zK = bVar.K(obj) | bVar.K(obj2);
        Object objV = bVar.v();
        if (zK || objV == b.a.a) {
            objV = new k74(function1);
            bVar.p(objV);
        }
    }

    public static final void b(Object obj, Function1 function1, b bVar) {
        boolean zK = bVar.K(obj);
        Object objV = bVar.v();
        if (zK || objV == b.a.a) {
            objV = new k74(function1);
            bVar.p(objV);
        }
    }

    public static final void c(Object[] objArr, Function1 function1, b bVar) {
        boolean zK = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zK |= bVar.K(obj);
        }
        Object objV = bVar.v();
        if (zK || objV == b.a.a) {
            bVar.p(new k74(function1));
        }
    }

    public static final void d(b bVar, Object obj, Function2 function2) {
        v03 v03VarL = bVar.l();
        boolean zK = bVar.K(obj);
        Object objV = bVar.v();
        if (zK || objV == b.a.a) {
            objV = new f(v03VarL, function2);
            bVar.p(objV);
        }
    }

    public static final void e(Object obj, Object obj2, Object obj3, Function2 function2, b bVar) {
        v03 v03VarL = bVar.l();
        boolean zK = bVar.K(obj) | bVar.K(obj2) | bVar.K(obj3);
        Object objV = bVar.v();
        if (zK || objV == b.a.a) {
            objV = new f(v03VarL, function2);
            bVar.p(objV);
        }
    }

    public static final void f(Object obj, Object obj2, Function2 function2, b bVar) {
        v03 v03VarL = bVar.l();
        boolean zK = bVar.K(obj) | bVar.K(obj2);
        Object objV = bVar.v();
        if (zK || objV == b.a.a) {
            objV = new f(v03VarL, function2);
            bVar.p(objV);
        }
    }

    public static final void g(Object[] objArr, Function2 function2, b bVar) {
        v03 v03VarL = bVar.l();
        boolean zK = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zK |= bVar.K(obj);
        }
        Object objV = bVar.v();
        if (zK || objV == b.a.a) {
            bVar.p(new f(v03VarL, function2));
        }
    }
}
