package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import defpackage.pt7;
import expo.modules.kotlin.types.folly.FollyDynamicExtensionConverter;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public interface t35<T> {

    public static final class a implements t35<Uri> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            Uri uri = (Uri) obj;
            if (uri == null) {
                return null;
            }
            String string = uri.toString();
            string.getClass();
            return string;
        }
    }

    public static final class b implements t35<Object> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            return pt7.a(2, obj);
        }
    }

    public static final class c implements t35<Object[]> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr != null) {
                return qt7.e(objArr, pt7.b.a);
            }
            return null;
        }
    }

    public static final class d implements t35<boolean[]> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr == null) {
                return null;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.getClass();
            for (boolean z : zArr) {
                writableArrayCreateArray.pushBoolean(z);
            }
            return writableArrayCreateArray;
        }
    }

    public static final class e implements t35<Bundle> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                return qt7.g(bundle, pt7.b.a);
            }
            return null;
        }
    }

    public static final class f implements t35<byte[]> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            byte[] bArr = (byte[]) obj;
            if (bArr != null) {
                return FollyDynamicExtensionConverter.a.put(bArr);
            }
            return null;
        }
    }

    public static final class g implements t35<Collection<?>> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            Collection collection = (Collection) obj;
            if (collection != null) {
                return qt7.j(collection);
            }
            return null;
        }
    }

    public static final class h implements t35<double[]> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            double[] dArr = (double[]) obj;
            if (dArr == null) {
                return null;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.getClass();
            for (double d : dArr) {
                writableArrayCreateArray.pushDouble(d);
            }
            return writableArrayCreateArray;
        }
    }

    public static final class i implements t35<wd4> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            wd4 wd4Var = (wd4) obj;
            if (wd4Var != null) {
                return Double.valueOf(wd4.o(wd4Var.a));
            }
            return null;
        }
    }

    public static final class j implements t35<Enum<?>> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            Enum r1 = (Enum) obj;
            if (r1 != null) {
                return qt7.i(r1);
            }
            return null;
        }
    }

    public static final class k implements t35<File> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            File file = (File) obj;
            if (file == null) {
                return null;
            }
            String absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
            return absolutePath;
        }
    }

    public static final class l implements t35<float[]> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            float[] fArr = (float[]) obj;
            if (fArr == null) {
                return null;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.getClass();
            for (float f : fArr) {
                writableArrayCreateArray.pushDouble(f);
            }
            return writableArrayCreateArray;
        }
    }

    public static final class m implements t35<int[]> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                return null;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.getClass();
            for (int i : iArr) {
                writableArrayCreateArray.pushInt(i);
            }
            return writableArrayCreateArray;
        }
    }

    public static final class n implements t35<Long> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            if (((Long) obj) != null) {
                return Double.valueOf(r1.longValue());
            }
            return null;
        }
    }

    public static final class o implements t35<Map<?, ?>> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                return qt7.k(map);
            }
            return null;
        }
    }

    public static final class p implements t35<Pair<?, ?>> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            Pair pair = (Pair) obj;
            if (pair != null) {
                return qt7.d(pair, pt7.b.a);
            }
            return null;
        }
    }

    public static final class q implements t35<Object> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            return obj;
        }
    }

    public static final class r implements t35<djc> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            djc djcVar = (djc) obj;
            if (djcVar != null) {
                return djcVar.a();
            }
            return null;
        }
    }

    public static final class s implements t35<ftc> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            ftc ftcVar = (ftc) obj;
            if (ftcVar != null) {
                return qt7.f(ftcVar, pt7.b.a);
            }
            return null;
        }
    }

    public static final class t implements t35<URI> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            URI uri = (URI) obj;
            if (uri == null) {
                return null;
            }
            String string = uri.toString();
            string.getClass();
            return string;
        }
    }

    public static final class u implements t35<URL> {
        @Override // defpackage.t35
        public final Object a(Object obj) {
            URL url = (URL) obj;
            if (url == null) {
                return null;
            }
            String string = url.toString();
            string.getClass();
            return string;
        }
    }

    Object a(Object obj);
}
