package defpackage;

import android.text.TextUtils;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wo8 implements yg6 {
    public final Map<String, List<vo8>> b;
    public volatile Map<String, String> c;

    public static final class a {
        public static final Map<String, List<vo8>> a;

        static {
            String property = System.getProperty(DataOkHttpUploader.SYSTEM_UA);
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char cCharAt = property.charAt(i);
                    if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                        sb.append(cCharAt);
                    } else {
                        sb.append(TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR);
                    }
                }
                property = sb.toString();
            }
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put(DataOkHttpUploader.HEADER_USER_AGENT, Collections.singletonList(new b(property)));
            }
            a = Collections.unmodifiableMap(map);
        }
    }

    public static final class b implements vo8 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // defpackage.vo8
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l6.i(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
        }
    }

    public wo8(Map<String, List<vo8>> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    @Override // defpackage.yg6
    public final Map<String, String> a() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.c = Collections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final HashMap b() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<vo8>> entry : this.b.entrySet()) {
            List<vo8> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                String strA = value.get(i).a();
                if (!TextUtils.isEmpty(strA)) {
                    sb.append(strA);
                    if (i != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wo8) {
            return this.b.equals(((wo8) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.b + '}';
    }
}
