package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.b.a;
import defpackage.f3a;
import defpackage.mj7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<Interval extends a> {

    public interface a {

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.b$a$a, reason: collision with other inner class name */
        public static final class C0014a implements Function1 {
            public static final C0014a a = new C0014a();

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return null;
            }
        }

        default Function1<Integer, Object> getKey() {
            return null;
        }

        default Function1<Integer, Object> getType() {
            return C0014a.a;
        }
    }

    public abstract f3a f();

    public final Object g(int i) {
        Object objInvoke;
        mj7 mj7VarB = f().b(i);
        int i2 = i - mj7VarB.a;
        Function1<Integer, Object> key = mj7VarB.c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new DefaultLazyKey(i) : objInvoke;
    }
}
