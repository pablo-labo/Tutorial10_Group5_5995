package defpackage;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class t72 {

    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        a(int i) {
            this.value = i;
        }
    }

    public abstract b50 a();

    public abstract a b();
}
