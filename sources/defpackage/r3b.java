package defpackage;

import defpackage.ap1;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r3b<T> {

    public static final class a<T> extends r3b<T> {
        public final Method a;
        public final int b;
        public final az2<T, RequestBody> c;

        public a(Method method, int i, az2<T, RequestBody> az2Var) {
            this.a = method;
            this.b = i;
            this.c = az2Var;
        }

        @Override // defpackage.r3b
        public final void a(s3d s3dVar, T t) {
            int i = this.b;
            Method method = this.a;
            if (t == null) {
                throw fkg.j(method, i, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                s3dVar.k = this.c.convert(t);
            } catch (IOException e) {
                throw fkg.k(method, e, i, v40.e(t, "Unable to convert ", " to RequestBody"), new Object[0]);
            }
        }
    }

    public static final class b<T> extends r3b<T> {
        public final String a;
        public final ap1.d b;
        public final boolean c;

        public b(String str, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = ap1.d.a;
            this.c = z;
        }

        @Override // defpackage.r3b
        public final void a(s3d s3dVar, T t) {
            if (t == null) {
                return;
            }
            this.b.getClass();
            String string = t.toString();
            if (string == null) {
                return;
            }
            s3dVar.a(this.a, string, this.c);
        }
    }

    public static final class c<T> extends r3b<Map<String, T>> {
        public final Method a;
        public final int b;
        public final boolean c;

        public c(int i, Method method, boolean z) {
            this.a = method;
            this.b = i;
            this.c = z;
        }

        @Override // defpackage.r3b
        public final void a(s3d s3dVar, Object obj) {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map == null) {
                throw fkg.j(method, i, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw fkg.j(method, i, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw fkg.j(method, i, l5.m("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw fkg.j(method, i, "Field map value '" + value + "' converted to null by " + ap1.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                s3dVar.a(str, string, this.c);
            }
        }
    }

    public static final class d<T> extends r3b<T> {
        public final String a;
        public final ap1.d b;

        public d(String str) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = ap1.d.a;
        }

        @Override // defpackage.r3b
        public final void a(s3d s3dVar, T t) {
            if (t == null) {
                return;
            }
            this.b.getClass();
            String string = t.toString();
            if (string == null) {
                return;
            }
            s3dVar.b(this.a, string);
        }
    }

    public static final class e<T> extends r3b<Map<String, T>> {
        public final Method a;
        public final int b;

        public e(int i, Method method) {
            this.a = method;
            this.b = i;
        }

        @Override // defpackage.r3b
        public final void a(s3d s3dVar, Object obj) {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map == null) {
                throw fkg.j(method, i, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw fkg.j(method, i, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw fkg.j(method, i, l5.m("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                s3dVar.b(str, value.toString());
            }
        }
    }

    public static final class f extends r3b<Headers> {
        public final Method a;
        public final int b;

        public f(int i, Method method) {
            this.a = method;
            this.b = i;
        }

        @Override // defpackage.r3b
        public final void a(s3d s3dVar, Headers headers) {
            Headers headers2 = headers;
            if (headers2 == null) {
                throw fkg.j(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
            }
            Headers.Builder builder = s3dVar.f;
            builder.getClass();
            int size = headers2.size();
            for (int i = 0; i < size; i++) {
                builder.c(headers2.b(i), headers2.g(i));
            }
        }
    }

    public static final class g<T> extends r3b<T> {
        public final Method a;
        public final int b;
        public final Headers c;
        public final az2<T, RequestBody> d;

        public g(Method method, int i, Headers headers, az2<T, RequestBody> az2Var) {
            this.a = method;
            this.b = i;
            this.c = headers;
            this.d = az2Var;
        }

        @Override // defpackage.r3b
        public final void a(s3d s3dVar, T t) {
            if (t == null) {
                return;
            }
            try {
                RequestBody requestBodyConvert = this.d.convert(t);
                MultipartBody.Builder builder = s3dVar.i;
                builder.getClass();
                requestBodyConvert.getClass();
                MultipartBody.Part.c.getClass();
                builder.c.add(MultipartBody.Part.Companion.a(this.c, requestBodyConvert));
            } catch (IOException e) {
                throw fkg.j(this.a, this.b, v40.e(t, "Unable to convert ", " to RequestBody"), e);
            }
        }
    }

    public static final class h<T> extends r3b<Map<String, T>> {
        public final Method a;
        public final int b;
        public final az2<T, RequestBody> c;
        public final String d;

        public h(Method method, int i, az2<T, RequestBody> az2Var, String str) {
            this.a = method;
            this.b = i;
            this.c = az2Var;
            this.d = str;
        }

        @Override // defpackage.r3b
        public final void a(s3d s3dVar, Object obj) {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map == null) {
                throw fkg.j(method, i, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw fkg.j(method, i, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw fkg.j(method, i, l5.m("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                String[] strArr = {"Content-Disposition", l5.m("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.d};
                Headers.b.getClass();
                Headers headersD = Headers.Companion.d(strArr);
                RequestBody requestBodyConvert = this.c.convert((T) value);
                MultipartBody.Builder builder = s3dVar.i;
                builder.getClass();
                requestBodyConvert.getClass();
                MultipartBody.Part.c.getClass();
                builder.c.add(MultipartBody.Part.Companion.a(headersD, requestBodyConvert));
            }
        }
    }

    public static final class i<T> extends r3b<T> {
        public final Method a;
        public final int b;
        public final String c;
        public final ap1.d d;
        public final boolean e;

        public i(Method method, int i, String str, boolean z) {
            this.a = method;
            this.b = i;
            Objects.requireNonNull(str, "name == null");
            this.c = str;
            this.d = ap1.d.a;
            this.e = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
        @Override // defpackage.r3b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(defpackage.s3d r18, T r19) throws java.io.EOFException {
            /*
                Method dump skipped, instruction units count: 257
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r3b.i.a(s3d, java.lang.Object):void");
        }
    }

    public static final class j<T> extends r3b<T> {
        public final String a;
        public final ap1.d b;
        public final boolean c;

        public j(String str, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = ap1.d.a;
            this.c = z;
        }

        @Override // defpackage.r3b
        public final void a(s3d s3dVar, T t) throws EOFException {
            if (t == null) {
                return;
            }
            this.b.getClass();
            String string = t.toString();
            if (string == null) {
                return;
            }
            s3dVar.c(this.a, string, this.c);
        }
    }

    public static final class k<T> extends r3b<Map<String, T>> {
        public final Method a;
        public final int b;
        public final boolean c;

        public k(int i, Method method, boolean z) {
            this.a = method;
            this.b = i;
            this.c = z;
        }

        @Override // defpackage.r3b
        public final void a(s3d s3dVar, Object obj) throws EOFException {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map == null) {
                throw fkg.j(method, i, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw fkg.j(method, i, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw fkg.j(method, i, l5.m("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw fkg.j(method, i, "Query map value '" + value + "' converted to null by " + ap1.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                s3dVar.c(str, string, this.c);
            }
        }
    }

    public static final class l<T> extends r3b<T> {
        public final boolean a;

        public l(boolean z) {
            this.a = z;
        }

        @Override // defpackage.r3b
        public final void a(s3d s3dVar, T t) throws EOFException {
            if (t == null) {
                return;
            }
            s3dVar.c(t.toString(), null, this.a);
        }
    }

    public static final class m extends r3b<MultipartBody.Part> {
        public static final m a = new m();

        @Override // defpackage.r3b
        public final void a(s3d s3dVar, MultipartBody.Part part) {
            MultipartBody.Part part2 = part;
            if (part2 != null) {
                MultipartBody.Builder builder = s3dVar.i;
                builder.getClass();
                builder.c.add(part2);
            }
        }
    }

    public static final class n extends r3b<Object> {
        public final Method a;
        public final int b;

        public n(int i, Method method) {
            this.a = method;
            this.b = i;
        }

        @Override // defpackage.r3b
        public final void a(s3d s3dVar, Object obj) {
            if (obj != null) {
                s3dVar.c = obj.toString();
            } else {
                throw fkg.j(this.a, this.b, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    public static final class o<T> extends r3b<T> {
        public final Class<T> a;

        public o(Class<T> cls) {
            this.a = cls;
        }

        @Override // defpackage.r3b
        public final void a(s3d s3dVar, T t) {
            s3dVar.e.f(this.a, t);
        }
    }

    public abstract void a(s3d s3dVar, T t);
}
