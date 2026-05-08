package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.e;
import androidx.datastore.preferences.protobuf.n;
import defpackage.ja;
import defpackage.l5;
import defpackage.sp9;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    public interface a {
        int getNumber();
    }

    public interface b {
        boolean a();
    }

    public interface c<E> extends List<E>, RandomAccess {
        boolean B0();

        void G();

        c<E> Q0(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new e.a(bArr, 0, 0, false).f(0);
        } catch (InvalidProtocolBufferException e) {
            defpackage.b0.s(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ja.k(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static n c(Object obj, Object obj2) {
        n.a aVarC = ((sp9) obj).c();
        sp9 sp9Var = (sp9) obj2;
        if (!aVarC.a.getClass().isInstance(sp9Var)) {
            l5.q("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        aVarC.j();
        n.a.k(aVarC.b, (n) ((androidx.datastore.preferences.protobuf.a) sp9Var));
        return aVarC.i();
    }
}
