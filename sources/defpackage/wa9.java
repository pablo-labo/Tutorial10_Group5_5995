package defpackage;

import androidx.datastore.preferences.protobuf.p;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class wa9 {
    public static final a b = new a();
    public final b a;

    public static class a implements qp9 {
        @Override // defpackage.qp9
        public final pp9 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // defpackage.qp9
        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    public static class b implements qp9 {
        public qp9[] a;

        @Override // defpackage.qp9
        public final pp9 a(Class<?> cls) {
            for (qp9 qp9Var : this.a) {
                if (qp9Var.b(cls)) {
                    return qp9Var.a(cls);
                }
            }
            b0.u("No factory is available for message type: ".concat(cls.getName()));
            return null;
        }

        @Override // defpackage.qp9
        public final boolean b(Class<?> cls) {
            for (qp9 qp9Var : this.a) {
                if (qp9Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public wa9() {
        qp9 qp9Var;
        try {
            qp9Var = (qp9) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            qp9Var = b;
        }
        qp9[] qp9VarArr = {qw5.a, qp9Var};
        b bVar = new b();
        bVar.a = qp9VarArr;
        Charset charset = p.a;
        this.a = bVar;
    }
}
