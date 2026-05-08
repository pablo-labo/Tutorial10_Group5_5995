package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class qt0 extends ge4<Object[]> {
    public final zf8 a;
    public final owf<?> b;

    public qt0(fxf fxfVar, zf8 zf8Var) {
        zf8Var.getClass();
        this.a = zf8Var;
        gg8 gg8Var = (gg8) z92.Q0(zf8Var.g());
        zf8 zf8Var2 = gg8Var != null ? gg8Var.b : null;
        if (zf8Var2 != null) {
            this.b = fxfVar.a(zf8Var2);
        } else {
            l5.q("The array type should contain the type of the elements.");
            throw null;
        }
    }

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return this.b.b();
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        ExpectedType expectedTypeC = this.b.c();
        expectedTypeC.getClass();
        return new ExpectedType(new SingleType(s23.c0, new ExpectedType[]{expectedTypeC}));
    }

    @Override // defpackage.ge4
    public final Object[] e(Object obj, gk0 gk0Var, boolean z) throws CollectionElementCastException {
        CodedException unexpectedException;
        owf<?> owfVar = this.b;
        if (owfVar.b() && !z) {
            return (Object[]) obj;
        }
        Object[] objArr = (Object[]) obj;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj2 : objArr) {
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
        return arrayList.toArray(new Object[0]);
    }

    @Override // defpackage.ge4
    public final Object[] f(Dynamic dynamic, gk0 gk0Var, boolean z) throws DynamicCastException {
        ReadableArray readableArrayAsArray = dynamic.asArray();
        if (readableArrayAsArray == null) {
            throw new DynamicCastException(fwc.a.b(ReadableArray.class));
        }
        int size = readableArrayAsArray.size();
        zf8 zf8Var = ((gg8) z92.O0(this.a.g())).b;
        zf8Var.getClass();
        oe8 oe8VarA = zf8Var.a();
        oe8VarA.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) jh2.p((yd8) oe8VarA), size);
        objNewInstance.getClass();
        Object[] objArr = (Object[]) objNewInstance;
        int size2 = readableArrayAsArray.size();
        for (int i = 0; i < size2; i++) {
            Dynamic dynamic2 = readableArrayAsArray.getDynamic(i);
            try {
                Object objA = this.b.a(dynamic2, gk0Var, z);
                dynamic2.recycle();
                objArr[i] = objA;
            } finally {
            }
        }
        return objArr;
    }
}
