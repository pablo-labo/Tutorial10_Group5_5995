package defpackage;

import android.media.AudioAttributes;
import android.util.SparseIntArray;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class px0 {
    public final b a;

    public static class a {
        public AudioAttributes a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            AudioAttributes audioAttributes = this.a;
            audioAttributes.getClass();
            return audioAttributes.hashCode();
        }

        public final String toString() {
            return "AudioAttributesCompat: audioattributes=" + this.a;
        }
    }

    public static class b extends a {
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public px0(b bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof px0) {
            return this.a.equals(((px0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
