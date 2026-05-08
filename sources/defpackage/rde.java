package defpackage;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.exception.Exceptions$AppContextLost;
import expo.modules.kotlin.exception.InvalidSharedObjectIdException;
import expo.modules.kotlin.exception.UsingReleasedSharedObjectException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class rde<T extends SharedObject> extends kka<T> {
    public final zf8 a;

    public rde(zf8 zf8Var) {
        zf8Var.getClass();
        this.a = zf8Var;
    }

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(s23.g0, s23.b);
    }

    @Override // defpackage.kka
    public final Object d(Object obj, gk0 gk0Var, boolean z) throws UsingReleasedSharedObjectException, InvalidSharedObjectIdException, Exceptions$AppContextLost {
        int iAsInt = obj instanceof Dynamic ? ((Dynamic) obj).asInt() : ((Integer) obj).intValue();
        if (gk0Var == null) {
            throw new Exceptions$AppContextLost();
        }
        ohd ohdVar = gk0Var.b;
        ohdVar.getClass();
        b49 b49Var = ohdVar.g;
        LinkedHashMap linkedHashMap = (LinkedHashMap) b49Var.c;
        if (!linkedHashMap.containsKey(new qde(iAsInt)) && iAsInt != 0 && iAsInt < b49Var.a) {
            throw new UsingReleasedSharedObjectException();
        }
        Pair pair = (Pair) linkedHashMap.get(new qde(iAsInt));
        SharedObject sharedObject = pair != null ? (SharedObject) pair.d() : null;
        if (sharedObject != null) {
            return sharedObject;
        }
        throw new InvalidSharedObjectIdException();
    }
}
