package defpackage;

import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class yna<T> extends ja1 implements Serializable {
    static final long serialVersionUID = 1;
    private T mValue;

    /* JADX WARN: Multi-variable type inference failed */
    public yna(Parcelable parcelable) {
        super(13);
        this.mValue = parcelable;
    }

    public final T U() {
        return this.mValue;
    }
}
