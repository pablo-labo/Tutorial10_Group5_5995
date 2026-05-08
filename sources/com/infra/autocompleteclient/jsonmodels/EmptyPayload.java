package com.infra.autocompleteclient.jsonmodels;

import defpackage.o7e;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/infra/autocompleteclient/jsonmodels/EmptyPayload;", "", "<init>", "()V", "Companion", "$serializer", "autocomplete-client_release"}, k = 1, mv = {1, 4, 2})
public final class EmptyPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/autocompleteclient/jsonmodels/EmptyPayload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/autocompleteclient/jsonmodels/EmptyPayload;", "autocomplete-client_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        public final KSerializer<EmptyPayload> serializer() {
            return EmptyPayload$$serializer.INSTANCE;
        }
    }
}
