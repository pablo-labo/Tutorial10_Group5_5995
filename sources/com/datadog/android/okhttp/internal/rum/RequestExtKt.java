package com.datadog.android.okhttp.internal.rum;

import com.datadog.android.okhttp.internal.utils.IdentifyRequestKt;
import com.datadog.android.rum.resource.ResourceId;
import java.util.UUID;
import kotlin.Metadata;
import okhttp3.Request;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"buildResourceId", "Lcom/datadog/android/rum/resource/ResourceId;", "Lokhttp3/Request;", "generateUuid", "", "dd-sdk-android-okhttp_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class RequestExtKt {
    public static final ResourceId buildResourceId(Request request, boolean z) {
        request.getClass();
        UUID uuidRandomUUID = (UUID) UUID.class.cast(request.e.get(UUID.class));
        if (uuidRandomUUID == null) {
            uuidRandomUUID = z ? UUID.randomUUID() : null;
        }
        return new ResourceId(IdentifyRequestKt.identifyRequest(request), uuidRandomUUID != null ? uuidRandomUUID.toString() : null);
    }
}
