package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes3.dex */
public final class c4d {
    public final Method a;
    public final HttpUrl b;
    public final String c;
    public final String d;
    public final Headers e;
    public final MediaType f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final r3b<?>[] j;
    public final boolean k;

    public static final class a {
        public static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        public static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        public final bad a;
        public final Method b;
        public final Annotation[] c;
        public final Annotation[][] d;
        public final Type[] e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public String n;
        public boolean o;
        public boolean p;
        public boolean q;
        public String r;
        public Headers s;
        public MediaType t;
        public LinkedHashSet u;
        public r3b<?>[] v;
        public boolean w;

        public a(bad badVar, Method method) {
            this.a = badVar;
            this.b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z) {
            String str3 = this.n;
            Method method = this.b;
            if (str3 != null) {
                throw fkg.i(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.n = str;
            this.o = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            Pattern pattern = x;
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (pattern.matcher(strSubstring).find()) {
                    throw fkg.i(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.r = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.u = linkedHashSet;
        }

        public final void c(int i, Type type) {
            if (fkg.g(type)) {
                throw fkg.j(this.b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public c4d(a aVar) {
        this.a = aVar.b;
        this.b = aVar.a.c;
        this.c = aVar.n;
        this.d = aVar.r;
        this.e = aVar.s;
        this.f = aVar.t;
        this.g = aVar.o;
        this.h = aVar.p;
        this.i = aVar.q;
        this.j = aVar.v;
        this.k = aVar.w;
    }
}
