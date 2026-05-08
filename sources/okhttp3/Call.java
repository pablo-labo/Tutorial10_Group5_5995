package okhttp3;

import kotlin.Metadata;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Call;", "", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Call extends Cloneable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Call$Factory;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
        RealCall c(Request request);
    }

    void R0(Callback callback);

    /* JADX INFO: renamed from: a */
    Request getB();

    Response b();

    void cancel();

    /* JADX INFO: renamed from: s */
    boolean getE0();
}
