package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class kvc extends vvc implements tu7 {
    public final Type a;
    public final su7 b;

    public kvc(Type type) {
        su7 hvcVar;
        type.getClass();
        this.a = type;
        if (type instanceof Class) {
            hvcVar = new hvc((Class) type);
        } else if (type instanceof TypeVariable) {
            hvcVar = new wvc((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                r40.i("Not a classifier type (", type.getClass(), "): ", type);
                throw null;
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            hvcVar = new hvc((Class) rawType);
        }
        this.b = hvcVar;
    }

    @Override // defpackage.tu7
    public final su7 a() {
        return this.b;
    }

    @Override // defpackage.tu7
    public final boolean e() {
        Type type = this.a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            typeParameters.getClass();
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    @Override // defpackage.tu7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList f() {
        /*
            r5 = this;
            java.lang.reflect.Type r5 = r5.a
            java.util.List r5 = defpackage.wuc.c(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.t92.r0(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L17:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r5.next()
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            r1.getClass()
            boolean r2 = r1 instanceof java.lang.Class
            if (r2 == 0) goto L39
            r3 = r1
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r4 = r3.isPrimitive()
            if (r4 == 0) goto L39
            tvc r1 = new tvc
            r1.<init>(r3)
            goto L62
        L39:
            boolean r3 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r3 != 0) goto L5c
            if (r2 == 0) goto L49
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L49
            goto L5c
        L49:
            boolean r2 = r1 instanceof java.lang.reflect.WildcardType
            if (r2 == 0) goto L56
            yvc r2 = new yvc
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            r2.<init>(r1)
        L54:
            r1 = r2
            goto L62
        L56:
            kvc r2 = new kvc
            r2.<init>(r1)
            goto L54
        L5c:
            bvc r2 = new bvc
            r2.<init>(r1)
            goto L54
        L62:
            r0.add(r1)
            goto L17
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvc.f():java.util.ArrayList");
    }

    @Override // defpackage.ku7
    public final Collection<fu7> getAnnotations() {
        return zr4.a;
    }

    @Override // defpackage.tu7
    public final String m() {
        return this.a.toString();
    }

    @Override // defpackage.tu7
    public final String o() {
        throw new UnsupportedOperationException("Type not found: " + this.a);
    }

    @Override // defpackage.vvc, defpackage.ku7
    public final fu7 p(mq5 mq5Var) {
        mq5Var.getClass();
        return null;
    }

    @Override // defpackage.vvc
    public final Type s() {
        return this.a;
    }
}
