package defpackage;

import defpackage.qo7;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iic {
    public static final a a = new a();
    public static final s3 b;

    public static final class a extends iic implements Serializable {

        /* JADX INFO: renamed from: iic$a$a, reason: collision with other inner class name */
        public static final class C0268a implements Serializable {
            public static final C0268a a = new C0268a();
            private static final long serialVersionUID = 0;

            private final Object readResolve() {
                return iic.a;
            }
        }

        private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() {
            return C0268a.a;
        }
    }

    static {
        tbb.a.getClass();
        Integer num = qo7.a.a;
        b = (num == null || num.intValue() >= 34) ? new wcb() : new q65();
    }
}
