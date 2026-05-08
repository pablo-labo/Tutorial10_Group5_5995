package defpackage;

import androidx.datastore.preferences.protobuf.n;

/* JADX INFO: loaded from: classes.dex */
public final class qw5 implements qp9 {
    public static final qw5 a = new qw5();

    @Override // defpackage.qp9
    public final pp9 a(Class<?> cls) {
        if (!n.class.isAssignableFrom(cls)) {
            l5.q("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (pp9) n.j(cls.asSubclass(n.class)).i(n.f.c);
        } catch (Exception e) {
            l6.p("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // defpackage.qp9
    public final boolean b(Class<?> cls) {
        return n.class.isAssignableFrom(cls);
    }
}
