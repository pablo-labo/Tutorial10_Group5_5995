package defpackage;

import com.indeed.android.myjobs.data.model.UserJobStatus;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class hkg<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return ak2.i(Long.valueOf(((UserJobStatus) t2).getTimestamp()), Long.valueOf(((UserJobStatus) t).getTimestamp()));
    }
}
