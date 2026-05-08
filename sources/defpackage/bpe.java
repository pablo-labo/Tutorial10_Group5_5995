package defpackage;

import java.io.IOException;
import org.apache.avro.AvroTypeException;
import org.apache.avro.g;
import org.apache.avro.path.TracingAvroTypeException;
import org.apache.avro.path.TracingClassCastException;
import org.apache.avro.path.TracingNullPointException;

/* JADX INFO: loaded from: classes3.dex */
public final class bpe<T> extends gx5<T> {
    @Override // defpackage.gx5
    public final void g(g gVar, Object obj, g54 g54Var) throws IOException {
        if (obj instanceof Enum) {
            g54Var.d(((Enum) obj).ordinal());
        } else {
            super.g(gVar, obj, g54Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [org.apache.avro.path.TracingNullPointException] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.apache.avro.path.TracingClassCastException] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Throwable, l6b] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.apache.avro.path.TracingAvroTypeException] */
    @Override // defpackage.gx5
    public final void h(Object obj, g.f fVar, g54 g54Var) {
        if (!(obj instanceof dpe)) {
            super.h(obj, fVar, g54Var);
            return;
        }
        fVar.getClass();
        String str = fVar.b;
        g gVar = fVar.d;
        gVar.getClass();
        int i = fVar.c;
        this.a.getClass();
        try {
            n(gVar, ((la7) obj).get(i), g54Var);
        } catch (TracingAvroTypeException e) {
            e = e;
            e.a(new g29(str));
            throw e;
        } catch (AvroTypeException e2) {
            throw gx5.a(e2, " in field '" + str + "'");
        } catch (TracingClassCastException e3) {
            e = e3;
            e.a(new g29(str));
            throw e;
        } catch (TracingNullPointException e4) {
            e = e4;
            e.a(new g29(str));
            throw e;
        }
    }

    @Override // defpackage.gx5
    public final void k(g gVar, Object obj, g54 g54Var) {
        if ((obj instanceof dpe) && ((zoe) this.a).k) {
            dpe dpeVar = (dpe) obj;
            if (dpeVar.n()) {
                try {
                    dpeVar.h(g54Var);
                    return;
                } catch (NullPointerException e) {
                    throw new TracingNullPointException(e, null, true);
                }
            }
        }
        super.k(gVar, obj, g54Var);
    }

    @Override // defpackage.gx5
    public final void l(Object obj, g54 g54Var) {
        if (!(obj instanceof CharSequence)) {
            zoe zoeVar = (zoe) this.a;
            if (zoeVar.j.contains(obj.getClass())) {
                obj = obj.toString();
            }
        }
        gx5.m(obj, g54Var);
    }
}
