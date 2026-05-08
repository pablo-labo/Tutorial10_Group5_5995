package com.facebook.react.common.mapbuffer;

import android.util.SparseArray;
import com.facebook.react.common.mapbuffer.a;
import defpackage.f84;
import defpackage.h5;
import defpackage.p6;
import defpackage.w40;
import defpackage.ze8;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;", "Lcom/facebook/react/common/mapbuffer/a;", "<init>", "()V", "", "getKeys", "()[I", "", "", "getValues", "()[Ljava/lang/Object;", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@f84
public final class WritableMapBuffer implements com.facebook.react.common.mapbuffer.a {
    public final SparseArray<Object> a = new SparseArray<>();

    public final class a implements a.c {
        public final int a;
        public final int b;
        public final a.b c;

        public a(int i) {
            a.b bVar;
            this.a = i;
            SparseArray<Object> sparseArray = WritableMapBuffer.this.a;
            int iKeyAt = sparseArray.keyAt(i);
            this.b = iKeyAt;
            Object objValueAt = sparseArray.valueAt(i);
            objValueAt.getClass();
            if (objValueAt instanceof Boolean) {
                bVar = a.b.a;
            } else if (objValueAt instanceof Integer) {
                bVar = a.b.b;
            } else if (objValueAt instanceof Long) {
                bVar = a.b.f;
            } else if (objValueAt instanceof Double) {
                bVar = a.b.c;
            } else if (objValueAt instanceof String) {
                bVar = a.b.d;
            } else {
                if (!(objValueAt instanceof com.facebook.react.common.mapbuffer.a)) {
                    throw new IllegalStateException("Key " + iKeyAt + " has value of unknown type: " + objValueAt.getClass());
                }
                bVar = a.b.e;
            }
            this.c = bVar;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final long a() {
            Object objValueAt = WritableMapBuffer.this.a.valueAt(this.a);
            int i = this.b;
            if (objValueAt == null) {
                h5.k(p6.c(i, "Key not found: "));
                return 0L;
            }
            if (objValueAt instanceof Long) {
                return ((Number) objValueAt).longValue();
            }
            w40.k(i, Long.class, ", found ", objValueAt.getClass());
            return 0L;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final String b() {
            Object objValueAt = WritableMapBuffer.this.a.valueAt(this.a);
            int i = this.b;
            if (objValueAt == null) {
                h5.k(p6.c(i, "Key not found: "));
                return null;
            }
            if (objValueAt instanceof String) {
                return (String) objValueAt;
            }
            w40.k(i, String.class, ", found ", objValueAt.getClass());
            return null;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final double c() {
            Object objValueAt = WritableMapBuffer.this.a.valueAt(this.a);
            int i = this.b;
            if (objValueAt == null) {
                h5.k(p6.c(i, "Key not found: "));
                return 0.0d;
            }
            if (objValueAt instanceof Double) {
                return ((Number) objValueAt).doubleValue();
            }
            w40.k(i, Double.class, ", found ", objValueAt.getClass());
            return 0.0d;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final com.facebook.react.common.mapbuffer.a d() {
            Object objValueAt = WritableMapBuffer.this.a.valueAt(this.a);
            int i = this.b;
            if (objValueAt == null) {
                h5.k(p6.c(i, "Key not found: "));
                return null;
            }
            if (objValueAt instanceof com.facebook.react.common.mapbuffer.a) {
                return (com.facebook.react.common.mapbuffer.a) objValueAt;
            }
            w40.k(i, com.facebook.react.common.mapbuffer.a.class, ", found ", objValueAt.getClass());
            return null;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final int e() {
            Object objValueAt = WritableMapBuffer.this.a.valueAt(this.a);
            int i = this.b;
            if (objValueAt == null) {
                h5.k(p6.c(i, "Key not found: "));
                return 0;
            }
            if (objValueAt instanceof Integer) {
                return ((Number) objValueAt).intValue();
            }
            w40.k(i, Integer.class, ", found ", objValueAt.getClass());
            return 0;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final boolean f() {
            Object objValueAt = WritableMapBuffer.this.a.valueAt(this.a);
            int i = this.b;
            if (objValueAt == null) {
                h5.k(p6.c(i, "Key not found: "));
                return false;
            }
            if (objValueAt instanceof Boolean) {
                return ((Boolean) objValueAt).booleanValue();
            }
            w40.k(i, Boolean.class, ", found ", objValueAt.getClass());
            return false;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final int getKey() {
            return this.b;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final a.b getType() {
            return this.c;
        }
    }

    public static final class b implements Iterator<a.c>, ze8 {
        public int a;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a < WritableMapBuffer.this.a.size();
        }

        @Override // java.util.Iterator
        public final a.c next() {
            int i = this.a;
            this.a = i + 1;
            return WritableMapBuffer.this.new a(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @f84
    private final int[] getKeys() {
        SparseArray<Object> sparseArray = this.a;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    @f84
    private final Object[] getValues() {
        SparseArray<Object> sparseArray = this.a;
        int size = sparseArray.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            Object objValueAt = sparseArray.valueAt(i);
            objValueAt.getClass();
            objArr[i] = objValueAt;
        }
        return objArr;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public final boolean getBoolean(int i) {
        Object obj = this.a.get(i);
        if (obj == null) {
            h5.k(p6.c(i, "Key not found: "));
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        w40.k(i, Boolean.class, ", found ", obj.getClass());
        return false;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    /* JADX INFO: renamed from: getCount */
    public final int getC() {
        return this.a.size();
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public final double getDouble(int i) {
        Object obj = this.a.get(i);
        if (obj == null) {
            h5.k(p6.c(i, "Key not found: "));
            return 0.0d;
        }
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        w40.k(i, Double.class, ", found ", obj.getClass());
        return 0.0d;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public final int getInt(int i) {
        Object obj = this.a.get(i);
        if (obj == null) {
            h5.k(p6.c(i, "Key not found: "));
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        w40.k(i, Integer.class, ", found ", obj.getClass());
        return 0;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public final String getString(int i) {
        Object obj = this.a.get(i);
        if (obj == null) {
            h5.k(p6.c(i, "Key not found: "));
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        w40.k(i, String.class, ", found ", obj.getClass());
        return null;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public final boolean h1(int i) {
        return this.a.get(i) != null;
    }

    @Override // java.lang.Iterable
    public final Iterator<a.c> iterator() {
        return new b();
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public final com.facebook.react.common.mapbuffer.a j0(int i) {
        Object obj = this.a.get(i);
        if (obj == null) {
            h5.k(p6.c(i, "Key not found: "));
            return null;
        }
        if (obj instanceof com.facebook.react.common.mapbuffer.a) {
            return (com.facebook.react.common.mapbuffer.a) obj;
        }
        w40.k(i, com.facebook.react.common.mapbuffer.a.class, ", found ", obj.getClass());
        return null;
    }
}
