package defpackage;

import com.indeed.android.myjobs.data.model.AppStatusJob;
import com.indeed.android.myjobs.data.model.UserJobStatus;
import defpackage.cd4;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class zc4 implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ak2.i(((cd4.a) obj).name(), ((cd4.a) obj2).name());
            default:
                UserJobStatus userJobStatus = ((AppStatusJob) obj2).getStatuses().getUserJobStatus();
                Long lValueOf = userJobStatus != null ? Long.valueOf(userJobStatus.getTimestamp()) : null;
                UserJobStatus userJobStatus2 = ((AppStatusJob) obj).getStatuses().getUserJobStatus();
                return ak2.i(lValueOf, userJobStatus2 != null ? Long.valueOf(userJobStatus2.getTimestamp()) : null);
        }
    }
}
