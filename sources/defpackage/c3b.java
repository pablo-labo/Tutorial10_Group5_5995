package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class c3b extends ge4<Pair<?, ?>> {
    public final zf8 a;
    public final List<owf<? extends Object>> b;

    public c3b(fxf fxfVar, zf8 zf8Var) {
        zf8Var.getClass();
        this.a = zf8Var;
        gg8 gg8Var = (gg8) z92.R0(0, zf8Var.g());
        zf8 zf8Var2 = gg8Var != null ? gg8Var.b : null;
        if (zf8Var2 == null) {
            l5.q("The pair type should contain the type of the first parameter.");
            throw null;
        }
        owf<?> owfVarA = fxfVar.a(zf8Var2);
        gg8 gg8Var2 = (gg8) z92.R0(1, zf8Var.g());
        zf8 zf8Var3 = gg8Var2 != null ? gg8Var2.b : null;
        if (zf8Var3 != null) {
            this.b = u63.a0(owfVarA, fxfVar.a(zf8Var3));
        } else {
            l5.q("The pair type should contain the type of the second parameter.");
            throw null;
        }
    }

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(new SingleType(s23.X, null));
    }

    @Override // defpackage.ge4
    public final Pair<?, ?> e(Object obj, gk0 gk0Var, boolean z) {
        if (!(obj instanceof ReadableArray)) {
            return (Pair) obj;
        }
        ReadableArray readableArray = (ReadableArray) obj;
        return new Pair<>(g(gk0Var, readableArray, 0, z), g(gk0Var, readableArray, 1, z));
    }

    @Override // defpackage.ge4
    public final Pair<?, ?> f(Dynamic dynamic, gk0 gk0Var, boolean z) throws DynamicCastException {
        ReadableArray readableArrayAsArray = dynamic.asArray();
        if (readableArrayAsArray != null) {
            return new Pair<>(g(gk0Var, readableArrayAsArray, 0, z), g(gk0Var, readableArrayAsArray, 1, z));
        }
        throw new DynamicCastException(fwc.a.b(ReadableArray.class));
    }

    public final Object g(gk0 gk0Var, ReadableArray readableArray, int i, boolean z) {
        Dynamic dynamic = readableArray.getDynamic(i);
        try {
            Object objA = this.b.get(i).a(dynamic, gk0Var, z);
            dynamic.recycle();
            return objA;
        } catch (Throwable th) {
            try {
                CodedException codedException = !(th instanceof CodedException) ? th instanceof expo.modules.core.errors.CodedException ? new CodedException(((expo.modules.core.errors.CodedException) th).a(), ((expo.modules.core.errors.CodedException) th).getMessage(), ((expo.modules.core.errors.CodedException) th).getCause()) : new UnexpectedException(th) : (CodedException) th;
                zf8 zf8Var = this.a;
                zf8 zf8Var2 = zf8Var.g().get(i).b;
                zf8Var2.getClass();
                throw new CollectionElementCastException(zf8Var, zf8Var2, dynamic.getType(), codedException);
            } catch (Throwable th2) {
                dynamic.recycle();
                throw th2;
            }
        }
    }
}
