package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class ape<T> extends cx5<T> {
    public static final String[] Y = System.getProperty("org.apache.avro.SERIALIZABLE_PACKAGES", "java.lang,java.math,java.io,java.net,org.apache.avro.reflect").split(",");
    public final ArrayList X;

    public ape(g gVar, g gVar2, zoe zoeVar) {
        super(gVar, gVar2, zoeVar);
        ArrayList arrayList = new ArrayList();
        this.X = arrayList;
        arrayList.addAll(Arrays.asList(Y));
    }

    @Override // defpackage.cx5
    public final Class b(g gVar) {
        int iOrdinal = gVar.K().ordinal();
        Class clsK = iOrdinal != 3 ? iOrdinal != 6 ? null : k("java-class", gVar) : k("java-key-class", gVar);
        return clsK != null ? clsK : super.b(gVar);
    }

    @Override // defpackage.cx5
    public final void d(Object obj, g.f fVar, Object obj2, d5d d5dVar) {
        if (!(obj instanceof dpe)) {
            super.d(obj, fVar, obj2, d5dVar);
            return;
        }
        Object objG = g(obj2, fVar.d, d5dVar);
        int i = fVar.c;
        this.a.getClass();
        ((la7) obj).c(i, objG);
    }

    @Override // defpackage.cx5
    public final Object e(Object obj, g gVar, d5d d5dVar) {
        zoe zoeVar = (zoe) this.a;
        if (zoeVar.k) {
            obj = zoeVar.p(obj, gVar);
            if (obj instanceof dpe) {
                dpe dpeVar = (dpe) obj;
                if (dpeVar.n()) {
                    dpeVar.f(d5dVar);
                    return dpeVar;
                }
            }
        }
        return super.e(obj, gVar, d5dVar);
    }

    public final void i(Class cls) {
        Package r0;
        ArrayList<String> arrayList = this.X;
        if ((arrayList.size() == 1 && "*".equals(arrayList.get(0))) || cls.isPrimitive() || (r0 = cls.getPackage()) == null) {
            return;
        }
        for (String str : arrayList) {
            if (r0.getName().equals(str)) {
                return;
            }
            if (r0.getName().startsWith(str + ".")) {
                return;
            }
        }
        throw new SecurityException(l5.m("Forbidden ", String.valueOf(cls), "! This class is not trusted to be included in Avro schema using java-class. Please set org.apache.avro.SERIALIZABLE_PACKAGES system property with the packages you trust."));
    }

    public final Class k(String str, g gVar) {
        String strE = gVar.e(str);
        if (strE == null) {
            return null;
        }
        try {
            Class<?> clsA = l62.a(this.a.a, strE);
            i(clsA);
            return clsA;
        } catch (ClassNotFoundException e) {
            throw new AvroRuntimeException(e);
        }
    }
}
