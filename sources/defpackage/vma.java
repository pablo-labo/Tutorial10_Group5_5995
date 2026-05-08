package defpackage;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;

/* JADX INFO: loaded from: classes3.dex */
public final class vma<Type> implements owf<Type> {
    public final owf<Type> a;

    public vma(owf<Type> owfVar) {
        this.a = owfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.owf
    public final Type a(Object obj, gk0 gk0Var, boolean z) {
        if (obj == 0) {
            return null;
        }
        boolean z2 = obj instanceof Dynamic;
        if (z2 && ((Dynamic) obj).isNull()) {
            return null;
        }
        owf<Type> owfVar = this.a;
        return (!owfVar.b() || z || z2) ? owfVar.a(obj, gk0Var, z) : obj;
    }

    @Override // defpackage.owf
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(new SingleType(s23.j0, new ExpectedType[]{this.a.c()}));
    }
}
