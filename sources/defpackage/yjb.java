package defpackage;

import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.p;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yjb extends n<yjb, a> implements up9 {
    private static final yjb DEFAULT_INSTANCE;
    private static volatile p4b<yjb> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private p.c<String> strings_ = c0.d;

    public static final class a extends n.a<yjb, a> implements up9 {
        public a() {
            super(yjb.DEFAULT_INSTANCE);
        }
    }

    static {
        yjb yjbVar = new yjb();
        DEFAULT_INSTANCE = yjbVar;
        n.m(yjb.class, yjbVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void o(yjb yjbVar, Iterable iterable) {
        if (!yjbVar.strings_.B0()) {
            p.c<String> cVar = yjbVar.strings_;
            int size = cVar.size();
            yjbVar.strings_ = cVar.Q0(size == 0 ? 10 : size * 2);
        }
        List list = yjbVar.strings_;
        Charset charset = p.a;
        if (iterable instanceof ot8) {
            List<?> listH = ((ot8) iterable).h();
            ot8 ot8Var = (ot8) list;
            int size2 = list.size();
            for (Object obj : listH) {
                if (obj == null) {
                    String str = "Element at index " + (ot8Var.size() - size2) + " is null.";
                    for (int size3 = ot8Var.size() - 1; size3 >= size2; size3--) {
                        ot8Var.remove(size3);
                    }
                    ja.k(str);
                    return;
                }
                if (obj instanceof tr1) {
                    ot8Var.f0((tr1) obj);
                } else {
                    ot8Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zmb) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                for (int size5 = list.size() - 1; size5 >= size4; size5--) {
                    list.remove(size5);
                }
                ja.k(str2);
                return;
            }
            list.add(obj2);
        }
    }

    public static yjb p() {
        return DEFAULT_INSTANCE;
    }

    public static a r() {
        return (a) ((n.a) DEFAULT_INSTANCE.i(n.f.e));
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final Object i(n.f fVar) {
        p4b bVar;
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new zic(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new yjb();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                p4b<yjb> p4bVar = PARSER;
                if (p4bVar != null) {
                    return p4bVar;
                }
                synchronized (yjb.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new n.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            default:
                b0.l();
                return null;
        }
    }

    public final p.c q() {
        return this.strings_;
    }
}
