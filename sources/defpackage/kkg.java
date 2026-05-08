package defpackage;

import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class kkg<T> implements Comparator {
    public final /* synthetic */ wc0 a;

    public kkg(wc0 wc0Var) {
        this.a = wc0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.a.compare(t, t2);
        return iCompare != 0 ? iCompare : ak2.i(u63.E((SavedJobsDto) t2).b, u63.E((SavedJobsDto) t).b);
    }
}
