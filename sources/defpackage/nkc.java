package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class nkc {
    public static final String[] c = {"", "_bold", "_italic", "_bold_italic"};
    public static final String[] d = {".ttf", ".otf"};
    public static final nkc e = new nkc();
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();

    public static final class a {
        public final SparseArray<Typeface> a = new SparseArray<>(4);
    }

    public final Typeface a(String str, b bVar, AssetManager assetManager) {
        Typeface typefaceCreate;
        str.getClass();
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap.containsKey(str)) {
            return bVar.a((Typeface) linkedHashMap.get(str));
        }
        LinkedHashMap linkedHashMap2 = this.a;
        Object aVar = linkedHashMap2.get(str);
        if (aVar == null) {
            aVar = new a();
            linkedHashMap2.put(str, aVar);
        }
        SparseArray<Typeface> sparseArray = ((a) aVar).a;
        int i = bVar.b;
        boolean z = bVar.a;
        int i2 = i < 700 ? z ? 2 : 0 : z ? 3 : 1;
        Typeface typeface = sparseArray.get(i2);
        if (typeface != null) {
            return typeface;
        }
        if (assetManager != null) {
            String str2 = c[i2];
            for (int i3 = 0; i3 < 2; i3++) {
                try {
                    typefaceCreate = Typeface.createFromAsset(assetManager, t40.l("fonts/", str, str2, d[i3]));
                    typefaceCreate.getClass();
                    break;
                } catch (RuntimeException unused) {
                }
            }
            typefaceCreate = Typeface.create(str, i2);
            typefaceCreate.getClass();
        } else {
            typefaceCreate = Typeface.create(str, i2);
            typefaceCreate.getClass();
        }
        sparseArray.put(i2, typefaceCreate);
        return typefaceCreate;
    }

    public static final class b {
        public final boolean a;
        public final int b;

        public b(int i, int i2) {
            i = i == -1 ? 0 : i;
            this.a = (i & 2) != 0;
            this.b = i2 == -1 ? (i & 1) != 0 ? 700 : DataOkHttpUploader.HTTP_BAD_REQUEST : i2;
        }

        public final Typeface a(Typeface typeface) {
            int i = Build.VERSION.SDK_INT;
            boolean z = this.a;
            int i2 = this.b;
            if (i < 28) {
                Typeface typefaceCreate = Typeface.create(typeface, i2 < 700 ? z ? 2 : 0 : z ? 3 : 1);
                typefaceCreate.getClass();
                return typefaceCreate;
            }
            Typeface typefaceCreate2 = Typeface.create(typeface, i2, z);
            typefaceCreate2.getClass();
            return typefaceCreate2;
        }

        public b(int i, boolean z) {
            this.a = z;
            this.b = i == -1 ? DataOkHttpUploader.HTTP_BAD_REQUEST : i;
        }
    }
}
