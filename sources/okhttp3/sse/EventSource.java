package okhttp3.sse;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/sse/EventSource;", "", "Factory", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface EventSource {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/sse/EventSource$Factory;", "", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
    }

    void cancel();
}
