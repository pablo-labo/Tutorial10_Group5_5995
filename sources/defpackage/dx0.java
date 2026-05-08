package defpackage;

import com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl;
import java.util.function.Predicate;
import org.webrtc.CameraEnumerator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dx0 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dx0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return AttachmentsRepositoryImpl.doUpload$lambda$6((pe0) obj2, obj);
            default:
                return ((CameraEnumerator) obj2).isBackFacing((String) obj);
        }
    }
}
