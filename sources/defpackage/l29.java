package defpackage;

import defpackage.a5;
import defpackage.j29;

/* JADX INFO: loaded from: classes3.dex */
public final class l29 extends j29.i<Object> {
    public final /* synthetic */ y4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l29(j29 j29Var, x4 x4Var, y4 y4Var) {
        super(j29Var, x4Var);
        this.e = y4Var;
        this.d = null;
    }

    public static /* synthetic */ void d(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    @Override // j29.f
    public final j29.m<Object> b(boolean z) {
        return new j29.m<>(new a5.a(u63.Z(lx4.d)), false);
    }
}
