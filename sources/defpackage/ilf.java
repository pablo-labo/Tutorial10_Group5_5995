package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ilf implements pv1 {
    public static final ilf a = new ilf();

    @Override // defpackage.pv1
    public final List<Type> a() {
        return zr4.a;
    }

    @Override // defpackage.pv1
    public final boolean b() {
        return false;
    }

    @Override // defpackage.pv1
    public final Object call(Object[] objArr) {
        objArr.getClass();
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // defpackage.pv1
    public final /* bridge */ /* synthetic */ Member getMember() {
        return null;
    }

    @Override // defpackage.pv1
    public final Type getReturnType() {
        Class cls = Void.TYPE;
        cls.getClass();
        return cls;
    }
}
