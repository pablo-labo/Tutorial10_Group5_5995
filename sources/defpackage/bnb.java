package defpackage;

import java.util.Set;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public enum bnb {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    private final Lazy arrayTypeFqName$delegate;
    private final n8a arrayTypeName;
    private final Lazy typeFqName$delegate;
    private final n8a typeName;
    public static final Set<bnb> a = ut0.I0(new bnb[]{CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE});

    bnb(String str) {
        this.typeName = n8a.h(str);
        this.arrayTypeName = n8a.h(str.concat("Array"));
        int i = 5;
        i14 i14Var = new i14(this, i);
        qt8 qt8Var = qt8.b;
        this.typeFqName$delegate = boa.E(qt8Var, i14Var);
        this.arrayTypeFqName$delegate = boa.E(qt8Var, new c5(this, i));
    }

    public static mq5 a(bnb bnbVar) {
        return ere.l.a(bnbVar.typeName);
    }

    public static mq5 c(bnb bnbVar) {
        return ere.l.a(bnbVar.arrayTypeName);
    }

    public final mq5 e() {
        return (mq5) this.arrayTypeFqName$delegate.getValue();
    }

    public final n8a f() {
        return this.arrayTypeName;
    }

    public final mq5 h() {
        return (mq5) this.typeFqName$delegate.getValue();
    }

    public final n8a m() {
        return this.typeName;
    }
}
