package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class fc8 implements lna, nlg {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map<Class<?>, kna<?>> c;
    public final Map<Class<?>, mlg<?>> d;
    public final kna<Object> e;
    public final boolean f;

    public fc8(Writer writer, HashMap map, HashMap map2, ba8 ba8Var, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = ba8Var;
        this.f = z;
    }

    @Override // defpackage.lna
    public final /* bridge */ /* synthetic */ lna a(Object obj, String str) throws IOException {
        k(obj, str);
        return this;
    }

    @Override // defpackage.lna
    public final lna b(x85 x85Var, Object obj) throws IOException {
        k(obj, x85Var.a);
        return this;
    }

    @Override // defpackage.nlg
    public final nlg c(String str) throws IOException {
        l();
        this.b.value(str);
        return this;
    }

    @Override // defpackage.lna
    public final lna d(int i, String str) throws IOException {
        l();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        l();
        jsonWriter.value(i);
        return this;
    }

    @Override // defpackage.nlg
    public final nlg e(boolean z) throws IOException {
        l();
        this.b.value(z);
        return this;
    }

    @Override // defpackage.lna
    public final lna f(x85 x85Var, boolean z) throws IOException {
        String str = x85Var.a;
        l();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        l();
        jsonWriter.value(z);
        return this;
    }

    @Override // defpackage.lna
    public final lna g(x85 x85Var, int i) throws IOException {
        String str = x85Var.a;
        l();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        l();
        jsonWriter.value(i);
        return this;
    }

    @Override // defpackage.lna
    public final lna h(x85 x85Var, double d) throws IOException {
        String str = x85Var.a;
        l();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        l();
        jsonWriter.value(d);
        return this;
    }

    @Override // defpackage.lna
    public final lna i(x85 x85Var, long j) throws IOException {
        String str = x85Var.a;
        l();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        l();
        jsonWriter.value(j);
        return this;
    }

    public final fc8 j(Object obj) throws IOException {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    j(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        k(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            kna<?> knaVar = this.c.get(obj.getClass());
            if (knaVar != null) {
                jsonWriter.beginObject();
                knaVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            mlg<?> mlgVar = this.d.get(obj.getClass());
            if (mlgVar != null) {
                mlgVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof yma) {
                int number = ((yma) obj).getNumber();
                l();
                jsonWriter.value(number);
                return this;
            }
            String strName = ((Enum) obj).name();
            l();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            l();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                l();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                j(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                j(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final fc8 k(Object obj, String str) throws IOException {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj == null) {
                return this;
            }
            l();
            jsonWriter.name(str);
            j(obj);
            return this;
        }
        l();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        j(obj);
        return this;
    }

    public final void l() {
        if (this.a) {
            return;
        }
        r6.g("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
