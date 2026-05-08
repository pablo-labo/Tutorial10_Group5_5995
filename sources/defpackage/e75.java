package defpackage;

import defpackage.ax5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntFunction;
import org.apache.avro.f;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class e75 {
    public final ax5 a;
    public final Map<g, Map<g, d>> b = Collections.synchronizedMap(new lug());
    public final boolean c = true;
    public final boolean d = true;

    public interface a {
        void f(Object obj, ka6 ka6Var);
    }

    public interface b extends wg3<Object> {
        default boolean a() {
            return false;
        }
    }

    public static class c implements b {
        public final b a;
        public final b b;

        public c(b bVar, b bVar2) {
            this.a = bVar;
            this.b = bVar2;
        }

        @Override // defpackage.wg3
        public final Object j(Object obj, ka6 ka6Var) {
            long jX0 = ka6Var.X0();
            HashMap map = new HashMap();
            while (jX0 > 0) {
                for (int i = 0; i < jX0; i++) {
                    map.put(this.a.j(null, ka6Var), this.b.j(null, ka6Var));
                }
                jX0 = ka6Var.F0();
            }
            return map;
        }
    }

    public static class d implements b {
        public a[] a;
        public ax5.f b;
        public g c;
        public a d = a.a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a a;
            public static final a b;
            public static final a c;
            public static final /* synthetic */ a[] d;

            static {
                a aVar = new a("NEW", 0);
                a = aVar;
                a aVar2 = new a("INITIALIZING", 1);
                b = aVar2;
                a aVar3 = new a("INITIALIZED", 2);
                c = aVar3;
                d = new a[]{aVar, aVar2, aVar3};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) d.clone();
            }
        }

        @Override // e75.b
        public final boolean a() {
            return true;
        }

        @Override // defpackage.wg3
        public final Object j(Object obj, ka6 ka6Var) {
            Object objG = this.b.g(obj, this.c);
            for (a aVar : this.a) {
                aVar.f(objG, ka6Var);
            }
            return objG;
        }
    }

    public interface e extends b {
        @Override // e75.b
        default boolean a() {
            return true;
        }
    }

    public e75(ax5 ax5Var) {
        this.a = ax5Var;
    }

    public static a b(g.f fVar, final b bVar) {
        final int i = fVar.c;
        return bVar.a() ? new a() { // from class: b75
            @Override // e75.a
            public final void f(Object obj, ka6 ka6Var) {
                la7 la7Var = (la7) obj;
                int i2 = i;
                la7Var.c(i2, bVar.j(la7Var.get(i2), ka6Var));
            }
        } : new a() { // from class: c75
            @Override // e75.a
            public final void f(Object obj, ka6 ka6Var) {
                ((la7) obj).c(i, bVar.j(null, ka6Var));
            }
        };
    }

    public static b c(g gVar) {
        return "String".equals(gVar.e("avro.java.string")) ? new bg(7) : new ia(8);
    }

    public final b a(g gVar, g gVar2) {
        return d(f.a(g.q(g.q(gVar, gVar2), gVar2), gVar2, this.a, new HashMap()), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e4  */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v46, types: [e75$b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r1v1, types: [a75] */
    /* JADX WARN: Type inference failed for: r1v15, types: [e75$c] */
    /* JADX WARN: Type inference failed for: r1v16, types: [z25] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [e75$b] */
    /* JADX WARN: Type inference failed for: r1v22, types: [e75$d] */
    /* JADX WARN: Type inference failed for: r8v0, types: [e75] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e75.b d(org.apache.avro.f.a r9, defpackage.xy2<?> r10) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e75.d(org.apache.avro.f$a, xy2):e75$b");
    }

    public final b e(String str, b bVar) {
        Optional optionalEmpty;
        if (str != null) {
            try {
                optionalEmpty = Optional.of(this.a.a.loadClass(str));
            } catch (ReflectiveOperationException unused) {
                optionalEmpty = Optional.empty();
            }
            Function function = (Function) optionalEmpty.map(new t65(0)).orElse(null);
            if (function != null) {
                return new u65(function, bVar);
            }
        }
        return bVar;
    }

    public final void f(d dVar, f.h hVar) throws IOException {
        a aVarB;
        dVar.d = d.a.b;
        ax5.f fVar = hVar.h;
        f.a[] aVarArr = hVar.d;
        g.f[] fVarArr = hVar.e;
        g gVar = hVar.b;
        IntFunction v65Var = fVar.g(null, gVar) instanceof dpe ? new v65() : new w65();
        int length = (aVarArr.length + fVarArr.length) - hVar.f;
        a[] aVarArr2 = new a[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < aVarArr.length) {
            f.a aVar = aVarArr[i2];
            if (aVar instanceof f.i) {
                aVarArr2[i2] = new i73((f.i) aVar, 2);
            } else {
                int i4 = i3 + 1;
                g.f fVar2 = fVarArr[i3];
                aVarArr2[i2] = b(fVar2, d(aVar, (xy2) v65Var.apply(fVar2.c)));
                i3 = i4;
            }
            i2++;
        }
        while (i2 < length) {
            int i5 = i3 + 1;
            g.f fVar3 = fVarArr[i3];
            Object objJ = this.a.j(fVar3);
            g gVar2 = fVar3.d;
            if (objJ == null || (objJ instanceof Number) || (objJ instanceof String) || (objJ instanceof kx5) || objJ.getClass().isEnum()) {
                aVarB = b(fVar3, new x65(objJ));
            } else if (objJ instanceof rjg) {
                aVarB = b(fVar3, new r91(this, objJ));
            } else if ((objJ instanceof List) && ((List) objJ).isEmpty()) {
                aVarB = b(fVar3, new z65(i, this, fVar3));
            } else if ((objJ instanceof Map) && ((Map) objJ).isEmpty()) {
                aVarB = b(fVar3, new q20(this, 4));
            } else {
                b bVarA = a(gVar2, gVar2);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                fo1 fo1VarA = bt4.b.a(byteArrayOutputStream);
                w6.b.getClass();
                e5d.a(fo1VarA, gVar2, fVar3.f);
                fo1VarA.flush();
                aVarB = b(fVar3, new rk3(bVarA, byteArrayOutputStream.toByteArray()));
            }
            aVarArr2[i2] = aVarB;
            i2++;
            i3 = i5;
        }
        ax5.f fVar4 = hVar.h;
        dVar.a = aVarArr2;
        dVar.c = gVar;
        dVar.b = fVar4;
        dVar.d = d.a.c;
    }
}
