package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class t3b implements ParameterizedType, Type {
    public final Class<?> a;
    public final Type b;
    public final Type[] c;

    public static final /* synthetic */ class a extends qv5 implements Function1<Type, String> {
        public static final a a = new a(1, kzf.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Type type) {
            Type type2 = type;
            type2.getClass();
            return kzf.a(type2);
        }
    }

    public t3b(Class cls, Type type, ArrayList arrayList) {
        this.a = cls;
        this.b = type;
        this.c = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return this.a.equals(parameterizedType.getRawType()) && wl7.b(this.b, parameterizedType.getOwnerType()) && Arrays.equals(this.c, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class<?> cls = this.a;
        Type type = this.b;
        if (type != null) {
            sb.append(kzf.a(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(kzf.a(cls));
        }
        Type[] typeArr = this.c;
        if (typeArr.length != 0) {
            ut0.q0(typeArr, sb, ", ", "<", ">", "...", a.a);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Type type = this.b;
        return Arrays.hashCode(this.c) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
    }

    public final String toString() {
        return getTypeName();
    }
}
