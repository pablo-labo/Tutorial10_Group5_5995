package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.AvroTypeException;
import org.apache.avro.UnresolvedUnionException;
import org.apache.avro.a;
import org.apache.avro.g;
import org.apache.avro.path.TracingAvroTypeException;
import org.apache.avro.path.TracingClassCastException;
import org.apache.avro.path.TracingNullPointException;

/* JADX INFO: loaded from: classes3.dex */
public class gx5<D> implements xg3<D> {
    public final ax5 a;
    public final g b;

    public gx5(g gVar, ax5 ax5Var) {
        this.a = ax5Var;
        this.b = gVar;
    }

    public static AvroTypeException a(AvroTypeException avroTypeException, String str) {
        AvroTypeException avroTypeException2 = new AvroTypeException(t40.k(avroTypeException.getMessage(), str));
        Throwable cause = avroTypeException.getCause();
        AvroTypeException cause2 = avroTypeException;
        if (cause != null) {
            cause2 = avroTypeException.getCause();
        }
        avroTypeException2.initCause(cause2);
        return avroTypeException2;
    }

    public static void b(Object obj, g gVar) {
        throw new AvroTypeException(t40.l("value ", ipd.a(obj), " is not a ", ipd.b(gVar)));
    }

    public static void f(Object obj, g54 g54Var) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (iLimit == 0) {
            g54Var.i();
        } else {
            g54Var.d(iLimit);
            g54Var.c(byteBuffer);
        }
    }

    public static void i(g gVar, Object obj, g54 g54Var) throws IOException {
        g54Var.b(0, ((cz5) obj).e(), gVar.D());
    }

    public static void m(Object obj, g54 g54Var) {
        CharSequence charSequence = (CharSequence) obj;
        if (!(charSequence instanceof rjg)) {
            g54Var.h(charSequence.toString());
            return;
        }
        rjg rjgVar = (rjg) charSequence;
        byte[] bArrE = rjgVar.e();
        int iC = rjgVar.c();
        if (iC == 0) {
            g54Var.i();
        } else {
            g54Var.d(iC);
            g54Var.b(0, bArrE, iC);
        }
    }

    public final void c(Object obj, g54 g54Var) {
        g gVar = this.b;
        try {
            d(gVar, obj, g54Var);
        } catch (TracingAvroTypeException | TracingClassCastException | TracingNullPointException e) {
            throw ((RuntimeException) e.b(gVar));
        }
    }

    public final void d(g gVar, Object obj, g54 g54Var) {
        p49 p49VarG = gVar.G();
        if (obj == null || p49VarG == null) {
            n(gVar, obj, g54Var);
            return;
        }
        Map map = (Map) this.a.c.get(obj.getClass());
        xy2 xy2Var = map != null ? (xy2) map.get(p49VarG.a) : null;
        if (xy2Var != null) {
            try {
                a.b(obj, gVar, p49VarG, xy2Var);
            } catch (AvroRuntimeException e) {
                Throwable cause = e.getCause();
                if (cause != null && cause.getClass() == ClassCastException.class) {
                    throw ((ClassCastException) cause);
                }
                throw e;
            }
        }
        n(gVar, obj, g54Var);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Throwable, l6b, org.apache.avro.path.TracingClassCastException] */
    public final void e(g gVar, Object obj, g54 g54Var) throws IOException {
        g gVarX = gVar.x();
        Collection collection = (Collection) obj;
        long size = collection.size();
        g54Var.a(size);
        Iterator it = collection.iterator();
        long j = 0;
        while (it.hasNext()) {
            try {
                d(gVarX, it.next(), g54Var);
                j++;
            } catch (TracingAvroTypeException | TracingClassCastException | TracingNullPointException e) {
                e.a(new mt0(j));
                throw e;
            }
        }
        g54Var.i();
        if (j != size) {
            throw new ConcurrentModificationException(r6.d(j, ". ", w40.i(size, "Size of array written was ", ", but number of elements written was ")));
        }
    }

    public void g(g gVar, Object obj, g54 g54Var) {
        if (!this.a.n(obj)) {
            throw new TracingAvroTypeException(new AvroTypeException(t40.l("value ", ipd.a(obj), " is not a ", ipd.b(gVar))));
        }
        g54Var.d(gVar.z(obj.toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [org.apache.avro.path.TracingNullPointException] */
    /* JADX WARN: Type inference failed for: r5v4, types: [org.apache.avro.path.TracingAvroTypeException] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Throwable, l6b] */
    /* JADX WARN: Type inference failed for: r5v9, types: [org.apache.avro.path.TracingClassCastException] */
    public void h(Object obj, g.f fVar, g54 g54Var) {
        String str = fVar.b;
        g gVar = fVar.d;
        int i = fVar.c;
        this.a.getClass();
        Object obj2 = ((la7) obj).get(i);
        try {
            d(gVar, obj2, g54Var);
        } catch (NullPointerException e) {
            e = e;
            NullPointerException nullPointerException = new NullPointerException(t40.k(e.getMessage(), l5.l(" in field ", str)));
            if (e.getCause() != null) {
                e = e.getCause();
            }
            nullPointerException.initCause(e);
            throw nullPointerException;
        } catch (UnresolvedUnionException e2) {
            UnresolvedUnionException unresolvedUnionException = new UnresolvedUnionException(gVar, fVar, obj2);
            unresolvedUnionException.addSuppressed(e2);
            throw unresolvedUnionException;
        } catch (TracingClassCastException e3) {
            e = e3;
            e.a(new g29(str));
            throw e;
        } catch (ClassCastException e4) {
            e = e4;
            ClassCastException classCastException = new ClassCastException(t40.k(e.getMessage(), l5.l(" in field ", str)));
            if (e.getCause() != null) {
                e = e.getCause();
            }
            classCastException.initCause(e);
            throw classCastException;
        } catch (TracingAvroTypeException e5) {
            e = e5;
            e.a(new g29(str));
            throw e;
        } catch (AvroTypeException e6) {
            throw a(e6, " in field " + str);
        } catch (TracingNullPointException e7) {
            e = e7;
            e.a(new g29(str));
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Throwable, l6b, org.apache.avro.path.TracingNullPointException] */
    public final void j(g gVar, Object obj, g54 g54Var) throws IOException {
        g gVarM = gVar.M();
        Map map = (Map) obj;
        int size = map.size();
        g54Var.a(size);
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            try {
                String string = entry.getKey().toString();
                m(string, g54Var);
                try {
                    d(gVarM, entry.getValue(), g54Var);
                    i++;
                } catch (TracingAvroTypeException | TracingClassCastException | TracingNullPointException e) {
                    e.a(new vb9(string));
                    throw e;
                }
            } catch (NullPointerException e2) {
                TracingNullPointException tracingNullPointException = new TracingNullPointException(e2, g.s(g.u.STRING), false);
                tracingNullPointException.a(new vb9(null));
                throw tracingNullPointException;
            }
        }
        g54Var.i();
        if (i != size) {
            throw new ConcurrentModificationException(w40.e("Size of map written was ", size, ", but number of entries written was ", i, ". "));
        }
    }

    public void k(g gVar, Object obj, g54 g54Var) {
        this.a.getClass();
        Iterator<g.f> it = gVar.C().iterator();
        while (it.hasNext()) {
            h(obj, it.next(), g54Var);
        }
    }

    public void l(Object obj, g54 g54Var) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Throwable, l6b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(org.apache.avro.g r5, java.lang.Object r6, defpackage.g54 r7) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx5.n(org.apache.avro.g, java.lang.Object, g54):void");
    }
}
