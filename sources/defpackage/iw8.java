package defpackage;

import androidx.fragment.app.Fragment;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import com.indeed.android.tare.broadcast.JSTBroadcast;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00078TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, d2 = {"Liw8;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lj6g;", "onResume", "onPause", "", "_viewInstanceId$delegate", "Lkotlin/Lazy;", "get_viewInstanceId", "()Ljava/lang/String;", "_viewInstanceId", "getViewInstanceId", "viewInstanceId", "getViewName", "viewName", "uiplugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class iw8 extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: _viewInstanceId$delegate, reason: from kotlin metadata */
    private final Lazy _viewInstanceId = new d2f(new lz(15));

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _viewInstanceId_delegate$lambda$0() {
        return UUID.randomUUID().toString();
    }

    private final String get_viewInstanceId() {
        return (String) this._viewInstanceId.getValue();
    }

    public final String getViewInstanceId() {
        return get_viewInstanceId();
    }

    public String getViewName() {
        String strR = fwc.a.b(getClass()).r();
        return strR == null ? ViewUtilsKt.UNKNOWN_DESTINATION_URL : strR;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ((JSTBroadcast) cr8.p(JSTBroadcast.class)).dispatch(new JSTBroadcastEvent.ViewWillDisappear(getViewName(), getViewInstanceId()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((JSTBroadcast) cr8.p(JSTBroadcast.class)).dispatch(new JSTBroadcastEvent.ViewWillAppear(getViewName(), getViewInstanceId()));
    }
}
