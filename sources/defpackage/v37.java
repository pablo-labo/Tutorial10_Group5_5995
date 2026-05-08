package defpackage;

import defpackage.f47;
import defpackage.ryc;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v37<K, V> extends f47<K, V> {
    private static final long serialVersionUID = 912559;

    public static final class a<K, V> extends f47.a<K, V> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f47.a
        public final f47.a b(Object obj, Object obj2) {
            super.b(obj, obj2);
            return this;
        }

        @Override // f47.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final pyc a() {
            return this.b == 0 ? pyc.X : new pyc(this.a, this.b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d(wpf wpfVar, String str) {
            super.b(wpfVar, str);
        }
    }

    public static class b<K, V> extends f47.b<K, V> {
        private static final long serialVersionUID = 0;

        @Override // f47.b
        public final f47.a a(int i) {
            return new a(i);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.f47
    public final x37 f() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.f47
    /* JADX INFO: renamed from: g */
    public final x37 values() {
        pyc pycVarH = h();
        i47<K> i47Var = pycVarH.b;
        if (i47Var != null) {
            return i47Var;
        }
        ryc.b bVarD = pycVarH.d();
        pycVarH.b = bVarD;
        return bVarD;
    }

    public abstract pyc h();

    @Override // defpackage.f47, java.util.Map
    public final Collection values() {
        pyc pycVarH = h();
        i47<K> i47Var = pycVarH.b;
        if (i47Var != null) {
            return i47Var;
        }
        ryc.b bVarD = pycVarH.d();
        pycVarH.b = bVarD;
        return bVarD;
    }

    @Override // defpackage.f47
    public Object writeReplace() {
        return new b(this);
    }
}
