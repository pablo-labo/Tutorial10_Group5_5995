package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ph8<T> implements xd4<T> {
    public final b<T> a;

    public static final class a<T> extends y3 {
        public a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b((Float) aVar.a, (Float) this.a) && wl7.b((af4) aVar.b, (af4) this.b);
        }

        public final int hashCode() {
            Float f = (Float) this.a;
            return ((af4) this.b).hashCode() + w40.c(0, (f != null ? f.hashCode() : 0) * 31, 31);
        }
    }

    public static final class b<T> extends qh8<T, a<T>> {
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
        public final a a(Float f, int i) {
            a aVar = new a(f, bf4.c);
            this.b.h(i, aVar);
            return aVar;
        }
    }

    public ph8(b<T> bVar) {
        this.a = bVar;
    }

    @Override // defpackage.jf5
    public final /* bridge */ /* synthetic */ omg b() {
        return a(q92.c0);
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
    @Override // defpackage.xd4, defpackage.yd0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final <V extends ge0> tmg<V> a(lvf<T, V> lvfVar) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        b<T> bVar = this.a;
        jh7 jh7Var = bVar.b;
        z2a z2aVar = new z2a(jh7Var.e + 2);
        a3a a3aVar = new a3a(jh7Var.e);
        int[] iArr3 = jh7Var.b;
        Object[] objArr3 = jh7Var.c;
        long[] jArr = jh7Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            a aVar = (a) objArr3[i6];
                            z2aVar.c(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            a3aVar.h(i7, new smg((ge0) lvfVar.a().invoke((Float) aVar.a), (af4) aVar.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!jh7Var.a(0)) {
            int i8 = z2aVar.b;
            if (i8 < 0) {
                l5.s("Index must be between 0 and size");
                return null;
            }
            z2aVar.d(i8 + 1);
            int[] iArr4 = z2aVar.a;
            int i9 = z2aVar.b;
            if (i9 != 0) {
                pyd.h(1, 0, i9, iArr4, iArr4);
            }
            iArr4[0] = 0;
            z2aVar.b++;
        }
        if (!jh7Var.a(bVar.a)) {
            z2aVar.c(bVar.a);
        }
        int i10 = z2aVar.b;
        if (i10 != 0) {
            int[] iArr5 = z2aVar.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new tmg<>(z2aVar, a3aVar, bVar.a, bf4.c);
    }
}
