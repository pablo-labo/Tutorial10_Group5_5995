package defpackage;

import defpackage.az2;
import defpackage.bv1;
import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class bad {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final Call.Factory b;
    public final HttpUrl c;
    public final List<az2.a> d;
    public final List<bv1.a> e;
    public final Executor f;

    public class a implements InvocationHandler {
        public final zab a = zab.b;
        public final Object[] b = new Object[0];
        public final /* synthetic */ Class c;

        public a(Class cls) {
            this.c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            m8e m8eVarB;
            zab zabVar = this.a;
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.b;
            }
            zabVar.getClass();
            if (method.isDefault()) {
                Class<?> cls = this.c;
                Constructor<MethodHandles.Lookup> constructor = zabVar.a;
                return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
            }
            bad badVar = bad.this;
            m8e m8eVar = (m8e) badVar.a.get(method);
            if (m8eVar == null) {
                synchronized (badVar.a) {
                    try {
                        m8eVarB = (m8e) badVar.a.get(method);
                        if (m8eVarB == null) {
                            m8eVarB = m8e.b(badVar, method);
                            badVar.a.put(method, m8eVarB);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                m8eVar = m8eVarB;
            }
            return m8eVar.a(objArr);
        }
    }

    public static final class b {
        public final zab a;
        public OkHttpClient b;
        public HttpUrl c;
        public final ArrayList d;
        public final ArrayList e;

        public b() {
            zab zabVar = zab.b;
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = zabVar;
        }

        public final void a(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            HttpUrl.k.getClass();
            HttpUrl httpUrlC = HttpUrl.Companion.c(str);
            if ("".equals(httpUrlC.f.get(r0.size() - 1))) {
                this.c = httpUrlC;
            } else {
                akb.o(httpUrlC, "baseUrl must end in /: ");
            }
        }

        public final bad b() {
            if (this.c == null) {
                r6.g("Base URL required.");
                return null;
            }
            OkHttpClient okHttpClient = this.b;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            OkHttpClient okHttpClient2 = okHttpClient;
            Executor executorA = this.a.a();
            ArrayList arrayList = new ArrayList(this.e);
            arrayList.addAll(Arrays.asList(zd2.a, new fm3(executorA)));
            ArrayList arrayList2 = this.d;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 2);
            ap1 ap1Var = new ap1();
            ap1Var.a = true;
            arrayList3.add(ap1Var);
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(Collections.singletonList(iva.a));
            return new bad(okHttpClient2, this.c, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList), executorA);
        }

        public final void c(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            this.b = okHttpClient;
        }
    }

    public bad(Call.Factory factory, HttpUrl httpUrl, List list, List list2, Executor executor) {
        this.b = factory;
        this.c = httpUrl;
        this.d = list;
        this.e = list2;
        this.f = executor;
    }

    public final bv1<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<bv1.a> list = this.e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            bv1<?, ?> bv1VarA = list.get(i).a(type, annotationArr);
            if (bv1VarA != null) {
                return bv1VarA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> T b(Class<T> cls) {
        if (!cls.isInterface()) {
            l5.q("API declarations must be interfaces.");
            return null;
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<T> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public final <T> az2<T, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<az2.a> list = this.d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            az2<T, RequestBody> az2Var = (az2<T, RequestBody>) list.get(i).a(type, annotationArr, annotationArr2, this);
            if (az2Var != null) {
                return az2Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> az2<ResponseBody, T> d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<az2.a> list = this.d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            az2<ResponseBody, T> az2Var = (az2<ResponseBody, T>) list.get(i).b(type, annotationArr, this);
            if (az2Var != null) {
                return az2Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<az2.a> list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).getClass();
        }
    }
}
