package expo.modules.kotlin.jni;

import defpackage.s23;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lexpo/modules/kotlin/jni/SingleType;", "", "", "getCppType", "()I", "Lexpo/modules/kotlin/jni/ExpectedType;", "getFirstParameterType", "()Lexpo/modules/kotlin/jni/ExpectedType;", "getSecondParameterType", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SingleType {
    public final s23 a;
    public final ExpectedType[] b;

    public SingleType(s23 s23Var, ExpectedType[] expectedTypeArr) {
        s23Var.getClass();
        this.a = s23Var;
        this.b = expectedTypeArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SingleType.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SingleType singleType = (SingleType) obj;
        return this.a == singleType.a && Arrays.equals(this.b, singleType.b);
    }

    public final int getCppType() {
        return this.a.c();
    }

    public final ExpectedType getFirstParameterType() {
        ExpectedType[] expectedTypeArr = this.b;
        if (expectedTypeArr != null) {
            return expectedTypeArr[0];
        }
        return null;
    }

    public final ExpectedType getSecondParameterType() {
        ExpectedType[] expectedTypeArr = this.b;
        if (expectedTypeArr != null) {
            return expectedTypeArr[1];
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ExpectedType[] expectedTypeArr = this.b;
        return iHashCode + (expectedTypeArr != null ? Arrays.hashCode(expectedTypeArr) : 0);
    }
}
