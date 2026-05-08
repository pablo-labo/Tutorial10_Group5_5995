package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class uae extends ge4<Set<?>> {
    public final zf8 a;
    public final owf<?> b;

    public uae(fxf fxfVar, zf8 zf8Var) {
        zf8Var.getClass();
        this.a = zf8Var;
        zf8 zf8Var2 = ((gg8) z92.O0(zf8Var.g())).b;
        if (zf8Var2 != null) {
            this.b = fxfVar.a(zf8Var2);
        } else {
            l5.q("The set type should contain the type of elements.");
            throw null;
        }
    }

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        ExpectedType expectedTypeC = this.b.c();
        expectedTypeC.getClass();
        return new ExpectedType(new SingleType(s23.d0, new ExpectedType[]{expectedTypeC}));
    }

    @Override // defpackage.ge4
    public final Set<?> e(Object obj, gk0 gk0Var, boolean z) throws CollectionElementCastException {
        CodedException unexpectedException;
        owf<?> owfVar = this.b;
        if (owfVar.b() && !z) {
            return z92.E1((List) obj);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(t92.r0(list, 10));
        for (Object obj2 : list) {
            try {
                arrayList.add(owfVar.a(obj2, gk0Var, z));
            } catch (Throwable th) {
                if (th instanceof CodedException) {
                    unexpectedException = (CodedException) th;
                } else if (th instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                    unexpectedException = new CodedException(codedException.a(), codedException.getMessage(), codedException.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
                zf8 zf8Var = this.a;
                zf8 zf8Var2 = ((gg8) z92.O0(zf8Var.g())).b;
                zf8Var2.getClass();
                obj2.getClass();
                throw new CollectionElementCastException(zf8Var, zf8Var2, (yd8<?>) fwc.a.b(obj2.getClass()), unexpectedException);
            }
        }
        return z92.E1(arrayList);
    }

    @Override // defpackage.ge4
    public final Set<?> f(Dynamic dynamic, gk0 gk0Var, boolean z) throws DynamicCastException {
        ReadableArray readableArrayAsArray = dynamic.asArray();
        if (readableArrayAsArray == null) {
            throw new DynamicCastException(fwc.a.b(ReadableArray.class));
        }
        int size = readableArrayAsArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Dynamic dynamic2 = readableArrayAsArray.getDynamic(i);
            try {
                Object objA = this.b.a(dynamic2, gk0Var, z);
                dynamic2.recycle();
                arrayList.add(objA);
            } finally {
            }
        }
        return z92.E1(arrayList);
    }
}
