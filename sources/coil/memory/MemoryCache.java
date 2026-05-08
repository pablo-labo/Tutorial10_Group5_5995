package coil.memory;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wl7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface MemoryCache {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcelable;", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Key implements Parcelable {

        @Deprecated
        public static final Parcelable.Creator<Key> CREATOR = new a();
        public final String a;
        public final Map<String, String> b;

        public static final class a implements Parcelable.Creator<Key> {
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                string.getClass();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 < i; i2++) {
                    String string2 = parcel.readString();
                    string2.getClass();
                    String string3 = parcel.readString();
                    string3.getClass();
                    linkedHashMap.put(string2, string3);
                }
                return new Key(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public Key(String str, Map<String, String> map) {
            this.a = str;
            this.b = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return wl7.b(this.a, key.a) && wl7.b(this.b, key.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Key(key=" + this.a + ", extras=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            Map<String, String> map = this.b;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                parcel.writeString(key);
                parcel.writeString(value);
            }
        }
    }

    public static final class a {
        public final Bitmap a;
        public final Map<String, Object> b;

        public a(Bitmap bitmap, Map<String, ? extends Object> map) {
            this.a = bitmap;
            this.b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && wl7.b(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Value(bitmap=" + this.a + ", extras=" + this.b + ')';
        }
    }

    void a(int i);

    a b(Key key);

    void c(Key key, a aVar);
}
