package defpackage;

import com.google.android.gms.common.api.Scope;
import com.indeed.android.myjobs.data.model.AppStatusJob;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class e85 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ e85(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ak2.i(Long.valueOf(((AppStatusJob) obj).getApplyTime()), Long.valueOf(((AppStatusJob) obj2).getApplyTime()));
            default:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
        }
    }
}
